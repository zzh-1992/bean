package com.grapefruit.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
public class InitClass implements ApplicationContextAware {

    @Autowired
    private ApplicationContext myApplicationContext;

    private String name;
    /**
     * Set the ApplicationContext that this object runs in.
     * Normally this call will be used to initialize the object.
     * <p>Invoked after population of normal bean properties but before an init callback such
     * as {@link InitializingBean#afterPropertiesSet()}
     * or a custom init-method. Invoked after {@link ResourceLoaderAware#setResourceLoader},
     * {@link ApplicationEventPublisherAware#setApplicationEventPublisher} and
     * {@link MessageSourceAware}, if applicable.
     *
     * @param applicationContext the ApplicationContext object to be used by this object
     * @throws ApplicationContextException in case of context initialization errors
     * @throws BeansException              if thrown by application context methods
     * @see BeanInitializationException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        myApplicationContext = applicationContext;
        init();
    }

    // 获取上下文
    public ApplicationContext getMyApplicationContext() {
        return myApplicationContext;
    }

    public void init(){
        name = "GGG";
        System.out.println("InitClass initialize ----->");
    }

    public String getName() {
        return name;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("InitClass is destroy");
    }
}
