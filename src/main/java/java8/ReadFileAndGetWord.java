package java8;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileAndGetWord {

    int getOccurance( String s, String wordTofind){

        if (s == null || wordTofind == null){
            return 0;
        }

        String [] numOfUniqueWord = s.split(wordTofind);
        int uumUniqueSplit = numOfUniqueWord.length;

       return uumUniqueSplit - 1;


    }
    public static void  main (String [] argv){

        String file ="/Users/Ajay/Downloads/100-0.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            String currentLine = reader.readLine();
            while (currentLine != null) {
                builder.append(currentLine);
                currentLine = reader.readLine();
            }

            reader.close();

            ReadFileAndGetWord readFileAndGetWord = new ReadFileAndGetWord();


            int count = readFileAndGetWord.getOccurance(builder.toString(), "Shakespeare");
            System.out.println ("Count is " + count);

            count = readFileAndGetWord.getOccurance("a a a", "Shakespeare");
            System.out.println ("Count is " + count);


            count = readFileAndGetWord.getOccurance("a  Shakespeare a a", "Shakespeare");
            System.out.println ("Count is " + count);
        }
        catch (Exception e){

            e.printStackTrace();

        }

    }
}
