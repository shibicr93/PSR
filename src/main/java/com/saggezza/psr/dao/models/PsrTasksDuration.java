package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the psr_tasks_duration database table.
 * 
 */
@Entity
@Table(name="psr_tasks_duration")
@NamedQuery(name="PsrTasksDuration.findAll", query="SELECT p FROM PsrTasksDuration p")
public class PsrTasksDuration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DURATION_ID", unique=true, nullable=false)
	private int durationId;

	@Temporal(TemporalType.DATE)
	@Column(name="DURATION_DATE")
	private Date durationDate;

	@Column(name="DURATION_HOURS")
	private int durationHours;

	@Column(length=1)
	private String status;

	//bi-directional many-to-one association to AssigneeTask
	@OneToMany(mappedBy="psrTasksDuration1")
	private List<AssigneeTask> assigneeTasks1;

	//bi-directional many-to-one association to AssigneeTask
	@OneToMany(mappedBy="psrTasksDuration2")
	private List<AssigneeTask> assigneeTasks2;

	//bi-directional many-to-one association to PsrMaster
	@ManyToOne
	@JoinColumn(name="PSR_NO", nullable=false)
	private PsrMaster psrMaster;

	public PsrTasksDuration() {
	}

	public int getDurationId() {
		return this.durationId;
	}

	public void setDurationId(int durationId) {
		this.durationId = durationId;
	}

	public Date getDurationDate() {
		return this.durationDate;
	}

	public void setDurationDate(Date durationDate) {
		this.durationDate = durationDate;
	}

	public int getDurationHours() {
		return this.durationHours;
	}

	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<AssigneeTask> getAssigneeTasks1() {
		return this.assigneeTasks1;
	}

	public void setAssigneeTasks1(List<AssigneeTask> assigneeTasks1) {
		this.assigneeTasks1 = assigneeTasks1;
	}

	public AssigneeTask addAssigneeTasks1(AssigneeTask assigneeTasks1) {
		getAssigneeTasks1().add(assigneeTasks1);
		assigneeTasks1.setPsrTasksDuration1(this);

		return assigneeTasks1;
	}

	public AssigneeTask removeAssigneeTasks1(AssigneeTask assigneeTasks1) {
		getAssigneeTasks1().remove(assigneeTasks1);
		assigneeTasks1.setPsrTasksDuration1(null);

		return assigneeTasks1;
	}

	public List<AssigneeTask> getAssigneeTasks2() {
		return this.assigneeTasks2;
	}

	public void setAssigneeTasks2(List<AssigneeTask> assigneeTasks2) {
		this.assigneeTasks2 = assigneeTasks2;
	}

	public AssigneeTask addAssigneeTasks2(AssigneeTask assigneeTasks2) {
		getAssigneeTasks2().add(assigneeTasks2);
		assigneeTasks2.setPsrTasksDuration2(this);

		return assigneeTasks2;
	}

	public AssigneeTask removeAssigneeTasks2(AssigneeTask assigneeTasks2) {
		getAssigneeTasks2().remove(assigneeTasks2);
		assigneeTasks2.setPsrTasksDuration2(null);

		return assigneeTasks2;
	}

	public PsrMaster getPsrMaster() {
		return this.psrMaster;
	}

	public void setPsrMaster(PsrMaster psrMaster) {
		this.psrMaster = psrMaster;
	}

}