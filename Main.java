public class Main
{
    public static void main(String[] args) throws Exception {
        Factorial(5);
    }
    public static int Factorial(int a) throws Exception
    {
        if(a<1 || a>10){
            throw new myexception("the number must be between 1 and 10");
        }
        else
        {
            int res =1;
            for(int i =1;i<=a;i++)
            {
                res*=i;
            }
            System.out.println(res);
            return(res);
        }

    }
}
