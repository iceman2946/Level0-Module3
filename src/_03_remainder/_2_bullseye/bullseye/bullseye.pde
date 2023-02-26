
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int l=500;
  int w=500;
  for(int x=0; x<9; x++) {
    if(x%2==0) {
      fill(0,0,0);
    }
    else {
      fill(255,0,0);
    }
    ellipse(250,250,l,w);
     l-=50;
     w-=50;

  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
