package com.daggerok.hbs;

import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

@HandlebarsHelper
public class HelloHelper {
    public CharSequence helloWorld(Object o) {
        return String.format("Hello, %s!", null == o ? "World" : o);
    }
}