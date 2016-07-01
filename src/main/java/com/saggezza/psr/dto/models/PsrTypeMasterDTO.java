package com.saggezza.psr.dto.models;

import com.saggezza.psr.dao.models.PsrStatusMaster;
import com.saggezza.psr.dao.models.PsrTypeMaster;

/**
 * Created by Arvind.J on 28-06-2016.
 */
public class PsrTypeMasterDTO {
    private int psrTypeId;
    private String psrTypeDesc;

    public PsrTypeMasterDTO() {}

    public PsrTypeMasterDTO(int psrTypeId, String psrTypeDesc) {
        this.psrTypeId = psrTypeId;
        this.psrTypeDesc = psrTypeDesc;
    }

    public static PsrTypeMasterDTO fromEntity(PsrTypeMaster psrTypeMaster){
        return new PsrTypeMasterDTO(psrTypeMaster.getPsrTypeId(),psrTypeMaster.getPsrTypeDesc());
    }

    public static PsrTypeMaster toEntity(PsrTypeMasterDTO psrTypeMasterDTO){
        final PsrTypeMaster psrTypeMaster = new PsrTypeMaster();
        psrTypeMaster.setPsrTypeId(psrTypeMasterDTO.getPsrTypeId());
        psrTypeMaster.setPsrTypeDesc(psrTypeMasterDTO.getPsrTypeDesc());
        return psrTypeMaster;
    }

    public int getPsrTypeId() {
        return psrTypeId;
    }

    public String getPsrTypeDesc() {
        return psrTypeDesc;
    }
}
