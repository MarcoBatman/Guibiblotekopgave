# Guibiblotekopgave

Heya her er kode for seje knapper. 
Du kan kigge i GUILib mappen for at se et eksempel på et brug af Bibloteket.

Det her er en IntelliJ Lib der kræver at du allerede har importeret PApplet til dit projek siden den bruger proccesing lib. 
For at importere det her Lib skal du klikke på "File" -->  "Project Structure" --> "Libararies" --> "+" --> find filen på din pc og vælg den.

Nu hvor du har imprteret mit Lib så her er en liste over de funktioner du kan bruge:
Cunstuctor.
Button name = new Button(int x,int y,int w,int h,String text,PApplet);

for at tegne den.
name.Display

for at chekke at der bliver klikket
name.click(float x,float y)

for at give din knap en funktion.
name.addAction(new Action() {
                                     public void execute() {
                                        //skriv det din knap skal gøre her
                                     }
                                 }
        );
        
for at gøre noget på release af knap
name.release();
