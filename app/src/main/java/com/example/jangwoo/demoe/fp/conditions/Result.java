package com.example.jangwoo.demoe.fp.conditions;

public interface Result {

    public class Success implements Result{}

    public class Failure implements Result{
        private final String errorMessage;

        public Failure(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
