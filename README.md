# ensembl-elastic-rest-final

This application has two main tasks.

1. Add JSON objects into Elastic-Search server by querying MySQL database for latest tracks.
2. Provide rest end points to search tracks loaded from MySQL database.

Tracks can be searched by following parameters.

1. Unique keyword
2. Species
3. Type
4. Release
5. Division

You can get the deployed application here. And the working rest end point with provided data. When you are searching,
Unique keyword (text) is a mandetory parameter.

https://ensembl-elastic-rest.herokuapp.com/api/elastic-test/master/track/search_advanced?text=Genes&species=homo_sapiens&type=gene&release=89&division=ensembl

### Main technologies used in the project.

1. Spring Boot
2. JPA
3. Maven
4. Elastic-Search
5. MySQL

### How to clone repository and install dependencies

You need to clone the applicaton from github. To do so, please use the following command.
```
git clone https://github.com/chanakaDe/ensembl-elastic-rest-final.git
```
Now you have the latest update of this application. Next part is installing all the dependencies.

Since this is a maven applicatoion, there are many ways to install all the dependencies.
It should be quite straightforward to run your application from an IDE with some maven support (Eclipse, IntellIJ , NetBeans). These IDEs will take care about creating the correct classpath and also all the dependencies. This application is created using IntelliJ IDEA Community Version.

If you want to do it manually, please run the following command at the root folder structure of the project.
```
mvn clean install
```
This will compile your project and create the jar you defined in the pom.xml file. It runs the maven phases clean and every phase up to install (compile, test, etc).

This is a maven application and there are plenty of ways to run a maven application. Since this is a Spring Boot application, it doesn't need a seperate to run. If you need more information, please check https://projects.spring.io/spring-boot/ and "Features" section.

### How to configure application with database locations and elastic-search locations

This application contains one elastic search instance and also one mysql database instance. These two instances are configure in the project's `application.properties` file.

The project location : `/src/main/resources/application.properties`

Github location : `https://github.com/chanakaDe/ensembl-elastic-rest-final/blob/master/src/main/resources/application.properties`

To change Elastic-Search instance , you need to change following properties.
```
elasticsearch.clustername = ensembl-cluster
elasticsearch.host = 138.197.117.104
elasticsearch.port = 9300
```

To change MySQL database instance, you need to change following properties.
```
spring.datasource.url=jdbc:mysql://138.197.117.104:3306/ensembl_new
spring.datasource.username=root
spring.datasource.password=AthulaErpUtrip1
```

### How to deploy application into Heroku

