import java.util.*;

public class uuidgenerator {
    public static String generateUUID() {
        String uuid = "";
        Random random = new Random();
        String[] characters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        
        for (int i = 1; i < 9; i++) {
            int randomIndex = random.nextInt(characters.length);
            uuid += characters[randomIndex];
        }

        uuid += "-";
        for (int i = 1; i < 4; i++) {
            for (int x = 1; x < 5; x++) {
                int randomIndex = random.nextInt(characters.length);
                uuid += characters[randomIndex];
            }
            uuid += "-";
        }

        for (int i = 1; i < 13; i++) {
            int randomIndex = random.nextInt(characters.length);
            uuid += characters[randomIndex];
        }

        return uuid;
    }

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of UUIDs: ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(generateUUID());
        }
    }
}
