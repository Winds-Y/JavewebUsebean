package henu.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * User: Yangtse
 * Date: 2017/11/20
 * Time: 18:29
 */
@WebFilter(filterName = "CharacterEncodingFilter",
        urlPatterns = {"/*"},
        initParams = {
            @WebInitParam(name = "encoding",value = "utf-8")
        }
    )
public class CharacterEncodingFilter implements Filter {
    protected String encoding;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if(encoding!=null){
            req.setCharacterEncoding(encoding);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.encoding=config.getInitParameter("encoding");
    }

}
