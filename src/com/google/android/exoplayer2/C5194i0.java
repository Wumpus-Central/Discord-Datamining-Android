package com.google.android.exoplayer2;

import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.i0 */
/* loaded from: classes7.dex */
public final class C5194i0 {

    /* renamed from: a */
    public final String f9244a;

    /* renamed from: com.google.android.exoplayer2.i0$b */
    /* loaded from: classes7.dex */
    public static final class C5196b {

        /* renamed from: a */
        private String f9245a;

        /* renamed from: a */
        public C5194i0 m30129a() {
            return new C5194i0(this.f9245a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5194i0.class != obj.getClass()) {
            return false;
        }
        return C7557q0.m22159c(this.f9244a, ((C5194i0) obj).f9244a);
    }

    public int hashCode() {
        String str = this.f9244a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    private C5194i0(String str) {
        this.f9244a = str;
    }
}
