package xyz.lwh.springdata.domain;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author lwh
 * @date 2020/7/19
 **/

@Entity
@Table(name = "add_article")
@DynamicUpdate
@DynamicInsert
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    /**
     * 标题
     */
    @Column(name="title")
    private String title;
    /**
     * 内容
     */
    @Column(name="content")
    private String content;
    /**
     * 关键字
     */
    @Column(name="keywords")
    private String keywords;
    /**
//     * 描述
//     */
    @Column(name="description")
    private String description;
    /**
     * 栏目
     */
    @Column(name="category")
    private int category;
    /**
     * 标签
     */
    @Column(name="tags")
    private String tags;
    /**
     * 标题图片
     */
    @Column(name="titlepic")
    private String titlepic;
    /**
     * 公开度
     */
    @Column(name="visibility")
    private char visibility;
    /**
     * 发布时间
     */
    @Column(name="create_time")
    private String create_time;

    @Column(name="last_time")
    private String last_time;
    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", keywords='" + keywords + '\'' +
//                ", describe='" + describe + '\'' +
                ", category=" + category +
                ", tags='" + tags + '\'' +
                ", titlepic='" + titlepic + '\'' +
                ", visibility=" + visibility +
                ", last_time='" + last_time + '\'' +
                '}';
    }

    public Article(String title, String content, String keywords, String describe, int category, String tags, String titlepic, char visibility, String last_time) {
        this.title = title;
        this.content = content;
        this.keywords = keywords;
//        this.describe = describe;
        this.category = category;
        this.tags = tags;
        this.titlepic = titlepic;
        this.visibility = visibility;
        this.last_time = last_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String describe) {
        this.description = description;
    }


    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic;
    }

    public char getVisibility() {
        return visibility;
    }

    public void setVisibility(char visibility) {
        this.visibility = visibility;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }
}
