package p337s8;

import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: s8.f */
/* loaded from: classes7.dex */
final class C12824f implements AbstractC12458f {

    /* renamed from: k */
    private final List<C12453b> f28860k;

    public C12824f(List<C12453b> list) {
        this.f28860k = list;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        return j >= 0 ? this.f28860k : Collections.emptyList();
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: c */
    public long mo151c(int i) {
        C7510a.m22371a(i == 0);
        return 0L;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return 1;
    }
}
