package Main;

import searchingfile.filesearch2;


import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //create an obect of this class
        filesearch2 f = new filesearch2();
        Scanner input = new Scanner(System.in);
        boolean found;
        while(true){ // user input
            System.out.println("Enter java regular expression to be matched with file name");
            String name=input.next();

            String directory=File.separatorChar+System.getProperty("user.home");
            f.clear();
            int count =0;  //to count the number of occurences of the file

            found=f.findFiles(name,directory);

            count = f.getResult().size();

            if(!found){
                System.out.println("\nNo result found!");
            }
            else{
                System.out.println("\nFound " + count + " result!\n");
                for(File matched:f.getResult()){
                    System.out.println("Found : " + matched);
                }
            }
        }//end of while
    }
}
