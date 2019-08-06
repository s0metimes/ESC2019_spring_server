package hyu.eos.esc2019

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity(name="tb_article")
class Article (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var pk: Long?, var name: String, var content: String, var title: String, var createdate: LocalDateTime?)