package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the psr_status_master database table.
 * 
 */
@Entity
@Table(name="psr_status_master")
@NamedQuery(name="PsrStatusMaster.findAll", query="SELECT p FROM PsrStatusMaster p")
public class PsrStatusMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STATUS_ID", unique=true, nullable=false)
	private int statusId;

	@Column(name="STATUS_DESC", length=50)
	private String statusDesc;

	//bi-directional many-to-one association to PsrMaster
	@OneToMany(mappedBy="psrStatusMaster")
	private List<PsrMaster> psrMasters;

	public PsrStatusMaster() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public List<PsrMaster> getPsrMasters() {
		return this.psrMasters;
	}

	public void setPsrMasters(List<PsrMaster> psrMasters) {
		this.psrMasters = psrMasters;
	}

	public PsrMaster addPsrMaster(PsrMaster psrMaster) {
		getPsrMasters().add(psrMaster);
		psrMaster.setPsrStatusMaster(this);

		return psrMaster;
	}

	public PsrMaster removePsrMaster(PsrMaster psrMaster) {
		getPsrMasters().remove(psrMaster);
		psrMaster.setPsrStatusMaster(null);

		return psrMaster;
	}

}