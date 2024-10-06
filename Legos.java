public class Legos extends Toys{
/*
  this sets the defining part about the legos
*/
 int numParts;
// arguments 
  public Legos (){
    super();
    this.numParts = 100;
  }
  public Legos (String type, int Size, double Price){
    super (type, Size, Price);
    this.numParts = numParts;
  }
  // return statements
  public int getNumParts(){
    return numParts;
  }
  public void setNumParts (int numPartsUpdated){
    numParts = numPartsUpdated;
  }
  /* 
  connects the toStrings
  */
  public String toString (){
    String text = "Toy: Legos /n";
    text += super.toString();
    text += ", Parts: " + numParts;
    return text;
  }
}