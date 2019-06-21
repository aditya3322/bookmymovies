# BookMyMovies using Spring Boot Cloud Framework

## Technology Stack
* Java 8
* Spring Boot
* Spring Cloud Config Server
* Spring Cloud Api Gateway (Zuul)
* Spring Cloud Discovery Server (Eureka) 
* H2 Database

## Introduction
BookMyMovies application consists of microservice architecture pattern where there are well bounded context services for every bussiness usecases.

## Microservices
* config service : cerntralized configuration managment service for all microservices which uses spring cloud config server's shared native design to store configuration.
* auth-service: Auth service works as authrization provider which provide jwt token for session management
* registry service: registry service uses spring erueka services which provides centralized services discovery platform
* locate-theatre: First application service provide all the location, sublocation and theatres details.
