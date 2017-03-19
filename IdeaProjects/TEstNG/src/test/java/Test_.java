import org.testng.annotations.*;

public class Test_ {
    @BeforeClass
    public static void firstSetUP()throws Exception {
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public  void setUP()throws Exception{
        System.out.println("@BeforeMethod");

}

    @Test(description = "TEST A_a",dependsOnMethods = {"testTest_b","testTest_c"})
    public void testTest1() throws Exception {
        System.out.println("TEst_a");

    }
    @Test(description = "TEST A_b")
    public void testTest_b() throws Exception {
        System.out.println("TEst_b");

    }
    @Test(description = "TEST A_c")
    public void testTest_c() throws Exception {
        System.out.println("TEst_c");

    }

@AfterMethod
    public  void endJob()throws Exception{
        System.out.println("@AfterMethod");

    }
    @AfterClass
    public static void endJobFinal()throws Exception{
        System.out.println("@AfterClass");

    }

}
