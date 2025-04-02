User Orders API
CRUD for User Orders built with Spring Boot 3, JPA, and H2 Database.

 Description

This project is a REST API for managing users and their orders. It provides:
Create, read, update, and delete users and orders.
JPA for database communication.
H2 in-memory database for storage.
API testing using Postman.
Embedded Apache Tomcat server with Spring Boot.

 Technologies Used
 
Java 21

Spring Boot 3

Spring Data JPA

H2 Database (In-memory database)

Apache Tomcat (Embedded web container)

Maven (Dependency management)

Postman (For API testing)

 How to Run the Project?

Clone the Repository
Build and Run the Application
mvn spring-boot:run
This will start the embedded Tomcat server, and the API will be available at http://localhost:8080.

 API Endpoints

Users (/users)
GET /users → Get all users

GET /users/{id} → Get a specific user

POST /users → Create a new user

PUT /users/{id} → Update an existing user

DELETE /users/{id} → Delete a user

 Orders (/orders)

GET /orders → Get all orders

GET /orders/{id} → Get a specific order

POST /orders → Create a new order

PUT /orders/{id} → Update an existing order

DELETE /orders/{id} → Delete an order

 Database (H2 Console)

Access the H2 database console at http://localhost:8080/h2-console.

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (empty)

