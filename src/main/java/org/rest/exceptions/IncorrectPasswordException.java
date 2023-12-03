package org.rest.exceptions;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(String oldPasswordIsIncorrect) {
    }
}
