//TO DEMONSTRATE DYNAMIC BINDING
class Human{
   
   public void walk()
   {
       System.out.println("Human walks");
   }
}
class Demo extends Human{
  
   public void walk(){
       System.out.println("Boy walks");
   }
   public static void main( String args[]) {
       
       Human obj1 = new Demo();
       
       Human obj2 = new Human();
       obj1.walk();
       obj2.walk();
   }
}
