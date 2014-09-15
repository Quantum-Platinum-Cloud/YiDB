package com.ebay.cloud.cms.model.raptor_paas;



import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Human extends GenericCMSEntity {


	public Human() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	

	public String getAge(){
		return (String)getFieldValue("age");
	}

	public void setAge(String attrVal_age){
		setFieldValue("age", attrVal_age);
	}

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

	@JsonIgnore
	public String get_metaclass(){
		return "Human";
	}
	
}