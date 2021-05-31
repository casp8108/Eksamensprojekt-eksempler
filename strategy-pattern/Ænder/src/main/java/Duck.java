import processing.core.PApplet;

public class Duck {

    Sound sound;
    Image image;
    int x,y;

    void noise(PApplet p,int x,int y){
        sound.noise(p,x,y);


    }

    void display(PApplet p,ImageLoader imgLoad){

        image.display(p, imgLoad);
    }



}
