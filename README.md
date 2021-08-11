# OpenAPI_Request_Validator_Example

An example Rest API implemented with Spring MVC which utilizes the 
Atlassian OpenAPI Validator. - https://bitbucket.org/atlassian/swagger-request-validator/src/master/

This example uses the Spring MVC OpenAPIValidationInterceptor 

OpenApiValidationConfig creates the filter and interceptor which imports the
OpenAPI doc with which it uses to validate requests against. 

This project also uses the Spring OpenAPI UI which allows us to generate the OpenAPI doc by
running the project using the maven spring-boot run goal and accessing the doc via localhost:8080/api-docs