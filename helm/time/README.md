# Application deployment on kubernetes with HELM

1. From helm/time directory run `helm lint`
2. From helm directory run `helm template time`
3. From helm directory run `helm install time ./time`
4. From helm directory run `helm list`
5. Get port from output of `kubectl get svc`
6. Check it works `curl $(minikube ip):31830/time`
