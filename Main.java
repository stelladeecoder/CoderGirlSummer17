
public class Main
{

    public static void main (String [] args)
    {   /* Create three objects (users) using constructor */

        User [] userInfo = new User [3];
        userInfo [0] = new User ("Chilli", "https://tinyurl.com/ybt9z6uw", "Rozonda","Thomas", "chilli@tlc.com","http://tlc.com");
        userInfo [1] = new User ("Tboz", "https://tinyurl.com/ydynfnee", "Tionne", "Watkins", "tboz@tlc.com", "http://tlc.com");
        userInfo [2] = new User ("LeftEye", "https://tinyurl.com/y8bpluhn", "Lisa", "Lopez", "lefteye@tlc.com", "http://tlc.com");

        for (int l=0; l < userInfo.length; l ++)
        { userInfo[l].printUser();
            System.out.println("");
        }


        Post [] post = new Post [5];
        post [0] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-waterfalls-lyrics",  "Don't go chasing waterfalls");
        post [1] = new Post (userInfo[0].getUsername(), "https://genius.com/Tlc-creep-lyrics",  "The 22nd of loneliness and we've been through so many things");
        post [2] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-diggin-on-you-lyrics",  "I was chilling with my Kool-aid when Miss Chilli came to relay");
        post [3] = new Post (userInfo[1].getUsername(), "https://genius.com/Tlc-red-light-special-lyrics",  "Take a good look at it, look at it now");
        post [4] = new Post (userInfo[2].getUsername(), "https://genius.com/Tlc-kick-your-game-lyrics", "I've been watchin' you, watchin' me" +
                "And I know you want it" );

        for (int i=0; i < post.length; i ++)
        { post[i].printPost();

        }


    }

}