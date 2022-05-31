#sample dockerfile
FROM adoptopenjdk:11-jdk
COPY /target/Mountains.jar /usr/src/mountains/Mountains.jar
WORKDIR /usr/src/mountains
EXPOSE 8090
CMD ["java", "-jar" ,"Mountains.jar"]