import java.io.*;
import java.util.StringTokenizer;

public class cf4
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int q = 1; q <= t; q++)
         {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long s = 0, totalSum = 0;
            long[] arr = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
             {
                arr[i] = Long.parseLong(st.nextToken());
                totalSum += arr[i];
            }
            
            for (int i = 0; i < n; i++)
             {
                for (int j = i + 1; j < n; j++) 
                {
                    long remainingSum = totalSum - arr[i] - arr[j];
                    if (remainingSum >= x && remainingSum <= y) 
                    {
                        s++;
                    }
                }
            }
            
            System.out.println(s);
        }
    }
}
