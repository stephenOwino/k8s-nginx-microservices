package com.stephenowinoh.Course.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

        private String courseId;
        private String name;
        private double price;
}