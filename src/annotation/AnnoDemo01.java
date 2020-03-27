package annotation;

/**
 * 注解的演示
 *
 * @since 1.5
 * @author buzhenyu
 * @version 1.0
 */

@MyAnno2
public class AnnoDemo01
{
    /**
     * sum
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    public int add(int a,int b)
    {
        return a+b;
    }
}
