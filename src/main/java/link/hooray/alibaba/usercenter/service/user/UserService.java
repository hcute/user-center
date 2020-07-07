package link.hooray.alibaba.usercenter.service.user;

import link.hooray.alibaba.usercenter.dao.user.UserMapper;
import link.hooray.alibaba.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author hooray
 * @Date 2020/7/7
 * @Version V1.0
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserMapper userMapper;

    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
