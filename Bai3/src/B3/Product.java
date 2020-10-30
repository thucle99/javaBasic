
package B3;


public class Product {
   private String code,name;
   private int quantity;
   private boolean isNew;
   private double price;

    public Product() {
    }

    public Product(String code, String name, int quantity, 
            boolean isNew, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.isNew = isNew;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   public Object[] toObject(){
       return new Object[]{
           code,name,isNew,quantity,price
       };
   }
}
