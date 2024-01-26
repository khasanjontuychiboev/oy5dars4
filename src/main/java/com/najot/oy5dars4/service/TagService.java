package com.najot.oy5dars4.service;


import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.dto.TagDTO;
import com.najot.oy5dars4.entity.News;
import com.najot.oy5dars4.entity.Tag;

import java.util.List;

public interface TagService {
    List<NewsDTO> getTagWithNews(Integer id);
}
