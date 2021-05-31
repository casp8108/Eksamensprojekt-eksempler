import processing.core.PApplet;
import processing.core.PImage;

public class ImageLoader {
    PApplet p;
    PImage rubberDuck, realDuck;
    ImageLoader(PApplet p){
        this.p = p;


    }
     void loadImages(){
        rubberDuck = p.loadImage("rubberDuck.png");
        realDuck = p.loadImage("realDuck.png");



    }

}
