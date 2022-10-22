import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> number = new HashSet<>();
        for (int i = 0; ; i++) {
            if (number.size() == 15) {
                break;
            }
            Random random = new Random();
            int r = random.nextInt(9);
            int h = random.nextInt(9);
            int t = 0;
            int y = 0;
            if (r != 0 && h != 0) {
                t = r;
                y = h;
            }
            if (!number.contains(t + "*" + y) || !number.contains(y + "*" + t)) {
                number.add(t + "*" + y);
            }

        }
        for (String nums: number)
        System.out.println(nums);
        System.out.println(number.size());
    }


}