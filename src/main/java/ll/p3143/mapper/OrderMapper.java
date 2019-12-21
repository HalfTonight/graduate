package ll.p3143.mapper;

import ll.p3143.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> selAllOrder(int pageNum,String num,String pname,String ptel);

}
