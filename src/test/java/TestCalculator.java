import classroom.Calculator;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestCalculator {

        Calculator casio;

        @Test(testName = "Test sum method")
        public void testSum() {
            casio = new Calculator();
            Assert.assertEquals(casio.sum(10, 20),30);
            }


        @Test
        public void testMultiply() {
            casio = new Calculator();
        Assert.assertEquals(casio.multiply(5,6),30);
        }

        @Test
        public void testDivide() {
            casio = new Calculator();
        Assert.assertEquals(casio.divide(18,3),6);
        }

        @Test
        public void testMinus () {
            casio = new Calculator();
        Assert.assertEquals(casio.minus(13,10),3);
        }

        @Test
        public void testSquare () {
            casio = new Calculator();
        Assert.assertEquals(casio.square(9),81);
        }

}
