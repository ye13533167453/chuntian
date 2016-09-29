package com.yly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by tj on 2016/9/29.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
        OutputHelper helper = (OutputHelper) context.getBean("outputHelper");
        helper.generateOutput();
    }

}
