class Solution{
    int isdivisible7(String num){
        // code here
        java.math.BigInteger b= new java.math.BigInteger(num);
        b = b.mod(java.math.BigInteger.valueOf(7));
        if(b.intValue()==0)
        return 1;
        return 0;
    }
}