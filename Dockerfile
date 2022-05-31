#sample dockerfile
FROM adoptopenjdk:11-jdk
COPY . /usr/src/Mountains
WORKDIR /usr/src/Mountains
EXPOSE 8090
CMD ["java", "Main"]