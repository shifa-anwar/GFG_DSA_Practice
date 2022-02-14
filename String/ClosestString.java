class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
       int min = Integer.MAX_VALUE;
        int s1=-1,s2=-1;
        for(int i=0;i<s.size();i++)
        {
        if(s.get(i).equals(word1))
        { s1=i;
        }
         if(s.get(i).equals(word2))
         {s2=i;}
         if(s1!=-1&&s2!=-1)
         min=Math.min(min,Math.abs(s2-s1));
        }
        return min;
    }
}