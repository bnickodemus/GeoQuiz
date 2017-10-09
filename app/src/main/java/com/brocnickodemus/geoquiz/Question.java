package com.brocnickodemus.geoquiz;

/**
 * Created by Broc on 9/25/17.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mHasCheated;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mHasCheated = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean getHasCheated() {
        return mHasCheated;
    }

    public void setHasCheated(boolean hasCheated) {
        mHasCheated = hasCheated;
    }
}
