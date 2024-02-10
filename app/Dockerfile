# Use a imagem base do OpenJDK
FROM openjdk:latest

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /usr/src/app

# Copie o arquivo JAR da sua aplicação para o contêiner
COPY ./app.jar .

# Comando a ser executado quando o contêiner for iniciado
CMD ["java", "-jar", "app.jar"]
