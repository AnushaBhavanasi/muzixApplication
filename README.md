Tasks to be Done on Muzix Application
1. Complete all the endpoints for CRUD operations on Muzix
2. Use h2-console to view in-memory data
3. Add an endpoint to search trackByName. Understand @Query and parameter passing to@Query
4. Generate API documentation using Swagger 2
5. Create custom exceptions TrackNotFoundException, TrackAlreadyExistsException in acom.stack....exceptions package.
Perform appropriate exception handling and propagationBack.
6. Running Logic on Startup in Spring. Create seed data to pre-fill the database with trackinformation whenever the application starts.
Use both approaches:
Approach 1: ApplicationListener<ContextRefreshedEvent>
Approach 2: CommandLineRunner (Find out how it differs from ApplicationRunner)
7.Global exception using Controller advice
8.Remove all hard coded data from the application code to application.properties
a)by using @Value.
b)by using @PropertySource
c)by using ​​ Environment(https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/Environment.html)
9. Add @Lombok(https://drive.google.com/file/d/1QQpEQZbDD9pmW2qrhYsx5N9XYQ5bJ5dM/view)
10.Provide a second implementation of MuzixService. Name it MuzixServiceImpl2 and use @Primary and @Qualifier annotations for the required implementation.