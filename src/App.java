public class App {
    public static void main(String[] args) throws Exception {

    
    Computer Ethans = new Computer("Ethan", "apple", 100, 5 );
    System.out.println(Ethans);
    Ethans.run1hour();
    System.out.println(Ethans);
    Ethans.newwindow();
    System.out.println(Ethans);
    Ethans.restart();
    Ethans.run1hour();
    System.out.println(Ethans);
    Ethans.charge1hour();
    System.out.println(Ethans);
    Ethans.newwindow();
    Ethans.newwindow();
    Ethans.run1hour();
    System.out.println(Ethans);
    Ethans.closewindow();
    Ethans.run1hour();
    System.out.println(Ethans);
    }

}
