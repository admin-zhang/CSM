package xyz.codedog.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @ClassName NavigationTag
 * @Description TODO
 * @Author panda
 * @Date 2020/5/16
 * @Version 1.0
 **/
public class NavigationTag extends TagSupport {

    private static final long serialVersionUID = -5395566672245818797L;
    /**
     * request 中用于保存 page<E> 对象的变量名,默认为"page"
     */
    private String bean = "page";
    /**
     * 分页跳转的url地址,此属性必需
     */
    private String url = null;
    /**
     * 显示页码数量
     */
    private int number = 5;

    @Override
    public int doStartTag() throws JspException {
        JspWriter writer = pageContext.getOut();
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        Page page = (Page) request.getAttribute(bean);
        if (page == null) {
            return SKIP_BODY;
        }
        url = resolverUrl(url, pageContext);
        try {
            int pageCount = page.getTotal() / page.getSize();
            if (page.getTotal() % page.getSize() > 0) {
                pageCount++;
            }
            writer.print("<nav><ul class=\"pagination\">");
           /* String homeUrl = append(url, "page", 1);
            String backUrl = append(preUrl, "rows", page.getSize());*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }
}
