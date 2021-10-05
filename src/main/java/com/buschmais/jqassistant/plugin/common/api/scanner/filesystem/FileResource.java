package com.buschmais.jqassistant.plugin.common.api.scanner.filesystem;

import java.io.IOException;
import java.io.InputStream;

/**
 * Represents a file resource.
 */
public interface FileResource extends CommonFileDirectoryResource {

    InputStream createStream() throws IOException;

}
