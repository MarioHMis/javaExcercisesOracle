package duke.choice;

public class Clothing {
    private String description;
    private Double price;
    private String size = "M";

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price + (price *  MIN_TAX);
    }

    public void setPrice(Double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
