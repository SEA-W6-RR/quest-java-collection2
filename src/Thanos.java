import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        // System.out.println("Employees (Before Sorting) : " + heroes); // gibt Hashes aus vor sort

        // This will use the `compareTo()` method of the `Hero` class to compare two heroes and sort them.
        Collections.sort(heroes);
        // System.out.println("\nEmployees (After Sorting) : " + heroes); // gibt Hashes aus nach sort

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        // Sort heroes by Age
        Comparator<Hero> heroAgeComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                // return h1.getAge().compareTo(h2.getAge());  // geht nicht, weil compareTo"getName"
                if(h1.getAge() > h2.getAge()) {
                    return -1;
                } else if (h1.getAge() < h2.getAge()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(heroes, heroAgeComparator);

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}