# Annual Salary API
This API provides two GET endpoints that returns information about employees.

`GET /employees` returns a list of employees showing their annual salary depending on their contract type.

`GET /employees/{id}` returns a single employee with the information and annual salary calculation depending on the contract type.

## Running this application
To run this application, run the following command in the project's root directory:

`./gradlew bootRun`

## Spring Framework usage
This application is using Spring Boot as the starting point to create the server and expose the REST controller to start the API.
It is easier and quicker to publish an API by using this framework.
