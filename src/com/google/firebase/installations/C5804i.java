package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p403wc.AbstractC13864d;
import p444yc.AbstractC14344a;
import p444yc.C14345b;

/* renamed from: com.google.firebase.installations.i */
/* loaded from: classes3.dex */
public final class C5804i {

    /* renamed from: b */
    public static final long f11495b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f11496c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C5804i f11497d;

    /* renamed from: a */
    private final AbstractC14344a f11498a;

    private C5804i(AbstractC14344a aVar) {
        this.f11498a = aVar;
    }

    /* renamed from: c */
    public static C5804i m27290c() {
        return m27289d(C14345b.m811b());
    }

    /* renamed from: d */
    public static C5804i m27289d(AbstractC14344a aVar) {
        if (f11497d == null) {
            f11497d = new C5804i(aVar);
        }
        return f11497d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m27286g(String str) {
        return f11496c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m27285h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m27292a() {
        return this.f11498a.mo812a();
    }

    /* renamed from: b */
    public long m27291b() {
        return TimeUnit.MILLISECONDS.toSeconds(m27292a());
    }

    /* renamed from: e */
    public long m27288e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m27287f(AbstractC13864d dVar) {
        if (!TextUtils.isEmpty(dVar.mo2511b()) && dVar.mo2505h() + dVar.mo2510c() >= m27291b() + f11495b) {
            return false;
        }
        return true;
    }
}
