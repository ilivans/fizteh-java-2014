package ru.fizteh.fivt.students.sautin1.filemap;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by sautin1 on 10/12/14.
 */
public interface TableIOTools<MappedValue, T extends GeneralTable<MappedValue>> {
    T readTable(Path rootPath, T tableName) throws IOException;
    void writeTable(Path rootPath, T table);
}
