package com.saggezza.psr.dao.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the assignee_master database table.
 * 
 */
@Entity
@Table(name="assignee_master")
@NamedQuery(name="AssigneeMaster.findAll", query="SELECT a FROM AssigneeMaster a")
public class AssigneeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=100)
	private String name;

	//bi-directional many-to-one association to AssigneeLeave
	@OneToMany(mappedBy="assigneeMaster")
	private List<AssigneeLeave> assigneeLeaves;

	//bi-directional many-to-one association to AssigneeTask
	@OneToMany(mappedBy="assigneeMaster")
	private List<AssigneeTask> assigneeTasks;

	//bi-directional many-to-one association to PsrMaster
	@OneToMany(mappedBy="assigneeMaster")
	private List<PsrMaster> psrMasters;

	public AssigneeMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AssigneeLeave> getAssigneeLeaves() {
		return this.assigneeLeaves;
	}

	public void setAssigneeLeaves(List<AssigneeLeave> assigneeLeaves) {
		this.assigneeLeaves = assigneeLeaves;
	}

	public AssigneeLeave addAssigneeLeave(AssigneeLeave assigneeLeave) {
		getAssigneeLeaves().add(assigneeLeave);
		assigneeLeave.setAssigneeMaster(this);

		return assigneeLeave;
	}

	public AssigneeLeave removeAssigneeLeave(AssigneeLeave assigneeLeave) {
		getAssigneeLeaves().remove(assigneeLeave);
		assigneeLeave.setAssigneeMaster(null);

		return assigneeLeave;
	}

	public List<AssigneeTask> getAssigneeTasks() {
		return this.assigneeTasks;
	}

	public void setAssigneeTasks(List<AssigneeTask> assigneeTasks) {
		this.assigneeTasks = assigneeTasks;
	}

	public AssigneeTask addAssigneeTask(AssigneeTask assigneeTask) {
		getAssigneeTasks().add(assigneeTask);
		assigneeTask.setAssigneeMaster(this);

		return assigneeTask;
	}

	public AssigneeTask removeAssigneeTask(AssigneeTask assigneeTask) {
		getAssigneeTasks().remove(assigneeTask);
		assigneeTask.setAssigneeMaster(null);

		return assigneeTask;
	}

	public List<PsrMaster> getPsrMasters() {
		return this.psrMasters;
	}

	public void setPsrMasters(List<PsrMaster> psrMasters) {
		this.psrMasters = psrMasters;
	}

	public PsrMaster addPsrMaster(PsrMaster psrMaster) {
		getPsrMasters().add(psrMaster);
		psrMaster.setAssigneeMaster(this);

		return psrMaster;
	}

	public PsrMaster removePsrMaster(PsrMaster psrMaster) {
		getPsrMasters().remove(psrMaster);
		psrMaster.setAssigneeMaster(null);

		return psrMaster;
	}

}