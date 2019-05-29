package parts;

import headOrgans.Brain;
import headOrgans.Mouth;
import headOrgans.Nose;
import headOrgans.Ear;
import organs.HeadOrgan;

import java.util.List;
import java.util.ArrayList;


public class Head {
    private List<HeadOrgan> organs;
    public Head (Brain brain, Nose nose, Mouth mouth, Ear ear) throws NullPointerException {
        if (brain == null || nose == null || mouth == null || ear == null) {
            throw new NullPointerException("Weight of organ can't be less than 0 or such as 0");
        }
        this.organs = new ArrayList<>();
        organs.add(brain);
        organs.add(nose);
        organs.add(mouth);
        organs.add(ear);
    }
}

