import java.util.Date;

public class Order {
    private Date date;
    private String status;

    public double calcSubTotal(){
        return 0.0;
    }

    public double calcTax(){
        return 0.0;
    }

    public double calcTotal(){
        return 0.0;
    }

    public double calcTotalWeight(){
        return 0.0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}