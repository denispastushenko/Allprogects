import org.junit.*;

public class ExampleTest {

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("After Class");
    }

    @Test
    public void name() throws Exception {
        System.out.println("Test1");

    }

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Before Class");
    }

    @After
    public void Down() throws Exception {

        System.out.println("After");
    }

    @Before
    public void Up() throws Exception {
        System.out.println("Before ");


    }

    @Test
    public void name1() throws Exception {
        System.out.println("Test2");

    }
}
