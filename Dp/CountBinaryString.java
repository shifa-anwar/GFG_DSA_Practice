/*count BinaryStrings(no two consecutivee 1's are allowed)
*/
class Solution {
    long countStrings(int n) {
        // code here
        long m=1000000007;
    long zero = 1,one = 1;    
    for(int i=2;i<=n;i++)
    {
    long none = zero%m;
    long nzero = (one+zero)%m;
     one = none;
    zero = nzero;
    }
    return (zero+one)%m;
}
}