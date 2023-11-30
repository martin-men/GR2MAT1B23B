FROM tomcat:10.1.16-jre21-temurin-jammy

COPY target/Prueba1-IB_Grupo2_MA-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/Prueba1-IB_Grupo2_MA-1.0-SNAPSHOT.war

EXPOSE 8888
CMD ["catalina.sh", "run"]