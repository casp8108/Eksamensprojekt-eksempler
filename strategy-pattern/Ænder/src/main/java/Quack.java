import processing.core.PApplet;

public class Quack implements Sound{

    @Override
    public void  noise(PApplet p,int x,int y) {
        p.text("Quack",x,y+200);

    }
}
