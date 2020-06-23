package com.java.brushup.oops.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {
        // Application -> Logger -> Filter, Handler -> Filer, Formatter, External System

        Logger logger = LoggerFactory.getLogger("newLoggerName");
        System.out.println(logger);

        logger = LoggerFactory.getLogger(Main.class.getName());
        System.out.println(logger);

        logger.warn("This is Warning level logger");
        System.out.println(logger);

        logger.info("Info level logger");
        System.out.println(logger);

    }
}
