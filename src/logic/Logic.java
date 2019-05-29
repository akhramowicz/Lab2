package logic;

import headOrgans.Brain;
import headOrgans.Mouth;
import headOrgans.Nose;
import headOrgans.Ear;
import organs.HeadOrgan;
import organs.BodyOrgan;
import bodyOrgans.Stomach;


public class Logic {
    public HeadOrgan headOrgan;
    public Mouth mouth;
    public Nose nose;
    public Brain brain;
    public Ear ear;
    public BodyOrgan bodyOrgan;
    public Stomach stomach;

    public Logic() {
        headOrgan= new HeadOrgan(100);
        mouth= new Mouth(100, 7);
        nose= new Nose(100,"straight");
        brain=new Brain(100,10);
        ear=new Ear(100, "blue");
        bodyOrgan=new BodyOrgan(150);
        stomach=new Stomach(150,200);

    }
    public Logic(HeadOrgan headOrgan, Mouth mouth, Nose nose,Brain brain, BodyOrgan bodyOrgan, Ear ear, Stomach stomach) throws NullPointerException{
        this.headOrgan=headOrgan;
        this.mouth=mouth;
        this.nose=nose;
        this.brain=brain;
        this.bodyOrgan = bodyOrgan;
        this.ear = ear;
        this.stomach = stomach;
    }
}
