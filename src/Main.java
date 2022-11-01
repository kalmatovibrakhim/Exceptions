import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        try(Car car = new Car("BMW","BLACK")) {
            car.drive();
        }catch (RuntimeException e) {
            System.out.println(e.getCause());
        }


    }
    public static void mMethod(int a) throws RuntimeException{

        if(a==1){
            throw new RuntimeException("a != 0");
        }
        else {
            System.out.println(123/a);
        }
    }
}