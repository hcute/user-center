package link.hooray.alibaba.usercenter;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName LombokTest
 * @Description: 测试lombok
 * @Author hooray
 * @Date 2020/7/7
 * @Version V1.0
 **/

@Slf4j
public class LombokTest {

    public static void main(String[] args) {
        UserRegisterDTO build = UserRegisterDTO.builder().username("123").password("456").confirmPassword("1234").build();


        log.info("使用lombok构建的对象为:" + build);
    }
}


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor //为标记为final的属性生成构造方法
class UserRegisterDTO {
    private String username;
    private String password;
    private String confirmPassword;
}
