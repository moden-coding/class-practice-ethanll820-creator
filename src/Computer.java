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
    public void closewindow(){
        batteryloss = batteryloss -1;
    }
    public void charge1hour(){
        batterypercent = batterypercent + 25;
    }

    public void restart(){
        batteryloss = 1;
    }

    public void run1hour(){
        batterypercent = batterypercent - (5*batteryloss);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "This computer is " + owner + "'s" + ", it is a " + brand +" & it has "+batterypercent+"% battery left";
    }



    
}
