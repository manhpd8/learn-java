package LearnCollection.List;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by  manhpd.ho on 04/10/2021
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Tạo list numbers sử dụng LinkedList
        List<Integer> numbers = new LinkedList<>();

        // Thêm phần tử vào list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

    }
}
