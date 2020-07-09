 PImage face; 
 int x = 217;
 int y = 374;
void setup() {
  face = loadImage ("googly eyes .jpeg");
 size(800,600);
    face.resize(800,600);
  
}

void draw() {
  background (face);
  if (mousePressed)  {println (mouseX, mouseY); }
  fill(255,255,255);
  ellipse(217,374,200,325);
  ellipse(523, 279, 200, 325);
  fill(x,,y);
  if ( mouseX <169) { 
    x=169; }
   else if ( mouseX >265) {
     x=265; }
   else { x=mouseX;}
  if( mouseY <267 ) {
    y=267;}
   else if ( mouseY >490 ) {
     y = 490; }
    else { y=mouseY;}
     
  ellipse(x, y,100,100); 
  ellipse(x+306, y -95, 100,100);
  
}
