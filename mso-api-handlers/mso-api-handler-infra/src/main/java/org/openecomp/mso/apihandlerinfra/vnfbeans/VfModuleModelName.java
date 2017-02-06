/*-
 * ============LICENSE_START=======================================================
 * OPENECOMP - MSO
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.03 at 02:02:13 PM EDT 
//


package org.openecomp.mso.apihandlerinfra.vnfbeans;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model-version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model-invariant-uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is-base" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asdc-service-model-version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelName",
    "modelVersion",
    "modelInvariantUuid",
    "isBase",
    "id",
    "description",
    "asdcServiceModelVersion"
})
@XmlRootElement(name = "vf-module-model-name")
public class VfModuleModelName {

    @XmlElement(name="model-name", required = true)
    protected String modelName;
    @XmlElement(name="model-version", required = true)
    protected String modelVersion;
    @XmlElement(name="model-invariant-uuid", required = true)
    protected String modelInvariantUuid;
    @XmlElement(name="is-base", required = true)
    protected Boolean isBase;
    @XmlElement(name="id", required = true)
    protected String id;
    @XmlElement(name="description", required = true)
    protected String description;
    @XmlElement(name="asdc-service-model-version", required = true)
    protected String asdcServiceModelVersion;

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }
    
    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }
    
    /**
     * Gets the value of the modelInvariantUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelInvariantUuid() {
        return modelInvariantUuid;
    }

    /**
     * Sets the value of the modelInvariantUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelInvariantUuid(String value) {
        this.modelInvariantUuid = value;
    }
    
    /**
     * Gets the value of the isBase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsBase() {
        return isBase;
    }

    /**
     * Sets the value of the isBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBase(Boolean value) {
        this.isBase = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }
    
    /**
     * Gets the value of the asdcServiceModelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsdcServiceModelVersion() {
        return asdcServiceModelVersion;
    }

    /**
     * Sets the value of the asdcServiceModelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsdcServiceModelVersion(String value) {
        this.asdcServiceModelVersion = value;
    }

}