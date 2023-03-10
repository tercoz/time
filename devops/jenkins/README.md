# Jenkins pipeline

 Install jenkins using guide: https://www.jenkins.io/doc/book/installing/docker/
 
A command to run jenkins: 
`docker run --name jenkins-blueocean --detach --network jenkins --env DOCKER_HOST=tcp://docker:2376 --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 --volume jenkins-data:/var/jenkins_home --volume jenkins-docker-certs:/certs/client:ro --volume "/home":/home --restart=on-failure --env JAVA_OPTS="-Dhudson.plugins.git.GitSCM.ALLOW_LOCAL_CHECKOUT=true" --publish 8080:8080 --publish 50000:50000 myjenkins-blueocean:2.387.1-1`