package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p079e7.C6713c;
import p079e7.C6722k;
import p119g9.C7510a;
import p153i8.C8290s;

/* loaded from: classes7.dex */
public final class ExoPlaybackException extends Exception {

    /* renamed from: k */
    public final int f8953k;

    /* renamed from: l */
    public final String f8954l;

    /* renamed from: m */
    public final int f8955m;

    /* renamed from: n */
    public final C6722k f8956n;

    /* renamed from: o */
    public final int f8957o;

    /* renamed from: p */
    public final long f8958p;

    /* renamed from: q */
    public final C8290s f8959q;

    /* renamed from: r */
    final boolean f8960r;

    /* renamed from: s */
    private final Throwable f8961s;

    private ExoPlaybackException(int i, Throwable th2) {
        this(i, th2, null, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static ExoPlaybackException m30560b(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    /* renamed from: c */
    public static ExoPlaybackException m30559c(Throwable th2, String str, int i, C6722k kVar, int i2, boolean z) {
        if (kVar == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th2, null, str, i, kVar, i2, z);
    }

    /* renamed from: d */
    public static ExoPlaybackException m30558d(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    /* renamed from: e */
    public static ExoPlaybackException m30557e(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    /* renamed from: f */
    private static String m30556f(int i, String str, String str2, int i2, C6722k kVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + kVar + ", format_supported=" + C6713c.m24567b(i3);
        } else if (i != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ExoPlaybackException m30561a(C8290s sVar) {
        return new ExoPlaybackException(getMessage(), this.f8961s, this.f8953k, this.f8954l, this.f8955m, this.f8956n, this.f8957o, sVar, this.f8958p, this.f8960r);
    }

    /* renamed from: g */
    public Exception m30555g() {
        boolean z = true;
        if (this.f8953k != 1) {
            z = false;
        }
        C7510a.m22366f(z);
        return (Exception) C7510a.m22367e(this.f8961s);
    }

    /* renamed from: h */
    public IOException m30554h() {
        boolean z;
        if (this.f8953k == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        return (IOException) C7510a.m22367e(this.f8961s);
    }

    private ExoPlaybackException(int i, Throwable th2, String str, String str2, int i2, C6722k kVar, int i3, boolean z) {
        this(m30556f(i, str, str2, i2, kVar, i3), th2, i, str2, i2, kVar, i3, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th2, int i, String str2, int i2, C6722k kVar, int i3, C8290s sVar, long j, boolean z) {
        super(str, th2);
        this.f8953k = i;
        this.f8961s = th2;
        this.f8954l = str2;
        this.f8955m = i2;
        this.f8956n = kVar;
        this.f8957o = i3;
        this.f8959q = sVar;
        this.f8958p = j;
        this.f8960r = z;
    }
}
