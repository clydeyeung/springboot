//package com.fss.Springboot.tutorial.controller;
//
//import com.fss.Springboot.tutorial.entity.Department;
//import com.fss.Springboot.tutorial.service.DepartmentService;
//import com.fss.Springboot.tutorial.service.DepartmentServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class DepartmentController {
//
//    @Autowired
//    private DepartmentService departmentService;
//    @PostMapping("/departments")
//    public Department saveDepartment(@RequestBody Department department) {
//        return departmentService.saveDepartment(department);
//    }
//}
