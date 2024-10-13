package com.example.Spring.Boot.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
public class journalEntry {
    @Id
    private String id;
    private String title;
    private String Content;
    private LocalDateTime Date;

    public LocalDateTime getDate(LocalDateTime now) {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }
}
