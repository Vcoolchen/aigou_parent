package com.ckx.aigo.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;


@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
       //网关中配置路径,而且如果有前缀,需要加上
        resources.add(swaggerResource("平台服务系统", "/service2/plat/v2/api-docs", "2.0"));//调用网关配置中的服务swagger
        resources.add(swaggerResource("平台服务系统1", "/v2/api-docs", "1.0"));
        resources.add(swaggerResource("用户系统", "/v2/api-docs", "2.0"));
        resources.add(swaggerResource("基础系统", "/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}