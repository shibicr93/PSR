package com.saggezza.psr.dto.models;

import com.saggezza.psr.dao.models.AssigneeMaster;
import com.saggezza.psr.dao.models.PsrMaster;
import com.saggezza.psr.dao.models.PsrStatusMaster;
import com.saggezza.psr.dao.models.PsrTypeMaster;

import java.util.Date;

/**
 * Created by Arvind.J on 28-06-2016.
 */
public class PsrMasterDTO {

    private int psrNo;
    private Date approvalDate;
    private Date createDate;
    private String description;
    private Date endDate;
    private int estimateHours;
    private String psrOwner;
    private String severity;
    private Date slaDate;
    private Date startDate;
    private Date updateDate;
    private AssigneeDTO assigneeMaster;
    private PsrStatusMasterDTO psrStatusMaster;
    private PsrTypeMasterDTO psrTypeMaster;

    public PsrMasterDTO() {}

    public PsrMasterDTO(int psrNo, Date approvalDate, Date createDate, String description, Date endDate,
                        int estimateHours, String psrOwner, String severity, Date slaDate, Date startDate,
                        Date updateDate, AssigneeMaster assigneeMaster , PsrStatusMaster psrStatusMaster,
                        PsrTypeMaster psrTypeMaster) {
        this.psrNo = psrNo;
        this.approvalDate = approvalDate;
        this.createDate = createDate;
        this.description = description;
        this.endDate = endDate;
        this.estimateHours = estimateHours;
        this.psrOwner = psrOwner;
        this.severity = severity;
        this.slaDate = slaDate;
        this.startDate = startDate;
        this.updateDate = updateDate;
        this.assigneeMaster = AssigneeDTO.fromEntity(assigneeMaster);
        this.psrStatusMaster = PsrStatusMasterDTO.fromEntity(psrStatusMaster);
        this.psrTypeMaster = PsrTypeMasterDTO.fromEntity(psrTypeMaster);
    }

    public static PsrMasterDTO fromEntity(PsrMaster psrMaster){
        return new PsrMasterDTO(psrMaster.getPsrNo(), psrMaster.getApprovalDate(), psrMaster.getCreateDate(),
                psrMaster.getDescription(), psrMaster.getEndDate(), psrMaster.getEstimateHours(), psrMaster.getPsrOwner(),
                psrMaster.getSeverity(), psrMaster.getSlaDate(), psrMaster.getStartDate(), psrMaster.getUpdateDate(),
                psrMaster.getAssigneeMaster(), psrMaster.getPsrStatusMaster(), psrMaster.getPsrTypeMaster());
    }

    public static PsrMaster toEntity(PsrMasterDTO psrMasterDTO){
        final PsrMaster psrMaster = new PsrMaster();
        psrMaster.setPsrNo(psrMasterDTO.getPsrNo());
        psrMaster.setApprovalDate(psrMasterDTO.getApprovalDate());
        psrMaster.setCreateDate(psrMasterDTO.getCreateDate());
        psrMaster.setDescription(psrMasterDTO.getDescription());
        psrMaster.setEndDate(psrMasterDTO.getEndDate());
        psrMaster.setEstimateHours(psrMasterDTO.getEstimateHours());
        psrMaster.setPsrOwner(psrMasterDTO.getPsrOwner());
        psrMaster.setSeverity(psrMasterDTO.getSeverity());
        psrMaster.setSlaDate(psrMasterDTO.getSlaDate());
        psrMaster.setStartDate(psrMasterDTO.getStartDate());
        psrMaster.setUpdateDate(psrMasterDTO.getUpdateDate());
        psrMaster.setAssigneeMaster(AssigneeDTO.toEntity(psrMasterDTO.getAssigneeMaster()));
        psrMaster.setPsrStatusMaster(PsrStatusMasterDTO.toEntity(psrMasterDTO.getPsrStatusMaster()));
        psrMaster.setPsrTypeMaster(PsrTypeMasterDTO.toEntity(psrMasterDTO.getPsrTypeMaster()));
        return psrMaster;
    }

    public int getPsrNo() {
        return psrNo;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getEstimateHours() {
        return estimateHours;
    }

    public String getPsrOwner() {
        return psrOwner;
    }

    public String getSeverity() {
        return severity;
    }

    public Date getSlaDate() {
        return slaDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public AssigneeDTO getAssigneeMaster() {
        return assigneeMaster;
    }

    public PsrStatusMasterDTO getPsrStatusMaster() {
        return psrStatusMaster;
    }

    public PsrTypeMasterDTO getPsrTypeMaster() {
        return psrTypeMaster;
    }
}
