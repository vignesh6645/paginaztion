package com.example.pagination.serviece;


import com.example.pagination.baseresponse.APIResponse;
import com.example.pagination.baseresponse.BaseResponse;
import com.example.pagination.dto.WorkerDTO;
import com.example.pagination.entity.Worker;
import com.example.pagination.respository.WorkerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service

public class WorkerServiece {

    @Autowired
    private WorkerRespository workerRespository;

    public BaseResponse add(WorkerDTO workerDTO){

        Worker worker= new Worker();
        BaseResponse baseResponse = new BaseResponse();

        worker.setName(workerDTO.getName());
        worker.setAge(workerDTO.getAge());
        worker.setMobileNumber(workerDTO.getMobileNumber());
        workerRespository.save(worker);

        baseResponse.setData(worker);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");

        return baseResponse;

    }


   // BaseResponse baseResponse = new BaseResponse();
    public Page<Worker> findWorkerWithPagination(int offset,int pageSize){
        APIResponse apiResponse = new APIResponse();
        Page<Worker> workers =workerRespository.findAll(PageRequest.of(offset, pageSize));
        return  workers;
    }

}
