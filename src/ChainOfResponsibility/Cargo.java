package ChainOfResponsibility;

public class Cargo {
    private String country;
    private double weight;

    public Cargo(String country, double weight) {
        this.country = country;
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
