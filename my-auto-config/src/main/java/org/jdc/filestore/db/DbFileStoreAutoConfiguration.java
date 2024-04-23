package org.jdc.filestore.db;

import org.jdc.filestore.FileStore;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(value = "file.store",havingValue = "db")
public class DbFileStoreAutoConfiguration {

    @Bean
    public FileStore dbFileStore(){
        return new DbFileStore();
    }
}
