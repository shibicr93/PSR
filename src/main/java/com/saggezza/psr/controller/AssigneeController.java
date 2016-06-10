package com.saggezza.psr.controller;

import com.saggezza.psr.dao.IAssigneeDAO;
import com.saggezza.psr.dao.models.AssigneeMaster;
import com.saggezza.psr.dto.models.AssigneeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shibi on 9/6/16.
 */

@Controller
@RequestMapping("/assignee")
public class AssigneeController implements IController<AssigneeDTO>{

    @Autowired
    private IAssigneeDAO assigneeDAO;

    @Override
    @ResponseBody
    @RequestMapping("/getAll")
    public List<AssigneeDTO> getAll() {
        List<AssigneeMaster> assigneeMasterList = assigneeDAO.findAll();
        return assigneeMasterList.stream().map(AssigneeDTO::fromEntity).collect(Collectors.toList());
    }

    @Override
    public AssigneeDTO get(String id) {
        return null;
    }

    @Override
    public void create(AssigneeDTO assigneeDTO) {

    }

    @Override
    public void update(AssigneeDTO assigneeDTO) {

    }

    @Override
    public void delete(AssigneeDTO assigneeDTO) {

    }
}
