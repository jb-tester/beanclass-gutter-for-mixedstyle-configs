package a.b.c;

/**
 * *
 * <p>beans for this class are defined in xml config and in java config</p>
 * <p>https://youtrack.jetbrains.com/issue/IDEA-100839</p>
 * *
 */
public class MyBean {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyBean{" +
               "id='" + id + '\'' +
               '}';
    }
}
