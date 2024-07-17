# Flood Impacts Mapping API

This project was developed using Spring Boot and Java 17.

## Prerequisites
To run this project locally, you need to have:

- Java 17 JDK
- MySQL 8 (or another supported version)
- Gradle
- Spring CLI

## Database Configuration

This project uses MySQL as the database. Make sure you have a database created with the name **gestaodanos**. Database configuration can be adjusted in the application.properties file.

```application.properties
  spring.datasource.url=jdbc:mysql://localhost:3306/gestaodanos
  spring.datasource.username=root
  spring.datasource.password=root
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## Security Configuration

Security is configured using Spring Security, with HTTP basic authentication and two pre-defined users (user and admin), each with their respective roles.

```java
@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder().encode("user123"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("admin123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
```

## Running the Project with Gradle

To run the project locally using Spring CLI:

1. Clone the repository.
2. Configure the MySQL database.
3. Navigate to the project directory containing build.gradle.
4. Build and run the application using Spring Boot CLI:

  ```
    spring boot run
  ```

The service will be available at `http://localhost:8080`.

## Postman Collection

[APICalls Spring Project.postman_collection.json](https://github.com/user-attachments/files/16241414/APICalls.Spring.Project.postman_collection.json)
