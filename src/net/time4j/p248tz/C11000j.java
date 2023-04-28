package net.time4j.p248tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.j */
/* loaded from: classes8.dex */
public final class C11000j extends AbstractC11002l implements AbstractC11008m {

    /* renamed from: F */
    private static final C11000j f38946F = new C11000j(C11028p.f24516u);
    private static final long serialVersionUID = 7807230388259573234L;
    private final C11028p offset;

    private C11000j(C11028p pVar) {
        if (pVar.m11188i() == 0) {
            this.offset = pVar;
            return;
        }
        int j = pVar.m11187j();
        this.offset = C11028p.m11181p(pVar.m11188i() < 0 ? j - 1 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static C11000j m11324R(C11028p pVar) {
        if (pVar.m11187j() == 0 && pVar.m11188i() == 0) {
            return f38946F;
        }
        return new C11000j(pVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.offset.m11188i() != 0) {
            throw new InvalidObjectException("Fractional offset is invalid.");
        }
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: A */
    public C11028p mo11323A(AbstractC10811a aVar, AbstractC10818g gVar) {
        return this.offset;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: B */
    public C11028p mo11322B(AbstractC10817f fVar) {
        return this.offset;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: E */
    public AbstractC11027o mo11319E() {
        return AbstractC11002l.f24453n;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: I */
    public boolean mo11315I(AbstractC10817f fVar) {
        return false;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: J */
    public boolean mo11314J() {
        return true;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: K */
    public boolean mo11313K(AbstractC10811a aVar, AbstractC10818g gVar) {
        return false;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: Q */
    public AbstractC11002l mo11307Q(AbstractC11027o oVar) {
        return this;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: a */
    public C11029q mo11224a(AbstractC10811a aVar, AbstractC10818g gVar) {
        return null;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: b */
    public C11029q mo11223b(AbstractC10817f fVar) {
        return null;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: c */
    public boolean mo11222c() {
        return false;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: d */
    public C11028p mo11221d() {
        return this.offset;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: e */
    public List<C11028p> mo11220e(AbstractC10811a aVar, AbstractC10818g gVar) {
        return Collections.singletonList(this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11000j) {
            return this.offset.equals(((C11000j) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C11000j.class.getName());
        sb2.append(':');
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: w */
    public String mo11289w(EnumC10994d dVar, Locale locale) {
        if (dVar.m11332a()) {
            return this.offset.toString();
        }
        return this.offset.mo11196a();
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: y */
    public AbstractC11008m mo11287y() {
        return this;
    }

    @Override // net.time4j.p248tz.AbstractC11002l
    /* renamed from: z */
    public AbstractC11001k mo11286z() {
        return this.offset;
    }
}
