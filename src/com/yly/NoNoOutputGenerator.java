package com.yly;

import org.springframework.stereotype.Component;

/**
 * Created by tj on 2016/9/29.
 */
@Component("noNoOutputGenerator")

public class NoNoOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("This is Nono Output Generator");
    }
}
