import processing.core.PApplet;

public class Button {
    //opretter booleans så knappen kan fungere som en knap
    boolean pressed;
    boolean done;
    //her laver den variablerne der skal bruges til positionen og størelsen af knappen
    int x,y;
    int w,h;
    //her får den Processing Objekt
    PApplet p;
    // her er tekst variablen
    String t;
    // her gør den plads til acton så man kan indsætte hvad knappen skal gøre
    Action a;

    //her er konstruktøren der tager de indsatte værdier når man laver et knap objekt så indsætter man værderne og den sætter dem ind i de alerede lavet variabler her i klassen
    Button(int x, int y, int w, int h,String t,PApplet p){
        this.p=p;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.t=t;
    }
//her tegner den knappen
    void display(){
        p.fill(255);
        p.rect(x,y,w,h);
        p.fill(0);
        p.textAlign(p.CENTER);
        p.text(t,x+w/2,y+h/2);

        //her køre den den action knappen har fået hvis den er trykket
        if(pressed&&!done){
        a.execute();
        done=true;
        }
    }

// her chekker den om man er inde for knappens kanter og sætter knappen til pressed
    public void click(float xin,float yin){
        if (xin > x && xin < x + w && yin < y + h && yin > y ){
            pressed = true;
        }
    }
// her tilføjer den en action til knappen
    void addAction(Action a){
        this.a=a;
    }

    // her sætter den knappen er trykket til false når man giver slip på knappen
    void release(){
        pressed=false;
        done=false;
    }
}
