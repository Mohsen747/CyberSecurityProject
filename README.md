# OnlineShoping
this a final React and node.js project
# Web Application README

This README provides instructions for setting up and running the web application, as well as a brief overview of the application's endpoints, vulnerabilities, and security measures.

## Application Overview

The web application is built using Node.js and Express. It provides various endpoints to interact with the application, such as retrieving items by brand, category, managing a shopping cart, and placing orders. The application intentionally contains three security vulnerabilities for educational purposes.

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
## Install the required dependencies:
npm install
Obtain the CA file provided by your teacher and place it in the project directory.

Generate a private key and self-signed certificate, or use the provided certificate. Ensure the certificate file is named server.crt and the private key is named server.key.

## Running the Application
To start the application, run the following command:
node app.js || nodemon index.js
The application will listen on port 4000 by default.

## ENDPOINTS
## GET Endpoints
GET /api/items/all: Retrieve all items.
GET /api/items/brand/:brandId: Retrieve items by brand.
GET /api/items/category/:category: Retrieve items by category.
GET /api/cart/details: Retrieve cart details.
GET /api/order/details: Retrieve order details.
GET /bacon: Get bacon (just for fun).
## POST Endpoints
POST /api/order/details: Place an order and delete the cart.
POST /api/cart/details: Add items to the cart.
## PATCH Endpoints
PATCH /api/cart/update: Update the cart by adding or removing items.
## Delete Endpoints
DELETE /api/cart/deleteItem/:_id: Delete an item from the cart.


## Security Vulnerabilities
The application intentionally includes three security vulnerabilities for educational purposes:

## SQL Injection:

Access /insecure-mongodb to test SQL injection.
A vulnerable query can be manipulated through the username query parameter.
## Cross-Site Scripting (XSS):

Access /insecure-xss to test XSS.
The message query parameter is directly reflected in the response HTML.
## Insecure Direct Object References (IDOR):

Access /insecure-idor to test IDOR.
The userId query parameter directly references a database document.

## Additional Security Measures
The application includes protection against Cross-Site Request Forgery (CSRF) when performing money transfers using csurf.

## Important Notes
This application is intentionally vulnerable and should not be used in a production environment.
Always follow ethical guidelines and respect privacy and security regulations.
