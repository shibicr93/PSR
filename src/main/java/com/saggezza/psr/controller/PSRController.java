package com.saggezza.psr.controller;

import com.saggezza.psr.dao.IAssigneeDAO;
import com.saggezza.psr.dao.IPSRMasterDAO;
import com.saggezza.psr.dao.models.AssigneeMaster;
import com.saggezza.psr.dao.models.PsrMaster;
import com.saggezza.psr.dto.models.AssigneeDTO;
import com.saggezza.psr.dto.models.PsrMasterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Arvind.J on 28-06-2016.
 */
@Controller
@RequestMapping("/psr")
public class PSRController implements IController<PsrMasterDTO> {

    @Autowired
    private IPSRMasterDAO psrMasterDao;

    @Override
    @ResponseBody
    @RequestMapping("/getAll")
    public List<PsrMasterDTO> getAll() {
        final List<PsrMaster> psrMasterList = psrMasterDao.findAll();
        return psrMasterList.stream().map(PsrMasterDTO::fromEntity).collect(Collectors.toList());
    }

    @Override
    public PsrMasterDTO get(String id) {
        return null;
    }

    @Override
    public void create(PsrMasterDTO psrMaster) {

    }

    @Override
    public void update(PsrMasterDTO psrMaster) {

    }

    @Override
    public void delete(PsrMasterDTO psrMaster) {

    }
}
