//1518
//Water Bottles
//we have given some water bottles and we can also exchange empty bottles at some exchange, we want to return max bottles we can drink


class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int empty = 0;

        while (numBottles > 0) {
           
            total += numBottles;
            empty += numBottles;
            //numBottles = 0;

           
            numBottles = empty / numExchange;
            empty = empty % numExchange;   
        }

        return total;
    }

    public static void main(String[] args) {
        WaterBottles sol = new WaterBottles();
        System.out.println(sol.numWaterBottles(9, 3));  // 13
        System.out.println(sol.numWaterBottles(15, 4)); // 19
        System.out.println(sol.numWaterBottles(5, 5));  // 6
    }
}
