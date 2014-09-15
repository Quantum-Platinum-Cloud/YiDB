package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class ApplicationService extends GenericCMSEntity {


	public ApplicationService() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	

	public String getArchTier(){
		return (String)getFieldValue("archTier");
	}

	public void setArchTier(String attrVal_archTier){
		setFieldValue("archTier", attrVal_archTier);
	}

	public String getPreActiveManifestRef(){
		return (String)getFieldValue("preActiveManifestRef");
	}

	public void setPreActiveManifestRef(String attrVal_preActiveManifestRef){
		setFieldValue("preActiveManifestRef", attrVal_preActiveManifestRef);
	}
		
	public List<ServiceInstance> getServices(){
		return (List<ServiceInstance>) getFieldValue("services");
	}

	public void setServices(List<ServiceInstance> attrVals_services){
		setFieldValue("services", attrVals_services);
	}
	
	public void addServices(ServiceInstance attrVal_services){
		addFieldValue("services", attrVal_services);
	}
		
	public List<String> getPreManifestRef(){
		return (List<String>)getFieldValue("preManifestRef");
	}

	public void setPreManifestRef(List<String> attrVals_preManifestRef){
		setFieldValue("preManifestRef", attrVals_preManifestRef);
	}

	public void addPreManifestRef(String attrVal_preManifestRef){
		addFieldValue("preManifestRef", attrVal_preManifestRef);
	}

	public String getHealthStatus(){
		return (String)getFieldValue("healthStatus");
	}

	public void setHealthStatus(String attrVal_healthStatus){
		setFieldValue("healthStatus", attrVal_healthStatus);
	}

	public String getAppId(){
		return (String)getFieldValue("appId");
	}

	public void setAppId(String attrVal_appId){
		setFieldValue("appId", attrVal_appId);
	}

	public String getStatus(){
		return (String)getFieldValue("status");
	}

	public void setStatus(String attrVal_status){
		setFieldValue("status", attrVal_status);
	}
		
	public List<String> getDeployHistory(){
		return (List<String>)getFieldValue("deployHistory");
	}

	public void setDeployHistory(List<String> attrVals_deployHistory){
		setFieldValue("deployHistory", attrVals_deployHistory);
	}

	public void addDeployHistory(String attrVal_deployHistory){
		addFieldValue("deployHistory", attrVal_deployHistory);
	}

	public String getLabel(){
		return (String)getFieldValue("label");
	}

	public void setLabel(String attrVal_label){
		setFieldValue("label", attrVal_label);
	}

	public String getArchitecture(){
		return (String)getFieldValue("architecture");
	}

	public void setArchitecture(String attrVal_architecture){
		setFieldValue("architecture", attrVal_architecture);
	}
		
	public List<String> getActiveManifestRef(){
		return (List<String>)getFieldValue("activeManifestRef");
	}

	public void setActiveManifestRef(List<String> attrVals_activeManifestRef){
		setFieldValue("activeManifestRef", attrVals_activeManifestRef);
	}

	public void addActiveManifestRef(String attrVal_activeManifestRef){
		addFieldValue("activeManifestRef", attrVal_activeManifestRef);
	}

	public String getNugget(){
		return (String)getFieldValue("nugget");
	}

	public void setNugget(String attrVal_nugget){
		setFieldValue("nugget", attrVal_nugget);
	}

	public String getActiveManifestCur(){
		return (String)getFieldValue("activeManifestCur");
	}

	public void setActiveManifestCur(String attrVal_activeManifestCur){
		setFieldValue("activeManifestCur", attrVal_activeManifestCur);
	}
		
	public List<String> getManifestRef(){
		return (List<String>)getFieldValue("manifestRef");
	}

	public void setManifestRef(List<String> attrVals_manifestRef){
		setFieldValue("manifestRef", attrVals_manifestRef);
	}

	public void addManifestRef(String attrVal_manifestRef){
		addFieldValue("manifestRef", attrVal_manifestRef);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}
		
	public List<UpdateStrategy> getUpdateStrategies(){
		return (List<UpdateStrategy>) getFieldValue("updateStrategies");
	}

	public void setUpdateStrategies(List<UpdateStrategy> attrVals_updateStrategies){
		setFieldValue("updateStrategies", attrVals_updateStrategies);
	}
	
	public void addUpdateStrategies(UpdateStrategy attrVal_updateStrategies){
		addFieldValue("updateStrategies", attrVal_updateStrategies);
	}

	public String getManifestCur(){
		return (String)getFieldValue("manifestCur");
	}

	public void setManifestCur(String attrVal_manifestCur){
		setFieldValue("manifestCur", attrVal_manifestCur);
	}

	public Boolean getActiveManifestDiff(){
		return (Boolean)getFieldValue("activeManifestDiff");
	}

	public void setActiveManifestDiff(Boolean attrVal_activeManifestDiff){
		setFieldValue("activeManifestDiff", attrVal_activeManifestDiff);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "ApplicationService";
	}
	
}