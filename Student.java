public class Student {

    String name; 
    double n1,n2,n3,fg,mp;

    public double fg(){
        return n1+n2+n3; 

    }
    public double mp(){
        if (fg() < 60.0) {
            return 60.0 - fg();
        } 
        else {
            return 0.0;
        }
    }
}