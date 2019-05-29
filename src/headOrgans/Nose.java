package headOrgans;

import organs.HeadOrgan;

public class Nose extends HeadOrgan {
    String shape = new String();
    public Nose (double m, String sh ) {
        super(m);
        shape = sh;
    }
    public enum Smell {
        CINNAMON("cinnamon"),
        GRASS("grass"),
        ORANGE("orange"),
        FOREST("forest"),
        RAIN("rain"),
        CHOCOLATE("chocolate"),
        STRAW("straw"),
        SEA("sea"),
        VANILLA("vanilla"),
        NOTHING("nothing");
        private String result;
        Smell(String res){
            result = res;
        }
        public String getSmell () {
            return result;
        }
    }
    public enum Scratch {
        YES ("Nose is scratching"),
        NO ("Nose isn't scratching");

        private String result;
        Scratch (String res) {
            result = res;
        }

        public String getScratch () {
            return result;
        }
    }
    void sniff(Brain brain) {
        int number = 10;
        int choice = (int) (Math.random()*number);
        Smell smell = Smell.values()[choice];
        brain.receiveOrgansData(smell.getSmell());

    }
    void scratch(Brain brain) {
        int number = 2;
        int choice = (int) (Math.random()*number);
        Scratch feeling = Scratch.values()[choice];
        brain.receiveOrgansData(feeling.getScratch());
    }
}
