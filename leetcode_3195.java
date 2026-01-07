//3195
//Water Bottles II



class WaterBottles2 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles; 
        int empty = numBottles;  

        while (empty >= numExchange) {
            
            empty -= numExchange;   
            numBottles = 1;         
            total += numBottles;    
            empty += numBottles;    
            numExchange++;          
        }

        return total;
    }

    public static void main(String[] args) {
        WaterBottles2 sol = new WaterBottles2();
        System.out.println(sol.numWaterBottles(13, 6)); 
        System.out.println(sol.numWaterBottles(10, 3)); 
    }
}
