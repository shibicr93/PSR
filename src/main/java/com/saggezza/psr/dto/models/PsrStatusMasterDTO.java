package com.saggezza.psr.dto.models;

import com.saggezza.psr.dao.models.AssigneeMaster;
import com.saggezza.psr.dao.models.PsrStatusMaster;

/**
 * Created by Arvind.J on 28-06-2016.
 */
public class PsrStatusMasterDTO {
    private int statusId;
    private String statusDesc;

    public PsrStatusMasterDTO() {}

    public PsrStatusMasterDTO(int statusId, String statusDesc) {
        this.statusId = statusId;
        this.statusDesc = statusDesc;
    }

    public static PsrStatusMasterDTO fromEntity(PsrStatusMaster psrStatusMaster){
        return new PsrStatusMasterDTO(psrStatusMaster.getStatusId(),psrStatusMaster.getStatusDesc());
    }

    public static PsrStatusMaster toEntity(PsrStatusMasterDTO psrStatusMasterDTO){
        final PsrStatusMaster psrStatusMaster = new PsrStatusMaster();
        psrStatusMaster.setStatusId(psrStatusMasterDTO.getStatusId());
        psrStatusMaster.setStatusDesc(psrStatusMasterDTO.getStatusDesc());
        return psrStatusMaster;
    }

    public int getStatusId() {
        return statusId;
    }

    public String getStatusDesc() {
        return statusDesc;
    }
}
