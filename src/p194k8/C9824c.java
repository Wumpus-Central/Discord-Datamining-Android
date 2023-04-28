package p194k8;

import p119g9.C7558r;
import p153i8.C8274n0;
import p194k8.AbstractC9828f;
import p228m7.AbstractC10500b0;
import p228m7.C10513h;

/* renamed from: k8.c */
/* loaded from: classes7.dex */
public final class C9824c implements AbstractC9828f.AbstractC9829a {

    /* renamed from: a */
    private final int[] f21868a;

    /* renamed from: b */
    private final C8274n0[] f21869b;

    public C9824c(int[] iArr, C8274n0[] n0VarArr) {
        this.f21868a = iArr;
        this.f21869b = n0VarArr;
    }

    /* renamed from: a */
    public int[] m15259a() {
        int[] iArr = new int[this.f21869b.length];
        int i = 0;
        while (true) {
            C8274n0[] n0VarArr = this.f21869b;
            if (i >= n0VarArr.length) {
                return iArr;
            }
            iArr[i] = n0VarArr[i].m20102F();
            i++;
        }
    }

    /* renamed from: b */
    public void m15258b(long j) {
        for (C8274n0 n0Var : this.f21869b) {
            n0Var.m20083Y(j);
        }
    }

    @Override // p194k8.AbstractC9828f.AbstractC9829a
    /* renamed from: e */
    public AbstractC10500b0 mo15248e(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f21868a;
            if (i3 >= iArr.length) {
                C7558r.m22109c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new C10513h();
            } else if (i2 == iArr[i3]) {
                return this.f21869b[i3];
            } else {
                i3++;
            }
        }
    }
}
