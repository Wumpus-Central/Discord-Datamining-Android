package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;

/* renamed from: io.sentry.android.core.d0 */
/* loaded from: classes8.dex */
public final class C8709d0 {

    /* renamed from: e */
    private static C8709d0 f19262e = new C8709d0();

    /* renamed from: a */
    private Long f19263a;

    /* renamed from: b */
    private Long f19264b;

    /* renamed from: c */
    private Boolean f19265c = null;

    /* renamed from: d */
    private Date f19266d;

    private C8709d0() {
    }

    /* renamed from: d */
    public static C8709d0 m18315d() {
        return f19262e;
    }

    /* renamed from: a */
    public synchronized Long m18318a() {
        Long l;
        if (!(this.f19263a == null || (l = this.f19264b) == null || this.f19265c == null)) {
            long longValue = l.longValue() - this.f19263a.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    /* renamed from: b */
    public Long m18317b() {
        return this.f19263a;
    }

    /* renamed from: c */
    public Date m18316c() {
        return this.f19266d;
    }

    /* renamed from: e */
    public Boolean m18314e() {
        return this.f19265c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void m18313f() {
        m18312g(SystemClock.uptimeMillis());
    }

    /* renamed from: g */
    void m18312g(long j) {
        this.f19264b = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized void m18311h(long j, Date date) {
        if (this.f19266d == null || this.f19263a == null) {
            this.f19266d = date;
            this.f19263a = Long.valueOf(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void m18310i(boolean z) {
        if (this.f19265c == null) {
            this.f19265c = Boolean.valueOf(z);
        }
    }
}
