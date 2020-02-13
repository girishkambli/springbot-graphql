package com.demo.graphql.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.google.common.collect.Lists;
import com.demo.graphql.graphql.entities.Book;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class BookResolver implements GraphQLResolver<Book>
{
    public static List<Book> BOOKS = Lists.newArrayList(
            new Book("1", "book-1"),
            new Book("2", "book-2"),
            new Book("3", "book-3"),
            new Book("4", "book-4"),
            new Book("5", "book-5")
    );

    public List<Book> getBooks()
    {
        return BOOKS;
    }
}
