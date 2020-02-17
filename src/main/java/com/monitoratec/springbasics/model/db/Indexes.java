/*
 * This file is generated by jOOQ.
*/
package com.monitoratec.springbasics.model.db;


import com.monitoratec.springbasics.model.db.tables.Authors;
import com.monitoratec.springbasics.model.db.tables.Books;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index AUTHORS_PRIMARY = Indexes0.AUTHORS_PRIMARY;
    public static final Index BOOKS_AUTHOR_ID = Indexes0.BOOKS_AUTHOR_ID;
    public static final Index BOOKS_PRIMARY = Indexes0.BOOKS_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index AUTHORS_PRIMARY = Internal.createIndex("PRIMARY", Authors.AUTHORS, new OrderField[] { Authors.AUTHORS.ID }, true);
        public static Index BOOKS_AUTHOR_ID = Internal.createIndex("AUTHOR_ID", Books.BOOKS, new OrderField[] { Books.BOOKS.AUTHOR_ID }, false);
        public static Index BOOKS_PRIMARY = Internal.createIndex("PRIMARY", Books.BOOKS, new OrderField[] { Books.BOOKS.ID }, true);
    }
}