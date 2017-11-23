public class Post {
    private static int nextPostNumber = 1;
    private String name;
    private int postNumber;
    private String postBody;
    private String linkUrl;

    public Post(String name, String linkUrl, String postBody) {
        this.name = name;
        this.postBody = postBody;
        this.linkUrl = linkUrl;
        this.postNumber = nextPostNumber;
        nextPostNumber++;
    }


    public void printPost() {
        System.out.println("Post Number " + postNumber + ".");
        System.out.println("This is " + name + " post");
        System.out.println(postBody);
        System.out.println(linkUrl);
        System.out.println("");
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public String getName() {
        return name;
    }

}