public class BuySellStock {
 
    static int maxProfit(int prices[]){
        int profit=0, left=0, right=1, currentProfit ;
        while(right<prices.length){
            currentProfit = prices[right] - prices[left];
            if(prices[left] < prices[right]){
                profit = Math.max(currentProfit,profit) ;
            }
            else{
                left = right ;
            }
            right+=1 ;
        }
        return profit ;
    }

    static int maxProfit_(int prices[]){
    
        int profit = 0 ;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-prices[i]>profit){
                    profit = prices[j]-prices[i] ;
                }               
            }         
        }
        return profit ;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4} ;
        System.out.println(maxProfit(arr));
    }
    
}
