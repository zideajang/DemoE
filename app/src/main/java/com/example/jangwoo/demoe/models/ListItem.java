package com.example.jangwoo.demoe.models;

import android.text.SpannableString;

public class ListItem {

    private SpannableString left;
    private SpannableString right;

    public ListItem() {
    }

    public ListItem(SpannableString left, SpannableString right) {
        this.left = left;
        this.right = right;
    }

    public void setLeft(SpannableString left) {
        this.left = left;
    }

    public void setRight(SpannableString right) {
        this.right = right;
    }

    public SpannableString getLeft() {
        return left;
    }

    public SpannableString getRight() {
        return right;
    }
}
