//NAME :  TEJESH KOLLAPANENI

//BATCH  :2576


//TYPES OF VARIABLES

class Variable // class creation , class name "variable"
{   
    int y=10; // instance variable
    static int z=45; // static variable
    static void m1() //method area
    {
        int x=25;// local variable
        System.out.println(x);//print x value
    }
    void m2()
    {
         System.out.println(y); //print y value
    }
    public static void main(String[] args)//main method
    {
      m1();//method 1 calling
      Variable obj=new Variable();  //object creation for class
      System.out.println(obj.y);instance variable access usind object "obj"
      void m2(); //method 2 calling
      System.out.println(Variable.z);//print z value using class name "Variable"
    }
}
