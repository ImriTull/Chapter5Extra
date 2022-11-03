package Poem;

import java.io.FileWriter;
import java.io.IOException;

public class MainTester {

    public static void main(String []args){

        try{
            FileWriter myFileWriter = new FileWriter("Poems.txt");
            Poem poem1 = new Poem();
            poem1.setName("We Real Cool");
            poem1.setPoet("Gwendolyn Brooks");

            Poem poem2 = new Poem();
            poem2.setName("I know Why the Caged Birds Sings");
            poem2.setPoet("Maya Angelou");

            Poem poem3 = new Poem();
            poem3.setName("The Road Not Taken");
            poem3.setPoet("Robert Frost");


            // this will write the poem.txt

            // poem 1 txt
            myFileWriter.write(poem1.getName()+ " \n");
            myFileWriter.write(poem1.setPoet()+ " \n");

            // poem 2 txt
            myFileWriter.write(poem2.getName()+ " \n");
            myFileWriter.write(poem2.setPoet()+ " \n");

            // poem 3 txt
            myFileWriter.write(poem3.getName()+ " \n");
            myFileWriter.write(poem3.setPoet()+ " \n");

            myFileWriter.close();
        }
        catch(IOException e){
            System.out.println("An error has occurred, please try again. :)");
            e.printStackTrace();
        }
    }



}
