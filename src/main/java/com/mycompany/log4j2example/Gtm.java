/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.log4j2example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author gtm
 */
public class Gtm {

    private static final Logger logger = LogManager.getLogger(Gtm.class);

    public static void main(String[] args) {
        System.out.println("*** MAIN ***");
        logger.info("LOGGER INFO *********************");
        logger.warn("LOGGER WARN *********************");
        logger.debug("LOGGER DEBUG *********************");
    }
}
