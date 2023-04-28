package net.time4j.p248tz;

import net.time4j.base.AbstractC10817f;

/* renamed from: net.time4j.tz.i */
/* loaded from: classes8.dex */
class C10999i implements AbstractC10817f {

    /* renamed from: k */
    private final long f24448k;

    /* renamed from: l */
    private final int f24449l;

    private C10999i(long j, int i) {
        this.f24448k = j;
        this.f24449l = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC10817f m11326b(long j, int i) {
        if (i == 0) {
            j--;
        }
        return new C10999i(j, i == 0 ? 999999999 : i - 1);
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: a */
    public int mo11327a() {
        return this.f24449l;
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: h */
    public long mo11325h() {
        return this.f24448k;
    }
}
