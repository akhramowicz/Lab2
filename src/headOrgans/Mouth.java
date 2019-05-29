package headOrgans;

import organs.HeadOrgan;
import bodyOrgans.Stomach;

public class Mouth extends HeadOrgan {
    double size;
    public Mouth (double m, double s){
        super(m);
        this.size = s;
    }
    public enum Taste{
        SALTY("salty"),
        SWEET("sweet"),
        BITTER("bitter"),
        ACIDIC("acidic"),
        TASTELESS("tasteless");
        private String result;
        Taste(String res) {
            result = res;
        }
        public String getTaste(){
            return result;
        }
    }
    public enum Talking{
        YES("Yes, I am talking"),
        NO("...");
        private String result;
        Talking(String res) {
            result = res;
        }
        public String getTalking(){
            return result;
        }
    }
    void eat (Brain brain, Stomach stomach) {
        int number = 5;
        int choice = (int)(Math.random()*number);
        Taste taste = Taste.values()[choice];
        this.getInformationOfTaste(brain, taste.getTaste(), stomach );
    }
    void talk (Brain brain) {
        int number = 2;
        int choice = (int)(Math.random()*number);
        Talking talking = Talking.values()[choice];
        brain.receiveOrgansData(talking.getTalking());
    }
    void getInformationOfTaste(Brain brain, String foodName, Stomach stomach){
        brain.receiveOrgansData(foodName);
        this.transferFood(stomach, foodName);

    }
    void transferFood(Stomach stomach, String foodName){
        stomach.getFood(foodName);
    }
}
