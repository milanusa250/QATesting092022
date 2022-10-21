package exceptions.compiletimeexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException{

        FileReader fr = new FileReader("/Users/nacer-zimu/GitHubProjects/Mar22-Weekdays-Project1/git");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

    }
}
