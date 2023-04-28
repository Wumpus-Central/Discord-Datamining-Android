package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.b */
/* loaded from: classes8.dex */
public final class C11010b extends AbstractC11024l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* renamed from: l */
    private final transient int f24475l;

    /* renamed from: m */
    private final transient C11009a f24476m;

    /* renamed from: n */
    private final transient C11021j f24477n;

    /* renamed from: o */
    private final transient C11029q f24478o;

    /* renamed from: p */
    private transient int f24479p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11010b(int i, List<C11029q> list, List<AbstractC11012d> list2, boolean z, boolean z2) {
        this.f24475l = i;
        C11009a aVar = new C11009a(list, z, z2);
        this.f24476m = aVar;
        C11029q n = aVar.m11251n();
        this.f24478o = n;
        this.f24477n = new C11021j(n, list2, z);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: a */
    public C11029q mo11224a(AbstractC10811a aVar, AbstractC10818g gVar) {
        return this.f24476m.m11252m(aVar, gVar, this.f24477n);
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: b */
    public C11029q mo11223b(AbstractC10817f fVar) {
        if (fVar.mo11325h() < this.f24478o.m11173e()) {
            return this.f24476m.mo11223b(fVar);
        }
        C11029q b = this.f24477n.mo11223b(fVar);
        if (b == null) {
            return this.f24478o;
        }
        return b;
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: c */
    public boolean mo11222c() {
        return this.f24477n.mo11222c() || this.f24476m.mo11222c();
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: d */
    public C11028p mo11221d() {
        return this.f24476m.mo11221d();
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    /* renamed from: e */
    public List<C11028p> mo11220e(AbstractC10811a aVar, AbstractC10818g gVar) {
        return this.f24476m.m11249p(aVar, gVar, this.f24477n);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11010b)) {
            return false;
        }
        C11010b bVar = (C11010b) obj;
        if (!this.f24476m.m11253l(bVar.f24476m, this.f24475l, bVar.f24475l) || !this.f24477n.m11216n().equals(bVar.f24477n.m11216n())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f24479p;
        if (i != 0) {
            return i;
        }
        int q = this.f24476m.m11248q(this.f24475l) + (this.f24477n.m11216n().hashCode() * 37);
        this.f24479p = q;
        return q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<AbstractC11012d> m11243k() {
        return this.f24477n.m11216n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m11242l(ObjectOutput objectOutput) {
        this.f24476m.m11245t(this.f24475l, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C11010b.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f24475l);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f24477n.m11216n());
        sb2.append(']');
        return sb2.toString();
    }
}
