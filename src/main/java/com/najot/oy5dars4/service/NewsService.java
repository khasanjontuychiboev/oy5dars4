package com.najot.oy5dars4.service;

import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.mapper.NewsMapper;
import com.najot.oy5dars4.repository.NewsRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NewsService {
    NewsDTO getNewsById(Integer id);
    List<NewsDTO> getNewsList();

    NewsDTO createNews(NewsDTO newsDTO);
    NewsDTO updateNews(Integer id, NewsDTO newsDTO);

    void deleteNews(Integer id);

}
