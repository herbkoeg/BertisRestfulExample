/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hk.bdk.rest.service;

/**
 *
 * @author palmherby
 */
class BdkResourceServiceImpl implements BdkResourceService {

    public BdkResourceServiceImpl() {
    }

    @Override
    public String create(String lastName, String firstName) {
        System.err.println(lastName);
        System.out.println(lastName);

        return "jaaaawoi jamei" + lastName + firstName;
    }
    
}
