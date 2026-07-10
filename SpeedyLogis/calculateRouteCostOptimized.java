package SpeedyLogis;
import java.util.Random;
public class calculateRouteCostOptimized {
    public static void main(String[] args){
        int size = 1000000 ;
        double[] testDistances =
                new double[size];
        Random random = new Random();
        for(int i = 0; i < size; i++) {
        
            testDistances[i] = 1 + random.nextDouble() * 4;
        }
        double maxBudget = 
                22500 * 1.1 * 3 * 100000;
        RouteCostCalculator calculator = new RouteCostCalculator();

        long startLegacy =System.currentTimeMillis();

        double legacy = calculator.calculateRouteCost(testDistances, maxBudget);
        long endLegacy =  System.currentTimeMillis();
        System.out.println( "Legacy cost = " + legacy );

        System.out.println(  "Legacy time = "  + (endLegacy-startLegacy) +  " ms"    );
        double optimized = calculator.calculateRouteCost(testDistances, maxBudget);
        System.out.println( "Optimized cost = " + optimized );
    }
}