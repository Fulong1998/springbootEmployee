package com.wfl.emps.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emps {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Double salary;
}
