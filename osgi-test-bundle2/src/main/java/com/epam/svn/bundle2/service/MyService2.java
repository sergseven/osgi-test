package com.epam.svn.bundle2.service;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

/**
 * Created by Sergii_Nesprava on 22.04.2015.
 */
@Component
@Service
public class MyService2 {

    @Activate
    public void serviceActivator(){
        System.out.println("MyService2.serviceActivator");

    }
}
