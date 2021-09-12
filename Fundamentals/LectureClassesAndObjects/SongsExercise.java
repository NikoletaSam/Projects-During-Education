package LectureClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {
            String input = scanner.nextLine();
            String[] information = input.split("_");
            String typeList = information[0];
            String name = information[1];
            String duration = information[2];
            Song song = new Song(typeList, name, duration);
            songs.add(song);
        }

        String type = scanner.nextLine();
        if (!type.equals("all")) {
            for (Song element : songs) {
                if (element.getTypeList().equals(type)) {
                    System.out.println(element);
                }
            }
        } else {
            for (Song element : songs) {
                System.out.println(element);
            }
        }
    }

    public static class Song {
        private String typeList;
        private String name;
        private String duration;

        public Song(String typeList, String name, String duration) {
            this.typeList = typeList;
            this.name = name;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return name;
        }

        public String getTypeList() {
            return typeList;
        }
    }
}
