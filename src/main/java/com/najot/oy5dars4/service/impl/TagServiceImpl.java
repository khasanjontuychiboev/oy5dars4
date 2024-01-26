package com.najot.oy5dars4.service.impl;

import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.dto.TagDTO;
import com.najot.oy5dars4.entity.News;
import com.najot.oy5dars4.mapper.TagMapper;
import com.najot.oy5dars4.repository.TagRepository;
import com.najot.oy5dars4.service.TagService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class TagServiceImpl implements TagService {
    private final TagRepository repository;
    private final TagMapper mapper;
    @Override
    public List<NewsDTO> getTagWithNews(Integer id) {
        repository.getTagsNews(id)
                .forEach(System.out::println);
        System.out.println("no");
        List<NewsDTO> newsDTOList = repository.getTagsNews(id)
                .stream()
                .map(news -> NewsDTO.builder()
                        .title(news.getTitle())
                        .build())
                .toList();
        return newsDTOList;
    }
}
