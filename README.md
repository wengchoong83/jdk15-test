# jdk15-test

this is me playing around with jdk15, spring boot 2, docker and k8s.

## To Build & Run
1. run `mvn clean install` or `./mvnw clean install` if you don't have maven installed.
2. `docker build -t jdk15-test .`
3. `docker run -dp 8080:8080 jdk15-test`   
4. to test: `curl localhost:8080`