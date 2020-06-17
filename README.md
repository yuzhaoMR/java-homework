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