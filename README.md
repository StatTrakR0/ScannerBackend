# ScannerBackend
This repository was created for the 3dscanner startup backend, with detailed installation instructions.


Front-end Apps to work with this Spring Boot Server:
- [Angular](сылка)

## Run Spring Boot application
```
mvn spring-boot:run
```
## Definitely needs to be changed
1. @CrossOrigin("http://localhost:4200") in folder FileController(replace with the port you will use in angular)

