public class Item {
    private int shippingWeight;
    private String description;

    public double getPriceForQuantity(){
        return 0.0;
    }

    public double getTax(){
        return 0.0;
    }

    public boolean inStock(){
        return true;
    }

    public int getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(int shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}