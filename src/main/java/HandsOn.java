import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class HandsOn {
    public static void main(String[] args) {
        String[] songs = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
        StringBuilder sb = new StringBuilder();
        for (String song : songs) {
            sb.append(song);
            sb.append(", ");
        }
        try(FileWriter writer = new FileWriter("songs.txt")){
            writer.write(sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("songs.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            //reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
