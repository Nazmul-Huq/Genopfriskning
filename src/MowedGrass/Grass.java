package MowedGrass;

public class Grass {

    private double currentLength;
    private int maxLength;


    public Grass(double currentLength, int maxLength) {
        this.currentLength = currentLength;
        this.maxLength = maxLength;
    }


    /**
     * method to check how many days left before next mow
     * int this calculation, we have considered the grass length should exceed the maximum length before mowed
     * @return
     */
    public double daysLeftToMowed(){

        // first get the length the grass need to grow to reach the maximum permitted length
        double lengthLeft = this.maxLength-this.currentLength;

        // calculate days left, and convert the value to its upper limit, eg, 1.2 or 1.5 or 1.8 will convert to 2
        double daysLeft = Math.ceil(lengthLeft / 0.8);

        // finally return days
        return daysLeft;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "currentLength=" + currentLength +
                ", maxLength=" + maxLength +
                '}';
    }

} // class Grass ends here
