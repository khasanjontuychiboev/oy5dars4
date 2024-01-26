package com.najot.oy5dars4.mapper;

import com.najot.oy5dars4.dto.TagDTO;
import com.najot.oy5dars4.entity.Tag;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagMapper extends EntityMapper<TagDTO, Tag> {

}
