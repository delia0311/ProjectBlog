package model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
/**
 * Created by DELIA on 11.09.2015.
 */


@Entity
@Table(name="article")
public class Article {

    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")
    @Id
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="content")
    private String content;

    private Article(){};

    public Article(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
