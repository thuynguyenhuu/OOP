package Generics;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer>[] humans = new Pair[3];

        humans[0] = new Pair<>("Brid", 150);
        humans[1] = new Pair<>("Michelle", 190);
        humans[2] = new Pair<>("Lany", 662);

        System.out.println(humans[0]);
        System.out.println(highestHuman(humans));
    }

    public static String highestHuman(Pair<String, Integer>[] humans) 
    {
        String highestHuman = "";
        int maxHeight = 0;

        for (Pair<String, Integer> human : humans) 
        {
            String name = human.getFirst();
            int height = human.getSecond();

            if (height > maxHeight) 
            {
            	maxHeight = height;
            	highestHuman = name;
            }
        }

        return highestHuman;
    }
}