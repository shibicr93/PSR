package com.saggezza.psr.dao;

import com.saggezza.psr.dao.models.AssigneeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.transaction.Transactional;

/**
 * Created by shibi on 9/6/16.
 */
@Transactional
@EnableJpaRepositories
public interface IAssigneeDAO extends JpaRepository<AssigneeMaster,Integer>{
}
