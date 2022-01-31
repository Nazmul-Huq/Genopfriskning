package MowedGrass;

public class GrassMain {

    public static void main(String[] args) {

        // make different types of grass
        Grass playFieldGrass = new Grass(1.0,4);
        Grass homeLawnGrass = new Grass(2.0,10);
        Grass roadSideGrass = new Grass(0.5,15);

        // check days left to be mowed
        System.out.println("Days left to be mowed : " + playFieldGrass.daysLeftToMowed());
        System.out.println("Days left to be mowed : " + homeLawnGrass.daysLeftToMowed());
        System.out.println("Days left to be mowed : " + roadSideGrass.daysLeftToMowed());


    } // main() ends here

} // class GrassMain ends here
