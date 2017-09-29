/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.db.h2.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.Indexes;
import org.jooq.example.db.h2.Keys;
import org.jooq.example.db.h2.Public;
import org.jooq.example.db.h2.tables.records.AuthorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = 1395848326;

    /**
     * The reference instance of <code>PUBLIC.AUTHOR</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>PUBLIC.AUTHOR.ID</code>.
     */
    public final TableField<AuthorRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    public final TableField<AuthorRecord, Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    public final TableField<AuthorRecord, Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.ADDRESS</code>.
     */
    public final TableField<AuthorRecord, String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author() {
        this(DSL.name("AUTHOR"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.PK_T_AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.PK_T_AUTHOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }
}
