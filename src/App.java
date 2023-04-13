import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] fruits1 = new String[] {"Manga", "Uva", "Caju"};
        String[] fruits2 = new String[] {"Uva", "Uva", "Manga"};

        List<String> repeatedFruits = new ArrayList<>();

        for (int i = 0; i < fruits1.length; i++) {
            for (int j = 0; j < fruits2.length; j++) {
                if (fruits1[i] == fruits2[j] && !repeatedFruits.contains(fruits1[i])) {
                    repeatedFruits.add(fruits1[i]);
                }
            }
        }

        for (int s = 0; s < repeatedFruits.size(); s++) {
            System.out.println(repeatedFruits.get(s));
        }
    }
}
