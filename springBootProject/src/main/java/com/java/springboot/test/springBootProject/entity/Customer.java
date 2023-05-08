package main.java.com.java.springboot.test.springBootProject.entity;

@Entity
@Table(name="Customer")
public class Customer {
    private Object GenerationType;
    private Customer strategy;
    /**
     *
     */
    @Id
    @Column(name = "customer_id", length = 50)
    protected int customerid;
    @Column(name="customer_name",length=50)
    private static String customername;
    @Column(name="customer_address",length=60)
    private String customeraddress;
    @Column(name="mobile",length=12)
    private int mobile;

    public Customer(int customerid, String customername, String customeraddress, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public Customer(String customername) {
    }

    public Customer(String customername, String customeraddress, int mobile) {

    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public static String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public class Integer {
    }
}
