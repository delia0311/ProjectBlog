package com.service;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by DELIA on 15.09.2015.
 */
public class CustomFilter implements Filter {

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;


        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "*");
        httpServletResponse.addHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "x-requested-with, X-Auth-Token, Content-Type");


        filterChain.doFilter(request, response);
    }

    /*
    public void addHeader(String name, String value) {

        this.addHeader(name, value);
        this.addHeader("Access-Control-Allow-Origin", "*");
        this.addHeader("Access-Control-Allow-Methods", "*");
        this.addHeader("Access-Control-Max-Age", "3600");
        this.addHeader("Access-Control-Allow-Headers", "x-requested-with, X-Auth-Token, Content-Type");

    }
    */

    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }
}