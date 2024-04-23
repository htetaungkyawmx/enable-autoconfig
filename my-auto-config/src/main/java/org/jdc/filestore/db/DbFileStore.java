package org.jdc.filestore.db;

import org.jdc.filestore.FileStore;

public class DbFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Db File Store");
    }
}
