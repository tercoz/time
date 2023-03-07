FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S user && adduser -S user -G user
USER user:user
COPY app.jar /srv/app.jar
ENTRYPOINT exec java -jar /srv/app.jar