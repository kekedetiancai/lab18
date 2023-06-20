package cn.ckj.seig;

import cn.ckj.seig.controller.aaa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab18ApplicationTests {
    @Autowired
    private aaa aa;

    @Test
    void contextLoads() {
        System.out.println(aa.sss());
        System.out.println(aa.sss());
    }

}
