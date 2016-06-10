package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the assignee_leave database table.
 * 
 */
@Entity
@Table(name="assignee_leave")
@NamedQuery(name="AssigneeLeave.findAll", query="SELECT a FROM AssigneeLeave a")
public class AssigneeLeave implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=1)
	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="UNAVAILABLE_DATE")
	private Date unavailableDate;

	@Column(name="UNAVAILABLE_HOURS")
	private int unavailableHours;

	//bi-directional many-to-one association to AssigneeMaster
	@ManyToOne
	@JoinColumn(name="ASSIGNEE_ID", nullable=false)
	private AssigneeMaster assigneeMaster;

	public AssigneeLeave() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUnavailableDate() {
		return this.unavailableDate;
	}

	public void setUnavailableDate(Date unavailableDate) {
		this.unavailableDate = unavailableDate;
	}

	public int getUnavailableHours() {
		return this.unavailableHours;
	}

	public void setUnavailableHours(int unavailableHours) {
		this.unavailableHours = unavailableHours;
	}

	public AssigneeMaster getAssigneeMaster() {
		return this.assigneeMaster;
	}

	public void setAssigneeMaster(AssigneeMaster assigneeMaster) {
		this.assigneeMaster = assigneeMaster;
	}

}