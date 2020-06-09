# spring-homework
Spring Boot和Spring Cloud的homework

1. 使用(Spring initializr)[https://start.spring.io/] 初始化项目，使用`Maven`/`Gradle`进行构建。
2. 创建**REST API**，实现对*User*的*CRUD*。*User*对象需要包含以下属性：`id`, `name`, `age`, `createdAt`, `updatedAt`等。
3. 使用`MySQL`/`PostgreSQL`进行数据持久化，使用`Flyway`/`Liquibase`进行**数据库版本控制**。
4. 使用`Junit5`和`Mockito`编写单元测试，除配置类外测试覆盖率**100%**。使用`jacoco`进行测试覆盖率检查。
5. 需要实现**分页查询**功能。
6. 需要实现**动态查询**，比如根据姓名和年龄或者创建时间区间进行查询。
7. 创建用户时，`id`、`createdAt`和`updatedAt`需要自动生成。
8. 使用`Docker`搭建*本地运行环境*, 本地Docker运行环境中使用不同`profile`。
