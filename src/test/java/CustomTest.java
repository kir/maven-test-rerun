import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(TestGroup.class)
public class CustomTest {

    @Test
    public void alwaysPassingTest() {
        Assert.assertEquals(0, 0);
    }

    private static volatile int x = 0;

    @Test
    public synchronized void secondAttemptPassingTest() throws InterruptedException {
        Thread.sleep(5000);
        if (x++ == 0) {
            Assert.fail();
        }
    }

}
