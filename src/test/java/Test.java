import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void test() throws InterruptedException {
        Indicator indicator = new Indicator();
        int a = 5;
        String result = indicator.indicator(a);
        assertEquals(result, "acidic");
    }
}