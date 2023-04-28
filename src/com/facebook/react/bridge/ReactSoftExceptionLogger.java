package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p078e6.AbstractC6709a;
import p414x3.C13925a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class ReactSoftExceptionLogger {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* loaded from: classes7.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th2);
    }

    @AbstractC6709a
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (!list.contains(reactSoftExceptionListener)) {
            list.add(reactSoftExceptionListener);
        }
    }

    @AbstractC6709a
    public static void clearListeners() {
        sListeners.clear();
    }

    @AbstractC6709a
    private static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    @AbstractC6709a
    public static void logSoftException(String str, Throwable th2) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.size() > 0) {
            for (ReactSoftExceptionListener reactSoftExceptionListener : list) {
                reactSoftExceptionListener.logSoftException(str, th2);
            }
            return;
        }
        C13925a.m2287k(str, "Unhandled SoftException", th2);
    }

    @AbstractC6709a
    public static void logSoftExceptionVerbose(String str, Throwable th2) {
        logSoftException(str + "|" + th2.getClass().getSimpleName() + ":" + th2.getMessage(), th2);
    }

    @AbstractC6709a
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}
