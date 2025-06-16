# Spring Security Login, Registration and Email Verification
A Spring Boot project showcasing user registration, email verification via a tokenized verification link, and secure user login.

---

## Features

- **Secure Login with Spring Security**
- **User Registration**
- **Send Verification Link via email for email verification**
- **JPA Authentication:** Store user data in the real database and authenticate against it.
---

## Prerequisites

Before running the project, ensure you have:

- **Java 17** or later
- **Maven 3.8+**
- **SMTP Email Account** (e.g., Gmail)

---

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/learnwithiftekhar/spring-security-user-registration-with-email-validation.git
cd spring-security-user-registration-with-email-validation
```

### 2. Configure Email Settings
Update `application.properties` with your email credentials:

```properties
spring.application.name=Authentication Demo Application
spring.datasource.url=<YOUR DATABASE URL>
spring.datasource.username=<YOUR DATABASE USERNAME>
spring.datasource.password=<YOUR DATABASE PASSWORD>
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database=postgresql
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update

spring.mail.host=<SMTP HOST>
spring.mail.port=<SMTP PORT>
spring.mail.username=<EMAIL USERNAME>
spring.mail.password=<EMAIL PASSWORD>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

```

### 4. Build the Project
Run the following command:
```bash
mvn clean install
```

### 5. Start the Application
```bash
mvn spring-boot:run
```

### 6. Access the Application
- Navigate to ```http://localhost:8080``` to view the main page.

## Built With
- **Spring Boot**
- **Spring Security**
- **Thymeleaf**
- **Java Mail**

## Contributing
Feel free to fork this repository and submit pull requests to contribute to this project.

## Contact
Contact
For any questions or feedback, please reach out:
- **GitHub**: https://github.com/renemunyeshyaka/
- **Email**: [munyeshyaka@hotmail.com]
-
## For More Details
Let me know if you need additional adjustments!
```
