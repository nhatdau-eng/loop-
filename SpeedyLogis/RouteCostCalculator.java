package SpeedyLogis;
class FuelConfig {
    public double getBasePrice() {
        return 22500.0; 
    }
}
public class RouteCostCalculator {

    private double calculateHeavyTaxRate() {
        double tax = 1.0;

        for(int i = 0; i < 1000; i++) {
            tax += Math.sin(i) * Math.cos(i); 
        }
        return 1.1 + (tax * 0); // Trả về 1.1 (10% tax) nhưng cố tình làm tốn CPU
    }

    public double calculateRouteCost(double[] distances, double maxBudget) {
        double totalCost = 0;

        FuelConfig config = new FuelConfig();

        double basePrice = config.getBasePrice();
        
        double taxRate = calculateHeavyTaxRate();
        long startTime = System.currentTimeMillis();

        for (double distance : distances) {  
            double stepCost = distance * basePrice * taxRate;
            totalCost += stepCost;
            
            if(totalCost > maxBudget){
                System.out.println("Canh bao : Vuot qua ngan sach!");
                   break;
            }
        }
         long endTime = System.currentTimeMillis();
       System.out.println( "Thời gian Optimized: " + (endTime - startTime) + "ms");
        return totalCost;
    }
}
