package com.rikkei.managementuser.model.dto.request;

import com.rikkei.managementuser.model.entity.Courses;
import com.rikkei.managementuser.model.entity.Instructor;
import com.rikkei.managementuser.validator.ClassUnique;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassCreateDTO {

    @NotBlank
    @ClassUnique(message = "Lớp học này đã tồn tại")
    private String name;

    @Min(value = 0, message = "số học viên không được âm ")
    private int maxStudent;

    @NotBlank
    private String instructor;

    private Long coursesId;

}
