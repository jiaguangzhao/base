package com.example.base.aop.configure;

import org.apache.tomcat.util.descriptor.web.FilterDef;
import org.apache.tomcat.util.descriptor.web.FilterMap;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 *
 * @author： Jagger
 * @date: 2019-09-13 14:28
 */
@Configuration
public class TomcatConfigure {

    @Bean
    public ConfigurableServletWebServerFactory servletContainer(){
        TomcatServletWebServerFactory tomcatServletWebServerFactory
                = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addContextCustomizers(context ->  {
            SecurityConstraint securityConstraint = new SecurityConstraint();


            SecurityCollection securityCollection = new SecurityCollection();
            //url匹配表达式
            securityCollection.addPattern("/*");
            //禁止的http方法

            securityCollection.addMethod("PUT");
            securityCollection.addMethod("PATCH");
            securityCollection.addMethod("DELETE");
            securityCollection.addMethod("COPY");
            securityCollection.addMethod("HEAD");
            securityCollection.addMethod("OPTIONS");
            securityCollection.addMethod("LINK");
            securityCollection.addMethod("UNLINK");
            securityCollection.addMethod("PURGE");
            securityCollection.addMethod("LOCK");
            securityCollection.addMethod("UNLOCK");
            securityCollection.addMethod("VIEW");
            securityCollection.addMethod("TRACE");
            securityCollection.addMethod("SEARCH");
            securityCollection.addMethod("PROPFIND");


            securityConstraint.addCollection(securityCollection);
            securityConstraint.setAuthConstraint(true);
            securityConstraint.setUserConstraint("NONE");

            context.addConstraint(securityConstraint);
            context.setUseHttpOnly(true);


            SecurityConstraint noneSecurityConstraint = new SecurityConstraint();
            SecurityCollection noneSecurityCollection = new SecurityCollection();
            //url匹配表达式
            noneSecurityCollection.addPattern("/*");
            noneSecurityConstraint.addCollection(noneSecurityCollection);
            noneSecurityConstraint.setUserConstraint("NONE");
            context.addConstraint(noneSecurityConstraint);

            FilterDef httpHeaderSecurityFilter = new FilterDef();
            httpHeaderSecurityFilter.setFilterName("httpHeaderSecurity");
            httpHeaderSecurityFilter.setFilterClass("org.apache.catalina.filters.HttpHeaderSecurityFilter");
            httpHeaderSecurityFilter.addInitParameter("antiClickJackingEnabled", "true");
            // <!-- 允许被嵌入到其它页面的方式，默认是DENY -->
            httpHeaderSecurityFilter.addInitParameter("antiClickJackingOption", "DENY");
            httpHeaderSecurityFilter.addInitParameter("xssProtectionEnabled", "true");
            httpHeaderSecurityFilter.addInitParameter("blockContentTypeSniffingEnabled", "true");
            httpHeaderSecurityFilter.setAsyncSupported("true");

            FilterMap httpHeaderSecurityFilterMap = new FilterMap();
            httpHeaderSecurityFilterMap.setFilterName("httpHeaderSecurity");
            httpHeaderSecurityFilterMap.addURLPattern("/*");
            httpHeaderSecurityFilterMap.setDispatcher("REQUEST");


            context.addFilterDef(httpHeaderSecurityFilter);
            context.addFilterMap(httpHeaderSecurityFilterMap);
        });
        return tomcatServletWebServerFactory;
    }
}