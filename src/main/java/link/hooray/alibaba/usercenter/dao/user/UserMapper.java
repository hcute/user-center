package link.hooray.alibaba.usercenter.dao.user;

import link.hooray.alibaba.usercenter.domain.entity.user.User;
import tk.mybatis.mapper.common.Mapper;
/*
    @Repository @Component @Service @Controller 之间的区别和联系
        @Component, @Service, @Controller, @Repository是spring注解，注解后可以被spring框架所扫描并注入到spring容器来进行管理 。
        @Component是通用注解，其他三个注解是这个注解的拓展，并且具有了特定的功能 。
        @Repository注解在持久层中，具有将数据库操作抛出的原生异常翻译转化为spring的持久层异常的功能。
        @Controller是spring-mvc的注解，具有将请求进行转发，重定向的功能。
        @Service是业务逻辑层注解，这个注解只是标注该类处于业务逻辑层。
        用这些注解对应用进行分层之后，就能将请求处理，义务逻辑处理，数据库操作处理分离出来，为代码解耦，也方便了以后项目的维护和开发。
 */
//@Repository
public interface UserMapper extends Mapper<User> {
}