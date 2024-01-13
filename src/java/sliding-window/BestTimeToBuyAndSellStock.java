/*
* @Question https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
* @Level EASY
*/
public class BestTimeToBuyAndSellStock {
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;
        int left=0,right=1,profit=0;
        while(right<prices.length){
            int boughtAt=prices[left];
            int sellAt=prices[right];
            int diff=sellAt-boughtAt;
            if(diff>0){
                profit=Math.max(diff, profit);
            }
            else{
                left=right;
            }
            right++;
        }
        return profit;
    }

    public static void main(String[] args) {
        //Tests
        BestTimeToBuyAndSellStock obj=new BestTimeToBuyAndSellStock();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(obj.maxProfit(new int[]{7,6,4,3,1}));
    }
}
