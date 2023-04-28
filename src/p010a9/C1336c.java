package p010a9;

import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: a9.c */
/* loaded from: classes7.dex */
final class C1336c implements AbstractC12458f {

    /* renamed from: k */
    private final List<C12453b> f229k;

    public C1336c(List<C12453b> list) {
        this.f229k = Collections.unmodifiableList(list);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        return j >= 0 ? this.f229k : Collections.emptyList();
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
