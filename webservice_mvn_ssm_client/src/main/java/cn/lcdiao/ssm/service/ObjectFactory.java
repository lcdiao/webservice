
package cn.lcdiao.ssm.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.lcdiao.ssm.service package. 
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

    private final static QName _GetUser_QNAME = new QName("http://service.ssm.lcdiao.cn/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://service.ssm.lcdiao.cn/", "getUserResponse");
    private final static QName _Insert_QNAME = new QName("http://service.ssm.lcdiao.cn/", "insert");
    private final static QName _InsertResponse_QNAME = new QName("http://service.ssm.lcdiao.cn/", "insertResponse");
    private final static QName _InsertSelective_QNAME = new QName("http://service.ssm.lcdiao.cn/", "insertSelective");
    private final static QName _InsertSelectiveResponse_QNAME = new QName("http://service.ssm.lcdiao.cn/", "insertSelectiveResponse");
    private final static QName _List_QNAME = new QName("http://service.ssm.lcdiao.cn/", "list");
    private final static QName _ListResponse_QNAME = new QName("http://service.ssm.lcdiao.cn/", "listResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.lcdiao.ssm.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link InsertSelective }
     * 
     */
    public InsertSelective createInsertSelective() {
        return new InsertSelective();
    }

    /**
     * Create an instance of {@link InsertSelectiveResponse }
     * 
     */
    public InsertSelectiveResponse createInsertSelectiveResponse() {
        return new InsertSelectiveResponse();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSelective }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertSelective }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "insertSelective")
    public JAXBElement<InsertSelective> createInsertSelective(InsertSelective value) {
        return new JAXBElement<InsertSelective>(_InsertSelective_QNAME, InsertSelective.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSelectiveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertSelectiveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "insertSelectiveResponse")
    public JAXBElement<InsertSelectiveResponse> createInsertSelectiveResponse(InsertSelectiveResponse value) {
        return new JAXBElement<InsertSelectiveResponse>(_InsertSelectiveResponse_QNAME, InsertSelectiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ssm.lcdiao.cn/", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

}
