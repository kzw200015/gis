package cc.jktu.gis;

import cc.jktu.gis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class GisAppTests {

    @Autowired
    private UserService userService;

    @Test
    void test() {
        System.out.println(new BCryptPasswordEncoder().encode("123321"));
    }

}
