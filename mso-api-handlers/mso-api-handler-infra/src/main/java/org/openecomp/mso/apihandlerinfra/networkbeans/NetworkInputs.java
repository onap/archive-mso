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


package org.openecomp.mso.apihandlerinfra.networkbeans;

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
 *         &lt;element name="network-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="network-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="network-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="service-instance-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backout-on-failure" type="{http://www.w3.org/2001/XMLSchema}Boolean"/>
 *         &lt;choice>
 *         	&lt;element name="service-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         	&lt;element name="service-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *         	&lt;element name="aic-node-clli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="aic-cloud-region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="aic-node-clli" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tenant-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prov-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "networkId",
    "networkName",
    "networkType",
    "serviceInstanceId",
    "backoutOnFailure",
    "serviceType",
    "serviceId",
    "aicNodeClli",
    "aicCloudRegion",
    "tenantId",
    "provStatus"
})
@XmlRootElement(name = "network-inputs")
public class NetworkInputs {

    @XmlElement(name = "network-id")
    protected String networkId;
    @XmlElement(name = "network-name")
    protected String networkName;
    @XmlElement(name = "network-type", required = true)
    protected String networkType;
    @XmlElement(name = "service-instance-id")
    protected String serviceInstanceId;
    @XmlElement(name = "backout-on-failure")
    protected Boolean backoutOnFailure;
    @XmlElement(name = "service-type")
    protected String serviceType;
    @XmlElement(name = "service-id")
    protected String serviceId;
    @XmlElement(name = "aic-node-clli")
    protected String aicNodeClli;
    @XmlElement(name = "aic-cloud-region")
    protected String aicCloudRegion;
    @XmlElement(name = "tenant-id", required = true)
    protected String tenantId;
    @XmlElement(name = "prov-status")
    protected String provStatus;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }
    
    /**
     * Gets the value of the serviceInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInstanceId() {
        return serviceInstanceId;
    }

    /**
     * Sets the value of the serviceInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInstanceId(String value) {
        this.serviceInstanceId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }
    
    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId (String value) {
        this.serviceId = value;
    }


    /**
     * Gets the value of the aicNodeClli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAicNodeClli() {
        return aicNodeClli;
    }

    /**
     * Sets the value of the aicNodeClli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAicNodeClli(String value) {
        this.aicNodeClli = value;
    }
    
    /**
     * Gets the value of the aicCloudRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAicCloudRegion() {
        return aicCloudRegion;
    }

    /**
     * Sets the value of the aicCloudRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAicCloudRegion(String value) {
        this.aicCloudRegion = value;
    }


    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantId(String value) {
        this.tenantId = value;
    }

    /**
     * Gets the value of the provStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvStatus() {
        return provStatus;
    }

    /**
     * Sets the value of the provStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvStatus(String value) {
        this.provStatus = value;
    }
    
    /**
     * Gets the value of the backoutOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBackoutOnFailure() {
        return backoutOnFailure;
    }

    /**
     * Sets the value of the backoutOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackoutOnFailure(Boolean value) {
        this.backoutOnFailure = value;
    }

}