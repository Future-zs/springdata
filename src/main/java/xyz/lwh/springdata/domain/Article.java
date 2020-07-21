package xyz.lwh.springdata.domain;

import javax.persistence.*;

/**
 * @author lwh
 * @date 2020/7/19
 **/

@Entity
@Table(name = "add_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 描述
     */
    private String describe;
    /**
     * 栏目
     */
    private Integer category;
    /**
     * 标签
     */
    private String tags;
    /**
     * 标题图片
     */
    private String titlepic;
    /**
     * 公开度
     */
    private char visibility;
    /**
     * 发布时间
     */
    private String time;

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", keywords='" + keywords + '\'' +
                ", describe='" + describe + '\'' +
                ", category=" + category +
                ", tags='" + tags + '\'' +
                ", titlepic='" + titlepic + '\'' +
                ", visibility=" + visibility +
                ", time='" + time + '\'' +
                '}';
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
