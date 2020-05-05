# continuous-delivery-demo
Demo of  continuous delivery using  Jenkins

# Prerequisites

1. Install Jenkins plugins
    - HTML Publisher
    - SonarQube Scanner
2. Install docker on Jenkins node.
   - In our case Jenkins is running inside Docker container on Windows machine. We need to bind Jenkins container's docker socket      
     to the host daemon docker socket with following command : 
     docker run -d -p 7070:8080 -v //usr/local/bin/docker:/usr/bin/docker -v //var/run/docker.sock:/var/run/docker.sock jenkins/jenkins
   - Connect to Jenkins container as a root
   
            *  winpty docker exec -u root -ti $CONTAINER_ID bin/bash
   - Then crate docker group and add jenkins user to the group : 
   
            * usermod -aG docker jenkins
            * groupadd docker
            * usermod -aG docker jenkins 
   - Grant executable access to docker socket inside container
   
            * chmod 666 /var/run/docker.sock
       
3. Configure SonarQube plugin
    - Jenkins->Configure System , "SonarQube servers" section
    - Check 'Enable injection of SonarQube server configuration as build environment variables'
    - Name : qasanovSonarCloud
    - Server URL : https://sonarcloud.io/
    - Server authentication token : Define token inside Jenkins credentials. You can generate token from Sonar Cloud
    
4. Configure Docker Hub
    - Jenkins->Credentials-
    - Define global credential with 'qasanovDockerHub' ID.
    - Provide your docker hub username and password
	
# How to run jenkins on Windows host machine
docker run -d -p 7070:8080 -v //usr/local/bin/docker:/usr/bin/docker -v //var/run/docker.sock:/var/run/docker.sock jenkins/jenkins

References
 - Book 'Continuous Delivery with Docker and Jenkins' by Rafal Leszko
