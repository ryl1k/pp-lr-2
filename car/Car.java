package car;

public class Car {
    private int id;
    private String model;
    private int year;
    private double price;
    private String number;


    public Car(int id, String model, int year, double price, String number) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
