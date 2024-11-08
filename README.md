
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Haonan Chen                |
| Date         | 11/08/2024                 |
| Course       | Fall                       |
| Assignment # | 4                          |

# Assignment Overview
This project is developed for Boston University's CS-665: Software Designs & Patterns course.
It demonstrates the use of the Adapter design pattern to integrate a legacy system and a new system
for accessing customer data. The project is implemented in Java and includes unit tests to verify functionality.

# GitHub Repository Link:
https://github.com/HaonanChen-2024/cs-665-assignment--4--
# Implementation Description 

## 1. Flexibility of the Implementation
   The design of this project emphasizes flexibility, primarily achieved through the use of the CustomerDataService interface. By defining a common interface for accessing customer data, the project allows new data retrieval implementations to be added or removed easily in the future. For example, if the company decides to add another customer data retrieval system (e.g., via a cloud service or a database), it can simply implement CustomerDataService, and the new implementation can be seamlessly integrated with the existing codebase without modifying other parts of the system. This makes the solution extensible and adaptable to future requirements without affecting the core functionality.

## 2. Simplicity and Understandability
   The implementation is simple and easy to understand, as it follows a modular design with clear separation of concerns. Each class has a single responsibility:

CustomerDataService defines a common interface for customer data access.
LegacyCustomerDataService and NewCustomerDataService provide concrete implementations for the old and new systems, respectively.
CustomerDataAdapter adapts the new system’s interface to match the legacy system’s expected format.
Customer is a straightforward data class representing customer information.
The use of interfaces and the Adapter pattern also enhances readability by making the purpose of each class evident, which helps other developers understand and maintain the code with ease.

## 3. Avoidance of Duplicated Code
   The codebase avoids duplication by defining a shared interface (CustomerDataService) and using an adapter (CustomerDataAdapter) to bridge between different systems. This approach prevents the need for separate code to handle data retrieval in multiple formats. Instead of duplicating data retrieval logic, the adapter leverages the existing NewCustomerDataService implementation to serve the legacy system. This is important because avoiding code duplication reduces the potential for inconsistencies and errors. It also simplifies future maintenance, as any changes to data retrieval logic can be made in one place rather than multiple classes.

## 4. Use of Design Patterns
   The Adapter Pattern was chosen as the primary design pattern for this project. This pattern allows the new system’s API to be used in place of the legacy system’s API by adapting it to match the old interface. The Adapter Pattern is well-suited for this scenario because it enables smooth integration of a new system without modifying the existing legacy system or duplicating its API. This choice enhances the flexibility of the implementation, allowing the system to evolve while remaining backward-compatible. Additionally, the pattern encourages clean and modular design by encapsulating the adaptation logic within a single class (CustomerDataAdapter), making the codebase easier to extend and maintain.

## Project Structure

- `CustomerDataService`: Interface defining the standard method for accessing customer data.
- `LegacyCustomerDataService`: Implementation of `CustomerDataService` that simulates data retrieval
  from a legacy system via USB.
- `NewCustomerDataService`: Implementation of `CustomerDataService` that simulates data retrieval
  from a new system via HTTPS.
- `CustomerDataAdapter`: Adapter class that allows the new system's data access method to be used
  as if it were the legacy system.
- `Customer`: Data class representing a customer, with attributes for ID and name.




# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




