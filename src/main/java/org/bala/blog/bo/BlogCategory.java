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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BlogCategory generated by hbm2java
 */
@Entity
@Table(name="blog_category")
public class BlogCategory  implements java.io.Serializable {


     private int categoryId;
     private BlogCategory blogCategory;
     private String categoryName;
     private Date createdDate;
     private Date updatedDate;
     private Set<BlogCategory> blogCategories = new HashSet<BlogCategory>(0);

    public BlogCategory() {
    }

	
    public BlogCategory(int categoryId) {
        this.categoryId = categoryId;
    }
    public BlogCategory( String categoryName, Date createdDate, Date updatedDate) {       
       this.blogCategory = blogCategory;
       this.categoryName = categoryName;
       this.createdDate = createdDate;
       this.updatedDate = updatedDate;
     }
   
     @Id 
    @GeneratedValue
    @Column(name="category_id", unique=true, nullable=false)
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent_category_id")
    public BlogCategory getBlogCategory() {
        return this.blogCategory;
    }
    
    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }
    
    @Column(name="category_name", length=45)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="blogCategory")
    public Set<BlogCategory> getBlogCategories() {
        return this.blogCategories;
    }
    
    public void setBlogCategories(Set<BlogCategory> blogCategories) {
        this.blogCategories = blogCategories;
    }




}

