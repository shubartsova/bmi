public class BmiService{
    public int calculate (double height, double weight) {

        int index = (int) ( weight / ( height * height ) );

        return index;
    }
}