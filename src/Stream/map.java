package Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  manhpd.ho on 28/03/2022
 */
public class map {
    public static void main(String[] args) {
        List<StudentDTO> dtoList = new ArrayList<>();
        for(int i=1;i<4;i++){
            StudentDTO studentDTO = new StudentDTO("name"+i,i);
            dtoList.add(studentDTO);
        }
        System.out.println(dtoList);
        //dtoList.stream().
    }
}
