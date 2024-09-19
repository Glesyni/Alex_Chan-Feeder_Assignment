public class Main 
{
    public static void main (String[] args)
    {
        Feeder g = new Feeder (500);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(1);
        System.out.println(g.getCurrentFood());
        System.out.println(g.simulateManyDays(10, 5)); 
        System.out.println(g.getCurrentFood());
        
    }
}