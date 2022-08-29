package au.edu.usc;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String[] files = {"False_1.json","False_2.json","False_3.json","False_4.json","False_5.json","True_1.json","True_2.json","True_3.json","True_4.json"};

        JSONParser parser = new JSONParser();
        for (int i = 0; i <= files.length - 1; i++)
        {
            try {
                Object obj = parser.parse(new FileReader("T1_test_cases/" + files[i]));
                JSONObject jsonObject = (JSONObject) obj;
                System.out.println("file " + files[i] + " is Valid");
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }
}
