//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.09.28 时间 02:46:25 AM CST 
//


package org.apache.ctakes.jdl.schema.xdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>csvLoadType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="csvLoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}columnCsvLoadType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="table" use="required" type="{}sqlNameType" />
 *       &lt;attribute name="commit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="skip" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="delimiter" default=",">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="encapsulator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "csvLoadType", propOrder = {
    "column"
})
@XmlSeeAlso({
    org.apache.ctakes.jdl.schema.xdl.LoadType.Csv.class
})
public class CsvLoadType {

    @XmlElement(required = true)
    protected List<CsvLoadType.Column> column;
    @XmlAttribute(name = "table", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String table;
    @XmlAttribute(name = "commit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger commit;
    @XmlAttribute(name = "skip")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger skip;
    @XmlAttribute(name = "delimiter")
    protected String delimiter;
    @XmlAttribute(name = "encapsulator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String encapsulator;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsvLoadType.Column }
     * 
     * 
     */
    public List<CsvLoadType.Column> getColumn() {
        if (column == null) {
            column = new ArrayList<CsvLoadType.Column>();
        }
        return this.column;
    }

    /**
     * 获取table属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * 设置table属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * 获取commit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCommit() {
        return commit;
    }

    /**
     * 设置commit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCommit(BigInteger value) {
        this.commit = value;
    }

    /**
     * 获取skip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkip() {
        return skip;
    }

    /**
     * 设置skip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkip(BigInteger value) {
        this.skip = value;
    }

    /**
     * 获取delimiter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        if (delimiter == null) {
            return ",";
        } else {
            return delimiter;
        }
    }

    /**
     * 设置delimiter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * 获取encapsulator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncapsulator() {
        return encapsulator;
    }

    /**
     * 设置encapsulator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncapsulator(String value) {
        this.encapsulator = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}columnCsvLoadType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Column
        extends ColumnCsvLoadType
    {


    }

}
