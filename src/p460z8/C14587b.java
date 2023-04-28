package p460z8;

import java.util.Collections;
import java.util.List;
import p119g9.C7510a;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: z8.b */
/* loaded from: classes7.dex */
final class C14587b implements AbstractC12458f {

    /* renamed from: l */
    public static final C14587b f33061l = new C14587b();

    /* renamed from: k */
    private final List<C12453b> f33062k;

    public C14587b(C12453b bVar) {
        this.f33062k = Collections.singletonList(bVar);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        return j >= 0 ? this.f33062k : Collections.emptyList();
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

    private C14587b() {
        this.f33062k = Collections.emptyList();
    }
}
