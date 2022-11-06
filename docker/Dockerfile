FROM openjdk:8-jdk-alpine
MAINTAINER docker_maven openim@czqu.net
WORKDIR VOLUME /tmp
CMD ["java", "-version"]
ARG JAR_FILE
ADD ${JAR_FILE} /app.jar
EXPOSE 8881
ENTRYPOINT ["java", "-jar", "/app.jar"]