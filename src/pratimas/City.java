package pratimas;

public class City {

    private static String mytoString(String[] theAray, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < theAray.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            String item = theAray[i];
            sb.append(item);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] testArray = {"Troškūnai", "Kazlų rūda"};
        System.out.println(mytoString(testArray, ", "));
    }
}
