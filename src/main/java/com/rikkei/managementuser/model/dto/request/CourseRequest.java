package com.rikkei.managementuser.model.dto.request;

import com.rikkei.managementuser.model.entity.CourseStatus;
import com.rikkei.managementuser.validator.CourseUnique;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {
    @NotBlank
    @CourseUnique(message = "Tên khóa học đã tồn tại!")
    private String title;
    @NotBlank
    private String description;

    private int courseTime;
//
//    @Temporal(TemporalType.DATE)
//    private Date startDate;
//
//    @Temporal(TemporalType.DATE)
//    private Date endDate;
//

}
