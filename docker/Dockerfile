FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S user && adduser -S user -G user
USER user:user
COPY app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]