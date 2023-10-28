# ReditClone Server

This is the server-side of the ReditClone project built with Spring Boot. In this README, we'll explore the important concepts and the structure of the project. The project is organized into several packages, each serving a specific purpose.

## Project Structure

### `config`
The `config` package contains configuration classes. These classes are used to configure various aspects of the Spring application, including database configuration and security settings. Here, you can find important classes like `WebSecurityConfig` for setting up security.

### `controller`
The `controller` package contains the API endpoints of the application. Controllers define the RESTful endpoints and handle HTTP requests. For example, you can find a `PostController` that handles operations related to posts.

### `dto`
DTO (Data Transfer Object) classes in the `dto` package are used to transfer data between the client and server. They define the structure of data to be sent or received by the API.

### `mapper`
The `mapper` package contains classes that map entities to DTOs and vice versa. For instance, the `UserMapper` class maps a `User` entity to a `UserResponse` DTO.

### `exception`
The `exception` package includes custom exception classes. These are used to handle and return custom error responses when exceptions occur. Commonly used exceptions like `ResourceNotFoundException` can be found here.

### `module`
Modules represent various components or features of the application. For instance, you may find a `UserModule` representing user-related functionality, and a `PostModule` representing posts.

### `repository`
The `repository` package contains interfaces that extend the `JpaRepository` interface. These interfaces are used to perform CRUD operations on the database. For example, the `PostRepository` interface handles post-related operations.

### `security`
The `security` package handles security-related aspects, including authentication and authorization. Here, you can find classes like `JwtAuthenticationFilter` and `JwtProvider` that handle JWT authentication.

### `service`
The `service` package contains service classes that handle the business logic of the application. For instance, the `PostService` class handles post-related business logic. Here is where the exception classes from the `exception` package are used. This is done due to the separation of concerns principle and to keep the code clean.

## Examples

Here are some examples of how these packages and concepts are used:
