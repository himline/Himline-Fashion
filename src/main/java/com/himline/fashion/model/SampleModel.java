package com.himline.fashion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/*
@NamedQueries ({
	@NamedQuery (name= "findSampleModelById", query="from sample_model where sample_model_id=:id"),
	@NamedQuery (name ="findVmByName", query="from sample_model_name where =:name")			
})
*/

@Entity
@Table(name = "sample_model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SampleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sample_model_id")
    private long sampleModleID;
	
	@Column(name = "sample_model_name")
	String sampleModelName;

	public long getSampleModleID() {
		return sampleModleID;
	}

	public void setSampleModleID(long sampleModleID) {
		this.sampleModleID = sampleModleID;
	}

	public String getSampleModelName() {
		return sampleModelName;
	}

	public void setSampleModelName(String sampleModelName) {
		this.sampleModelName = sampleModelName;
	}
	
}