# Application deployment on kubernetes

## Create minikube cluster
1. Start using minikube: https://minikube.sigs.k8s.io/docs/start/
2. minikube delete
3. minikube start --vm-driver=virtualbox

## Deploy application from local image
> Execute commands in the same terminal window
1. Configure environment to use minikube's Docker daemon `minikube docker-env`
2. To point your shell to minikube's docker-daemon, run: `eval $(minikube -p minikube docker-env)`
3. Create docker image of application right in the terminal window where steps 1 and 2 were performed `docker build -t tercoz/time .`
4. Check if it works `docker run -d -p 8080:8080 tercoz/time` then `curl $(minikube ip):8080/time`
5. Edit deployment by setting the imagePullPolicy to Never, otherwise kubernetes will try to download the image then `kubectl create deployment time --image=tercoz/time:latest`
6. Make it available ouside cluster `kubectl expose deployment time --type="NodePort" --port 8080`
7. Get ip `minikube ip`
8. Get port `kubectl get services -n time`
9. Make a http request `curl http://ip:port/time`

You can also just run from project root `kubectl apply -d kubernetes` a couple of times to apply all files in the folder.

To make it comfortable working with kubernetes when using namespaces set the working namespace:
`kubectl config set-context --current --namespace=<insert-namespace-name-here>`
