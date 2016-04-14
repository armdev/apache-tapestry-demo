/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tapestry.pages;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

public class StoringDataInAPage {

    // Screen fields
    @Property
    @Persist
    private int count;

    // Generally useful bits and pieces
    @Inject
    private ComponentResources componentResources;

    // The code
    void setupRender() {
        count++;
    }

    Object onClear() {
        componentResources.discardPersistentFieldChanges();
        return Start.class;
    }

}
