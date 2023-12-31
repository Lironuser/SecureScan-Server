package com.example.javaserverapi.repository;

import com.example.javaserverapi.entity.EmployeeEntity;
import com.example.javaserverapi.entity.SecurityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SecurityRepository extends JpaRepository<SecurityEntity,Long> {
    @Query("SELECT e FROM SecurityEntity e WHERE e.access=?1 AND e.room_name=?2")
    Optional<SecurityEntity> haveAccess(long access, String room_name);

    @Query("SELECT e FROM EmployeeEntity e where e.id=:id")
    Optional<EmployeeEntity> getEmployeeById(@Param("id")long id);
}
