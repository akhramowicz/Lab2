package headOrgans;
import organs.HeadOrgan;

public class Ear extends HeadOrgan {
    String earring = new String();
    public Ear(double mass, String earring) {
      super(mass);
      this.earring = earring;
    }
    public enum Sound {
        MUSIC("music"),
        CONVERSATION("conversation"),
        SILENT("silent"),
        LAUGH("laugh");
        private String result;
        Sound(String res){
            result = res;
        }
        public String getSound() {
            return result;
        }
    }
    void listen(Brain brain){
        int number = 4;
        int choice = (int)(Math.random()*number);
        Sound sound = Sound.values()[choice];
        brain.receiveOrgansData(sound.getSound());
    }
}
