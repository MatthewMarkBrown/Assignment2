package src.za;

//import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private App calc;

    @BeforeMethod
    public void setUp() throws Exception{
       //calc = new AppCalcImpl();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       calc = (App)ctx.getBean("calc");

}
    @AfterMethod
    public void tearDown() throws Exception{

    }

    /**
     * Rigorous Test :-)
     */
    @Test
        public void testAd() throws Exception
        {
            App calc = new AppCalcImpl();
            int result = calc.multiply(5,5);
            Assert.assertEquals(25, result );
    }


 /*     public void  shouldAnswerWithTrue(){
        App calc = new AppCalcImpl();

    }
*/
}
