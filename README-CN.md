# Spring-Cloud-Gateway-Samples
								
# 描述

使用Spring Cloud Gateway作为网关服务，Nacos作为注册中心，实现对子服务的负载均衡访问。简单例子									

# 项目结构

- gateway-main-nacos: 网关服务。
- user-service: 子服务。
- user-service-1: 子服务(作为user-service的拷贝)。

# 特性

- 使用nacos作为注册中心，发现发布，gateway-main-nacos服务进行负载均衡。多种predicates进行匹配路由

# 用法

## 1.nacos

你可以参考这个(https://nacos.io/en-us/docs/quick-start.html) 去安装nacos。

## 2. 启动gateway-main-nacos、user-service、user-service-1

你需要修改application.yml文件中的一些配置

| 配置项                 | 是否必须 | 描述                         |
| --------------------------- | ---- | ---------------------------- |
| server-addr                 | 是  | nacos注册中心地址        |
| namespace         | 是  | nacos注册中心命名空间                  |

然后本地启动gateway-main-nacos、user-service、user-service-1。
访问 http://localhost:8888/user/hello，多次访问发现会返回 hello world user! 或者 hello world user,another!。达到负载均衡的效果。
访问这个地址也可以看到同样的效果， http://localhost:8888/user01/hello。两个url不用的路由匹配规则。

# 环境要求

- JDK1.8+




  





