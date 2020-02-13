package com.demo.graphql.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.graphql.entities.Book;
import com.demo.graphql.graphql.resolvers.BookResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Root query.
 */
@Component
public class Query implements GraphQLQueryResolver
{

    public List<Book> allBooks()
    {
        return BookResolver.BOOKS;
    }

    public Optional<Book> bookById(String id)
    {
        return BookResolver.BOOKS.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
}
