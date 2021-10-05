package LearnCollection.List;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by  manhpd.ho on 04/10/2021
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Truy cập phần tử từ list
        int number = numbers.get(2);
        System.out.println("Truy cập phần tử: " + number);

        // Loại bỏ phần tử khỏi list
        int removedNumber = numbers.remove(1);
        System.out.println("Loại bỏ phần tử: " + removedNumber);

        //Chỉ định tổng phần tử mà Array list có thể chứa.
        //System.out.println("tổng phần tử mà Array list có thể chứa: "+numbers.ensureCapacity(2););
    }
}
