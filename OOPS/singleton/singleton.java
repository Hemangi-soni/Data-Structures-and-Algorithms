package singleton;
public class singleton {
    // a class of which only 1 object can be created
    // this happens using constructor so declare it as private
    private singleton(){

    }
    private static singleton instance;

    public static singleton getInstance(){
        //check whether 1 object is created or not
        if(instance == null){
            instance=new singleton();
        }
        return instance;
        
    }
}
