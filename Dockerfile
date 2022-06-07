FROM openjdk:8
EXPOSE 8103
ADD target/PensionDisbursement-Microservice-0.0.1-SNAPSHOT.jar PensionDisbursement-Microservice-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/PensionDisbursement-Microservice-0.0.1-SNAPSHOT.jar"]