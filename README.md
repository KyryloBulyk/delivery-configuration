# Delivery Configuration Service

## Overview
The Delivery Configuration Service is a critical component of the **Delivery** application's microservice architecture. It centralizes and manages configuration settings for the entire suite of microservices, ensuring consistency, simplifying management tasks, and facilitating dynamic updates without the need for service restarts.

## Architecture Interaction
As an essential service within the Delivery application ecosystem, the Delivery Configuration Service interacts with several key components:

- [Delivery API Gateway](https://github.com/KyryloBulyk/delivery-api-gateway): Retrieves its own configuration settings from the Configuration Service to handle authentication, authorization, and request routing effectively.

- [Delivery Users Microservice](https://github.com/KyryloBulyk/delivery-users): Obtains user management-related configurations, such as security policies and access controls, from the Configuration Service.

- [Delivery Discovery](https://github.com/KyryloBulyk/delivery-discovery): Works alongside the Configuration Service to enable dynamic service discovery and registration, ensuring that configuration updates are promptly applied across services.

- [Delivery Configuration Repository](https://github.com/KyryloBulyk/delivery-config-repo): In this repository we saving all configuration for Delivery Project
The Delivery Configuration Service plays a vital role in maintaining the operational flexibility and resilience of the Delivery application by centralizing configuration management.

## Getting Started

### Prerequisites
To set up the Delivery Configuration Service, you will need:
- Java 11 or later.
- Maven for handling project dependencies and executions.
- A Git repository to store configuration files (e.g., GitHub, GitLab).

### Configuration
1. **Application Configuration**: Ensure the `application.properties` or `application.yml` file is properly configured with the Git repository details where the configuration files are stored.

2. **Repository Setup**: Organize your configuration files in the Git repository, following a structure that aligns with your environment and service naming conventions.

### Running the Application
To launch the Delivery Configuration Service, execute the following steps:

1. Open a terminal and navigate to the root directory of the Configuration Service project.
2. Start the application using Maven with this command:

```bash
mvn spring-boot:run
```
Upon starting, the Configuration Service will connect to the specified Git repository, making the configurations available for consumption by other microservices in the Delivery application.

## Contributing
We welcome contributions to the Delivery Configuration Service, including new features, bug fixes, and documentation improvements. Please refer to the project's GitHub repository for the contributing guidelines.