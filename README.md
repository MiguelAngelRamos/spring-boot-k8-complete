## Comandos para despliegue K8S

```sh
  kubectl apply -f k8s/postgres-deployment.yaml
```

```sh
  kubectl apply -f k8s/postgres-service.yaml
```

```sh
  kubectl apply -f k8s/springboot-api-deployment.yaml
```

```sh
  kubectl apply -f k8s/springboot-api-service.yaml
```


```sh
 kubectl port-forward svc/spring-boot-service 8080:8080
```