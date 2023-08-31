import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        MyHashMap salaries = new MyHashMap();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000000 + 1);

            String randomString = UUID.randomUUID().toString();
            names.add(randomString);

            salaries.put(randomString, randomNumber);
        }

        for (int i = 0; i < 100; i++) {
            String name = names.get(i);
            System.out.println("NAME: " + name + " VALUE: " + salaries.get(name));
        }
    }
}