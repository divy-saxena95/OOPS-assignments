package Main;
import kyc.kycrange;
import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class main {
    public static void main(String [] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        String s = null;int i,n;
        System.out.println("Enter the number of inputs");
        n = Integer.parseInt(input.next());
        for(i=1;i<=n;i++){

            System.out.println("Enter signup date and current date in \'dd-mm-yyyy\' dateform separated by space");
            if (args.length == 2)
                s = args[0] + " " + args[1];
            else
                s = br.readLine();

            String[] dates = s.split(" ");

            kycrange form = new kycrange(dates[0], dates[1]);
            if (form.validity()) {
                Date anniv = form.AnniversaryDate();
                System.out.println("You can file your KYC for dates: " + form.generateRange(anniv));
            } else {
                System.out.println("No Range");
            }
        }
    }
}
