package ObjectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    static class Song {
        String type;
        String songName;
        String time;

        //constr
        public Song (String type, String songName, String time){
            this.type = type;
            this.songName = songName;
            this.time = time;
        }

        public String getType() {
            return this.type;
        }

        public String getSongName() {
            return this.songName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntries = Integer.parseInt(scanner.nextLine());
        List<Song> listSongs = new ArrayList<>();

        for (int i = 0 ; i < numEntries ; i++){
            String inputS = scanner.nextLine();
            String[] commArr = inputS.split("_");
            String type = commArr[0];
            String name = commArr[1];
            String time = commArr[2];
            Song song = new Song(type,name,time);
            listSongs.add(song);
        }

        String inputFilter = scanner.nextLine();

        for (Song currSong : listSongs ){
            if (inputFilter.equals("all")){
                System.out.println(currSong.getSongName());
            }else{
                String songType = currSong.getType();
                if (songType.equals(inputFilter)){
                    System.out.println(currSong.getSongName());
                }
            }
        }
    }
}
