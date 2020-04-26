# continuous-delivery-demo
Demo of  continuous delivery using  Jenkins

# How to run jenkins on Windows host machine
docker run -d -p 7070:8080 -v //usr/local/bin/docker:/usr/bin/docker -v //var/run/docker.sock:/var/run/docker.sock jenkins/jenkins
