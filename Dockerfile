FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Instala wait-for-it para aguardar o banco (opcional)
RUN apt-get update && apt-get install -y wait-for-it

# Copia o JAR gerado pelo Maven
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]