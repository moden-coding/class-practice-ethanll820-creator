public class Computer {
    private String owner ;
    private String brand ;
    private int batterypercent ;
    private int batteryloss;

    public Computer(String o, String b, int bp, int bl){
    brand = b;
    batterypercent = bp;
    batteryloss = bl;
    owner = o;


    }

    public void newwindow (){
        batteryloss = batteryloss + 1;

    }

    public void restart(){
        batteryloss = 0;
    }

    public void run1hour(){
        batterypercent = batterypercent - 10;
    }



    
}
