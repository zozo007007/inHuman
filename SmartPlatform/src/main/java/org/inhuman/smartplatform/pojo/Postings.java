package org.inhuman.smartplatform.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postings {
    private int id;
    private int posterId;
    private String title;
    private String content;
    private Date time;
    private String type;
}
