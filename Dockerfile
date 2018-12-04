
FROM java:8
WORKDIR /concours_springboot_angular
EXPOSE 8080
CMD java -jar /home/sahil/concours_springboot_angular/target/concours-0.0.1-SNAPSHOT.jar
