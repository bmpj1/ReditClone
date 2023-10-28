# ReditClone
Redit clone with Angular and Spring Boot for learning purposes

## 1. Software and Versions
### Versioning:
- **Git:** A version control system.
- **GitKraken:** A Git GUI client for easy version control.

### Database:
- `XAMPP 3.3.0:` Used for easy MySQL installation.
- `MySQL Workbench 8.0.22:` For efficient database management.

### Backend:
- `Java 17.0.9:` The programming language for backend development.
- `Maven 3.9.0:` A build tool for managing Java dependencies.
- `Spring Boot 3.1.5:` Provides project structure management for your backend.
- `Postman:` Used for API testing.

### Frontend:
- `npm 10.2.0:` The Node Package Manager for frontend dependencies.
- `Node.js 18.12.0:` A runtime environment for executing JavaScript on the server-side.
- `Angular CLI 16.2.8:` A command-line tool for Angular project development.

### IDE:
- **`Visual Studio Code:`** A lightweight IDE for development and debugging.
   - **Extensions:**
      - `IntelliCode:` AI-assisted development.
      - `Path Intellisense:` Autocompletes filenames.
      - `Prettier:` Code formatter.
      - `Auto Close Tag:` Automatically adds HTML/XML close tag.
      - `Auto Rename Tag:` Automatically renames paired HTML/XML tags.
- **`IntelliJ IDEA:`** A powerful IDE for backend development.
   - **Plugins:**
      - `SonarLint:` Ensures code quality.

## 2. Project Installation
After installing the software and versions mentioned above, follow these steps to install and run the project locally:

- Clone the repository to your local machine.
- Create an empty database in MySQL Workbench with the name `spring-red-clone`, using port `3306`. Hibernate will automatically create the necessary tables.
- Open the server project in IntelliJ IDEA.
- In the 'application.yml' file located in the 'resources' folder, update the username and password as per your requirements.
- Run the server project.
- Open the client project in Visual Studio Code.
- Open the terminal and execute `npm install` to install all the necessary dependencies.
- Start the client project with `ng serve`.
- Access the project in your browser at `http://localhost:4200/`.
- You can also use Postman to test the API.

## 3. Additional Documentation
- [Spring Initializr](https://start.spring.io/)
- [Spring Boot best practices](https://www.youtube.com/watch?v=NaEk2zAmDE8&ab_channel=JavaTechie)
- [Spring Boot tutorial](https://www.youtube.com/watch?v=kpKUMmAmcj0&list=PLSVW22jAG8pAGrwFjsUERCu9WSo2-uEMg&index=2&ab_channel=ProgrammingTechie)
- [Angular versions compatibility](https://angular.io/guide/versions)
