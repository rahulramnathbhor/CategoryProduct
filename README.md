# CategoryProduct  Project

  In this project showing one to many relation between category and product.
  1. Category Endpoints

Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Electronics"
}



Headers:
- Accept: application/json


Headers:
- Accept: application/json


Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Updated Electronics"
}



2. Product Endpoints


Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Smartphone",
    "price": 599.99,
    "categoryId": 1
}


Headers:
- Accept: application/json


Headers:
- Accept: application/json


Headers:
- Content-Type: application/json

Body (raw JSON):
{
    "name": "Premium Smartphone",
    "price": 799.99,
    "categoryId": 1
}

 Technologies Used
(Spring Boot,
Java 17,
MySQL Database,
Maven,
Hibernate/JPA)
