# movie-catalog

This project comprises of 3 microservices
movie-catalog
movie-info
ratings-data

1st Api - Movie catalog api, i/p - userid, o/p - movie list with details
2nd Api - Movie Info service, i/p - movieId, o/p - movie details
3rd Api - Ratings Data Service, i/p - userId, o/p - movieId and ratings

Add the following properties to avoid errors from Eureka in Eureka Microservice:

server:
  port: 8761

eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false
  server:
    waitTimeInMsWhenSyncEmpty: 0
or
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false

--------------To avoid errors from Spring Cloud dependencies-----------------
Add the below code to enable spring cloud imports:
<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
	
Copy pasting dependencies will not directly import them, try rediting those properties and saving the pom to import them
--------------------------------------------------------------------------
To remove the NoSuchMethodError Exception, add below property under java version in pom.xml

<spring-cloud.version>Finchley.SR2</spring-cloud.version>

maven clean build and run the app.

-------------------------------------URLS------------------------------
Exposed from movie-catalog-service
http://localhost:8081/catalog/abc

Exposed from ratings-data-service
http://localhost:8083/ratingsdata/users/1

Exposed from movie-info-service
http://localhost:8082/movies/1

--------------Running application jar using cmdline to create another instance of service---------

java -jar movie-info-service-0.01-SNAPSHOT.jar (runs on the port specified in properties file)

java -Dserver.port=8203 -jar jar_name

--------------------Next Steps---------------------------------
Remove hardcoded data and use JPA to create data repositories
