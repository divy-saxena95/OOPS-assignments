package kyc;

import java.io.*;
import java.text.*;
import java.util.*;
public class kycrange{
    private Date signup;
    private Date current;
    private final SimpleDateFormat dateform =new SimpleDateFormat("dd-MM-yyyy");
    public kycrange(String signupdate,String currentdate)  {
        try {
            signup= dateform.parse(signupdate);
            current = dateform.parse(currentdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean validity() {

        return signup.compareTo(current) <= 0;

    }
    public Date AnniversaryDate() {

        Calendar ani = Calendar.getInstance();
        ani.setTime(signup);

        Calendar cur = Calendar.getInstance();
        cur.setTime(current);
        cur.add(Calendar.DATE,30);
        ani.set(Calendar.YEAR,cur.get(Calendar.YEAR));
        if(ani.after(cur)){
            ani.add(Calendar.YEAR,-1);
        }
        Date anniversary=ani.getTime();
        return anniversary;

    }

    public String generateRange(Date anniv) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(anniv);
        cal.add(Calendar.DATE, -30);
        Date startani = cal.getTime();
        cal.add(Calendar.DATE, 60);
        Date endani = cal.getTime();
        if(endani.after(current)) {
            endani=current;
        }
        if(startani.before(signup)){
            startani=signup;
        }
        return (dateform.format(startani)+" to "+dateform.format(endani));}

    //public class kycrange{
    }





