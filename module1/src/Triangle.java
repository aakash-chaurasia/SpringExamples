/**
 * Created by Aakash on 10/30/2016.
 */
public class Triangle {
    public String type;

    public Integer getHeight() {
        return height;
    }

    public Triangle(Integer height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Integer height;

    public void setHeight(Integer height) {
        this.height = height;
    }

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
        System.out.println(getType() + " Triangle drawn of height " + getHeight());
    }
}
