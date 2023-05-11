package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

import static java.nio.file.FileVisitResult.CONTINUE;

public class AlphabeticalPDFFileTreeWalkerVisitor implements FileVisitor<Path> {
    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        if(fileName.endsWith(".pdf")) {
            list.add(fileName);
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return CONTINUE;
    }
}
