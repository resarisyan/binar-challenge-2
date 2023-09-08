FROM openjdk:8
ADD /out/artifacts/Challenge2_jar/binar-fud-application.jar binar-fud-application.jar
ENTRYPOINT ["java", "-jar","binar-fud-application.jar"]
EXPOSE 8080