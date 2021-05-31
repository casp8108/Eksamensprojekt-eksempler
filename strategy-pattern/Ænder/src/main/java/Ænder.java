import processing.core.PApplet;

public class Ænder extends  PApplet {

    //Polymorfi, Strategy Pattern og Metoder

    ImageLoader imageLoader;

    Duck real = new RealDuck();
    Duck rubber = new RubberDuck();

    public static void main(String[] args ) {
        PApplet.main("Ænder");
    }

    @Override
    public void settings() {
        size(1000,1000);
    }

    public void setup(){
       imageLoader  = new ImageLoader(this);
       imageLoader.loadImages();



    }

    @Override
    public void draw() {
        background(0);
        real.display(this,imageLoader);
        rubber.display(this,imageLoader);
        textSize(20);
        real.noise(this,real.x,real.y);
        rubber.noise(this,rubber.x,rubber.y);
    }
}
