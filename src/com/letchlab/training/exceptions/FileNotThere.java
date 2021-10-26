package com.letchlab.training.exceptions;

import java.io.FileNotFoundException;

public class FileNotThere extends FileNotFoundException
{
    public FileNotThere(String errorMessage) {
        super(errorMessage);
    }
}
