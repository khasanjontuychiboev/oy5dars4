package com.najot.oy5dars4.service.impl;

import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.entity.News;
import com.najot.oy5dars4.entity.Tag;
import com.najot.oy5dars4.mapper.NewsMapper;
import com.najot.oy5dars4.repository.NewsRepository;
import com.najot.oy5dars4.service.NewsService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class NewsServiceImpl implements NewsService {
    private final NewsRepository repository;
    private final NewsMapper mapper;

    @Override
    public NewsDTO getNewsById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id));
    }

    @Override
    public List<NewsDTO> getNewsList() {
        return mapper
                .toDTO(repository
                        .findAll());
    }

    @Override
    public NewsDTO createNews(NewsDTO newsDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(newsDTO)));
    }

    @Override
    public NewsDTO updateNews(Integer id, NewsDTO newsDTO) {
        News news = repository.getReferenceById(id);
        news.setTitle(newsDTO.getTitle());

        news.setTags(newsDTO.getTags().stream()
                .map(tagDTO -> Tag.builder()
                        .id(tagDTO.getId())
                        .name(tagDTO.getName())
                        .build())
                .collect(Collectors.toSet()));
        news = repository.save(news);

        return mapper.toDTO(news) ;
    }

    @Override
    public void deleteNews(Integer id) {
        repository.deleteById(id);
    }
}
