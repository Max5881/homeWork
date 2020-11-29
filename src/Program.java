import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int read;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            read = Integer.parseInt(buffer.readLine());
            if (read == 100)break;
            arrayList.add(read);
        }
        num(arrayList);
    }
    public static ArrayList<Integer> num(ArrayList<Integer> arrayList){
        int num = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i)<0){
                num = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (num == arrayList.get(i)){
                System.out.println(arrayList.get(i));
            }
        }
        return arrayList;
    }
}