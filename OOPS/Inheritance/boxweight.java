public class boxweight extends Box{
    static double weight;
    public boxweight(){
        
        this.weight= -1;
    }
    public boxweight(double l,double w, double h, double weight){
        super(l,w,h);
        this.weight=weight;
    }
    // @Override
    // void common(){
    //     System.out.println("boxweight common");
    // }
    public boxweight(boxweight other){
        super(other);
        this.weight= other.weight;
    }
}
