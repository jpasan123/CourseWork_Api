package cwproject.example.Coursework.Data;


import javax.persistence.*;

@Entity

@Table(name = "order_tlb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  whatever the strategy used in the table, apply it to here as well
    //  all these annotations is because this column is the most important column in the table
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private int amount;

    @Column(name = "customer_name")
    private String cname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
