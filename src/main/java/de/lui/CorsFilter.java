package de.lui;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

public class CorsFilter implements Filter {

    private static final Logger log = Logger.getLogger(CorsFilter.class.getName());

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        log.info("do filter");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String h = headers.nextElement();
            log.fine(h + "->" + req.getHeader(h));

        }

        resp.setCharacterEncoding("UTF-8");
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
        resp.addHeader("Access-Control-Allow-Headers", "*");

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) {
    }
}
