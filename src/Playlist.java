import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    public Playlist (){
        favoriteSongs[0] = "Tal Vez - Paulo Londra";
        favoriteSongs[1] = "Andrómeda - Wos";
        favoriteSongs[2] = "Golden Hour - JVKE";
        favoriteSongs[3] = "Danza Kuduro - Don Omar";
        favoriteSongs[4] = "Limbo - Daddy Yankee";
        favoriteSongs[5] = "Dile - Don Omar";
        favoriteSongs[6] = "A VOS - Milo J";
        favoriteSongs[7] = "El Retén REMIX - Criss & Ronny";
        favoriteSongs[8] = "She Don't Give a Fo - Duki";
        favoriteSongs[9] = "FEEL ME?? - Trueno";

        desertIslandPlaylist.add("Tú - Myke Towers");
        desertIslandPlaylist.add("Gyal You a Party Animal Remix - Charly Black");
        desertIslandPlaylist.add("Lonely - Akon");
        desertIslandPlaylist.add("Eladio Carrion: Bzrp Music Session - Bizarrap");
        desertIslandPlaylist.add("El taxi - Pitbull");
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

//        desertIslandPlaylist.remove("Andrómeda - Wos");
//        desertIslandPlaylist.remove("She Don't Give a Fo - Duki");
//        desertIslandPlaylist.remove("FEEL ME?? - Trueno");
//        desertIslandPlaylist.remove("Tú - Myke Towers");
//        desertIslandPlaylist.remove("Lonely - Akon");
//        desertIslandPlaylist.remove("Eladio Carrion: Bzrp Music Session - Bizarrap");
//        desertIslandPlaylist.remove("El taxi - Pitbull");
//        desertIslandPlaylist.remove("A vos - Milo J");
//        desertIslandPlaylist.remove("Tal vez - Paulo Londra");
//        desertIslandPlaylist.remove("Dile - Don Omar");
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
    }

    public void playSongs () {
        System.out.println("First three song of favorite list: ");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert island...");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    }
}
