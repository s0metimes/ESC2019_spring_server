package hyu.eos.esc2019
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/article")
class ApiController(private val articleRepository: ArticleRepository) {
    @GetMapping("/")
    fun getArticles(): Iterable<Article>
            = articleRepository.findAll()

    @GetMapping("/{id}")
    fun getArticle(@PathVariable id: Long)
            = articleRepository.findByIdOrNull(id)

    @PostMapping("/")
    // TODO: 받아온 body 데이터를 사용해서 article 을 만듬.
    fun createArticle(@RequestBody article: Article) = articleRepository.save(article)

    @PutMapping("/")
    // TODO: id 에 해당하는 article 을 수정할 예정.
    fun updateArticle(@RequestBody article: Article) = articleRepository.save(article)

    @DeleteMapping("/{id}")
    // TODO: id 에 해당하는 article 을 삭제할 예정.
    fun deleteArticle(@PathVariable id: Long) = articleRepository.deleteById(id)
}