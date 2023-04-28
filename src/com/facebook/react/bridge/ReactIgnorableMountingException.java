package com.facebook.react.bridge;

/* loaded from: classes7.dex */
public class ReactIgnorableMountingException extends RuntimeException {
    public ReactIgnorableMountingException(String str) {
        super(str);
    }

    public static boolean isIgnorable(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof ReactIgnorableMountingException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public ReactIgnorableMountingException(String str, Throwable th2) {
        super(str, th2);
    }

    public ReactIgnorableMountingException(Throwable th2) {
        super(th2);
    }
}
