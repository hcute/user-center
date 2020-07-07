package link.hooray.alibaba.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("link.hooray.alibaba")
@SpringBootApplication
public class UserCenterApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}
