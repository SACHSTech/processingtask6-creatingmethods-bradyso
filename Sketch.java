import processing.core.PApplet;

 /**
 * Description: Drawing composites objects and its color using methods with parameters and return statements
 * @author: Brady So
 */

public class Sketch extends PApplet {
  
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Drawing clouds as background (circles)
    // Color is customizable
    // White
    cloudsColour(255, 255, 255);
    float cloudsDimension1 = clouds(35, 25, 200, 50);
    // Light grey
    cloudsColour(204, 204, 204);
    float cloudsDimension2 = clouds(175, 25, 200, 50);
    // White
    cloudsColour(255, 255, 255);
    float cloudsDimenstion3 = clouds(350, 25, 200, 50);
    // Light grey
    cloudsColour(204, 204, 204);
    float cloudsDimension4 = clouds(490, 25, 200, 50);
    
	  // Drawing the houses (Square)
    // Color is customizable
    // Red house
    colourHouse(153, 0, 0);
    float houseDimension = house(175, 135, 210, 200);
    // Blue house
    colourHouse(0, 0, 204);
    float houseDimension2 = house(430, 135, 150, 150);
    
    // Drawing the doors (Rectangle)
    // Color is customizable
    // Red house
    doorColour(153, 102, 0);
    float doorDimension1 = door(252, 230, 50, 70);
    doorColour(51, 51, 51);
    // Blue house
    float doorDimension2 = door(485, 230, 40, 60);

    // Drawing the roofs (Triangle)
    // Color is customizable
    // Red house
    roofColour(102, 51, 0);
    float roofDimension1 = roof(272, 45, 407, 145, 157, 145);
    // Blue house
    roofColour(153, 153, 153);
    float roofDimension2 = roof(490, 45, 610, 140, 400, 140);

    // Drawing windows (Squares)
    // Red house
    windowColour(204, 204, 204);
    float windowDimension1 = window(320, 157, 40, 40);
    windowColour(153, 153, 153);
    float windowDimension2 = window(195, 157, 40, 40);
    windowColour(204, 204, 204);
    float windowDimension3 = window(195, 230, 30, 30);
    windowColour(153, 153, 153);
    float windowDimension4 = window(325, 230, 30, 30);
    // Blue house
    windowColour(204, 204, 204);
    float windowDimension5 = window(450, 157, 30, 30);
    windowColour(153, 153, 153);
    float windowDimension6 = window(530, 157, 30, 30);
    windowColour(204, 204, 204);
    float windowDimension7 = window(450, 230, 20, 20);
    windowColour(153, 153, 153);
    float windowDimension8 = window(545, 230, 20, 20);
    // Drawing grass (Foreground)
    grassColour(0, 204, 0);
    float grassDimension = grass(0, 280, width, 500);

    // Drawing the tree trunk (Rectangles)
    // Dark brown
    treeTrunkColour(51, 0 ,0);
    float treeTrunkDimension1 = treeTrunk(18, 100, 50, 180);
    // Light brown
    treeTrunkColour(153, 102, 0);
    float treeTrunkDimension2 = treeTrunk(100, 100, 50, 180);

    // Drawing the tree bush (circle)
    // Dark green
    treeBushColour(0, 153, 0);
    float treeBushDimension1 = treeBush(42, 100, 80, 60);
    // Light green
    treeBushColour(102, 255, 102);
    float treeBushDimension2 = treeBush(125, 100, 80, 60);
  }
 /**
 * Method for the clouds
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public float clouds(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the colour of the house
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void cloudsColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
 /**
 * Method for the house
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the house
 */
 public float house(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
   return(X2 - X1) * (Y2 - Y1);
 }
 /**
 * Method for the colour of the house
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void colourHouse(float setup1, float setup2, float setup3){
   fill(setup1, setup2, setup3);
}
  /**
 * Method for the door
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the door
 */
 public float door(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
   return(X2 - X1) * (Y2 - Y1);
 }
 /**
 * Method for the colour of the door
 * @param setup1 first parameter to identify colour
 * @param setup2 second parameter to identify colour
 * @param setup3 third parameter to identify colour
 */
 void doorColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
  /**
 * Method for the roof
 * @param X1 The first horizontal coordinate
 * @param X2 The first vertical coordinate
 * @param X2 The second horizontal coordinate
 * @param Y2 The second vertical coordinate
 * @param X3 Horizontal size
 * @param Y3 Vertical size
 * @return the total area for the roof
 */
 public float roof(float X1, float Y1, float X2, float Y2, float X3, float Y3){
   triangle(X1, Y1, X2, Y2, X3, Y3);
   return(X3 - X2 - X1) * (Y3 - Y2 - Y1);
 }
 /**
 * Method for the color of the roof
 * @param setup1 first parameter to identify color
 * @param setup2 second parameter to identify color
 * @param setup3 third parameter to identify color
 */
 void roofColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
 /**
 * Method for the window
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the windows
 */
  public float window(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
    return(X2 - X1) * (Y2 - Y1);
  }
 /**
 * Method for the color of the house
 * @param setup1 first parameter to identify color
 * @param setup2 second parameter to identify color
 * @param setup3 third parameter to identify color
 */
 void windowColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  } 
 /**
 * Method for the grass
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the grass
 */
 public float grass(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
   return(X2 - X1) * (Y2 - Y1);
 }
 /**
 * Method for the color of the grass
 * @param setup1 first parameter to identify color
 * @param setup2 second parameter to identify color
 * @param setup3 third parameter to identify color
 */
 void grassColour(float setup1, float setup2, float setup3){
   fill(setup1, setup2, setup3);
 }
 /**
 * Method for the tree trunk
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the tree trunk
 */
 public float treeTrunk(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
   return(X2 - X1) * (Y2 - Y1);
 }
 /**
 * Method for the color of the treetrunk
 * @param setup1 first parameter to identify color
 * @param setup2 second parameter to identify color
 * @param setup3 third parameter to identify color
 */
 void treeTrunkColour(float setup1, float setup2, float setup3){
    fill(setup1, setup2, setup3);
  }
 /**
 * Method for the treebush
 * @param X1 Customizable horizontal coordinate
 * @param X2 Customizable vertical coordinate
 * @param X2 Customizable horizontal size
 * @param Y2 Customizable size
 * @return the total area for the tree bush
 */
 public float treeBush(float X1, float Y1, float X2, float Y2){
   ellipse(X1, Y1, X2, Y2);
   return(X2 - X1) * (Y2 - Y1);
 }
 /**
 * Method for the color of the treebush color
 * @param setup1 first parameter to identify color
 * @param setup2 second parameter to identify color
 * @param setup3 third parameter to identify color
 */
 void treeBushColour(float setup1, float setup2, float setup3){
   fill(setup1, setup2, setup3);
  }
}