FROM maven:3.9-eclipse-temurin-21-alpine

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

#Copy code LAST - changing code does NOT trigger re-download
COPY src ./src

#EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]