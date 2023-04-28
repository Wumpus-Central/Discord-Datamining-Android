package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.c */
/* loaded from: classes8.dex */
public final class C10993c extends AbstractC11002l {
    private static final long serialVersionUID = 1738909257417361021L;

    /* renamed from: F */
    private final transient AbstractC11001k f38941F;

    /* renamed from: G */
    private final transient AbstractC11008m f38942G;

    /* renamed from: H */
    private final transient AbstractC11027o f38943H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10993c(AbstractC11001k kVar, AbstractC11008m mVar) {
        this(kVar, mVar, AbstractC11002l.f24453n);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: A */
    public C11028p mo11323A(AbstractC10811a aVar, AbstractC10818g gVar) {
        List<C11028p> e = this.f38942G.mo11220e(aVar, gVar);
        if (e.size() == 1) {
            return e.get(0);
        }
        return C11028p.m11181p(this.f38942G.mo11224a(aVar, gVar).m11169i());
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: B */
    public C11028p mo11322B(AbstractC10817f fVar) {
        C11029q b = this.f38942G.mo11223b(fVar);
        if (b == null) {
            return this.f38942G.mo11221d();
        }
        return C11028p.m11181p(b.m11169i());
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: E */
    public AbstractC11027o mo11319E() {
        return this.f38943H;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: I */
    public boolean mo11315I(AbstractC10817f fVar) {
        AbstractC10817f b;
        C11029q b2;
        C11029q b3 = this.f38942G.mo11223b(fVar);
        if (b3 == null) {
            return false;
        }
        int d = b3.m11174d();
        if (d > 0) {
            return true;
        }
        if (d < 0 || !this.f38942G.mo11222c() || (b2 = this.f38942G.mo11223b((b = C10999i.m11326b(b3.m11173e(), 0)))) == null) {
            return false;
        }
        if (b2.m11170h() != b3.m11170h()) {
            return mo11315I(b);
        }
        if (b2.m11174d() < 0) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: J */
    public boolean mo11314J() {
        return this.f38942G.isEmpty();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: K */
    public boolean mo11313K(AbstractC10811a aVar, AbstractC10818g gVar) {
        C11029q a = this.f38942G.mo11224a(aVar, gVar);
        if (a == null || !a.m11168j()) {
            return false;
        }
        return true;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: Q */
    public AbstractC11002l mo11307Q(AbstractC11027o oVar) {
        if (this.f38943H == oVar) {
            return this;
        }
        return new C10993c(this.f38941F, this.f38942G, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10993c)) {
            return false;
        }
        C10993c cVar = (C10993c) obj;
        if (!this.f38941F.mo11196a().equals(cVar.f38941F.mo11196a()) || !this.f38942G.equals(cVar.f38942G) || !this.f38943H.equals(cVar.f38943H)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f38941F.mo11196a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C10993c.class.getName());
        sb2.append(':');
        sb2.append(this.f38941F.mo11196a());
        sb2.append(",history={");
        sb2.append(this.f38942G);
        sb2.append("},strategy=");
        sb2.append(this.f38943H);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: y */
    public AbstractC11008m mo11287y() {
        return this.f38942G;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: z */
    public AbstractC11001k mo11286z() {
        return this.f38941F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10993c(AbstractC11001k kVar, AbstractC11008m mVar, AbstractC11027o oVar) {
        if (kVar == null) {
            throw new NullPointerException("Missing timezone id.");
        } else if ((kVar instanceof C11028p) && !mVar.isEmpty()) {
            throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + kVar.mo11196a());
        } else if (mVar == null) {
            throw new NullPointerException("Missing timezone history.");
        } else if (oVar != null) {
            this.f38941F = kVar;
            this.f38942G = mVar;
            this.f38943H = oVar;
        } else {
            throw new NullPointerException("Missing transition strategy.");
        }
    }
}
