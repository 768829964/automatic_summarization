//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.09.28 时间 02:46:25 AM CST 
//


package org.apache.ctakes.jdl.schema.xdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>loadType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="loadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="csv">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}csvLoadType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xml">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}xmlLoadType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadType", propOrder = {
    "csv",
    "xml"
})
public class LoadType {

    protected LoadType.Csv csv;
    protected LoadType.Xml xml;

    /**
     * 获取csv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoadType.Csv }
     *     
     */
    public LoadType.Csv getCsv() {
        return csv;
    }

    /**
     * 设置csv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoadType.Csv }
     *     
     */
    public void setCsv(LoadType.Csv value) {
        this.csv = value;
    }

    /**
     * 获取xml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoadType.Xml }
     *     
     */
    public LoadType.Xml getXml() {
        return xml;
    }

    /**
     * 设置xml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoadType.Xml }
     *     
     */
    public void setXml(LoadType.Xml value) {
        this.xml = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}csvLoadType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Csv
        extends CsvLoadType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}xmlLoadType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Xml
        extends XmlLoadType
    {


    }

}
