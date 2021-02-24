
int x1 = 150;
int x2 = 500;


void setup(){
  size(700, 500);
noFill();
}

void draw(){
 background(200);
  for(int i=30; i > 0; i--){

  ellipse(x1,250,i * 10, i *10);
}
for(int i=30; i > 0; i--){

  ellipse(x2,250,i * 10, i *10);
}

x1 ++;
x2 --;
}
