package com.module.b.configure;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.module.b.service.ServiceB;
import com.module.b.service.ServiceBImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModuleConfigure {
    @Bean
    @SofaService
    public ServiceB serviceA(){
        return new ServiceBImpl();
    }
}
