public class Box{
    double l;
    double w;
    double h;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        //This is a square
        this.l=side;
        this.w=side;
        this.h=side;

    }
    Box(double l,double w,double h){
        
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box (Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void info(){
        System.out.println("running the box");
    }
    void common(){
        System.out.println("box common");
    }
}