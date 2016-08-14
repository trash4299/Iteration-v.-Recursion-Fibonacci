
public class Fibonacci
{
    public long ifibs(int i)
    {
        if((i==1)||(i==2))
           return 1;
        long sum = 1;
        long temp = 0;
        long temp2 = 1;
        for(int x=2;x<=i;x++)
        {
            sum=temp+temp2;
            temp = temp2;
            temp2 = sum;
        }
        return sum;
    }
    
    public long rfibs(int i)
    {
        if((i==1)||(i==2))
           return 1;
        return rfibs(i-1)+rfibs(i-2);
    }
}
