package com.jason;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.SystemUtils;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        System.out.println("Java Home is        : " + SystemUtils.getJavaHome());
        System.out.println("Java IO tmp Dir is  : " + SystemUtils.getJavaIoTmpDir());
        System.out.println("User Home is        : " + SystemUtils.getUserHome());
        System.out.println("User Dir is         : " + SystemUtils.getUserDir());
        assertTrue( true );
    }
}
