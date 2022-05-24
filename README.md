# ScannerBackend
This repository was created for the 3dscanner startup backend, with detailed installation instructions.


Front-end Apps to work with this Spring Boot Server:
- [Angular]([сылка](https://github.com/StatTrakR0/-ScannerFrontend))

## Run Spring Boot application
```
mvn spring-boot:run
```
## Definitely needs to be changed
1. @CrossOrigin("http://localhost:4200") in folder "FileController"(replace with the port you will use in angular)
2. Change "application.properties" 
3. java version 1.8

## Data base
1. Install mySQL
2. Create data base and table
3. Paste the link to the database and table in "application.properties"
