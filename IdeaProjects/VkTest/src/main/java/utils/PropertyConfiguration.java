package utils;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

import java.util.Base64;

@Resource.Classpath("VkTest.properties")
public class PropertyConfiguration {
    private static final PropertyConfiguration INSTANCE = new PropertyConfiguration();

    @Property("start.url")
    private String startUrl;

    @Property("user.login")
    private String email;

    @Property("user.pass")
    private String password;

    private PropertyConfiguration() {
        PropertyLoader.populate(this);
    }

    public static PropertyConfiguration getInstance() {
        return INSTANCE;
    }

    public String getStartUrl() {
        return startUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return new String(Base64.getDecoder().decode(password));
    }
}
