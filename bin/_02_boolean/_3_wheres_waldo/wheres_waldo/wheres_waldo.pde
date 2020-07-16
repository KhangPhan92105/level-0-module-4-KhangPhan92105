/*
import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
*/
PImage waldo;
int x;
void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
   waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(755, 507); // Change this to match the size of your waldo picture
  image(waldo, 755, 507);

  /*
    doh = minim.loadSample("homer-doh.wav"); 
    woohoo = minim.loadSample("homer-woohoo.wav"); 
  */
}

void draw() {
  background(waldo);
  //x 464 y 256 -- x 532 y 358
  // x 0 x 5
  // x >= 0 && x <= 5
  if (mousePressed)  { println("X: " + mouseX + " Y: " + mouseY); 
 }
 // || or
 // && and
 if( mouseX >464 && mouseX <= 532 && mouseY >256 && mouseY <= 358) {println (" Very epic");}
  else { 
    println("0/11/0");}    // Use this print statement to find out the coordinates of Waldo when you press the mouse
      // println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”

/**********  Now to add the sounds. You will need to uncomment all the code and import the Minim library ********/

      // If Waldo is found, also use a method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
      
}
/*********************  Use the methods below, DON'T CHANGE THE CODE *********************/

/*
void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
*/
