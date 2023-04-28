package p440y8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p119g9.C7557q0;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: y8.h */
/* loaded from: classes7.dex */
final class C14319h implements AbstractC12458f {

    /* renamed from: k */
    private final C14315d f32429k;

    /* renamed from: l */
    private final long[] f32430l;

    /* renamed from: m */
    private final Map<String, C14318g> f32431m;

    /* renamed from: n */
    private final Map<String, C14316e> f32432n;

    /* renamed from: o */
    private final Map<String, String> f32433o;

    public C14319h(C14315d dVar, Map<String, C14318g> map, Map<String, C14316e> map2, Map<String, String> map3) {
        Map<String, C14318g> map4;
        this.f32429k = dVar;
        this.f32432n = map2;
        this.f32433o = map3;
        if (map != null) {
            map4 = Collections.unmodifiableMap(map);
        } else {
            map4 = Collections.emptyMap();
        }
        this.f32431m = map4;
        this.f32430l = dVar.m931j();
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        int e = C7557q0.m22155e(this.f32430l, j, false, false);
        if (e < this.f32430l.length) {
            return e;
        }
        return -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        return this.f32429k.m933h(j, this.f32431m, this.f32432n, this.f32433o);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: c */
    public long mo151c(int i) {
        return this.f32430l[i];
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return this.f32430l.length;
    }
}
