package com.Employee_recode_system.RecordController;

import com.Employee_recode_system.dto.RecordRequest;
import com.Employee_recode_system.model.Records;
import com.Employee_recode_system.repo.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;


    @PostMapping("/Create_New_Records")
    public ResponseEntity<Map<String, String>> createEmployee(@RequestBody RecordRequest request){
        Map<String, String> response = new HashMap<>();

        if(recordRepository.findByEmail(request.getEmail()).isPresent()){
            response.put("message", "Email already exist");
            ResponseEntity.status(400).body(response);
        }

        Records newRecord = new Records();
        newRecord.setFullname(request.getFullname());
        newRecord.setEmail(request.getEmail());
        newRecord.setPosition(request.getPosition());
        newRecord.setDepartment(request.getDepartment());
        newRecord.setSalary(request.getSalary());
        newRecord.setHire_Date(request.getHire_Date());


        recordRepository.save(newRecord);

        response.put("message", "Employees Records Saved Successfully");
        return ResponseEntity.ok(response);
    }



}
