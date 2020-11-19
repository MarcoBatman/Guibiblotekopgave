import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args ) {
        PApplet.main("Main");
    }

    //her laver jeg de 2 knap objekter en til at slå med en 10 sidet terning og en anden til at lå med en 6 sidet terningeng men det kan de ikke endu
    Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!",this);
    Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!",this);
    Terning terning6 = new Terning(6);
    Terning terning10 = new Terning(10);
    //her oprettes de to variabler der skal bruges til at vise slagene af teringerne på skærmen
    int sum;
    int terningeKast;



    // her sættes størrelsen af vinduet
    @Override
    public void settings() {
        super.settings();
        size(500, 300);
    }

    public void setup() {

// her bliver den ting som knappen med 6 sider terningen skal gøre lavet
        buttonTerning6.addAction(new Action() {
                                     public void execute() {
                                         terningeKast = (int)random(1, terning6.sides+1);
                                         sum += terningeKast;
                                     }
                                 }
        );
// her bliver den ting som knappen med 10 sider terningen skal gøre lavet
        buttonTerning10.addAction(new Action() {
                                      public void execute() {
                                          terningeKast = (int)random(1, terning10.sides+1);
                                          sum += terningeKast;
                                      }
                                  }
        );
    }

   public void draw() {
        clear();
        // her bliver knapperne tegnet
        buttonTerning6.display();
        buttonTerning10.display();

        // her bliver teksten tegnet
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);

    }

   public void mousePressed() {
        // her ser den om knappen bliver klikket på
        buttonTerning6.click(mouseX,mouseY);
        buttonTerning10.click(mouseX,mouseY);
    }

    @Override
    public void mouseReleased() {
        // her giver den slip på terningen
        buttonTerning6.release();
        buttonTerning10.release();
    }
}
