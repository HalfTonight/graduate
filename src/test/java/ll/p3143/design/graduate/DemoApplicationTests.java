package ll.p3143.design.graduate;

import ll.p3143.entity.Order;
import ll.p3143.entity.Product;
import ll.p3143.mapper.OrderMapper;
import ll.p3143.mapper.ProductMappper;

import ll.p3143.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ProductMappper productMappper;
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserMapper userMappper;

    @Test
    void contextLoads() {
        //System.out.println(orderMapper.selAllOrder());
//        System.out.println(userMappper.selAllUser());
       Product product = productMappper.selProductByProductName("5");
        System.out.println(product);



    }

}
