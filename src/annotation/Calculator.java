package annotation;

public class Calculator
{
    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    @Check
    public void add (int a,int b)
    {
        System.out.println(1/0);
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    @Check
    public void a (int a,int b)
    {
        System.out.println(1*0);
    }
    @Check
    public void b (int a,int b)
    {
        System.out.println(1+0);
    }

    @Check
    public void c (int a,int b)
    {
        System.out.println(1-0);
    }



}
