package exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASpiralMoon on 2016/12/9.
 */
public class Exam1 {

    public static void main(String[] args) {

        int i, j, count = 0;

        List list = new ArrayList<>();
        for (i = 101; i <= 200; i++) {
            j = 2;
            while (j < i) {
                if (i % j == 0) break;
                j++;
            }

            if (j == i) {
                count++;
                list.add(i);
            }
        }
        System.out.print("101-200间总共有" + count + "个素数,分别是:");
        for (int k = 0; k < count; k++) {

            System.out.print(list.get(k));
            if (k < count - 1) {
                System.out.print(",");
            }

        }
    }

}
