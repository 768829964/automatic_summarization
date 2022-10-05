//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.09.28 时间 02:46:25 AM CST 
//


package org.apache.ctakes.jdl.schema.xdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.ctakes.jdl.schema.xdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Conn_QNAME = new QName("", "conn");
    private final static QName _Load_QNAME = new QName("", "load");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.ctakes.jdl.schema.xdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlLoadType }
     * 
     */
    public XmlLoadType createXmlLoadType() {
        return new XmlLoadType();
    }

    /**
     * Create an instance of {@link CsvLoadType }
     * 
     */
    public CsvLoadType createCsvLoadType() {
        return new CsvLoadType();
    }

    /**
     * Create an instance of {@link LoadType }
     * 
     */
    public LoadType createLoadType() {
        return new LoadType();
    }

    /**
     * Create an instance of {@link ConnType }
     * 
     */
    public ConnType createConnType() {
        return new ConnType();
    }

    /**
     * Create an instance of {@link JdbcType }
     * 
     */
    public JdbcType createJdbcType() {
        return new JdbcType();
    }

    /**
     * Create an instance of {@link ColumnXmlLoadType }
     * 
     */
    public ColumnXmlLoadType createColumnXmlLoadType() {
        return new ColumnXmlLoadType();
    }

    /**
     * Create an instance of {@link ColumnCsvLoadType }
     * 
     */
    public ColumnCsvLoadType createColumnCsvLoadType() {
        return new ColumnCsvLoadType();
    }

    /**
     * Create an instance of {@link XmlLoadType.Column }
     * 
     */
    public XmlLoadType.Column createXmlLoadTypeColumn() {
        return new XmlLoadType.Column();
    }

    /**
     * Create an instance of {@link CsvLoadType.Column }
     * 
     */
    public CsvLoadType.Column createCsvLoadTypeColumn() {
        return new CsvLoadType.Column();
    }

    /**
     * Create an instance of {@link LoadType.Csv }
     * 
     */
    public LoadType.Csv createLoadTypeCsv() {
        return new LoadType.Csv();
    }

    /**
     * Create an instance of {@link LoadType.Xml }
     * 
     */
    public LoadType.Xml createLoadTypeXml() {
        return new LoadType.Xml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "conn")
    public JAXBElement<ConnType> createConn(ConnType value) {
        return new JAXBElement<ConnType>(_Conn_QNAME, ConnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "load")
    public JAXBElement<LoadType> createLoad(LoadType value) {
        return new JAXBElement<LoadType>(_Load_QNAME, LoadType.class, null, value);
    }

}
