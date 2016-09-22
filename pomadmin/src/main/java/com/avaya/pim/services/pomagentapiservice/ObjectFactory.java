
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avaya.pim.services.pomagentapiservice package. 
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

    private final static QName _PhoneTypeCountryCode_QNAME = new QName("http://services.pim.avaya.com/AgentAPI/", "CountryCode");
    private final static QName _PhoneTypePhoneNumber_QNAME = new QName("http://services.pim.avaya.com/AgentAPI/", "PhoneNumber");
    private final static QName _PhoneTypeTimeZone_QNAME = new QName("http://services.pim.avaya.com/AgentAPI/", "TimeZone");
    private final static QName _PhoneTypePhoneAttributeName_QNAME = new QName("http://services.pim.avaya.com/AgentAPI/", "PhoneAttributeName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avaya.pim.services.pomagentapiservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContactData }
     * 
     */
    public GetContactData createGetContactData() {
        return new GetContactData();
    }

    /**
     * Create an instance of {@link GetContactDataResponse }
     * 
     */
    public GetContactDataResponse createGetContactDataResponse() {
        return new GetContactDataResponse();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link GetContactAttributeValue }
     * 
     */
    public GetContactAttributeValue createGetContactAttributeValue() {
        return new GetContactAttributeValue();
    }

    /**
     * Create an instance of {@link GetContactAttributeValueResponse }
     * 
     */
    public GetContactAttributeValueResponse createGetContactAttributeValueResponse() {
        return new GetContactAttributeValueResponse();
    }

    /**
     * Create an instance of {@link SaveContact }
     * 
     */
    public SaveContact createSaveContact() {
        return new SaveContact();
    }

    /**
     * Create an instance of {@link SaveContactResponse }
     * 
     */
    public SaveContactResponse createSaveContactResponse() {
        return new SaveContactResponse();
    }

    /**
     * Create an instance of {@link AddContactToJob }
     * 
     */
    public AddContactToJob createAddContactToJob() {
        return new AddContactToJob();
    }

    /**
     * Create an instance of {@link AddContactToJobResponse }
     * 
     */
    public AddContactToJobResponse createAddContactToJobResponse() {
        return new AddContactToJobResponse();
    }

    /**
     * Create an instance of {@link IsDNC }
     * 
     */
    public IsDNC createIsDNC() {
        return new IsDNC();
    }

    /**
     * Create an instance of {@link IsDNCResponse }
     * 
     */
    public IsDNCResponse createIsDNCResponse() {
        return new IsDNCResponse();
    }

    /**
     * Create an instance of {@link AddToDNCList }
     * 
     */
    public AddToDNCList createAddToDNCList() {
        return new AddToDNCList();
    }

    /**
     * Create an instance of {@link AddToDNCListResponse }
     * 
     */
    public AddToDNCListResponse createAddToDNCListResponse() {
        return new AddToDNCListResponse();
    }

    /**
     * Create an instance of {@link RemoveFromDNCList }
     * 
     */
    public RemoveFromDNCList createRemoveFromDNCList() {
        return new RemoveFromDNCList();
    }

    /**
     * Create an instance of {@link RemoveFromDNCListResponse }
     * 
     */
    public RemoveFromDNCListResponse createRemoveFromDNCListResponse() {
        return new RemoveFromDNCListResponse();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValue }
     * 
     */
    public UpdateContactAttributeValue createUpdateContactAttributeValue() {
        return new UpdateContactAttributeValue();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValueResponse }
     * 
     */
    public UpdateContactAttributeValueResponse createUpdateContactAttributeValueResponse() {
        return new UpdateContactAttributeValueResponse();
    }

    /**
     * Create an instance of {@link GetContactDataFaultInfo }
     * 
     */
    public GetContactDataFaultInfo createGetContactDataFaultInfo() {
        return new GetContactDataFaultInfo();
    }

    /**
     * Create an instance of {@link GetContactAttributeValueFaultInfo }
     * 
     */
    public GetContactAttributeValueFaultInfo createGetContactAttributeValueFaultInfo() {
        return new GetContactAttributeValueFaultInfo();
    }

    /**
     * Create an instance of {@link AddContactToJobFaultInfo }
     * 
     */
    public AddContactToJobFaultInfo createAddContactToJobFaultInfo() {
        return new AddContactToJobFaultInfo();
    }

    /**
     * Create an instance of {@link IsDNCFaultInfo }
     * 
     */
    public IsDNCFaultInfo createIsDNCFaultInfo() {
        return new IsDNCFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValueFaultInfo }
     * 
     */
    public UpdateContactAttributeValueFaultInfo createUpdateContactAttributeValueFaultInfo() {
        return new UpdateContactAttributeValueFaultInfo();
    }

    /**
     * Create an instance of {@link GetAllCompletionCodesForCampaign }
     * 
     */
    public GetAllCompletionCodesForCampaign createGetAllCompletionCodesForCampaign() {
        return new GetAllCompletionCodesForCampaign();
    }

    /**
     * Create an instance of {@link GetAllCompletionCodesForCampaignResponse }
     * 
     */
    public GetAllCompletionCodesForCampaignResponse createGetAllCompletionCodesForCampaignResponse() {
        return new GetAllCompletionCodesForCampaignResponse();
    }

    /**
     * Create an instance of {@link GetAllCompletionCodesForCampaignFaultInfo }
     * 
     */
    public GetAllCompletionCodesForCampaignFaultInfo createGetAllCompletionCodesForCampaignFaultInfo() {
        return new GetAllCompletionCodesForCampaignFaultInfo();
    }

    /**
     * Create an instance of {@link SaveContactFaultInfo }
     * 
     */
    public SaveContactFaultInfo createSaveContactFaultInfo() {
        return new SaveContactFaultInfo();
    }

    /**
     * Create an instance of {@link AddToDNCListFaultInfo }
     * 
     */
    public AddToDNCListFaultInfo createAddToDNCListFaultInfo() {
        return new AddToDNCListFaultInfo();
    }

    /**
     * Create an instance of {@link RemoveFromDNCListFaultInfo }
     * 
     */
    public RemoveFromDNCListFaultInfo createRemoveFromDNCListFaultInfo() {
        return new RemoveFromDNCListFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateCompletionCode }
     * 
     */
    public UpdateCompletionCode createUpdateCompletionCode() {
        return new UpdateCompletionCode();
    }

    /**
     * Create an instance of {@link UpdateCompletionCodeResponse }
     * 
     */
    public UpdateCompletionCodeResponse createUpdateCompletionCodeResponse() {
        return new UpdateCompletionCodeResponse();
    }

    /**
     * Create an instance of {@link UpdateCompletionCodeFaultInfo }
     * 
     */
    public UpdateCompletionCodeFaultInfo createUpdateCompletionCodeFaultInfo() {
        return new UpdateCompletionCodeFaultInfo();
    }

    /**
     * Create an instance of {@link DeleteContact }
     * 
     */
    public DeleteContact createDeleteContact() {
        return new DeleteContact();
    }

    /**
     * Create an instance of {@link DeleteContactResponse }
     * 
     */
    public DeleteContactResponse createDeleteContactResponse() {
        return new DeleteContactResponse();
    }

    /**
     * Create an instance of {@link DeleteContactFaultInfo }
     * 
     */
    public DeleteContactFaultInfo createDeleteContactFaultInfo() {
        return new DeleteContactFaultInfo();
    }

    /**
     * Create an instance of {@link AddContactGroupToJob }
     * 
     */
    public AddContactGroupToJob createAddContactGroupToJob() {
        return new AddContactGroupToJob();
    }

    /**
     * Create an instance of {@link AddContactGroupToJobResponse }
     * 
     */
    public AddContactGroupToJobResponse createAddContactGroupToJobResponse() {
        return new AddContactGroupToJobResponse();
    }

    /**
     * Create an instance of {@link AddContactGroupToJobFaultInfo }
     * 
     */
    public AddContactGroupToJobFaultInfo createAddContactGroupToJobFaultInfo() {
        return new AddContactGroupToJobFaultInfo();
    }

    /**
     * Create an instance of {@link UpdatePhoneNumber }
     * 
     */
    public UpdatePhoneNumber createUpdatePhoneNumber() {
        return new UpdatePhoneNumber();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link UpdatePhoneNumberResponse }
     * 
     */
    public UpdatePhoneNumberResponse createUpdatePhoneNumberResponse() {
        return new UpdatePhoneNumberResponse();
    }

    /**
     * Create an instance of {@link UpdatePhoneNumberFaultInfo }
     * 
     */
    public UpdatePhoneNumberFaultInfo createUpdatePhoneNumberFaultInfo() {
        return new UpdatePhoneNumberFaultInfo();
    }

    /**
     * Create an instance of {@link GetPhoneNumber }
     * 
     */
    public GetPhoneNumber createGetPhoneNumber() {
        return new GetPhoneNumber();
    }

    /**
     * Create an instance of {@link GetPhoneNumberResponse }
     * 
     */
    public GetPhoneNumberResponse createGetPhoneNumberResponse() {
        return new GetPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link GetPhoneNumberFaultInfo }
     * 
     */
    public GetPhoneNumberFaultInfo createGetPhoneNumberFaultInfo() {
        return new GetPhoneNumberFaultInfo();
    }

    /**
     * Create an instance of {@link ScheduleCallBack }
     * 
     */
    public ScheduleCallBack createScheduleCallBack() {
        return new ScheduleCallBack();
    }

    /**
     * Create an instance of {@link ScheduleCallBackResponse }
     * 
     */
    public ScheduleCallBackResponse createScheduleCallBackResponse() {
        return new ScheduleCallBackResponse();
    }

    /**
     * Create an instance of {@link ScheduleCallBackFaultInfo }
     * 
     */
    public ScheduleCallBackFaultInfo createScheduleCallBackFaultInfo() {
        return new ScheduleCallBackFaultInfo();
    }

    /**
     * Create an instance of {@link AddContactFromListToJob }
     * 
     */
    public AddContactFromListToJob createAddContactFromListToJob() {
        return new AddContactFromListToJob();
    }

    /**
     * Create an instance of {@link AddContactFromListToJobResponse }
     * 
     */
    public AddContactFromListToJobResponse createAddContactFromListToJobResponse() {
        return new AddContactFromListToJobResponse();
    }

    /**
     * Create an instance of {@link AddContactFromListToJobFaultInfo }
     * 
     */
    public AddContactFromListToJobFaultInfo createAddContactFromListToJobFaultInfo() {
        return new AddContactFromListToJobFaultInfo();
    }

    /**
     * Create an instance of {@link SaveContactToList }
     * 
     */
    public SaveContactToList createSaveContactToList() {
        return new SaveContactToList();
    }

    /**
     * Create an instance of {@link ContactDataType }
     * 
     */
    public ContactDataType createContactDataType() {
        return new ContactDataType();
    }

    /**
     * Create an instance of {@link SaveContactToListResponse }
     * 
     */
    public SaveContactToListResponse createSaveContactToListResponse() {
        return new SaveContactToListResponse();
    }

    /**
     * Create an instance of {@link SaveContactToListFaultInfo }
     * 
     */
    public SaveContactToListFaultInfo createSaveContactToListFaultInfo() {
        return new SaveContactToListFaultInfo();
    }

    /**
     * Create an instance of {@link GetContactDataFromList }
     * 
     */
    public GetContactDataFromList createGetContactDataFromList() {
        return new GetContactDataFromList();
    }

    /**
     * Create an instance of {@link GetContactDataFromListResponse }
     * 
     */
    public GetContactDataFromListResponse createGetContactDataFromListResponse() {
        return new GetContactDataFromListResponse();
    }

    /**
     * Create an instance of {@link GetContactDataFromListFaultInfo }
     * 
     */
    public GetContactDataFromListFaultInfo createGetContactDataFromListFaultInfo() {
        return new GetContactDataFromListFaultInfo();
    }

    /**
     * Create an instance of {@link GetContactAttributeValueFromList }
     * 
     */
    public GetContactAttributeValueFromList createGetContactAttributeValueFromList() {
        return new GetContactAttributeValueFromList();
    }

    /**
     * Create an instance of {@link GetContactAttributeValueFromListResponse }
     * 
     */
    public GetContactAttributeValueFromListResponse createGetContactAttributeValueFromListResponse() {
        return new GetContactAttributeValueFromListResponse();
    }

    /**
     * Create an instance of {@link GetContactAttributeValueFromListFaultInfo }
     * 
     */
    public GetContactAttributeValueFromListFaultInfo createGetContactAttributeValueFromListFaultInfo() {
        return new GetContactAttributeValueFromListFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValueToList }
     * 
     */
    public UpdateContactAttributeValueToList createUpdateContactAttributeValueToList() {
        return new UpdateContactAttributeValueToList();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValueToListResponse }
     * 
     */
    public UpdateContactAttributeValueToListResponse createUpdateContactAttributeValueToListResponse() {
        return new UpdateContactAttributeValueToListResponse();
    }

    /**
     * Create an instance of {@link UpdateContactAttributeValueToListFaultInfo }
     * 
     */
    public UpdateContactAttributeValueToListFaultInfo createUpdateContactAttributeValueToListFaultInfo() {
        return new UpdateContactAttributeValueToListFaultInfo();
    }

    /**
     * Create an instance of {@link AddContactListToJob }
     * 
     */
    public AddContactListToJob createAddContactListToJob() {
        return new AddContactListToJob();
    }

    /**
     * Create an instance of {@link AddContactListToJobResponse }
     * 
     */
    public AddContactListToJobResponse createAddContactListToJobResponse() {
        return new AddContactListToJobResponse();
    }

    /**
     * Create an instance of {@link AddContactListToJobFaultInfo }
     * 
     */
    public AddContactListToJobFaultInfo createAddContactListToJobFaultInfo() {
        return new AddContactListToJobFaultInfo();
    }

    /**
     * Create an instance of {@link DeleteContactFromList }
     * 
     */
    public DeleteContactFromList createDeleteContactFromList() {
        return new DeleteContactFromList();
    }

    /**
     * Create an instance of {@link DeleteContactFromListResponse }
     * 
     */
    public DeleteContactFromListResponse createDeleteContactFromListResponse() {
        return new DeleteContactFromListResponse();
    }

    /**
     * Create an instance of {@link DeleteContactFromListFaultInfo }
     * 
     */
    public DeleteContactFromListFaultInfo createDeleteContactFromListFaultInfo() {
        return new DeleteContactFromListFaultInfo();
    }

    /**
     * Create an instance of {@link GetAttributesList }
     * 
     */
    public GetAttributesList createGetAttributesList() {
        return new GetAttributesList();
    }

    /**
     * Create an instance of {@link GetAttributesListResponse }
     * 
     */
    public GetAttributesListResponse createGetAttributesListResponse() {
        return new GetAttributesListResponse();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link GetAttributesListFaultInfo }
     * 
     */
    public GetAttributesListFaultInfo createGetAttributesListFaultInfo() {
        return new GetAttributesListFaultInfo();
    }

    /**
     * Create an instance of {@link EmptyContactList }
     * 
     */
    public EmptyContactList createEmptyContactList() {
        return new EmptyContactList();
    }

    /**
     * Create an instance of {@link EmptyContactListResponse }
     * 
     */
    public EmptyContactListResponse createEmptyContactListResponse() {
        return new EmptyContactListResponse();
    }

    /**
     * Create an instance of {@link EmptyContactListFaultInfo }
     * 
     */
    public EmptyContactListFaultInfo createEmptyContactListFaultInfo() {
        return new EmptyContactListFaultInfo();
    }

    /**
     * Create an instance of {@link GetContactListEmptyStatus }
     * 
     */
    public GetContactListEmptyStatus createGetContactListEmptyStatus() {
        return new GetContactListEmptyStatus();
    }

    /**
     * Create an instance of {@link GetContactListEmptyStatusResponse }
     * 
     */
    public GetContactListEmptyStatusResponse createGetContactListEmptyStatusResponse() {
        return new GetContactListEmptyStatusResponse();
    }

    /**
     * Create an instance of {@link ContactListStatus }
     * 
     */
    public ContactListStatus createContactListStatus() {
        return new ContactListStatus();
    }

    /**
     * Create an instance of {@link GetContactListEmptyStatusFaultInfo }
     * 
     */
    public GetContactListEmptyStatusFaultInfo createGetContactListEmptyStatusFaultInfo() {
        return new GetContactListEmptyStatusFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateCampaignAttributeValue }
     * 
     */
    public UpdateCampaignAttributeValue createUpdateCampaignAttributeValue() {
        return new UpdateCampaignAttributeValue();
    }

    /**
     * Create an instance of {@link UpdateCampaignAttributeValueResponse }
     * 
     */
    public UpdateCampaignAttributeValueResponse createUpdateCampaignAttributeValueResponse() {
        return new UpdateCampaignAttributeValueResponse();
    }

    /**
     * Create an instance of {@link UpdateCampaignAttributeValueFaultInfo }
     * 
     */
    public UpdateCampaignAttributeValueFaultInfo createUpdateCampaignAttributeValueFaultInfo() {
        return new UpdateCampaignAttributeValueFaultInfo();
    }

    /**
     * Create an instance of {@link UpdateAgentAttributeValue }
     * 
     */
    public UpdateAgentAttributeValue createUpdateAgentAttributeValue() {
        return new UpdateAgentAttributeValue();
    }

    /**
     * Create an instance of {@link UpdateAgentAttributeValueResponse }
     * 
     */
    public UpdateAgentAttributeValueResponse createUpdateAgentAttributeValueResponse() {
        return new UpdateAgentAttributeValueResponse();
    }

    /**
     * Create an instance of {@link UpdateAgentAttributeValueFaultInfo }
     * 
     */
    public UpdateAgentAttributeValueFaultInfo createUpdateAgentAttributeValueFaultInfo() {
        return new UpdateAgentAttributeValueFaultInfo();
    }

    /**
     * Create an instance of {@link GetCampaignAttributesList }
     * 
     */
    public GetCampaignAttributesList createGetCampaignAttributesList() {
        return new GetCampaignAttributesList();
    }

    /**
     * Create an instance of {@link GetCampaignAttributesListResponse }
     * 
     */
    public GetCampaignAttributesListResponse createGetCampaignAttributesListResponse() {
        return new GetCampaignAttributesListResponse();
    }

    /**
     * Create an instance of {@link GetCampaignAttributesListFaultInfo }
     * 
     */
    public GetCampaignAttributesListFaultInfo createGetCampaignAttributesListFaultInfo() {
        return new GetCampaignAttributesListFaultInfo();
    }

    /**
     * Create an instance of {@link GetAgentAttributesList }
     * 
     */
    public GetAgentAttributesList createGetAgentAttributesList() {
        return new GetAgentAttributesList();
    }

    /**
     * Create an instance of {@link GetAgentAttributesListResponse }
     * 
     */
    public GetAgentAttributesListResponse createGetAgentAttributesListResponse() {
        return new GetAgentAttributesListResponse();
    }

    /**
     * Create an instance of {@link GetAgentAttributesListFaultInfo }
     * 
     */
    public GetAgentAttributesListFaultInfo createGetAgentAttributesListFaultInfo() {
        return new GetAgentAttributesListFaultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pim.avaya.com/AgentAPI/", name = "CountryCode", scope = PhoneType.class)
    public JAXBElement<String> createPhoneTypeCountryCode(String value) {
        return new JAXBElement<String>(_PhoneTypeCountryCode_QNAME, String.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pim.avaya.com/AgentAPI/", name = "PhoneNumber", scope = PhoneType.class)
    public JAXBElement<String> createPhoneTypePhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneTypePhoneNumber_QNAME, String.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pim.avaya.com/AgentAPI/", name = "TimeZone", scope = PhoneType.class)
    public JAXBElement<String> createPhoneTypeTimeZone(String value) {
        return new JAXBElement<String>(_PhoneTypeTimeZone_QNAME, String.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.pim.avaya.com/AgentAPI/", name = "PhoneAttributeName", scope = PhoneType.class)
    public JAXBElement<String> createPhoneTypePhoneAttributeName(String value) {
        return new JAXBElement<String>(_PhoneTypePhoneAttributeName_QNAME, String.class, PhoneType.class, value);
    }

}
