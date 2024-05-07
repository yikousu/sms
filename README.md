# sms
### 项目介绍

**项目名称：学校课程管理系统**

本项目是一个基于 Java 的 Spring Boot 框架开发的学校课程管理系统，旨在为学校提供一套完善的课程管理解决方案。该系统支持管理员、教师和学生等角色进行课程管理、学生管理、教师管理等操作，提高了学校课程管理的效率和便捷性。

### 技术栈

- **技术栈：**

  - **Spring Boot：** 作为项目的核心框架，提供了快速构建应用程序的能力。
  - **Spring MVC：** 用于构建 Web 层的框架，实现了前后端分离的开发模式。
  - **MySQL：** 作为关系型数据库，存储了管理员、教师、学生等用户信息，以及课程、课程安排等数据。
  - **MyBatis：** 持久层框架，用于与数据库交互，实现了数据的增删改查操作。
  - **JWT：** 用于身份验证和授权，保障了系统的安全性。
  - **Nginx：** 作为反向代理服务器，用于负载均衡和静态资源的部署。

  - **Vue.js：** 用于构建前端用户界面，实现了页面的动态渲染和交互效果。

### 功能模块

1. **用户管理：** 包括管理员、教师、学生等用户的管理，支持用户的增删改查操作。
2. **课程管理：** 管理员可以对课程进行管理，包括课程的添加、修改、删除等操作。
3. **课程安排：** 教师可以对课程进行安排，包括课程的时间、地点等信息的管理。
4. **学生成绩：** 教师可以录入学生的成绩，学生可以查看自己的成绩情况。
5. **数据统计：** 提供了课程选课人数、成绩分布等数据统计功能，帮助管理员和教师更好地了解课程情况。

### 扩展优化

1. **安全优化：** 使用 JWT 进行身份验证和授权，保障用户数据的安全性。
2. **性能优化：** 使用 MySQL 数据库进行数据存储，并对数据库进行索引优化，提高了系统的查询效率。
3. **可扩展性优化：** 采用了分层架构设计，使系统具有良好的可扩展性，方便后续功能的扩展和升级。

通过以上技术和功能的应用，本项目为学校提供了一套完善的课程管理解决方案，为教师和学生的学习和管理提供了便利和支持。
