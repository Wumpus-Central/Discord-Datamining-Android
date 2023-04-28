package com.google.android.exoplayer2;

import p119g9.C7557q0;
import p153i8.AbstractC8299u;

/* renamed from: com.google.android.exoplayer2.k0 */
/* loaded from: classes7.dex */
final class C5200k0 {

    /* renamed from: a */
    public final AbstractC8299u.C8300a f9264a;

    /* renamed from: b */
    public final long f9265b;

    /* renamed from: c */
    public final long f9266c;

    /* renamed from: d */
    public final long f9267d;

    /* renamed from: e */
    public final long f9268e;

    /* renamed from: f */
    public final boolean f9269f;

    /* renamed from: g */
    public final boolean f9270g;

    /* renamed from: h */
    public final boolean f9271h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5200k0(AbstractC8299u.C8300a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f9264a = aVar;
        this.f9265b = j;
        this.f9266c = j2;
        this.f9267d = j3;
        this.f9268e = j4;
        this.f9269f = z;
        this.f9270g = z2;
        this.f9271h = z3;
    }

    /* renamed from: a */
    public C5200k0 m30102a(long j) {
        if (j == this.f9266c) {
            return this;
        }
        return new C5200k0(this.f9264a, this.f9265b, j, this.f9267d, this.f9268e, this.f9269f, this.f9270g, this.f9271h);
    }

    /* renamed from: b */
    public C5200k0 m30101b(long j) {
        if (j == this.f9265b) {
            return this;
        }
        return new C5200k0(this.f9264a, j, this.f9266c, this.f9267d, this.f9268e, this.f9269f, this.f9270g, this.f9271h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5200k0.class != obj.getClass()) {
            return false;
        }
        C5200k0 k0Var = (C5200k0) obj;
        if (this.f9265b == k0Var.f9265b && this.f9266c == k0Var.f9266c && this.f9267d == k0Var.f9267d && this.f9268e == k0Var.f9268e && this.f9269f == k0Var.f9269f && this.f9270g == k0Var.f9270g && this.f9271h == k0Var.f9271h && C7557q0.m22159c(this.f9264a, k0Var.f9264a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f9264a.hashCode()) * 31) + ((int) this.f9265b)) * 31) + ((int) this.f9266c)) * 31) + ((int) this.f9267d)) * 31) + ((int) this.f9268e)) * 31) + (this.f9269f ? 1 : 0)) * 31) + (this.f9270g ? 1 : 0)) * 31) + (this.f9271h ? 1 : 0);
    }
}
