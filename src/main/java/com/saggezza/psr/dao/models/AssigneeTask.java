package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the assignee_tasks database table.
 * 
 */
@Entity
@Table(name="assignee_tasks")
@NamedQuery(name="AssigneeTask.findAll", query="SELECT a FROM AssigneeTask a")
public class AssigneeTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;


	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to AssigneeMaster
	@ManyToOne
	@JoinColumn(name="ASSIGNEE_ID", nullable=false)
	private AssigneeMaster assigneeMaster;

	//bi-directional many-to-one association to PsrTasksDuration
	@ManyToOne
	@JoinColumn(name="END_ID")
	private PsrTasksDuration psrTasksDuration1;

	//bi-directional many-to-one association to PsrTasksDuration
	@ManyToOne
	@JoinColumn(name="START_ID")
	private PsrTasksDuration psrTasksDuration2;

	public AssigneeTask() {
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public PsrTasksDuration getPsrTasksDuration1() {
		return this.psrTasksDuration1;
	}

	public void setPsrTasksDuration1(PsrTasksDuration psrTasksDuration1) {
		this.psrTasksDuration1 = psrTasksDuration1;
	}

	public PsrTasksDuration getPsrTasksDuration2() {
		return this.psrTasksDuration2;
	}

	public void setPsrTasksDuration2(PsrTasksDuration psrTasksDuration2) {
		this.psrTasksDuration2 = psrTasksDuration2;
	}

}