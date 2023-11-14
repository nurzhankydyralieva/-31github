package org.project.bpp;

import com.epam.project.model.Trainer;
import com.epam.project.storage.Storage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StorageInitializationBPP implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        if (bean instanceof Storage) {
            Map<Integer, Trainer> trainers = new HashMap<>();
            trainers.put(1, new Trainer(1, "Tom Obama"));
            trainers.put(2, new Trainer(2, "Sarah Smith"));
            trainers.put(3, new Trainer(3, "Andrea Bocelli"));
            ((Storage) bean).writeDataToTrainerFile(trainers);
        }
        System.out.println("Called postProcessBeforeInitialization() for: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Called postProcessAfterInitialization() for: " + beanName);
        return bean;
    }

}
