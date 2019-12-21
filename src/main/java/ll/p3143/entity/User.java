package ll.p3143.entity;

public class User {
//         <th>会员头像</th>
//        <th>会员账号</th>
//        <th>手机号码</th>
//        <th>电子邮件</th>
//        <th>验证</th>
//        <th>会员等级</th>
//        <th>账户余额</th>
//        <th>冻结资金</th>
//        <th>操作</th>
    private int id;                     //自增主键

    private String headPhoto;          //会员头像

    private String memberAccount;      //会员账号

    private String phoneNumber;         //手机号码

    private String email;       //电子邮件

    private int verify;       //验证

    private int memberShip;       //会员等级

    private Double balance;       //账户余额

    private Double frozenCapital;     //冻结资金

    public User() {

    }

    public User(int id, String headPhoto, String memberAccount, String phoneNumber,
                String email, int verify, int memberShip, Double balance, Double frozenCapital) {
        this.id = id;
        this.headPhoto = headPhoto;
        this.memberAccount = memberAccount;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.verify = verify;
        this.memberShip = memberShip;
        this.balance = balance;
        this.frozenCapital = frozenCapital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVerify() {
        return verify;
    }

    public void setVerify(int verify) {
        this.verify = verify;
    }

    public int getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(int memberShip) {
        this.memberShip = memberShip;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getFrozenCapital() {
        return frozenCapital;
    }

    public void setFrozenCapital(Double frozenCapital) {
        this.frozenCapital = frozenCapital;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", headPhoto='" + headPhoto + '\'' +
                ", memberAccount='" + memberAccount + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", verify='" + verify + '\'' +
                ", memberShip=" + memberShip +
                ", balance=" + balance +
                ", frozenCapital=" + frozenCapital +
                '}';
    }
}
