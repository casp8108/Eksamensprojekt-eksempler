import processing.core.PApplet;

public class DisplayRealDuck implements Image {
    @Override
    public void display(PApplet p,ImageLoader imageLoader) {
        p.image(imageLoader.realDuck,100,100);
    }
}
