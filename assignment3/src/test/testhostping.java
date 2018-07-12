package test;
import hostping.HostPinging;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class testhostping {
    private HostPinging p=new HostPinging();

    @Test
    public void testcase1(){
        assertTrue(p.ping("google.com",4));
    }

    @Test
    public void testcase2(){
        assertTrue(p.ping("facebook.com",3));
    }
    @Test
    public void pingTest3(){
        assertFalse(p.ping("AAAABBBBB",1));
    }
    @Test
    public void pingTest4(){
        assertFalse(p.ping("",1));
    }
    @Test
    public void pingTest5(){
        assertFalse(p.ping(null,1));
    }

}