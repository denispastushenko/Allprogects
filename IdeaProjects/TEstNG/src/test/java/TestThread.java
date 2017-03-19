import org.testng.annotations.Test;

public class TestThread {
    @Test(threadPoolSize = 5,invocationCount = 20,invocationTimeOut = 10000)
    public void testThread() throws Exception {
        System.out.println("Thread"+ Thread.currentThread().getId());
    }
}
