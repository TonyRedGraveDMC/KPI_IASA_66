call apache-maven-3.6.0\bin\mvn clean install
call apache-maven-3.6.0\bin\mvn -X clean verify cargo:run -Dcargo.servlet.port=9001