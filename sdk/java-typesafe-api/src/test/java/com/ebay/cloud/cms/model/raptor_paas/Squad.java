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
public class Squad extends GenericCMSEntity {


	public Squad() {
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
		
	public List<Human> getHuman(){
		return (List<Human>) getFieldValue("human");
	}

	public void setHuman(List<Human> attrVals_human){
		setFieldValue("human", attrVals_human);
	}
	
	public void addHuman(Human attrVal_human){
		addFieldValue("human", attrVal_human);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Squad";
	}
	
}