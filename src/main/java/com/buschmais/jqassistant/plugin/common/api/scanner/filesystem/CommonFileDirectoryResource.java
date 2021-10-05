package com.buschmais.jqassistant.plugin.common.api.scanner.filesystem;

import java.io.IOException;

public interface CommonFileDirectoryResource extends Resource {
    java.io.File getFile() throws IOException;
}
