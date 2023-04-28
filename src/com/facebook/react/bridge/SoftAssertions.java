package com.facebook.react.bridge;

/* loaded from: classes7.dex */
public class SoftAssertions {
    public static void assertCondition(boolean z, String str) {
        if (!z) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
        }
    }

    public static <T> T assertNotNull(T t) {
        if (t == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t;
    }

    public static void assertUnreachable(String str) {
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }
}
