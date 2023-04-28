package p268og;

import fi.AbstractC7267g0;
import fi.AbstractC7299n1;
import fi.C7309p1;
import java.util.Collection;
import java.util.List;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11301b;
import pg.AbstractC11672g;

/* renamed from: og.y */
/* loaded from: classes8.dex */
public interface AbstractC11397y extends AbstractC11301b {

    /* renamed from: og.y$a */
    /* loaded from: classes8.dex */
    public interface AbstractC11398a<D extends AbstractC11397y> {
        /* renamed from: a */
        AbstractC11398a<D> mo6212a();

        /* renamed from: b */
        <V> AbstractC11398a<D> mo6211b(AbstractC11297a.AbstractC0362a<V> aVar, V v);

        D build();

        /* renamed from: c */
        AbstractC11398a<D> mo6210c(List<AbstractC11335j1> list);

        /* renamed from: d */
        AbstractC11398a<D> mo6209d(EnumC11314e0 e0Var);

        /* renamed from: e */
        AbstractC11398a<D> mo6208e(C11142f fVar);

        /* renamed from: f */
        AbstractC11398a<D> mo6207f();

        /* renamed from: g */
        AbstractC11398a<D> mo6206g(AbstractC7299n1 n1Var);

        /* renamed from: h */
        AbstractC11398a<D> mo6205h(AbstractC11301b bVar);

        /* renamed from: i */
        AbstractC11398a<D> mo6204i();

        /* renamed from: j */
        AbstractC11398a<D> mo6203j(AbstractC11387u uVar);

        /* renamed from: k */
        AbstractC11398a<D> mo6202k();

        /* renamed from: l */
        AbstractC11398a<D> mo6201l(boolean z);

        /* renamed from: m */
        AbstractC11398a<D> mo6200m(List<AbstractC11319f1> list);

        /* renamed from: n */
        AbstractC11398a<D> mo6199n(AbstractC7267g0 g0Var);

        /* renamed from: o */
        AbstractC11398a<D> mo6198o(AbstractC11396x0 x0Var);

        /* renamed from: p */
        AbstractC11398a<D> mo6197p(AbstractC11672g gVar);

        /* renamed from: q */
        AbstractC11398a<D> mo6196q(AbstractC11301b.EnumC11302a aVar);

        /* renamed from: r */
        AbstractC11398a<D> mo6195r(AbstractC11396x0 x0Var);

        /* renamed from: s */
        AbstractC11398a<D> mo6194s(AbstractC11346m mVar);

        /* renamed from: t */
        AbstractC11398a<D> mo6193t();
    }

    /* renamed from: A */
    boolean mo6274A();

    /* renamed from: A0 */
    boolean mo6273A0();

    /* renamed from: F0 */
    boolean mo6269F0();

    @Override // p268og.AbstractC11301b, p268og.AbstractC11297a, p268og.AbstractC11346m
    /* renamed from: a */
    AbstractC11397y mo6162a();

    @Override // p268og.AbstractC11358n, p268og.AbstractC11346m
    /* renamed from: b */
    AbstractC11346m mo6104b();

    /* renamed from: c */
    AbstractC11397y mo6167c(C7309p1 p1Var);

    @Override // p268og.AbstractC11301b, p268og.AbstractC11297a
    /* renamed from: d */
    Collection<? extends AbstractC11397y> mo6249d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* renamed from: p0 */
    AbstractC11397y mo6239p0();

    /* renamed from: u */
    AbstractC11398a<? extends AbstractC11397y> mo6238u();
}
