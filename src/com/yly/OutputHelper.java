package com.yly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tj on 2016/9/29.
 */
@Component("outputHelper")
public class OutputHelper {
    @Autowired
    private IOutputGenerator noNoOutputGenerator;

    public void generateOutput() {
        noNoOutputGenerator.generateOutput();
    }
}
