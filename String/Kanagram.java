class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        if(s1.length()!=s2.length())
        return false;
        else
        {
            int count=0;
          int hash[]=new int[26];
          int hash1[]=new int[26];
          for(int i=0;i<s1.length();i++)
          {
            hash[s1.charAt(i)-'a']++;
            hash1[s2.charAt(i)-'a']++;
          }
            for(int i=0;i<26;i++)
            {
                count+=Math.abs(hash1[i]-hash[i]);
            }
            count/=2;
            if(count<=k)
            return true;
        }
            
        return false;
    }
}