package com.example.base.aop;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/5/5 19:03
 */
public class FillTraceIdInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String traceId = request.getHeader("HTTP_TRACE_ID");
        if (StringUtils.isBlank(traceId)) {
            traceId = request.getParameter("HTTP_TRANCE_ID");
        }
        if (StringUtils.isBlank(traceId)) {
            traceId = UUID.randomUUID().toString().replaceAll("-", "");
        }
        MDC.put("traceId", traceId);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        MDC.clear();
    }
}
