package ll.p3143.entity;

public class Order  {
//        <th>订单编号</th>
//        <th>收件人</th>
//        <th>联系电话</th>
//        <th>收件人地址</th>
//        <th>订单金额</th>
//        <th>配送方式</th>
    private int id;                 //自增主键

    private String orderNumber;     //订单编号

    private String receiver;        //收件人

    private String phone;           //联系电话

    private String direction;       //收件人地址

    private int orderAmount;     //订单金额

    private String dispatching;     //配送方式

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(int id, String orderNumber, String receiver, String phone, String direction, int orderAmount, String dispatching) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.receiver = receiver;
        this.phone = phone;
        this.direction = direction;
        this.orderAmount = orderAmount;
        this.dispatching = dispatching;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getDispatching() {
        return dispatching;
    }

    public void setDispatching(String dispatching) {
        this.dispatching = dispatching;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", receiver='" + receiver + '\'' +
                ", phone='" + phone + '\'' +
                ", direction='" + direction + '\'' +
                ", orderAmount=" + orderAmount +
                ", dispatching='" + dispatching + '\'' +
                '}';
    }
}
