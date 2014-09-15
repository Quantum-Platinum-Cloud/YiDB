package com.ebay.cloud.cms.model.software_deployment;



import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class DeploymentEntityStatus extends GenericCMSEntity {


	public DeploymentEntityStatus() {
		set_type(get_metaclass());
//		set_repo("software-deployment");
	}

	// the getter/setter method
	

	public String getStatus(){
		return (String)getFieldValue("status");
	}

	public void setStatus(String attrVal_status){
		setFieldValue("status", attrVal_status);
	}

	public String getDescription(){
		return (String)getFieldValue("description");
	}

	public void setDescription(String attrVal_description){
		setFieldValue("description", attrVal_description);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "DeploymentEntityStatus";
	}
	
}