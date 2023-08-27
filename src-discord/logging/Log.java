package com.discord.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import timber.log.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u000b\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000e"}, d2 = {"Lcom/discord/logging/Log;", "", "()V", "d", "", "tag", "", "message", "exception", "", "Lkotlin/reflect/KClass;", "e", "i", "w", "logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class Log {
    public static final Log INSTANCE = new Log();

    static {
        a.f28082a.a(new LoggingTree());
    }

    private Log() {
    }

    public static  void d$default(Log log, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.d(str, str2, th2);
    }

    public static  void e$default(Log log, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.e(str, str2, th2);
    }

    public static  void i$default(Log log, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.i(str, str2, th2);
    }

    public static  void w$default(Log log, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.w(str, str2, th2);
    }

    public final void d(String tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        a.b bVar = a.f28082a;
        bVar.b(tag);
        bVar.d(th2, message, new Object[0]);
    }

    public final void e(String tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        a.b bVar = a.f28082a;
        bVar.b(tag);
        bVar.e(th2, message, new Object[0]);
    }

    public final void i(String tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        a.b bVar = a.f28082a;
        bVar.b(tag);
        bVar.i(th2, message, new Object[0]);
    }

    public final void w(String tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        a.b bVar = a.f28082a;
        bVar.b(tag);
        bVar.w(th2, message, new Object[0]);
    }

    public static  void d$default(Log log, KClass kClass, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.d(kClass, str, th2);
    }

    public static  void e$default(Log log, KClass kClass, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.e(kClass, str, th2);
    }

    public static  void i$default(Log log, KClass kClass, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.i(kClass, str, th2);
    }

    public static  void w$default(Log log, KClass kClass, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        log.w(kClass, str, th2);
    }

    public final void d(KClass<?> tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        String simpleName = uf.a.b(tag).getSimpleName();
        q.g(simpleName, "tag.java.simpleName");
        d(simpleName, message, th2);
    }

    public final void e(KClass<?> tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        String simpleName = uf.a.b(tag).getSimpleName();
        q.g(simpleName, "tag.java.simpleName");
        e(simpleName, message, th2);
    }

    public final void i(KClass<?> tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        String simpleName = uf.a.b(tag).getSimpleName();
        q.g(simpleName, "tag.java.simpleName");
        i(simpleName, message, th2);
    }

    public final void w(KClass<?> tag, String message, Throwable th2) {
        q.h(tag, "tag");
        q.h(message, "message");
        String simpleName = uf.a.b(tag).getSimpleName();
        q.g(simpleName, "tag.java.simpleName");
        w(simpleName, message, th2);
    }
}
