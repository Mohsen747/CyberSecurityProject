'use strict';

const express = require('express');
const csrf = require('csurf');
const { MongoClient } = require('mongodb');
const morgan = require('morgan');
const { getItemsByBrand } = require('./handlers/getItemsByBrand');
const { getAllItems } = require('./handlers/getAllItems')
const { getCartDetails } = require('./handlers/getCartDetails')
const { getOrderDetails } = require('./handlers/getOrderDetails')
const { postCartItems } = require('./handlers/postCartItems')
const { postOrderAndDeleteCart } = require('./handlers/postOrderAndDeleteCart')
const { updateCart } = require('./handlers/updateCart')
const { getItemsByCatergory } = require('./Handlers/getItemsByCatergory');
const { deleteCartItem } = require('./Handlers/deleteCardItem');




const PORT = 4000;

express()
    .use(function(req, res, next) {
      res.header(
        'Access-Control-Allow-Methods',
        'OPTIONS, HEAD, GET, PUT, POST, DELETE'
      );
      res.header(
        'Access-Control-Allow-Headers',
        'Origin, X-Requested-With, Content-Type, Accept'
      );
      next();
    })
    .use(morgan('tiny'))
    .use(express.static('./server/assets'))
    .use(express.json())
    .use(express.urlencoded({ extended: false }))
    .use('/', express.static(__dirname + '/'))



// GET ENDPOINTS //

  // get all items
  .get("/api/items/all", getAllItems)

  // get items by their brand
  .get("/api/items/brand/:brandId", getItemsByBrand)

  // get items by their category type
  .get("/api/items/category/:category", getItemsByCatergory)

  // get details about what's in the cart
  .get("/api/cart/details", getCartDetails)

  // get details about the completed order
  .get("/api/order/details", getOrderDetails)

  // get bacon
  .get('/bacon', (req, res) => res.status(200).json('🥓'))




// POST ENDPOINTS // 

  // post order after completed purchase AND delete cart
  .post("/api/order/details", postOrderAndDeleteCart)

  // post items into the cart
  .post("/api/cart/details", postCartItems)




// PATCH ENDPOINTS //

  // update cart in database by adding or removing item(s)
  .patch("/api/cart/update", updateCart)

  


  //Delete ENDPOINTS 

  // Delete an item in the cart
  .delete("/api/cart/deleteItem/:_id", deleteCartItem)



  // three vulnerabilities

  //SQL Injection:
  .get('/insecure-mongodb', async (req, res) => {
    const userInput = req.query.username; // Assuming this is user input
    
    const client = new MongoClient('mongodb://localhost:27017', { useUnifiedTopology: true });

    try {
        await client.connect();
        const db = client.db('Group-Project-Watchout');
        const collection = db.collection('users');
        
        const query = { username: userInput }; // Vulnerable to NoSQL injection
        const result = await collection.find(query).toArray();
        res.json(result);
    } finally {
        client.close();
    }
})
// Cross-Site Scripting (XSS):
.get('/insecure-xss', (req, res) => {
  const userInput = req.query.message; // Assuming this is user input

  const html = `<div>${userInput}</div>`; // Vulnerable to XSS

  res.send(html);
})

// Insecure Direct Object References (IDOR)
.get('/insecure-idor', async (req, res) => {
  const userId = req.query.userId; // Assuming this is user input
  
  const client = new MongoClient('mongodb://localhost:27017', { useUnifiedTopology: true });

  try {
      await client.connect();
      const db = client.db('Group-Project-Watchout');
      const collection = db.collection('users');

      const query = { _id: userId }; // Vulnerable to IDOR
      const result = await collection.findOne(query);
      res.json(result);
  } finally {
      client.close();
  }
})

.post('/transfer-money', (req, res) => {
  const toAccount = req.body.toAccount;
  const amount = req.body.amount;

  // Now, with csurf protection in place, you need to check the CSRF token before processing the transfer
  if (req.csrfToken() !== req.body._csrf) {
      return res.status(403).send('CSRF token mismatch. Access denied.');
  }

  // Perform the money transfer here

  res.send(`Money transferred to ${toAccount}. Amount: $${amount}`);
})


  .listen(PORT, () => console.info(`Listening on port ${PORT}`));
