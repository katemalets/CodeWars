package code.wars.java.Dubstep;

public class Dubstep {
    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    public static String SongDecoder (String song)
    {
        song = song.replace("WUB"," ");
        return song;
    }
}
