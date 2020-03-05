package com.nengliang.web.dto;

import java.util.List;

public class DataTwoDTO {
	
	private String sourceId;
    private List<FieldValuesDTO> fieldValues;
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public List<FieldValuesDTO> getFieldValues() {
		return fieldValues;
	}
	public void setFieldValues(List<FieldValuesDTO> fieldValues) {
		this.fieldValues = fieldValues;
	}
    
    
    
}
