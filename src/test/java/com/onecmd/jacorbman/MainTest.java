package com.onecmd.jacorbman;

import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 */
public class MainTest {

    @Test
    public void testMain(){
        Main main = new Main();
        main.printUsage();
    }

}
