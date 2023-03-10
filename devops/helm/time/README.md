# Application deployment on kubernetes with HELM

From helm directory
1. Check chart `helm lint time`
2. Check files contents `helm template time`
3. Install on kubernetes `helm install time ./time`
4. Get list of helm releases `helm list`
5. Get port from output of `kubectl get svc`
6. Check it works `curl $(minikube ip):31830/time`
