import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] Adjectives = {"attractive", "beautiful", "dazzling", "elegant", "gorgeous", "shapely", "fit", "muscular", "fancy", "skinny"};
        String[] Noun = {"cat", "dog", "turtle", "elephant", "dolphin", "parrot", "fish", "shark", "tiger", "lion"};
        Random random = new Random();
        int randomadj = (random.nextInt(Adjectives.length));
        int randomnoun = (random.nextInt(Noun.length));
        System.out.println((Adjectives[randomadj]) + " " + (Noun[randomnoun]));
    }
}