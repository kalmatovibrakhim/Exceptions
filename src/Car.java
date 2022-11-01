import java.io.Closeable;

public class Car implements AutoCloseable {
    private String name;
    private String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void close() {
        System.out.println("Машина закрывается");
    }

    public void drive(){
        System.out.println("Машина едет");
    }

}
