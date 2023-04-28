package com.otaliastudios.zoom;

import android.util.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomLogger;", "", "", "messageLevel", "", "c", "", "ofData", "", "d", "(I[Ljava/lang/Object;)Ljava/lang/String;", "message", "", "e", "(Ljava/lang/String;)V", "a", "g", "data", "f", "([Ljava/lang/Object;)V", "b", "h", "Ljava/lang/String;", "mTag", "<init>", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ZoomLogger {

    /* renamed from: b */
    public static final C6105a f12416b = new C6105a(null);

    /* renamed from: c */
    private static int f12417c = 3;

    /* renamed from: d */
    private static String f12418d;

    /* renamed from: e */
    private static String f12419e;

    /* renamed from: a */
    private final String f12420a;

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomLogger$a;", "", "", "tag", "Lcom/otaliastudios/zoom/ZoomLogger;", "a", "(Ljava/lang/String;)Lcom/otaliastudios/zoom/ZoomLogger;", "", "LEVEL_ERROR", "I", "LEVEL_INFO", "LEVEL_VERBOSE", "LEVEL_WARNING", "level", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomLogger$a */
    /* loaded from: classes6.dex */
    public static final class C6105a {
        private C6105a() {
        }

        public /* synthetic */ C6105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ZoomLogger m26250a(String tag) {
            C9971q.m14633g(tag, "tag");
            return new ZoomLogger(tag, null);
        }
    }

    private ZoomLogger(String str) {
        this.f12420a = str;
    }

    public /* synthetic */ ZoomLogger(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: c */
    private final boolean m26256c(int i) {
        return f12417c <= i;
    }

    /* renamed from: d */
    private final String m26255d(int i, Object... objArr) {
        String c0;
        if (!m26256c(i)) {
            return "";
        }
        c0 = C9899f.m14934c0(objArr, " ", null, null, 0, null, null, 62, null);
        return c0;
    }

    /* renamed from: a */
    public final void m26258a(String message) {
        C9971q.m14633g(message, "message");
        if (m26256c(1)) {
            Log.i(this.f12420a, message);
            f12418d = message;
            f12419e = this.f12420a;
        }
    }

    /* renamed from: b */
    public final void m26257b(Object... data) {
        C9971q.m14633g(data, "data");
        m26258a(m26255d(1, Arrays.copyOf(data, data.length)));
    }

    /* renamed from: e */
    public final void m26254e(String message) {
        C9971q.m14633g(message, "message");
        if (m26256c(0)) {
            Log.v(this.f12420a, message);
            f12418d = message;
            f12419e = this.f12420a;
        }
    }

    /* renamed from: f */
    public final void m26253f(Object... data) {
        C9971q.m14633g(data, "data");
        m26254e(m26255d(0, Arrays.copyOf(data, data.length)));
    }

    /* renamed from: g */
    public final void m26252g(String message) {
        C9971q.m14633g(message, "message");
        if (m26256c(2)) {
            Log.w(this.f12420a, message);
            f12418d = message;
            f12419e = this.f12420a;
        }
    }

    /* renamed from: h */
    public final void m26251h(Object... data) {
        C9971q.m14633g(data, "data");
        m26252g(m26255d(2, Arrays.copyOf(data, data.length)));
    }
}
