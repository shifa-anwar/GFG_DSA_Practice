import java.util.Scanner;
public class WaveTraversal {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr[0].length;j++)
        {
            arr[i][j]=sc.nextInt();
        }
        }
        waveTraversal(arr);
    }
    public static void waveTraversal(int arr[][])
    {

      for(int j=arr[0].length-1;j>=0;j--)
      {
          if(j%2==0)
          {
            for(int i=arr.length-1;i>=0;i--) {
                System.out.print(arr[i][j] + " ");
            }
          }
          else
          {
           for(int i=0;i<arr.length;i++) {
               System.out.print(arr[i][j] + " ");
           }
          }
      }
     }
    }

