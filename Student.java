//NAME : TEJESH KOLLAPANENI
// BATCH  :  2576

//printing student details using "Scanner class"

class Student    // class creation , class name "Student"
{
    public static void main(String[] args) //main method 
    {
       int Student_id;// student id declaration
       String Sname;  // student name declaration
       double attendence; student attendence declaration
       
       System.out.println(" Enter Student details:");//get student details
       
       Scanner sc=new Scanner(System.in);//get the student details using SCANNER CLASS
     
       Student_id=sc.nextInt();//scanner object "sc" using type "nextInt()"
    
       Sname=sc.next();//scanner object "sc" using type "next()"

       attendence=sc.nextDouble();//scanner object"sc" using type "nextdouble()"

       System.out.println(Student_id+" "+Sname+" "+attendence); //print all the student details
     }
}
