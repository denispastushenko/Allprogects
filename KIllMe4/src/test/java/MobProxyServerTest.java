import annotation.Proxy;
import org.testng.annotations.Test;
import pages.Page;
import utils.ProxyServerUtils;


/**
 * Created by Billy on 7/15/2016.
*/


public class MobProxyServerTest extends OriginTest{
    @Test
    @Proxy
    public void mobProxyServerTest() throws InterruptedException {
        ProxyServerUtils.startServer();
        Page.getDriver().get("http://www.canadiantire.ca/en.html");
        Thread.sleep(3000);
    }
}
