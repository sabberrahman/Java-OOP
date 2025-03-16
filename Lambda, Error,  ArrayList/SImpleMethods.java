
public class Methods extends Inheritence {
    
    //over loading 
    private  int calculate(int length, int width, int height){return length*width*height;}
    private static double calculate(double length, double width, double height){return length*width*height;}
    
    //overridding 
    
    @Override void PlaySong(){
        System.out.println("Hhhhhhhhhhhnhhhhhhhh");
    }
    public static void main(String[] args) {
        // overridding 
        Methods myObj = new Methods();
        
        System.out.println(myObj.calculate(33,33,22)+" Sq Meter");
        System.out.println(calculate(3.33,23.3434,10.777)+ " Sq Meter");
        
        //ovr
        Methods mObj = new Methods();
        mObj.PlaySong();
       
        
        
    }
}
