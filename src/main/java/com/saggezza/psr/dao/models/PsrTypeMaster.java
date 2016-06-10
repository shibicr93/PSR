package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the psr_type_master database table.
 * 
 */
@Entity
@Table(name="psr_type_master")
@NamedQuery(name="PsrTypeMaster.findAll", query="SELECT p FROM PsrTypeMaster p")
public class PsrTypeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PSR_TYPE_ID", unique=true, nullable=false)
	private int psrTypeId;

	@Column(name="PSR_TYPE_DESC", length=50)
	private String psrTypeDesc;

	//bi-directional many-to-one association to PsrMaster
	@OneToMany(mappedBy="psrTypeMaster")
	private List<PsrMaster> psrMasters;

	public PsrTypeMaster() {
	}

	public int getPsrTypeId() {
		return this.psrTypeId;
	}

	public void setPsrTypeId(int psrTypeId) {
		this.psrTypeId = psrTypeId;
	}

	public String getPsrTypeDesc() {
		return this.psrTypeDesc;
	}

	public void setPsrTypeDesc(String psrTypeDesc) {
		this.psrTypeDesc = psrTypeDesc;
	}

	public List<PsrMaster> getPsrMasters() {
		return this.psrMasters;
	}

	public void setPsrMasters(List<PsrMaster> psrMasters) {
		this.psrMasters = psrMasters;
	}

	public PsrMaster addPsrMaster(PsrMaster psrMaster) {
		getPsrMasters().add(psrMaster);
		psrMaster.setPsrTypeMaster(this);

		return psrMaster;
	}

	public PsrMaster removePsrMaster(PsrMaster psrMaster) {
		getPsrMasters().remove(psrMaster);
		psrMaster.setPsrTypeMaster(null);

		return psrMaster;
	}

}