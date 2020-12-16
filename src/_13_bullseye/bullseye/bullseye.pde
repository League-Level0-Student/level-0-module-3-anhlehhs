
void setup() {
 
  // set the size of your sketch
  size(100,200);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0 ; i < 9; i++) {
  //Use an if statement and modulo to alternate the color of your rings.
  
  ellipse( 50,100, 30, 50);
 if( i % 2==0){
fill(255,0,0);
 }else if( i % 3==0);{
  fill(0,0,0) 
 }
}
}
