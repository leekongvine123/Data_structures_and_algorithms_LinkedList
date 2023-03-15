/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author Admin
 */
public class Phone {

        private int id;
    private String name;
    private double price;
    private int amount;
    private int year;

    public Phone(int id, String name, double price, int amount, int year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.year = year;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + ", year=" + year + '}';
    }
    
   
   
    /**
     * @param args the command line arguments
     */
  
    
}
