package sg.edu.np.mad.madpractical;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(){

    }

    public User(String N, String D, int ID) {
        name = N;
        description = D;
        id = ID;
        followed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean F) {
        followed = F;
    }
}