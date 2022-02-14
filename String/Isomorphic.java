class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length())
        return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
         if(!map.containsKey(str1.charAt(i)))
         map.put(str1.charAt(i),i);
         if(!map1.containsKey(str2.charAt(i)))
         map1.put(str2.charAt(i),i);
          int x=map.get(str1.charAt(i));
         int y=map1.get(str2.charAt(i));
          if(x!=y)
        return false;
        }
        
        
        return true;
    }
}