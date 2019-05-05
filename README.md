# boot-on-docker-service

This is a simple tutorial to build a hello world spring boot application and run it on Docker instead of localhost. 
I have used the official guide here https://spring.io/guides/gs/spring-boot-docker/ to work on this application.

Pre-requisites:
1. First of all we need to install Docker on our machine which I am not covering as part of this exercise.
2. We need to have an account on dockerhub - https://hub.docker.com

Learn about Docker here:
https://docs.docker.com/develop/

Main steps are:
1. Create a simple spring boot application
2. Create Dockerfile where in the root directry of above app
3. Modify the pom.xml in order to build and push docker image for our app. 
4. Create docker image with this command - $ ./gradlew build docker
5. We can verify the docker image created inside the folder target/docker/
6. We can also check the image created here. We can now push this image to docker repository with following command
  docker push <image-name>
7. We can verify if the image has been pushed to repository or not by checking here - https://hub.docker.com
8. Finally execute the docker image and this will start our spring boot application with docker container
docker run -p 8080:8080 -t goyalshub/boot-on-docker-service

