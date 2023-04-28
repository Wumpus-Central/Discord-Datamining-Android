package li;

import fi.AbstractC7267g0;
import gi.AbstractC7659e;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11319f1;

/* renamed from: li.c */
/* loaded from: classes8.dex */
final class C10454c {

    /* renamed from: a */
    private final AbstractC11319f1 f23070a;

    /* renamed from: b */
    private final AbstractC7267g0 f23071b;

    /* renamed from: c */
    private final AbstractC7267g0 f23072c;

    public C10454c(AbstractC11319f1 typeParameter, AbstractC7267g0 inProjection, AbstractC7267g0 outProjection) {
        C9971q.m14633g(typeParameter, "typeParameter");
        C9971q.m14633g(inProjection, "inProjection");
        C9971q.m14633g(outProjection, "outProjection");
        this.f23070a = typeParameter;
        this.f23071b = inProjection;
        this.f23072c = outProjection;
    }

    /* renamed from: a */
    public final AbstractC7267g0 m13137a() {
        return this.f23071b;
    }

    /* renamed from: b */
    public final AbstractC7267g0 m13136b() {
        return this.f23072c;
    }

    /* renamed from: c */
    public final AbstractC11319f1 m13135c() {
        return this.f23070a;
    }

    /* renamed from: d */
    public final boolean m13134d() {
        return AbstractC7659e.f16659a.mo21674b(this.f23071b, this.f23072c);
    }
}
