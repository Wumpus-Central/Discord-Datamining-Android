package p268og;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.EnumC7338w1;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p249nh.C11142f;
import pg.AbstractC11672g;

/* renamed from: og.c */
/* loaded from: classes8.dex */
final class C11306c implements AbstractC11319f1 {

    /* renamed from: k */
    private final AbstractC11319f1 f25238k;

    /* renamed from: l */
    private final AbstractC11346m f25239l;

    /* renamed from: m */
    private final int f25240m;

    public C11306c(AbstractC11319f1 originalDescriptor, AbstractC11346m declarationDescriptor, int i) {
        C9971q.m14633g(originalDescriptor, "originalDescriptor");
        C9971q.m14633g(declarationDescriptor, "declarationDescriptor");
        this.f25238k = originalDescriptor;
        this.f25239l = declarationDescriptor;
        this.f25240m = i;
    }

    @Override // p268og.AbstractC11346m
    /* renamed from: C0 */
    public <R, D> R mo6105C0(AbstractC11363o<R, D> oVar, D d) {
        return (R) this.f25238k.mo6105C0(oVar, d);
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: K */
    public AbstractC6944n mo6394K() {
        return this.f25238k.mo6394K();
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: O */
    public boolean mo6393O() {
        return true;
    }

    @Override // p268og.AbstractC11358n, p268og.AbstractC11346m
    /* renamed from: b */
    public AbstractC11346m mo6104b() {
        return this.f25239l;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        return this.f25238k.getAnnotations();
    }

    @Override // p268og.AbstractC11319f1
    public int getIndex() {
        return this.f25240m + this.f25238k.getIndex();
    }

    @Override // p268og.AbstractC11334j0
    public C11142f getName() {
        return this.f25238k.getName();
    }

    @Override // p268og.AbstractC11319f1
    public List<AbstractC7267g0> getUpperBounds() {
        return this.f25238k.getUpperBounds();
    }

    @Override // p268og.AbstractC11365p
    /* renamed from: j */
    public AbstractC11299a1 mo6102j() {
        return this.f25238k.mo6102j();
    }

    @Override // p268og.AbstractC11319f1, p268og.AbstractC11326h
    /* renamed from: k */
    public AbstractC7268g1 mo6111k() {
        return this.f25238k.mo6111k();
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: m */
    public EnumC7338w1 mo6392m() {
        return this.f25238k.mo6392m();
    }

    @Override // p268og.AbstractC11326h
    /* renamed from: p */
    public AbstractC7304o0 mo6166p() {
        return this.f25238k.mo6166p();
    }

    public String toString() {
        return this.f25238k + "[inner-copy]";
    }

    @Override // p268og.AbstractC11319f1
    /* renamed from: w */
    public boolean mo6391w() {
        return this.f25238k.mo6391w();
    }

    @Override // p268og.AbstractC11319f1, p268og.AbstractC11326h, p268og.AbstractC11346m
    /* renamed from: a */
    public AbstractC11319f1 mo6162a() {
        AbstractC11319f1 a = this.f25238k.mo6162a();
        C9971q.m14634f(a, "originalDescriptor.original");
        return a;
    }
}
