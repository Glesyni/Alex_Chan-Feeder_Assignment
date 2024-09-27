public class Main 
{
    public static void main (String[] args)
    {
        Feeder Ex1 = new Feeder(500); 
        Ex1.simulateOneDay(12); 
        System.out.println(Ex1.getCurrentFood());
        Feeder Ex2 = new Feeder(1000); 
        Ex2.simulateOneDay(22);
        System.out.println(Ex2.getCurrentFood());
        Feeder Ex3 = new Feeder(100); 
        Ex3.simulateOneDay(5);
        System.out.println(Ex3.getCurrentFood());
        Feeder Ex4 = new Feeder(2400); 
        System.out.println(Ex4.simulateManyDays(10, 4)); 
        Feeder Ex5 = new Feeder(250); 
        System.out.println(Ex5.simulateManyDays(10, 5)); 
        Feeder Ex6 = new Feeder(0); 
        System.out.println(Ex6.simulateManyDays(5, 10));



        
        // Feeder g = new Feeder (500);
        // System.out.println(g.getCurrentFood());
        // g.simulateOneDay(1);
        // System.out.println(g.getCurrentFood());
        // System.out.println(g.simulateManyDays(10, 5)); 
        // System.out.println(g.getCurrentFood());
        
    }
}