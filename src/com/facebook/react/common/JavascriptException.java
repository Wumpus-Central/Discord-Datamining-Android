package com.facebook.react.common;

/* loaded from: classes7.dex */
public class JavascriptException extends RuntimeException implements HasJavascriptExceptionMetadata {
    private String extraDataAsJson;

    public JavascriptException(String str) {
        super(str);
    }

    @Override // com.facebook.react.common.HasJavascriptExceptionMetadata
    public String getExtraDataAsJson() {
        return this.extraDataAsJson;
    }

    public JavascriptException setExtraDataAsJson(String str) {
        this.extraDataAsJson = str;
        return this;
    }
}
