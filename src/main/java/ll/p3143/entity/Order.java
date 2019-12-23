package ll.p3143.entity;

public class Order  {
//        <th>订单编号</th>
//        <th>收件人</th>
//        <th>联系电话</th>
//        <th>收件人地址</th>
//        <th>订单金额</th>
//        <th>配送方式</th>
    private int id;                 //自增主键

    private int pid;                //与产品product的id对应,影应是多对一

    private String orderNumber;     //订单编号

    private String receiver;        //收件人

    private String phone;           //联系电话

    private String direction;       //收件人地址

    private int orderAmount;     //订单金额

    private String dispatching;     //配送方式

    private String remarks;         //备注

    private Product product;

    public Order() {
    }

    public Order(int id, int pid,String orderNumber, String receiver, String phone, String direction,
                 int orderAmount, String dispatching,String remarks, Product product) {
        this.id = id;
        this.pid=pid;
        this.orderNumber = orderNumber;
        this.receiver = receiver;
        this.phone = phone;
        this.direction = direction;
        this.orderAmount = orderAmount;
        this.dispatching = dispatching;
        this.remarks = remarks;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setId(int id) {
        this.id = id;
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

    public Product getProduct() {
        return product;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                "pid=" + pid +
                ", orderNumber='" + orderNumber + '\'' +
                ", receiver='" + receiver + '\'' +
                ", phone='" + phone + '\'' +
                ", direction='" + direction + '\'' +
                ", orderAmount=" + orderAmount +
                ", dispatching='" + dispatching + '\'' +
                ", remarks='" + remarks + '\'' +
                ", product=" + product +
                '}';
    }
}
