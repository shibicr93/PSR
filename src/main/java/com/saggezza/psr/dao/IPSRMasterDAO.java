package com.saggezza.psr.dao;

import com.saggezza.psr.dao.models.AssigneeMaster;
import com.saggezza.psr.dao.models.PsrMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.transaction.Transactional;

/**
 * Created by Arvind.J on 28-06-2016.
 */
@Transactional
@EnableJpaRepositories
public interface IPSRMasterDAO extends JpaRepository<PsrMaster,Integer> {
}
