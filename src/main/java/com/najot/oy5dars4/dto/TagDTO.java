package com.najot.oy5dars4.dto;

import com.najot.oy5dars4.entity.News;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagDTO {

    private Integer id;
    private String name;

    private Set<News> news;
}
