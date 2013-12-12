package org.bala.blog.bo;
// Generated Dec 9, 2013 12:20:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BlogPost generated by hbm2java
 */
@Entity
@Table(name="blog_post")

public class BlogPost  implements java.io.Serializable {


     private int blogId;
     private String blogTittle;
     private String blogContent;
     private Date createdDate;
     private Date updatedDate;
     private String tags;
     private Set<BlogComments> blogCommentses = new HashSet<BlogComments>(0);

    public BlogPost() {
    }

	
    public BlogPost(int blogId) {
        this.blogId = blogId;
    }
    public BlogPost(String blogTittle, String blogContent) {
       this.blogTittle = blogTittle;
       this.blogContent = blogContent;
    }
   
     @Id 
    @GeneratedValue
    @Column(name="blog_id", unique=true, nullable=false)
    public int getBlogId() {
        return this.blogId;
    }
    
    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }
    
    @Column(name="blog_tittle", length=600)
    public String getBlogTittle() {
        return this.blogTittle;
    }
    
    public void setBlogTittle(String blogTittle) {
        this.blogTittle = blogTittle;
    }
    
    @Column(name="blog_content")
    public String getBlogContent() {
        return this.blogContent;
    }
    
    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date", length=19)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_date", length=19)
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    @Column(name="tags", length=300)
    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="blogPost")
    public Set<BlogComments> getBlogCommentses() {
        return this.blogCommentses;
    }
    
    public void setBlogCommentses(Set<BlogComments> blogCommentses) {
        this.blogCommentses = blogCommentses;
    }




}

