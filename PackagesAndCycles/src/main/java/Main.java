import ru.netology.qamavendz.services.SQRService;

public class Main {
    public static void main(String[] args) {

        int number1 = 200;
        int number2 = 300;

        SQRService service = new SQRService();
        System.out.println(service.calcSqrt(number1,number2));
    }
}
