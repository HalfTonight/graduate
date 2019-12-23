package ll.p3143.mapper;

import ll.p3143.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    /**
     *
     * @param pageNum
     * @param num
     * @param pname
     * @param ptel
     * @return
     */
    List<Order> selAllOrder(int pageNum,String num,String pname,String ptel);
    //通过传过来的订单编号查询order

    /**
     *
     * @param orderNumber ：传过来的订单编号
     * @return
     */
    Order selByOrderNumber(String orderNumber);

    void delByOrderNumber(String orderNumber);
}
