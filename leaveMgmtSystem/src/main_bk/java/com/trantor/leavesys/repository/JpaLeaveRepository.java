package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.entity.Leave;

/**
 * @author rajni.ubhi
 *
 */

@Repository("leaveRepository")
public interface JpaLeaveRepository extends JpaRepository<Leave, Long>{

}
