package hyu.eos.esc2019

import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long>
