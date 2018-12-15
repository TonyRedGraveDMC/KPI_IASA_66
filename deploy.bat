call apache-maven-3.6.0\bin\mvn clean install
call apache-maven-3.6.0\bin\mvn cargo:undeploy
call apache-maven-3.6.0\bin\mvn cargo:deploy
call apache-maven-3.6.0\bin\mvn cargo:start