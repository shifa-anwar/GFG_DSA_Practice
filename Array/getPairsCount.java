class Solution {
    int getPairsCount(int[] arr, int n, int k) {
    
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
         if(map.containsKey(k-arr[i]))//check if element with whom first no will make sum exit in map or not
         count+=map.get(k-arr[i]);
         if(map.containsKey(arr[i]))
         map.put(arr[i],map.get(arr[i])+1);
         else
         map.put(arr[i],1);
        }
        return count;
    }
}
