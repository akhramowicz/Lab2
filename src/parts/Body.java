package parts;

import bodyOrgans.Stomach;
import organs.BodyOrgan;

import java.util.List;
import java.util.ArrayList;


public class Body {
    private List<BodyOrgan> organs;
    public Body (Stomach stomach) throws NullPointerException {
        if (stomach == null) {
            throw new NullPointerException("Weight of organ can't be less than 0 or such as 0");
        }
        this.organs = new ArrayList<>();
        organs.add(stomach);
    }
}
