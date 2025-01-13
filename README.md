# Spring Cloud Gateway Samples

## Description

This project demonstrates the use of Spring Cloud Gateway as a gateway service, with Nacos as the service discovery center, to achieve load balancing access to sub-services. A simple example is provided.

## Project Structure

- `gateway-main-nacos`: Gateway service.
- `user-service`: Sub-service.
- `user-service-1`: Sub-service (as a copy of `user-service`).

## Features

- Use Nacos as the service discovery center for service registration and discovery. The `gateway-main-nacos` service performs load balancing.
- Various predicates are used for matching routes.

## Usage

### 1. Nacos

You can refer to this [link](https://nacos.io/en-us/docs/quick-start.html) to install Nacos.

### 2. Start `gateway-main-nacos`, `user-service`, and `user-service-1`

You need to modify some configurations in the `application.yml` file:

| Configuration Item         | Mandatory | Description                         |
| --------------------------- | --------- | ----------------------------------- |
| `server-addr`               | Yes       | Address of the Nacos service registry |
| `namespace`                 | Yes       | Nacos namespace                     |

Then start `gateway-main-nacos`, `user-service`, and `user-service-1` locally.

Accessing http://localhost:8888/user/hello multiple times will show that it returns "hello world user!" or "hello world user,another!", demonstrating load balancing.

Accessing this address also shows the same effect: http://localhost:8888/user01/hello. The two URLs use different route matching rules.

## Environment Requirements

- JDK1.8+
- -Nacos 1.3.0 Server
