package com.springbootdemo2.demo.dao;

import com.springbootdemo2.demo.domain.Blog;

import java.util.ArrayList;
import java.util.Collection;

public class BlogDaoImlp {
    public Collection<Blog> FindAll(){
        Collection<Blog> collection = new ArrayList<>();
        Blog blog = new Blog();
        blog.setId(1);
        blog.setTitle("A");
        Blog blog2 = new Blog();
        blog2.setId(2);
        blog2.setTitle("B");
        collection.add(blog);
        collection.add(blog2);
        return collection;
    }
}
