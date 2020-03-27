package test;

import junit.Calculator1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    /**
     * 先执行该方法
     * 资源的申请
     */
    @Before
    public void init()
    {
        System.out.println("initing ......");
    }


    /**
     * 最后执行该方法
     * 资源的释放
     */
    @After
    public void close()
    {
        System.out.println("releasing resources ......");
    }

    @Test
    public void testAdd()
    {
        Calculator1 c = new Calculator1();
        int result = c.add(1,2);
//        System.out.println(result);
        System.out.println("testAdd running ~~~");
        Assert.assertEquals(3,result);
    }
}
