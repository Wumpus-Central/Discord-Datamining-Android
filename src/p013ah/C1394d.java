package p013ah;

import java.util.Iterator;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6891d;
import p087ei.AbstractC6937h;
import p217lg.C10434k;
import p249nh.C11137c;
import p306qi.C12200o;
import p447yg.C14381c;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: ah.d */
/* loaded from: classes8.dex */
public final class C1394d implements AbstractC11672g {

    /* renamed from: k */
    private final C1399g f416k;

    /* renamed from: l */
    private final AbstractC6891d f417l;

    /* renamed from: m */
    private final boolean f418m;

    /* renamed from: n */
    private final AbstractC6937h<AbstractC6885a, AbstractC11666c> f419n;

    /* renamed from: ah.d$a */
    /* loaded from: classes8.dex */
    static final class C1395a extends AbstractC9973s implements Function1<AbstractC6885a, AbstractC11666c> {
        C1395a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11666c invoke(AbstractC6885a annotation) {
            C9971q.m14633g(annotation, "annotation");
            return C14381c.f32552a.m715e(annotation, C1394d.this.f416k, C1394d.this.f418m);
        }
    }

    public C1394d(C1399g c, AbstractC6891d annotationOwner, boolean z) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(annotationOwner, "annotationOwner");
        this.f416k = c;
        this.f417l = annotationOwner;
        this.f418m = z;
        this.f419n = c.m41174a().m41189u().mo23894g(new C1395a());
    }

    @Override // pg.AbstractC11672g
    /* renamed from: c */
    public AbstractC11666c mo9038c(C11137c fqName) {
        AbstractC11666c invoke;
        C9971q.m14633g(fqName, "fqName");
        AbstractC6885a c = this.f417l.mo3966c(fqName);
        if (c == null || (invoke = this.f419n.invoke(c)) == null) {
            return C14381c.f32552a.m719a(fqName, this.f417l, this.f416k);
        }
        return invoke;
    }

    @Override // pg.AbstractC11672g
    public boolean isEmpty() {
        return this.f417l.getAnnotations().isEmpty() && !this.f417l.mo3971D();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC11666c> iterator() {
        Sequence K;
        Sequence y;
        Sequence B;
        Sequence r;
        K = C9914r.m14782K(this.f417l.getAnnotations());
        y = C12200o.m7420y(K, this.f419n);
        B = C12200o.m7439B(y, C14381c.f32552a.m719a(C10434k.C10435a.f22948y, this.f417l, this.f416k));
        r = C12200o.m7427r(B);
        return r.iterator();
    }

    @Override // pg.AbstractC11672g
    /* renamed from: l */
    public boolean mo9037l(C11137c cVar) {
        return AbstractC11672g.C11674b.m9045b(this, cVar);
    }

    public /* synthetic */ C1394d(C1399g gVar, AbstractC6891d dVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, dVar, (i & 4) != 0 ? false : z);
    }
}
