package module1;

/**
 * Created by Aakash on 10/30/2016.
 */
public class Triangle {
    public String type;

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public Triangle() {
    }

    public void setType(String type) {
        this.type = type;
    }
    public void draw() {
        System.out.println(type + " Triangle drawn");
    }
}
