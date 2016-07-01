package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the psr_master database table.
 * 
 */
@Entity
@Table(name="psr_master")
@NamedQuery(name="PsrMaster.findAll", query="SELECT p FROM PsrMaster p")
public class PsrMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PSR_NO", unique=true, nullable=false)
	private int psrNo;

	@Temporal(TemporalType.DATE)
	@Column(name="APPROVAL_DATE")
	private Date approvalDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(length=250)
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="ESTIMATE_HOURS")
	private int estimateHours;

	@Column(name="PSR_OWNER", length=100)
	private String psrOwner;

	@Column(length=50)
	private String severity;

	@Temporal(TemporalType.DATE)
	@Column(name="SLA_DATE")
	private Date slaDate;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to AssigneeMaster
	@ManyToOne
	@JoinColumn(name="ASSIGNEE_ID")
	private AssigneeMaster assigneeMaster;

	//bi-directional many-to-one association to PsrStatusMaster
	@ManyToOne
	@JoinColumn(name="STATUS_ID", nullable=false)
	private PsrStatusMaster psrStatusMaster;

	//bi-directional many-to-one association to PsrTypeMaster
	@ManyToOne
	@JoinColumn(name="PSR_TYPE_ID", nullable=false)
	private PsrTypeMaster psrTypeMaster;

	//bi-directional many-to-one association to PsrTasksDuration
	@OneToMany(mappedBy="psrMaster", fetch = FetchType.EAGER)
	private List<PsrTasksDuration> psrTasksDurations;

	public PsrMaster() {
	}

	public int getPsrNo() {
		return this.psrNo;
	}

	public void setPsrNo(int psrNo) {
		this.psrNo = psrNo;
	}

	public Date getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getEstimateHours() {
		return this.estimateHours;
	}

	public void setEstimateHours(int estimateHours) {
		this.estimateHours = estimateHours;
	}

	public String getPsrOwner() {
		return this.psrOwner;
	}

	public void setPsrOwner(String psrOwner) {
		this.psrOwner = psrOwner;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public Date getSlaDate() {
		return this.slaDate;
	}

	public void setSlaDate(Date slaDate) {
		this.slaDate = slaDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public AssigneeMaster getAssigneeMaster() {
		return this.assigneeMaster;
	}

	public void setAssigneeMaster(AssigneeMaster assigneeMaster) {
		this.assigneeMaster = assigneeMaster;
	}

	public PsrStatusMaster getPsrStatusMaster() {
		return this.psrStatusMaster;
	}

	public void setPsrStatusMaster(PsrStatusMaster psrStatusMaster) {
		this.psrStatusMaster = psrStatusMaster;
	}

	public PsrTypeMaster getPsrTypeMaster() {
		return this.psrTypeMaster;
	}

	public void setPsrTypeMaster(PsrTypeMaster psrTypeMaster) {
		this.psrTypeMaster = psrTypeMaster;
	}

	public List<PsrTasksDuration> getPsrTasksDurations() {
		return this.psrTasksDurations;
	}

	public void setPsrTasksDurations(List<PsrTasksDuration> psrTasksDurations) {
		this.psrTasksDurations = psrTasksDurations;
	}

	public PsrTasksDuration addPsrTasksDuration(PsrTasksDuration psrTasksDuration) {
		getPsrTasksDurations().add(psrTasksDuration);
		psrTasksDuration.setPsrMaster(this);

		return psrTasksDuration;
	}

	public PsrTasksDuration removePsrTasksDuration(PsrTasksDuration psrTasksDuration) {
		getPsrTasksDurations().remove(psrTasksDuration);
		psrTasksDuration.setPsrMaster(null);

		return psrTasksDuration;
	}

}