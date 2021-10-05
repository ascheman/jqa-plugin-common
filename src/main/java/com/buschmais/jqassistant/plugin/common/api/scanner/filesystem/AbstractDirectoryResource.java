package com.buschmais.jqassistant.plugin.common.api.scanner.filesystem;

import java.io.File;

/**
 * Abstract base implementation of a virtual directory.
 */
public class AbstractDirectoryResource implements DirectoryResource {
    private String path;

    public AbstractDirectoryResource(String entryPath) {
        path = entryPath;
    }

    @Override
    public File getFile() {
        return new File(path);
    }

    @Override
    public void close() {
    }

    @Override
    public String toString() {
        return path;
    }
}
