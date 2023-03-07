FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S user && adduser -S user -G user
USER user:user
WORKDIR /srv
COPY app.jar /srv/app.jar
ENTRYPOINT ["java","-jar","/srv/app.jar"]