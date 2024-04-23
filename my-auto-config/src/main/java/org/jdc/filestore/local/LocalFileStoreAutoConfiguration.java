package org.jdc.filestore.local;

import org.jdc.filestore.FileStore;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(value = "file.store",havingValue = "local")
public class LocalFileStoreAutoConfiguration {
    @Bean
    public FileStore localFileStore() {
        return new LocalFileStore();
    }
}
