package p399w8;

import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p119g9.C7557q0;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: w8.d */
/* loaded from: classes7.dex */
final class C13810d implements AbstractC12458f {

    /* renamed from: k */
    private final List<List<C12453b>> f31106k;

    /* renamed from: l */
    private final List<Long> f31107l;

    public C13810d(List<List<C12453b>> list, List<Long> list2) {
        this.f31106k = list;
        this.f31107l = list2;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        int d = C7557q0.m22157d(this.f31107l, Long.valueOf(j), false, false);
        if (d < this.f31107l.size()) {
            return d;
        }
        return -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        int g = C7557q0.m22151g(this.f31107l, Long.valueOf(j), true, false);
        if (g == -1) {
            return Collections.emptyList();
        }
        return this.f31106k.get(g);
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
        if (i >= this.f31107l.size()) {
            z2 = false;
        }
        C7510a.m22371a(z2);
        return this.f31107l.get(i).longValue();
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return this.f31107l.size();
    }
}
