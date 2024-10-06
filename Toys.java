public class Toys{
  /*
  this class allows the subclasses to connect to this toys superclass 
  */
  
  // Instance Variables 
 private String type;
 private int Size;
 private double Price;
  
  // construcors no argument 
 public Toys(){
   this.type = type;
   this.Size = Size;
   this.Price = Price;
 }
  // parameter constructor
  public Toys (String type, int Size, double getPrice){
    this.type = type;
    this.Size = Size;
    this.Price = 10.99;

  }
  /*
  this returns and sets the defining statements of the toys sold
  */
  
  // accessor and mutator methods
 public String getType(){
   return type;
 }
 public void setType (String type){
   this.type = type;
 }
 public int Size(){
   return Size;
 }
 public void setSize (int Size){
   this.Size = Size;
 }
 public double getPrice(){
   return Price;
 }
 public void setPrice (double Price){
   this.Price = Price;
 }
  // toString() 
  public String toString(){
  String text = "Type: " + type + ", Size: " + Size + " Price: " + Price;
    return text;
  }
}