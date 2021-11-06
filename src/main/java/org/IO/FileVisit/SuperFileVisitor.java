package org.IO.FileVisit;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Logger;

public class SuperFileVisitor implements FileVisitor<Path> {
    private static final Logger log = Logger.getLogger(SuperFileVisitor.class.getName());

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        log.info("Entering to directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        log.info("Visiting file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        log.info("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        log.info("Exit from directory: " + dir.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }
}
