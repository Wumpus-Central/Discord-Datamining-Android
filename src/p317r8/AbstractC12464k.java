package p317r8;

import java.util.List;
import p119g9.C7510a;
import p152i7.AbstractC8226j;

/* renamed from: r8.k */
/* loaded from: classes7.dex */
public abstract class AbstractC12464k extends AbstractC8226j implements AbstractC12458f {

    /* renamed from: n */
    private AbstractC12458f f28116n;

    /* renamed from: o */
    private long f28117o;

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        return ((AbstractC12458f) C7510a.m22367e(this.f28116n)).mo153a(j - this.f28117o);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        return ((AbstractC12458f) C7510a.m22367e(this.f28116n)).mo152b(j - this.f28117o);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: c */
    public long mo151c(int i) {
        return ((AbstractC12458f) C7510a.m22367e(this.f28116n)).mo151c(i) + this.f28117o;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return ((AbstractC12458f) C7510a.m22367e(this.f28116n)).mo150d();
    }

    @Override // p152i7.AbstractC8215a
    /* renamed from: f */
    public void mo1151f() {
        super.mo1151f();
        this.f28116n = null;
    }

    /* renamed from: o */
    public void m6666o(long j, AbstractC12458f fVar, long j2) {
        this.f17811l = j;
        this.f28116n = fVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f28117o = j;
    }
}
