package com.balckswan.exampleToAdam;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        String resourceName = "maef.properties"; // could also be a constant
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        props.load(new InputStreamReader(new FileInputStream("/maef.properties")));
        System.out.println("props.getProperty(\"szevasz\"):\t"+props.getProperty("szevasz"));
//        try {
//            try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
//                props.load(resourceStream);
//
//            }
//            //System.out.println(props.getProperty("scala_version"));
//            System.out.println("props.getProperty(\"szevasz\"):\t"+props.getProperty("szevasz"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
