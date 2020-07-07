package link.hooray.alibaba.usercenter;

import link.hooray.alibaba.usercenter.dao.user.UserMapper;
import link.hooray.alibaba.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @ClassName TestController
 * @Description: 测试整合代码的正确性
 * @Author hooray
 * @Date 2020/7/7
 * @Version V1.0
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    /*
        @Resource 和 @Autowired区别
        - @Autowired 是按照byType 注入 @Resource 默认是按照byName注入
        - @Autowired 对象必须在spring容器中存在
     */
//    @Autowired 此处会报红色的处理方式 ，建议采用 @RequiredArgsConstructor(onConstructor = @__(@Autowired)) 这种方式处理
    private final UserMapper userMapper; // 认为是null

    @GetMapping("/test")
    public User testInsert(){
        User user = new User();
        user.setAvatarUrl("xxxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;
    }
}
