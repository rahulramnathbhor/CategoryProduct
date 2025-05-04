# CategoryProduct  Project

  In this project showing one to many relation between category and product.
  1. Category Endpoints


POST http://localhost:8080/api/categories
Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Electronics"
}


GET http://localhost:8080/api/categories?page=0&size=10
Headers:
- Accept: application/json

GET http://localhost:8080/api/categories/1
Headers:
- Accept: application/json

PUT http://localhost:8080/api/categories/1
Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Updated Electronics"
}

DELETE http://localhost:8080/api/categories/1

2. Product Endpoints

POST http://localhost:8080/api/products
Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Smartphone",
    "price": 599.99,
    "categoryId": 1
}

GET http://localhost:8080/api/products?page=0&size=10
Headers:
- Accept: application/json

GET http://localhost:8080/api/products/1
Headers:
- Accept: application/json

PUT http://localhost:8080/api/products/1
Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Premium Smartphone",
    "price": 799.99,
    "categoryId": 1
}

DELETE http://localhost:8080/api/products/1
