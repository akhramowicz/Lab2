package bodyOrgans;
import organs.BodyOrgan;

public class Stomach extends BodyOrgan{
    private double volume;
    public Stomach (double mass, double volume) {
        super(mass);
        this.volume = volume;
    }
    public void getFood(String foodName){
        this.digestFood(foodName);
    }
    private void digestFood(String foodName){
        foodName = null;
    }
}
