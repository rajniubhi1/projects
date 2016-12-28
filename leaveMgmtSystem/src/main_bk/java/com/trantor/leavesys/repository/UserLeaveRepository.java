package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.entity.UserLeave;
/**
 * @author rajni.ubhi
 *
 */
@Repository("userLeaveRepository")
public interface UserLeaveRepository extends JpaRepository<UserLeave, Long>{

}
