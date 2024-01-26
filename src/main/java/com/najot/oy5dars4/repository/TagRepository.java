package com.najot.oy5dars4.repository;

import com.najot.oy5dars4.dto.TagDTO;
import com.najot.oy5dars4.entity.News;
import com.najot.oy5dars4.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {

    //JPQL = JPA Query language
    @Query(value = "Select n from News n join FETCH  Tag t on t.id=n.id  where t.id=:id")
    List<News> getTagsNews(@Param("id") Integer tagId);


}
