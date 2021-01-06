
void setup() {
 
  // set the size of your sketch
  size(300,400);
}

void draw() {
    ellipse( 100,100, 100, 100);
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i =10; i>0 ;i--){
 ellipse(100,100, i*10,i*10)
  }
  
  //Use an if statement and modulo to alternate the color of your rings.
  

}
}
