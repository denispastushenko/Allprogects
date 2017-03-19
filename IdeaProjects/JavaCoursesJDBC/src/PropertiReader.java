import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("properties")
public class PropertiReader {
    public static PropertiReader getInstanse() {
        return propertiReader;
    }

    private static final PropertiReader propertiReader = new PropertiReader();
    @Property("db.url")
    private String dbUrl;
    @Property("db.user")
    private String dbUserName ;
    @Property("db.password")
    private String dbUserPass ;

    private PropertiReader() {
        PropertyLoader.populate(this);
    }

    public String getDbUrl() {

        return dbUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public String getDbUserPass() {
        return dbUserPass;
    }
}
