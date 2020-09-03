package com.onecmd.jacorbman;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class Main {

    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public void printUsage(){
        System.out.println("Hello JacorbMan!");
    }

    public static void main(String[] args) {
        LOGGER.info("main...");
        System.out.println("Hello JacorbMan!");
    }

}
