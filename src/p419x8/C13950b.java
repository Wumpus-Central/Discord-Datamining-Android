package p419x8;

import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p119g9.C7557q0;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: x8.b */
/* loaded from: classes7.dex */
final class C13950b implements AbstractC12458f {

    /* renamed from: k */
    private final C12453b[] f31451k;

    /* renamed from: l */
    private final long[] f31452l;

    public C13950b(C12453b[] bVarArr, long[] jArr) {
        this.f31451k = bVarArr;
        this.f31452l = jArr;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        int e = C7557q0.m22155e(this.f31452l, j, false, false);
        if (e < this.f31452l.length) {
            return e;
        }
        return -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        C12453b bVar;
        int i = C7557q0.m22147i(this.f31452l, j, true, false);
        if (i == -1 || (bVar = this.f31451k[i]) == C12453b.f28078q) {
            return Collections.emptyList();
        }
        return Collections.singletonList(bVar);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: c */
    public long mo151c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (i >= this.f31452l.length) {
            z2 = false;
        }
        C7510a.m22371a(z2);
        return this.f31452l[i];
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return this.f31452l.length;
    }
}
