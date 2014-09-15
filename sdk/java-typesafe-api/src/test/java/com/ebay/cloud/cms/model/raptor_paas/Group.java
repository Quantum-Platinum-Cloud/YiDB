package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;
import java.util.ArrayList;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Group extends GenericCMSEntity {


	public Group() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}

	public String getLabel(){
		return (String)getFieldValue("label");
	}

	public void setLabel(String attrVal_label){
		setFieldValue("label", attrVal_label);
	}
		
	public List<Person> getCustomer(){
		return (List<Person>) getFieldValue("customer");
	}

	public void setCustomer(List<Person> attrVals_customer){
		setFieldValue("customer", attrVals_customer);
	}
	
	public void addCustomer(Person attrVal_customer){
		addFieldValue("customer", attrVal_customer);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Group";
	}
	
}