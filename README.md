# Student-Management--System

**Java Spring Boot — README**

---

## Project Overview

**Student Management System** is a Spring Boot-based web application designed to manage student records efficiently. It allows performing CRUD (Create, Read, Update, Delete) operations on student data such as id, fname, lname and email. This system can be extended with RESTful APIs and connected to a Thymeleaf if required.

---

## Features

* Add new student records
* Edit existing student information
* Delete student records
* View all students in a table
* RESTful API endpoints
* MySQL database integration using Spring Data JPA
* Exception and validation handling

---

## Technology Stack

* **Backend:** Java, Spring Boot
* **Database:** MySQL
* **ORM:** Hibernate / JPA
* **Build Tool:** Maven
* **Server:** Apache Tomcat (embedded)
* **IDE:** IntelliJ IDEA / Eclipse / Spring Tool Suite (STS)

---

## Project Structure

```
src/main/java/
├── com.project.studentmanagement
│   ├── StudentManagementApplication.java
│   ├── controller/
│   │   └── StudentController.java
│   ├── entity/
│   │   └── Student.java
│   ├── repository/
│   │   └── StudentRepository.java
│   ├── service/
│   │   └── StudentService.java
│   └── exception/
│       └── GlobalExceptionHandler.java
└── resources/
    ├── application.properties
    └── templates/ (if using Thymeleaf)
```

---

## Entity Example — Student.java

```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String Lname;
    private String  Email;

    // Getters and Setters
}
```

---

## Database Configuration (application.properties)

```properties
spring.application.name=StudentManagementSystem
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8080
```

---

## REST API Endpoints

| Method     | Endpoint         | Description            |
| ---------- | ---------------- | ---------------------- |
| **POST**   | `/students`      | Add a new student      |
| **GET**    | `/students`      | Get all students       |
| **GET**    | `/students/{id}` | Get student by ID      |
| **PUT**    | `/students/{id}` | Update student details |
| **DELETE** | `/students/{id}` | Delete student record  |

---

## How to Run the Project

1. **Clone the repository**

   ```bash
   git clone <your-repo-url>
   cd student-management-system
   ```
2. **Configure the database** in `application.properties`
3. **Build and Run**

   ```bash
   mvn spring-boot:run
   ```
4. **Access the Application**

   * API URL: [http://localhost:8080/students](http://localhost:8080/students)

---

## Testing the API

You can test using tools like:

* Postman
---


## Author

**Sumeet Pethkar**
Student Management System Project — Java Spring Boot

---

Would you like me to generate a version with **Thymeleaf frontend integration** or just keep it API-based?
