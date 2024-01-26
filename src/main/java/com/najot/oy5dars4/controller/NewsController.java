package com.najot.oy5dars4.controller;

import com.najot.oy5dars4.dto.NewsDTO;
import com.najot.oy5dars4.entity.News;
import com.najot.oy5dars4.service.NewsService;
import com.najot.oy5dars4.service.TagService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
@Data
public class NewsController {
    private final NewsService service;
    private final TagService tagService;

    @GetMapping("/{id}")
    public NewsDTO getNews(@PathVariable Integer id){
        tagService.getTagWithNews(1);
        return service
                .getNewsById(id);
    }

    @GetMapping("/tag/{tagId}")
    public List<NewsDTO> getTagsNews(@PathVariable Integer tagId){
        return tagService
                .getTagWithNews(tagId);
    }



    @GetMapping()
    public List<NewsDTO> getNewsList(){
        return service
                .getNewsList();
    }

    @PostMapping
    public NewsDTO createNews(@RequestBody NewsDTO newsDTO){
        return service
                .createNews(newsDTO);
    }

    @PutMapping("/{id}")
    public NewsDTO updateNews(@PathVariable Integer id, @RequestBody NewsDTO newsDTO){
        return service
                .updateNews(id, newsDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteNews(@PathVariable Integer id){
       service
               .deleteNews(id);
    }




}
