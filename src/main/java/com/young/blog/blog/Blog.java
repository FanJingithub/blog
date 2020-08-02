package com.young.blog.blog;

import javax.xml.crypto.Data;

public class Blog {
    String blogId;
    String userId;
    Data create_time;
    String title;
    String content;

    public Blog(String blogId, String userId, Data create_time, String title, String content) {
        this.blogId = blogId;
        this.userId = userId;
        this.create_time = create_time;
        this.title = title;
        this.content = content;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Data getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Data create_time) {
        this.create_time = create_time;
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

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", userId='" + userId + '\'' +
                ", create_time=" + create_time +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
