public class ArrayEx1 {
    public static String[] swap(String[] array) {
        String temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        return array;
    }
}
