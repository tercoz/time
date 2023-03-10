Install EFK (Elasticsearch, Fluent bit, Kibana) logging stack

Tutorial origin: https://medium.com/@jbsazon/aggregated-kubernetes-container-logs-with-fluent-bit-elasticsearch-and-kibana-5a9708c5dd9a

Create namespace in kubernetes cluster where all logging apps will reside `kubectl create namespace efk`

## Installing elasticsearch

Follow the link to install elasticsearch: https://github.com/elastic/helm-charts/tree/main/elasticsearch

I had to do this to start it on local docker https://www.elastic.co/guide/en/elasticsearch/reference/current/vm-max-map-count.html

Failed to cope EFK stack at the moment...