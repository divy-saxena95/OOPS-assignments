package searchingfile;


import java.io.File;
import java.util.*;
import java.util.regex.*;
public class filesearch2  {

    private static List<File> result=new ArrayList<>();

    /**
     * getter function to get the mResultArray that is list of all matching files
     * @return Returns list of all matching files.
     */
    public List<File> getResult(){
        return result;
    }
    /**
     * Prints the complete path if file matching regex is found. It searches in all directories and
     * subdirectories recursively.
     * @param rgx The regular expression that has to be matched
     * @param directory The home directory where search is carried out
     */
    public boolean findFiles(String rgx, String directory){
        if(rgx==null || directory==null)
        {
            System.out.println("enter a non null regular expression and directory");
        }
        else {


            try {
                Pattern.compile(rgx);
            } catch (PatternSyntaxException e) {
                System.out.println("Enter valid Regex");
                return false;
            }

            File home = new File(directory);
            System.out.println("enter valid home");
            File[] fileslist = home.listFiles();
            if(fileslist==null)
                System.out.println("no directory found");
            if (fileslist.length != 0) {
                for (File file : fileslist) {
                    if (file.isFile()) {
                        if (file.getName().matches(rgx)) {
                            result.add(file);

                        }

                    } else if (file.isDirectory()) {
                        System.out.println("Searching directory ... " + file.getAbsolutePath());
                        findFiles(rgx, file.getAbsolutePath());
                    }
                }
            }
        }

        return (result.size()>0);
    }


    public static void main(String[] args) {

        //create an obect of this class
        filesearch2 f = new filesearch2();
        Scanner input = new Scanner(System.in);
        boolean found;
        while(true){ // user input
            System.out.println("Enter java regular expression to be matched with file name");
            String name=input.next();

            String directory=File.separatorChar+System.getProperty("user.home");
            result.clear();
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

