package testkyc;
import org.junit.Test;
import kyc.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
/**
 * Test class to test the main class.
 */
public class testkycrange {
    private kycrange obj;
    private Date dt = new Date();
    private Date anniv=new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    @Test
    public void validityTest()throws ParseException{

        obj = new kycrange("16-07-1998","27-06-2017");
        assertTrue(obj.validity());
        obj = new kycrange(null,null);
        assertFalse(obj.validity());
        obj = new kycrange("04/2/2017","04/04/2017");
        assertFalse(obj.validity());
        obj = new kycrange("04/04/2015","04-04-2016");
        assertTrue(obj.validity());
        obj = new kycrange(null,"15-03-2016");
        assertTrue(obj.validity());

    }
    @Test
    public void Anniversarycheck() throws ParseException {
        dt=sdf.parse("01-06-2017");
        obj = new kycrange("16-07-1998","27-06-2017");
        assertEquals(obj.AnniversaryDate(),dt);
        dt=sdf.parse("01-04-2017");
        obj = new kycrange(null,null);
        assertEquals(obj.AnniversaryDate(),dt);
        dt=sdf.parse("01-04-2017");
        obj = new kycrange("04/05/2017","04/04/2017");
        assertEquals(obj.AnniversaryDate(),dt);
        dt=sdf.parse("01-04-2016");
        obj = new kycrange("04/04/2015","04-04-2016");
        assertEquals(obj.AnniversaryDate(),dt);
        dt=sdf.parse("01-03-2016");
        obj = new kycrange(null,"15-03-2016");
        assertEquals(obj.AnniversaryDate(),dt);

    }

    @Test
    public void generateRangeTest() throws ParseException {
        //validation carried out so input dates are valid
        obj=new kycrange("16-07-1998","27-06-2017");
        assertEquals("16-06-2017 to 27-06-2017",obj.generateRange(obj.AnniversaryDate()));
        obj=new kycrange(null,null);
        assertEquals("05-01-2017 to 06-03-2017",obj.generateRange(obj.AnniversaryDate()));
        obj=new kycrange("04/05/2017","04/04/2017");
        assertEquals("No Range",obj.generateRange(obj.AnniversaryDate()));
        obj=new kycrange("04/04/2015","04-04-2016");
        assertEquals("05-03-2016 to 04-04-2016",obj.generateRange(obj.AnniversaryDate()));
        obj=new kycrange(null,"15-03-2016");
        assertEquals("05-03-2016 to 15-03-2016",obj.generateRange(obj.AnniversaryDate()));
    }
}


