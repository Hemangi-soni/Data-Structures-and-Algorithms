


//outside classes cannot be static
public class innerclass {
    //creating an inne class
    // the classes which depend on  the outside clkasses cna be static
    // static class Test{
    //     String name;
    //     Test(String name){
    //         this.name = name;
    //     }
    // }
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }
    //static variables donot depend on objects
    //objects are created at runtime
    //static stuff are resolved during compile time

    public static void main(String[] args) {
        Test obj1=new Test("hema");
        Test obj2=new Test("hari");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
//This class canot be sttaic 
// static class B{

// }
