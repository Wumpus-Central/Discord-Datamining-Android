package io.sentry;

/* renamed from: io.sentry.g */
/* loaded from: classes8.dex */
public enum EnumC8868g {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");
    
    private final String category;

    EnumC8868g(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
