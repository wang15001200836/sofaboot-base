package com.module.a.configuer;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.module.a.service.ServiceA;
import com.module.a.service.ServiceAImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModuleConfigure {
    @Bean

    public ServiceA serviceA(){
        return new ServiceAImpl();
    }
}
