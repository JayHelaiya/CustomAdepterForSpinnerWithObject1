package nichetech.com.customadepterforspinnerwithobject;

/**
 * Created by krunal on 17/3/16.
 */
public class Country {

    public Country(String name, int image) {
        this.name = name;
        this.image = image;
    }

    private String name;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
