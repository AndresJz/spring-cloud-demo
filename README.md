# spring-cloud-demo

This repository contains microservices samples built using spring boot and spring cloud application development frameworks.

### Projects :

<table>
 <tr>
    <th style="text-align:left">Name</th>
    <th style="text-align:left">Port</th> 
    <th style="text-align:left">Description</th>
  </tr>
  <tr>
    <td><a href="/eureka-server"> eureka-server</a></td>
    <td>8080</td>
    <td>Eureka service registration server </td>
  </tr>
  <tr>
    <td><a href="/eureka-client-app1">eureka-client-app1</a></td>
    <td>8081</td>
    <td>Eureka service discovery client registered with eureka-server</td>
  </tr>
  <tr>
    <td><a href="/eureka-client-app2">eureka-client-app2</a></td>
    <td>8082</td>
    <td>Eureka service discovery client registered with eureka-server</td>
  </tr>
  <tr>
    <td><a href="/zuul-proxy">zuul-proxy</a></td>
    <td>8085</td>
    <td>Zuul reverse proxy server acting as reverse proxy pass to other microservices</td>
  </tr>

  <tr>
    <td><a href="/config-server">config-server</a></td>
    <td>8888</td>
    <td>Configuration server acting as a hub for centralized configuration</td>
  </tr>
  
</table>




#### Eureka Server Registration View :
 
 eureka-service : http://localhost:8080/ 

 ![eureka-server](images/eureka-server.png)
 

### How to run the project ? 

* Clone the repository

```sh
git clone https://github.com/AndresJz/spring-cloud-demo.git
```

* Execute below script to build all the applications

```sh 
cd spring-cloud-demo
./build.sh

or 
cd spring-cloud-demo
mvn clean package
```

* Start the applications

```sh

cd spring-cloud-demo

cd  eureka-server
mvn spring-boot:run

cd eureka-client-app1
mvn spring-boot:run

cd eureka-client-app2
mvn spring-boot:run

cd zuul-proxy
mvn spring-boot:run

cd config-server
mvn spring-boot:run

```

<b>Test the microservices in local </b>: 
 
```Shell
# Standalone App

$ curl http://localhost:8081/

$ curl http://localhost:8082/


# Zuul proxy

$ curl http://localhost:8085/app1/


$ curl http://localhost:8085/app2/

```

  