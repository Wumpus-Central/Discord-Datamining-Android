package com.discord.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.reflect.KClass;
import p447yf.C14306a;
import timber.log.C13027a;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\u000b\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ&\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/logging/Log;", "", "()V", "d", "", "tag", "", "message", "exception", "", "Lkotlin/reflect/KClass;", "e", "i", "w", "logging_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class Log {
    public static final Log INSTANCE = new Log();

    static {
        C13027a.f33789a.m4531a(new LoggingTree());
    }

    private Log() {
    }

    public static /* synthetic */ void d$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32181d(str, str2, th2);
    }

    public static /* synthetic */ void e$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32179e(str, str2, th2);
    }

    public static /* synthetic */ void i$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32177i(str, str2, th2);
    }

    public static /* synthetic */ void w$default(Log log, String str, String str2, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32175w(str, str2, th2);
    }

    /* renamed from: d */
    public final void m32181d(String tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        C13027a.C13030b bVar = C13027a.f33789a;
        bVar.m4530b(tag);
        bVar.mo4527d(th2, message, new Object[0]);
    }

    /* renamed from: e */
    public final void m32179e(String tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        C13027a.C13030b bVar = C13027a.f33789a;
        bVar.m4530b(tag);
        bVar.mo4524e(th2, message, new Object[0]);
    }

    /* renamed from: i */
    public final void m32177i(String tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        C13027a.C13030b bVar = C13027a.f33789a;
        bVar.m4530b(tag);
        bVar.mo4521i(th2, message, new Object[0]);
    }

    /* renamed from: w */
    public final void m32175w(String tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        C13027a.C13030b bVar = C13027a.f33789a;
        bVar.m4530b(tag);
        bVar.mo4515w(th2, message, new Object[0]);
    }

    public static /* synthetic */ void d$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32180d(kClass, str, th2);
    }

    public static /* synthetic */ void e$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32178e(kClass, str, th2);
    }

    public static /* synthetic */ void i$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32176i(kClass, str, th2);
    }

    public static /* synthetic */ void w$default(Log log, KClass kClass, String str, Throwable th2, int i, Object obj) {
        if ((i & 4) != 0) {
            th2 = null;
        }
        log.m32174w(kClass, str, th2);
    }

    /* renamed from: d */
    public final void m32180d(KClass<?> tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        String simpleName = C14306a.m737b(tag).getSimpleName();
        C9677q.m14634f(simpleName, "tag.java.simpleName");
        m32181d(simpleName, message, th2);
    }

    /* renamed from: e */
    public final void m32178e(KClass<?> tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        String simpleName = C14306a.m737b(tag).getSimpleName();
        C9677q.m14634f(simpleName, "tag.java.simpleName");
        m32179e(simpleName, message, th2);
    }

    /* renamed from: i */
    public final void m32176i(KClass<?> tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        String simpleName = C14306a.m737b(tag).getSimpleName();
        C9677q.m14634f(simpleName, "tag.java.simpleName");
        m32177i(simpleName, message, th2);
    }

    /* renamed from: w */
    public final void m32174w(KClass<?> tag, String message, Throwable th2) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(message, "message");
        String simpleName = C14306a.m737b(tag).getSimpleName();
        C9677q.m14634f(simpleName, "tag.java.simpleName");
        m32175w(simpleName, message, th2);
    }
}
