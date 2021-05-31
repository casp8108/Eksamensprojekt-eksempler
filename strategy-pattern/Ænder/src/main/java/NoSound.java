import processing.core.PApplet;

public class NoSound implements Sound {


        public void  noise(PApplet p,int x,int y) {
            p.text("Silence",x,y+200);

        }
    }

