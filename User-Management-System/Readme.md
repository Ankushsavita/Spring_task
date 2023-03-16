# User Management System Application

# Requirements

* Framework - Springboot 3.0.4 version
* Language - Java 17 version
* Build tool - Maven

# Dependencies 

* Spring web
* Springboot dev tools
* lombok developer tool
* H2 DataBase
* Spring data JPA
* Swagger

# EndPoints

* http://localhost:8081/api/v1/user-app/add-user


* http://localhost:8081/api/v1/user-app/find-all


* http://localhost:8081/api/v1/user-app/findUser/id/2


* http://localhost:8081/api/v1/user-app/updateUser/id/1


* http://localhost:8081/api/v1/user-app/deleteUser/id/5

# Data Flow

* Controller : This component handles incoming requests and returns responses to the client. It receives requests from the client, invokes the appropriate method on the service layer, and returns the response to the client.


* Service : This component contains the business logic for the application. It receives requests from the controller layer and interacts with the repository layer to perform CRUD (create, read, update, delete) operations on the data.


* DAO(Data Access Object) : This component interacts directly with the database to perform data access and persistence operations. It receives requests from the service layer, performs the necessary operations on the data, and returns the results to the service layer.


* DataBase : This is H2 Database. This is where the user data is stored. The repository layer interacts directly with the database to perform CRUD operations on the data.

# Project Summary 

* I have created User Management System using Springboot Application. so here, When a user sends a request to the system, it is received by the Controller layer. The Controller layer then invokes the appropriate method on the Service layer, passing along any necessary parameters from the request. The Service layer then invokes the appropriate method on the Repository layer to perform the requested operation.




