import processing.core.PApplet;

public class DisplayRubberDuck implements Image {
    public void display(PApplet p, ImageLoader imageLoader) {
        p.image(imageLoader.rubberDuck,500,0);
    }
}
