package org.jdc.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@AutoConfiguration
@ConditionalOnClass({org.hsqldb.jdbcDriver.class})
public class DataSourceConfig {

    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("jdc-schema.sql")
                .addScript("jdc-data.sql")
                .setScriptEncoding("UTF-8")
                .generateUniqueName(true)
                .build();
    }
}
