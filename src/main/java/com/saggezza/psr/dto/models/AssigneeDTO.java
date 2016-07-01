package com.saggezza.psr.dto.models;

import com.saggezza.psr.dao.models.AssigneeMaster;

/**
 * Created by shibi on 9/6/16.
 */
public class AssigneeDTO extends BaseDTO {

    public AssigneeDTO(int id, String name) {
        super(id,name);
    }

    public AssigneeDTO(){}; //Default constructor for POJO mapping

    public static AssigneeDTO fromEntity(AssigneeMaster assigneeMaster){
        return new AssigneeDTO(assigneeMaster.getId(),assigneeMaster.getName());
    }

    public static AssigneeMaster toEntity(AssigneeDTO assigneeDTO){
        final AssigneeMaster assigneeMaster = new AssigneeMaster();
        assigneeMaster.setId(assigneeDTO.getId());
        assigneeMaster.setName(assigneeDTO.getName());
        return assigneeMaster;
    }
}
