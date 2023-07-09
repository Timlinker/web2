package com.example.Banks.model.dto;

import com.example.Banks.model.ED807;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {
        private Boolean success;
        private String message;
        private LocalDateTime timestamp;
        private int status;
        private String cause;
        private String stacktrace;
        private ED807 data;
        public static ResultDTO SUCCESS_RESULT = new ResultDTO(true, "", LocalDateTime.now(), 0, null, null, null);
        public static ResultDTO FAILURE_RESULT = new ResultDTO(false, "", LocalDateTime.now(), 0, null, null, null);
}