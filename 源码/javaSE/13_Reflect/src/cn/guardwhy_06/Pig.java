package cn.guardwhy_06;
/**
 * pig类
 */
public class Pig {
    private String name ;
    private String onwer ;
    private double weight ;

    public Pig() {
    }

    public Pig(String name, String onwer, double weight) {
        this.name = name;
        this.onwer = onwer;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnwer() {
        return onwer;
    }

    public void setOnwer(String onwer) {
        this.onwer = onwer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
