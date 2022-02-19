//First Non Repeating String
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
        if(!map.containsKey(S.charAt(i)))
        map.put(S.charAt(i),1);
        else
        {
        int value=map.get(S.charAt(i));    
        map.put(S.charAt(i),value+1);
        }
        }
        for(int i=0;i<S.length();i++)
        {
            if(map.get(S.charAt(i))==1)
            return S.charAt(i);
        }
        return '$';//to return -1
    }
}

