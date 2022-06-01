#dockerfile for mountains git repo
FROM adoptopenjdk:11-jdk
COPY /target/Mountains.jar /usr/src/mountains/
WORKDIR /usr/src/mountains
EXPOSE 8090
CMD ["java", "-jar" ,"Mountains.jar"]