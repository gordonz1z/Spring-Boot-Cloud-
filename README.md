# Project Aim:

You will set up a [Netflix Eureka service registry](https://github.com/spring-cloud/spring-cloud-netflix) and then build a client that both registers itself with the registry and uses it to resolve its own host. A service registry is useful because it enables client-side load-balancing and decouples service providers from consumers without the need for DNS.

## Workflow:

[C] Customer: demo-consumer-user

[P] Provide: demo-provider-booking

[R] [Registration Center](!https://spring.io/guides/gs/service-registration-and-discovery/): demo-eureka-server

## Example:

If you create and A Project and access from B Project, you can call registation center to access different project.

**Step 1** [P] -> [R]

Provide register project into Registration Center.

**Step 2** [C] -> [R]

Customer access the service from Registration Center



## Attachment

Project Files

![Images1](https://github.com/Z1ZAC/BookFun_Java_Boot/blob/master/demo_cloud/images/images1.png)

Eureka Server Example

![Images2](https://github.com/Z1ZAC/BookFun_Java_Boot/blob/master/demo_cloud/images/images2.png)

Provide Example

![Images3](https://github.com/Z1ZAC/BookFun_Java_Boot/blob/master/demo_cloud/images/images3.png)

Customer Example

![Images4](https://github.com/Z1ZAC/BookFun_Java_Boot/blob/master/demo_cloud/images/images4.png)