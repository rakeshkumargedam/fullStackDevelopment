package com.letchlab.training.exceptions;

public class CustomNullPointer extends NullPointerException
{
    public CustomNullPointer(String error) {
        super(error);
    }
}
