package com.najot.oy5dars4.mapper;

import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.entity.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper extends EntityMapper<NewsDTO, News>{
}
