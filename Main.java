public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate (1.65 , 55 ); // рост м; вес кг

        System.out.println(index);

    }
}