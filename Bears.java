public class Bears extends Legos {
/* 
  sets the defining statement of the bears height
*/
  int height;

  public Bears (){
    super();
    this.height = 2;
  }
  // return statements 
  public int getHeight(){
    return height;
  }
  public void setHeight (int height){
    height = height;
  // toString
  public String toString(){
   String text = "Toy: Bears /n";
    text += super.toString ();
    text+= ", Height: " + height;
    return text;
  }
}