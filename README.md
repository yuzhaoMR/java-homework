# spring-homework
How to run project

1. git clone https://github.com/AuJavaTraining/spring-homework.git
2. cd spring-homework
3. docker-compose up
4. goto Eureka http://localhost:9090/register/ ,Account: admin ,Password: 123456
6. goto monitor 
    emailapi: http://localhost:9091/actuator
    userapi: http://localhost:9092/actuator
7. emailapi:http://localhost:9091/email/hello  
   gateway-emailapi: http://localhost:9000/email/email/hello and can get hello@rest.local
8. postman 
    Request:
        HTTPPOST:http://localhost:9002/users or http://localhost:9000/user/users
        Body:{
            {
                "name": "hello",
                "age": 10
            }   
        }
    Response:
        {
            hello@rest.local
        }
9. http://localhost:9092/users/1 or http://localhost:9000/user/users/1 


requirements:
1. 使用(Spring initializr)[https://start.spring.io/] 初始化项目，使用Maven/Gradle进行构建。
2. 创建REST API（User API），实现对User的CRUD。User对象需要包含以下属性：id, name, age, createdAt, updatedAt等。
3. 使用MySQL/PostgreSQL进行数据持久化，使用Flyway/Liquibase进行数据库版本控制。
4. 使用Junit5和Mockito编写单元测试，除配置类外测试覆盖率100%。使用jacoco进行测试覆盖率检查。
5. 需要实现分页查询功能。
6. 需要实现动态查询，比如根据姓名和年龄或者创建时间区间进行查询。
7. 创建用户时，id、createdAt和updatedAt需要自动生成。
8. 使用Docker搭建本地运行环境, 本地Docker运行环境中使用不同profile。
9. 创建第二个REST API（Email API），它根据 User 的ID，返回其邮箱地址。规则：如果id为 12345，那么邮箱地址为 12345@rest.local，即添加后缀即可。
10. 给 User API 和 Email 添加 actuator。
11. 创建一个 Eureka Server 项目并启动。
12 .把 User API 和 Email API 作为客户端，注册到 Eureka Server上。
13. 在 UserAPI 中添加或者修改返回用户详情的API，使其返回来自 Email API的邮箱地址。User API中，需要使用 Feign, Ribbon和Eureka Client进行负载均衡。
14. 在User API中使用 Hystrix，在调用Email API的部分添加断路器和fallback响应。访问 User API，同时手动关闭和打开 Email API，查看断路器的行为。
15. 使用 Spring Cloud Gateway 对外暴露 User API和Email API。
16. 使用 Spring Cloud Config 管理 User API的配置。
注意：Mac OSX 不能以 host 的网络模式启动 docker 容器。如果需要从Docker内部访问Mac主机，可以使用主机名 docker.for.mac.localhost。
