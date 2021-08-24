package com.example.pagination.controller;

import com.example.pagination.baseresponse.APIResponse;
import com.example.pagination.baseresponse.BaseResponse;
import com.example.pagination.dto.WorkerDTO;
import com.example.pagination.entity.Worker;
import com.example.pagination.serviece.WorkerServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/workers")

public class WorkerController {
    @Autowired
    private WorkerServiece workerServiece;

    @GetMapping("/pagination/{offset}/{pageSize}")
    private APIResponse<Page<Worker>> getWorkerWithPagination
            (@PathVariable int offset,@PathVariable int pageSize) {
        Page<Worker> workerWithPagination = workerServiece.findWorkerWithPagination(offset, pageSize);
        return new APIResponse<>(workerWithPagination.getSize(), workerWithPagination);

    }
    @GetMapping("/{field}")
    private APIResponse<List<Worker>> getWorkersWithSort(@PathVariable String field){
     List<Worker> allWorkers = workerServiece.findProductWithSortig(field);
     return new APIResponse<>(allWorkers.size(),allWorkers);
    }

    @PostMapping("/addWorker")
    public BaseResponse add(@RequestBody WorkerDTO workerDTO){
        return workerServiece.add(workerDTO);
    }
}
