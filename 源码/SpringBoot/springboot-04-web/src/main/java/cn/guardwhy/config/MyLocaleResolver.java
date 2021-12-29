package cn.guardwhy.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
// 可以在链接上携带区域信息
public class MyLocaleResolver implements LocaleResolver {
    // 解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 获得请求的语言参数
        String language= request.getParameter("l");
        // 如果没有获取到就使用系统默认的
        Locale locale = Locale.getDefault();
        // 如果请求链接不为空
        if(!StringUtils.isEmpty(language)){
            // 分割请求参数
            String[] split = language.split("_");
            // 国家，地区
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
