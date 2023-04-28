package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.a */
/* loaded from: classes8.dex */
public final class C10991a extends AbstractC11002l {
    private static final long serialVersionUID = -2894726563499525332L;
    private final AbstractC11002l fallback;
    private final AbstractC11001k tzid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10991a(AbstractC11001k kVar, AbstractC11002l lVar) {
        if (kVar == null || lVar == null) {
            throw null;
        }
        this.tzid = kVar;
        this.fallback = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 12);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: A */
    public C11028p mo11323A(AbstractC10811a aVar, AbstractC10818g gVar) {
        return this.fallback.mo11323A(aVar, gVar);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: B */
    public C11028p mo11322B(AbstractC10817f fVar) {
        return this.fallback.mo11322B(fVar);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: E */
    public AbstractC11027o mo11319E() {
        return this.fallback.mo11319E();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: I */
    public boolean mo11315I(AbstractC10817f fVar) {
        return this.fallback.mo11315I(fVar);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: J */
    public boolean mo11314J() {
        return this.fallback.mo11314J();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: K */
    public boolean mo11313K(AbstractC10811a aVar, AbstractC10818g gVar) {
        return this.fallback.mo11313K(aVar, gVar);
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: Q */
    public AbstractC11002l mo11307Q(AbstractC11027o oVar) {
        return new C10991a(this.tzid, this.fallback.mo11307Q(oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public AbstractC11002l m11334R() {
        return this.fallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10991a)) {
            return false;
        }
        C10991a aVar = (C10991a) obj;
        if (!this.tzid.mo11196a().equals(aVar.tzid.mo11196a()) || !this.fallback.equals(aVar.fallback)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.tzid.mo11196a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C10991a.class.getName());
        sb2.append(':');
        sb2.append(this.tzid.mo11196a());
        sb2.append(",fallback=");
        sb2.append(this.fallback);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: y */
    public AbstractC11008m mo11287y() {
        return this.fallback.mo11287y();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: z */
    public AbstractC11001k mo11286z() {
        return this.tzid;
    }
}
