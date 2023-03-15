# Food Delivery Platform API Application

# Requirements

* Framework - Springboot 3.0.4 version
* langauge  - java  17 version

# Data Flow 

* Controller : after creating the Model classes(User , Order, Admin , FoodItems, Restaurant etc.). now, we are going to send the request to server through controller class for all model classes. and here, we are making the Object of service class for all individual controllers just to call the service layer and here all endpoints are created.


* Services : in this layer, we are writing all the business logics depend upon the requirements of client and inside this layer we are making the repository object. 


* Repository : in this layer , we are going to extends the JpaRepository<M,DT> which will helps to fetch the data form database tables. it contains some predefined functions which helps us to write the shorted code.


* DataBase Design : so here we are using , H2 Database that is inmemory database . i have created that database because im getting error while configuration with mySql database.


* Project Summary : The project is a food delivery application developed using Spring Boot framework. The application contains various model classes such as User, Food, Order, Admin, and Restaurant, which represent the entities in the system. Each model class has a corresponding controller class and service class, and the data is persisted in a H2 database. The application allows users to browse through restaurants and place orders for food items. Registered users can create an account and store their details, managing orders, and user accounts. The application is built using a layered architecture, with the presentation layer being handled by the controller classes, business logic handled by the service classes, and data access handled by the DAO (Data Access Object) classes. The project is implemented using various Spring Boot features such as Spring Data JPA, which simplifies database access, and Spring MVC, which provides a model-view-controller architecture for building web applications.