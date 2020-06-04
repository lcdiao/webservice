
package cn.lcdiao.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.lcdiao.webservice package. 
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

    private final static QName _OtherResponse_QNAME = new QName("http://webservice.lcdiao.cn/", "otherResponse");
    private final static QName _QueryResponse_QNAME = new QName("http://webservice.lcdiao.cn/", "queryResponse");
    private final static QName _Query_QNAME = new QName("http://webservice.lcdiao.cn/", "query");
    private final static QName _Other_QNAME = new QName("http://webservice.lcdiao.cn/", "other");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.lcdiao.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Other }
     * 
     */
    public Other createOther() {
        return new Other();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link OtherResponse }
     * 
     */
    public OtherResponse createOtherResponse() {
        return new OtherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lcdiao.cn/", name = "otherResponse")
    public JAXBElement<OtherResponse> createOtherResponse(OtherResponse value) {
        return new JAXBElement<OtherResponse>(_OtherResponse_QNAME, OtherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lcdiao.cn/", name = "queryResponse")
    public JAXBElement<QueryResponse> createQueryResponse(QueryResponse value) {
        return new JAXBElement<QueryResponse>(_QueryResponse_QNAME, QueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lcdiao.cn/", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Other }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.lcdiao.cn/", name = "other")
    public JAXBElement<Other> createOther(Other value) {
        return new JAXBElement<Other>(_Other_QNAME, Other.class, null, value);
    }

}
