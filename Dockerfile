FROM amazoncorretto:15

COPY target/jdk15-test-0.0.1-SNAPSHOT.jar /usr/local/src/app.jar
CMD ["/usr/bin/java", "-jar", "/usr/local/src/app.jar"]