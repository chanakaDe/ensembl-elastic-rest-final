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



