FROM openjdk:8
EXPOSE 8080
ADD target/docker-devops-integration.jar docker-devops-integration.jar
ENTRYPOINT ["java","-jar","/docker-devops-integration.jar"]