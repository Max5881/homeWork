import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Camry");
        arrayList.add("Moserati");
        arrayList.add("Maclaren");
        arrayList.add("AUDI");
        arrayList.add("BMW");
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));;
        }

    }
}
