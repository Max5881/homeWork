import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String read;
        for (int i = 0; i < 5; i++) {
            read = reader.readLine();
            arrayList.add(read);
        }
        String min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < min.length()){
                min = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == min.length()){
                System.out.println(arrayList.get(i));
            }
        }

    }
}
