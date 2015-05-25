package com.rhcloud.profiterole.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyLoader {

    public static String loadProperty(String name) throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("src/test/resources/app.properties")));
        return props.getProperty(name);
    }
}
