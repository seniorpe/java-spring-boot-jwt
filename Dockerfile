FROM maven:3.8.4-openjdk-11

WORKDIR /java-spring-boot-jwt
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run