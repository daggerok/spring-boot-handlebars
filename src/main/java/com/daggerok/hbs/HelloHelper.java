package com.daggerok.hbs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jknack.handlebars.Options;
import org.springframework.beans.factory.annotation.Autowired;
import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@HandlebarsHelper
public class HelloHelper {
    @Autowired ObjectMapper objectMapper;

    public CharSequence helloWorld(Object o, Options options) {
        if (options.params.length > 0) return Arrays.stream(options.params).map(String::valueOf).collect(Collectors.joining(","));
        return o instanceof Map ? null : String.format("%s", o);
    }
}