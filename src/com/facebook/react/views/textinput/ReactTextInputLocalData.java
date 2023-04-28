package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* loaded from: classes7.dex */
public final class ReactTextInputLocalData {
    private final int mBreakStrategy;
    private final int mInputType;
    private final int mMaxLines;
    private final int mMinLines;
    private final CharSequence mPlaceholder;
    private final SpannableStringBuilder mText;
    private final float mTextSize;

    public ReactTextInputLocalData(EditText editText) {
        this.mText = new SpannableStringBuilder(editText.getText());
        this.mTextSize = editText.getTextSize();
        this.mInputType = editText.getInputType();
        this.mPlaceholder = editText.getHint();
        this.mMinLines = editText.getMinLines();
        this.mMaxLines = editText.getMaxLines();
        this.mBreakStrategy = editText.getBreakStrategy();
    }

    public void apply(EditText editText) {
        editText.setText(this.mText);
        editText.setTextSize(0, this.mTextSize);
        editText.setMinLines(this.mMinLines);
        editText.setMaxLines(this.mMaxLines);
        editText.setInputType(this.mInputType);
        editText.setHint(this.mPlaceholder);
        editText.setBreakStrategy(this.mBreakStrategy);
    }
}
