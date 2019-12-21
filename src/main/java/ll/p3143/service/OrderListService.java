package ll.p3143.service;

import ll.p3143.entity.Order;
import ll.p3143.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListService {
    @Autowired
    OrderMapper orderMapper;
    public List<Order> selAllOrder(int pageNum,String num,String pname,String ptel){
        List<Order> orders = orderMapper.selAllOrder(pageNum,num,pname,ptel);
        return orders;
    }
}
