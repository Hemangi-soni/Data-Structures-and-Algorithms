public class learnStatic {
    static int a=5;
    static int  b;
    //THIS WILL ONLY LOAD ONCE WHEN THE FIRST OPBJECT IS CREATED 
    
    static{
        System.out.println("Running static block");
        b=a*5;
    }
    public static void main(String[] args) {
        learnStatic obj1=new learnStatic();
        System.out.println(learnStatic.a+" "+ learnStatic.b);

        b+=20;
        System.out.println(learnStatic.b);
        learnStatic obj2=new learnStatic();
        System.out.println(learnStatic.b);
 

    }
    

}




// public static void main(String[] args) {
        //why static is used in main funcation?
        //when static is used that means you dont have to create object of that class before using it.
        //Main is the first thing to run so in order to run something you need to create object of the class
        // Within the static you cannot use anything non static
        // greeting();

    // }
    // static void fun(){
    //     // greeting();// you cant use this because greeting does not belong to an instance
    //     learnStatic obj=new learnStatic();
    //     obj.greeting();
    // }
    // static void greeting(){
    //     System.out.println("hello");
    // }
    // you can use static method under a non static method
