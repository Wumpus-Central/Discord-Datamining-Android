package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import p079e7.C6713c;
import p103fc.C7118f;
import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.g */
/* loaded from: classes7.dex */
public final class C5178g implements AbstractC5192h0 {

    /* renamed from: a */
    private final float f9166a;

    /* renamed from: b */
    private final float f9167b;

    /* renamed from: c */
    private final long f9168c;

    /* renamed from: d */
    private final float f9169d;

    /* renamed from: e */
    private final long f9170e;

    /* renamed from: f */
    private final long f9171f;

    /* renamed from: g */
    private final float f9172g;

    /* renamed from: h */
    private long f9173h;

    /* renamed from: i */
    private long f9174i;

    /* renamed from: j */
    private long f9175j;

    /* renamed from: k */
    private long f9176k;

    /* renamed from: l */
    private long f9177l;

    /* renamed from: m */
    private long f9178m;

    /* renamed from: n */
    private float f9179n;

    /* renamed from: o */
    private float f9180o;

    /* renamed from: p */
    private float f9181p;

    /* renamed from: q */
    private long f9182q;

    /* renamed from: r */
    private long f9183r;

    /* renamed from: s */
    private long f9184s;

    /* renamed from: com.google.android.exoplayer2.g$b */
    /* loaded from: classes7.dex */
    public static final class C5180b {

        /* renamed from: a */
        private float f9185a = 0.97f;

        /* renamed from: b */
        private float f9186b = 1.03f;

        /* renamed from: c */
        private long f9187c = 1000;

        /* renamed from: d */
        private float f9188d = 1.0E-7f;

        /* renamed from: e */
        private long f9189e = C6713c.m24566c(20);

        /* renamed from: f */
        private long f9190f = C6713c.m24566c(500);

        /* renamed from: g */
        private float f9191g = 0.999f;

        /* renamed from: a */
        public C5178g m30265a() {
            return new C5178g(this.f9185a, this.f9186b, this.f9187c, this.f9188d, this.f9189e, this.f9190f, this.f9191g);
        }
    }

    /* renamed from: f */
    private void m30269f(long j) {
        long j2 = this.f9183r + (this.f9184s * 3);
        if (this.f9178m > j2) {
            float c = (float) C6713c.m24566c(this.f9168c);
            this.f9178m = C7118f.m23351c(j2, this.f9175j, this.f9178m - (((this.f9181p - 1.0f) * c) + ((this.f9179n - 1.0f) * c)));
            return;
        }
        long s = C7557q0.m22127s(j - (Math.max(0.0f, this.f9181p - 1.0f) / this.f9169d), this.f9178m, j2);
        this.f9178m = s;
        long j3 = this.f9177l;
        if (j3 != -9223372036854775807L && s > j3) {
            this.f9178m = j3;
        }
    }

    /* renamed from: g */
    private void m30268g() {
        long j = this.f9173h;
        if (j != -9223372036854775807L) {
            long j2 = this.f9174i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f9176k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f9177l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f9175j != j) {
            this.f9175j = j;
            this.f9178m = j;
            this.f9183r = -9223372036854775807L;
            this.f9184s = -9223372036854775807L;
            this.f9182q = -9223372036854775807L;
        }
    }

    /* renamed from: h */
    private static long m30267h(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    /* renamed from: i */
    private void m30266i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f9183r;
        if (j4 == -9223372036854775807L) {
            this.f9183r = j3;
            this.f9184s = 0L;
            return;
        }
        long max = Math.max(j3, m30267h(j4, j3, this.f9172g));
        this.f9183r = max;
        this.f9184s = m30267h(this.f9184s, Math.abs(j3 - max), this.f9172g);
    }

    @Override // com.google.android.exoplayer2.AbstractC5192h0
    /* renamed from: a */
    public void mo30134a(MediaItem.C5150f fVar) {
        this.f9173h = C6713c.m24566c(fVar.f9009a);
        this.f9176k = C6713c.m24566c(fVar.f9010b);
        this.f9177l = C6713c.m24566c(fVar.f9011c);
        float f = fVar.f9012d;
        if (f == -3.4028235E38f) {
            f = this.f9166a;
        }
        this.f9180o = f;
        float f2 = fVar.f9013e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f9167b;
        }
        this.f9179n = f2;
        m30268g();
    }

    @Override // com.google.android.exoplayer2.AbstractC5192h0
    /* renamed from: b */
    public float mo30133b(long j, long j2) {
        if (this.f9173h == -9223372036854775807L) {
            return 1.0f;
        }
        m30266i(j, j2);
        if (this.f9182q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f9182q < this.f9168c) {
            return this.f9181p;
        }
        this.f9182q = SystemClock.elapsedRealtime();
        m30269f(j);
        long j3 = j - this.f9178m;
        if (Math.abs(j3) < this.f9170e) {
            this.f9181p = 1.0f;
        } else {
            this.f9181p = C7557q0.m22131q((this.f9169d * ((float) j3)) + 1.0f, this.f9180o, this.f9179n);
        }
        return this.f9181p;
    }

    @Override // com.google.android.exoplayer2.AbstractC5192h0
    /* renamed from: c */
    public long mo30132c() {
        return this.f9178m;
    }

    @Override // com.google.android.exoplayer2.AbstractC5192h0
    /* renamed from: d */
    public void mo30131d() {
        long j = this.f9178m;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f9171f;
            this.f9178m = j2;
            long j3 = this.f9177l;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f9178m = j3;
            }
            this.f9182q = -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC5192h0
    /* renamed from: e */
    public void mo30130e(long j) {
        this.f9174i = j;
        m30268g();
    }

    private C5178g(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f9166a = f;
        this.f9167b = f2;
        this.f9168c = j;
        this.f9169d = f3;
        this.f9170e = j2;
        this.f9171f = j3;
        this.f9172g = f4;
        this.f9173h = -9223372036854775807L;
        this.f9174i = -9223372036854775807L;
        this.f9176k = -9223372036854775807L;
        this.f9177l = -9223372036854775807L;
        this.f9180o = f;
        this.f9179n = f2;
        this.f9181p = 1.0f;
        this.f9182q = -9223372036854775807L;
        this.f9175j = -9223372036854775807L;
        this.f9178m = -9223372036854775807L;
        this.f9183r = -9223372036854775807L;
        this.f9184s = -9223372036854775807L;
    }
}
