public class Main {
    public static void main(String[] args) {
        shapes shape=new shapes();
        circle cir=new circle();
        shapes sq=new triangle();

        sq.area();
    }
}

//Polymorphism
// 2 types: 1: Compile time/Static polymorphism
//Achieved using method  overloading( same name but argument, ordering return type may be different, example multiple constructors)
//Java determines which method to be called during compile time
//
