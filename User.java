public class User {
    private String username;
    private String avatar;
    private String firstName;
    private String lastName;
    private String email;
    private String url;
    private int userNextNumber = 0;
    private int userNumber;


    public User(String username, String avatar, String firstName, String lastName,String email, String url) {
        this.username = username;
        this.avatar = avatar;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.url = url;
        userNumber = userNextNumber;
        userNextNumber++;

    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    public String getUrl() {
        return url;
    }

    public void printUser() {
        System.out.println("User:" + username);
        System.out.println("Avatar:" + avatar);
        System.out.println("Name:" + firstName + " " + lastName);
        System.out.println("Email:" + email);
    }
}
