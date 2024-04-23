package org.jdc.myapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    public StudentDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }

    public List<String> listEmails() {
        return jdbcTemplate.queryForList("select email from student",
                String.class);
    }
}
