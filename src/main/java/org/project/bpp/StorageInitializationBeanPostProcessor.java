package org.project.bpp;


import org.project.model.Trainer;
import org.project.storage.Storage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StorageInitializationBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Map<Integer, Trainer> trainers = new HashMap<>();
        trainers.put(1, new Trainer(1, "Tom Obama"));
        trainers.put(2, new Trainer(2, "Sarah Smith"));
        trainers.put(3, new Trainer(3, "Andrea Bocelli"));
        if (bean instanceof Storage) {
            // ((Storage) bean).init();
            ((Storage) bean).writeDataToTrainerFile(trainers);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
