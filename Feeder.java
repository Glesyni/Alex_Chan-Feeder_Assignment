public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        int conditions = (int) (Math.random()*100);
        if (conditions < 5)
        {
            currentFood = 0;
        }
        
        else if (conditions >= 5)
        {
            int eatRandom = (int) (Math.random()*40 + 10);
            int foodEaten = eatRandom * numBirds;
            if (currentFood < foodEaten)
            {
                currentFood = 0;
            }
            else if (currentFood > foodEaten)
            {
                currentFood = currentFood - foodEaten;
            }
        }

    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int daysDone;
        for (daysDone = 0; daysDone<numDays; daysDone++)
        {
            if (currentFood>0)
            {
                simulateOneDay(numBirds);
            }
            else if (currentFood == 0)
            {
                break;
            }
        }
        return daysDone;
    }

    public int getCurrentFood()
    {
        return currentFood;
    }

    public Feeder (int c)
    {
        currentFood = c;
    }

    public Feeder () {}
}