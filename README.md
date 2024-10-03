# AREP LAB5: CRUD System to Manage Properties

This project implements a simple CRUD (Create, Read, Update, Delete) system for managing real estate properties using a Spring Boot backend and a frontend built with HTML, CSS, and JavaScript. It allows users to create, update, delete, and search for properties, with data stored in a MySQL database.

## Project Summary

A web application that enables users to:
- Create new properties
- View a list of all properties
- Update an existing property 
- Delete properties

The project has a frontend built with HTML, JavaScript and CSS, a backend REST API developed using Spring Boot, and a MySQL database.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before install and run the project you will need:

1. **Java** (version 17)

2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

4. **MySQL Server** 


### Installing

1. **Clone the repository and navigate into the project directory**:
    ```sh
    git clone https://github.com/JuanDavidGarciaPulido/AREP_LAB5.git

    cd AREP_LAB5
    ```

2. **Compile the project**:
   ```sh
   mvn clean install
   ```

3. Set up the database:
   - Create a new MySQL database named `property_management`
   - Update `application.properties` in the `src/main/resources` directory with your database credentials

4. Run the backend:
   ```
   mvn spring-boot:run
   ```
5. Access the application at:
   `http://localhost:8080`


## Deployment on AWS

1. Set up an EC2 instance (LAB5_BACKEND) for the Spring Boot backend
You need to install Java, Git, and Maven on your EC2 instance in order to download and install the backend of the project.   

2. Set up another EC2 instance (LAB5_DATABASE) for the MySQL database
In this new instance, you need to download and install MySQL Server, create the database, the user, and the password for the connection with the backend, and grant all permissions to this user.
   
3. Configure security groups to allow necessary traffic between the instances and from the internet to LAB5_BACKEND

7. Build and run the Spring Boot service on LAB5_BACKEND
   
9. Ensure MySQL is running and properly configured on Instance 2

## Usage

https://github.com/user-attachments/assets/106f5ab9-d1c6-4d70-af5c-5e3317e178f2

### Architecture Diagram

Client Browser HTML/JS
       |
       |  HTTP/HTTPS
       |
  +----------------+
  | EC2 Instance 1 |
  +----------------+
       |
  +----------------+
  | Spring Boot API|
  +----------------+
       |
  +--------------------+
  | Property Controller |
  +--------------------+
       |
  +-------------------+
  |   Service Layer   |
  +-------------------+
       |
  +--------------------+
  |  Property Service   |
  +--------------------+
       |
  +-------------------+
  |    Data Access    |
  +-------------------+
       |
  +---------------------+
  |  Property Repository |
  +---------------------+
       |
  +----------------+
  |   JPA/Hibernate |
  +----------------+
       |
  +----------------+
  | EC2 Instance 2 |
  +----------------+
       |
  +---------------------+
  |  MySQL Database     |
  +---------------------+

## Author
This project was developed by Juan David García Pulido.

## Date

Wednesday, October 2 - 2024

## License

This project is licensed under the GNU license; See the [LICENSE.txt](LICENSE.txt) file for details.
