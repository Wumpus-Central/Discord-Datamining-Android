package net.time4j.p248tz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.p248tz.AbstractC11008m;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;

/* renamed from: net.time4j.tz.model.e */
/* loaded from: classes8.dex */
final class C11013e implements AbstractC11008m, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final C11028p offset;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11013e(C11028p pVar) {
        this.offset = pVar;
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
        if (obj instanceof C11013e) {
            return this.offset.equals(((C11013e) obj).offset);
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
        return "EmptyTransitionModel=" + this.offset.mo11196a();
    }
}
