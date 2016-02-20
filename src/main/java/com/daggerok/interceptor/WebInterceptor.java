package com.daggerok.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import java.util.Optional;

@Component
public class WebInterceptor implements WebRequestInterceptor {
    @Autowired ObjectMapper objectMapper;

    @Override
    public void preHandle(WebRequest request) throws Exception {}

    @Override
    public void postHandle(final WebRequest request, final ModelMap model) throws Exception {
        Optional.ofNullable(model).ifPresent(m -> {
            try {
                //m.addAttribute("principal", objectMapper.writeValueAsString(request.getUserPrincipal()));
                m.addAttribute("parameters", objectMapper.writeValueAsString(request.getParameterMap()));
            } catch (Throwable e) { /* sorry.. :) */ }
        });
    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {}
}