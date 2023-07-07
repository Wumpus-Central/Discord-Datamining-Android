package com.discord.logging;

import android.util.Log;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.q;
import timber.log.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/discord/logging/LoggingLineNumberTree;", "Ltimber/log/a$c;", "Ljava/lang/StackTraceElement;", "getCalleStackTraceElement", "", "priority", "", "tag", "message", "", "t", "", "log", "", "kotlin.jvm.PlatformType", "ignoreClasses", "Ljava/util/List;", "<init>", "()V", "logging_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LoggingLineNumberTree extends a.c {
    private final List<String> ignoreClasses;

    public LoggingLineNumberTree() {
        List<String> k10;
        k10 = j.k(a.class.getName(), a.b.class.getName(), a.c.class.getName(), a.C0395a.class.getName(), LoggingLineNumberTree.class.getName(), Log.class.getName());
        this.ignoreClasses = k10;
    }

    private final StackTraceElement getCalleStackTraceElement() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        q.f(stackTrace, "Throwable().stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.ignoreClasses.contains(stackTraceElement.getClassName())) {
                q.f(stackTraceElement, "Throwable().stackTrace\n …sName !in ignoreClasses }");
                return stackTraceElement;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // timber.log.a.c
    protected void log(int i10, String str, String message, Throwable th2) {
        q.g(message, "message");
        StackTraceElement calleStackTraceElement = getCalleStackTraceElement();
        String fileName = calleStackTraceElement.getFileName();
        int lineNumber = calleStackTraceElement.getLineNumber();
        Log.println(i10, str + "/(" + fileName + ":" + lineNumber + ")", message);
    }
}
