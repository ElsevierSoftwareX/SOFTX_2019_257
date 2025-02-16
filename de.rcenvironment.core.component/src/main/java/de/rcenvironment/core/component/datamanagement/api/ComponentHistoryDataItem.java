/*
 * Copyright 2006-2021 DLR, Germany
 * 
 * SPDX-License-Identifier: EPL-1.0
 * 
 * https://rcenvironment.de/
 */
 
package de.rcenvironment.core.component.datamanagement.api;

import java.io.IOException;
import java.io.Serializable;

import de.rcenvironment.core.datamodel.api.TypedDatumSerializer;

/**
 * Defines a data point generated by workflow components and mainly shows in the Workflow Data Browser .
 * 
 * @author Doreen Seider
 * 
 * Note: I don't expect the class to extend {@link Serializable} anymore as it explicitly provides a
 * {@link #serialize(TypedDatumSerializer)} method on its own. --seid_do
 */
public interface ComponentHistoryDataItem extends Serializable {

    /**
     * @return identifier of this data point object. With the help of this identifier the appropriate sub tree builder is found.
     */
    String getIdentifier();
    
    /**
     * @param serializer {@link TypedDatumSerializer}
     * @return serialized representation of this object
     * @throws IOException if serialization failed
     */
    String serialize(TypedDatumSerializer serializer) throws IOException;
}
