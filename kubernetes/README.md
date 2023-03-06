# Application deployment on kubernetes

## Create minikube cluster
1. minikube delete
2. minikube start --vm-driver=virtualbox

## Deploy application from local image
> Execute commands in the same terminal window
1. Configure environment to use minikube's Docker daemon `minikube docker-env`
2. To point your shell to minikube's docker-daemon, run: `eval $(minikube -p minikube docker-env)`
3. Create docker image of application right in the terminal window where steps 1 and 2 were performed `docker build -t tercoz/time .
   `
4. Edit deployment by setting the imagePullPolicy to Never, otherwise kubernetes will try to download the image then `kubectl create deployment time --image=tercoz/time:latest`
5. Make it available ouside cluster `kubectl expose deployment time --type="NodePort" --port 8080`
6. Get ip `minikube ip`
7. Get port `kubectl get services -n time`
8. Make a http request `curl http://ip:port/time`
