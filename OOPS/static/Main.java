import java.net.SocketPermission;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        
        // int [] rollno=new int[5];
        // String [] name=new String[5];
        // float[] marks=new float[5];
        // Student []  students=new Student[5];
        // // Student [] students=new Student[5];
        // // Here Student [] students is created at compile time
        // Here new Student[5]; is created at run time
        // new keyword dynamically allocates memory and returns reference variable to it.
        // Student  hema = new Student();
        // Student  hems = new Student(2,"hello",13.6f);
        //constructor defines what will happen when object will be created
        // we want to do smt so that values are mentioned directly when we initiate it and it allocates some variables
        //Student kunquan = new Student(13,"kushwaha",90.5f);
       
        // hema.marks=12.2f;
        // hema.rno=6;
        // hema.name="outside"; 
        //If they r not initialized here itself then default
        // hema.greeting();
        // hems.changeName("Changed");

        // Student random=new Student(hema);
        // System.out.println(random.rno);
        // System.out.println(random.name);
        // System.out.println(random.marks);
        // System.out.println(hema.rno);
        // System.out.println(hema.name);
        // System.out.println(hema.marks);
        // System.out.println(hems.rno);
        // System.out.println(hems.name);
        // System.out.println(hems.marks);
        //Firstly it will look for is it mentioned , if not check default 
        // Student [] students=new Student[5];
        // System.out.println(Arrays.toString(students));
        // output: [null, null, null, null, null]

        //  Student random2=new Student();
        // //  random2=new Student();
        // System.out.println(random2.rno);
        // System.out.println(random2.name);
        // System.out.println(random2.marks);

        // Student stud1=new Student();
        // Student stud2=stud1;
        //Both above will point to the same object
        // for(int i =0;i<100000000;i++){
        //     random2=new Student();
        // }
        rectangle n= new B();
        n.rec(12,13);
        


    }
    //Class is template of an object
    //Object is instance of class
    //3 properties of a class: State, Behaviour, Identity
    //Variables inside object are known as instance variables
    //how to link object instance variables ? we put as student1.rollno i.e Dot operator
}
class Student{
        int  rno;
        String  name;
        float marks;

        // Student(){
        //     this.rno=4;
        //     this.name="ok";
        //     this.marks=333.4f;
        // }
        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }
        void greeting(){
            System.out.println("Hello "+this.name+"!");
        }
        void changeName(String name){
            this.name=name;
        }
        
        Student(Student other){
            this.name=other.name;
            this.marks=other.marks;
            this.rno=other.rno;
        }
        //Call a constructor from another constructor
        Student(){
            this(11,"random-2",6.4f);
        }
        // @Override
        // protected void finalize() throws Throwable {
        //     System.out.println("Destroyed");
        // }


    }
    class rectangle{
        void rec(int x, int y){
            System.out.println("inside main");
        }
    }
    class B extends rectangle{
        void rec(int x, int y){
            System.out.println("inside subclass");
        }
    }