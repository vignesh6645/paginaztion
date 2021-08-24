package com.example.pagination.respository;

import com.example.pagination.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRespository extends JpaRepository<Worker ,Integer> {
}
