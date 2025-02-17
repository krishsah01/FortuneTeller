import java.util.ArrayList;
import java.util.Random;

public class FortuneGenerator {
    private ArrayList<String> fortuneArr;
    private Random random;
    private int lastIndex = -1;
    public FortuneGenerator(){
        random = new Random();
        fortuneArr = new ArrayList<>();
        fortuneArr.add("Great fortune awaits you around the next corner.");
        fortuneArr.add("An unexpected journey will bring you new experiences.");
        fortuneArr.add("Someone close to you has exciting news to share.");
        fortuneArr.add("Success will follow your hard work and determination.");
        fortuneArr.add("You will soon make a valuable new connection.");
        fortuneArr.add("A surprise gift is heading your way.");
        fortuneArr.add("Trust your instincts—they will lead you to the right path.");
        fortuneArr.add("Your creativity will open new doors.");
        fortuneArr.add("An old friend will reach out with a pleasant surprise.");
        fortuneArr.add("The answer you seek will come in an unexpected form.");
        fortuneArr.add("A small change will bring great happiness.");
        fortuneArr.add("Your kindness will return to you multiplied.");
    }
    public String getFortune(){
        int newIndex;
        do {
            newIndex = random.nextInt(fortuneArr.size());
        }while(newIndex == lastIndex);

        lastIndex = newIndex;
        return fortuneArr.get(newIndex);
    }

}
