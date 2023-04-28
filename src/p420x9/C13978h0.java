package p420x9;

import android.content.Context;
import android.util.SparseIntArray;
import p365u9.C13221g;
import p384v9.C13456a;

/* renamed from: x9.h0 */
/* loaded from: classes5.dex */
public final class C13978h0 {

    /* renamed from: a */
    private final SparseIntArray f31531a = new SparseIntArray();

    /* renamed from: b */
    private C13221g f31532b;

    public C13978h0(C13221g gVar) {
        C14004p.m2051j(gVar);
        this.f31532b = gVar;
    }

    /* renamed from: a */
    public final int m2102a(Context context, int i) {
        return this.f31531a.get(i, -1);
    }

    /* renamed from: b */
    public final int m2101b(Context context, C13456a.AbstractC13463f fVar) {
        C14004p.m2051j(context);
        C14004p.m2051j(fVar);
        int i = 0;
        if (!fVar.mo2160e()) {
            return 0;
        }
        int n = fVar.mo143n();
        int a = m2102a(context, n);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f31531a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f31531a.keyAt(i2);
                if (keyAt > n && this.f31531a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1) {
                a = this.f31532b.mo4270f(context, n);
            } else {
                a = i;
            }
            this.f31531a.put(n, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void m2100c() {
        this.f31531a.clear();
    }
}
