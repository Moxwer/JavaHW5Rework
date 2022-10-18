import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        int limitMin = 3000;
        int limitMax = 5000;
        SQRService service = new SQRService();
        System.out.println("Количество квардатов " + service.calculate(limitMin, limitMax));
    }
}