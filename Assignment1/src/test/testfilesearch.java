package test;
import searchingfile.filesearch2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testfilesearch {

    public filesearch2 p;
    @Before
    public void init(){
        p = new filesearch2();
    }
    @After
    public void print(){
        System.out.println(p.getResult());
    }
    //Multiple tests as new object required for every search.
    @Test
    public void findFilesTest1(){

        assertTrue(p.findFiles(".*\\.java","/home"));
        assertFalse(p.findFiles("\tr]esD..","/home"));
        assertFalse(p.findFiles("tr]esD..","/home"));
        assertFalse(p.findFiles(null,null));
        assertFalse(p.findFiles(" ","/home/zadmin"));
        assertTrue(p.findFiles("[tr]esD..","/home"));
        assertFalse(p.findFiles("...",null));
        assertTrue(p.findFiles("hello_world","/home"));

    }}



