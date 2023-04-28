package th;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;

/* renamed from: th.p */
/* loaded from: classes8.dex */
public final class C13121p implements AbstractC7268g1 {

    /* renamed from: a */
    private final long f29429a;

    /* renamed from: b */
    private final AbstractC11327h0 f29430b;

    /* renamed from: c */
    private final ArrayList<AbstractC7267g0> f29431c;

    /* renamed from: c */
    public Void m4569c() {
        return null;
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: m */
    public Collection<AbstractC7267g0> mo4568m() {
        return this.f29431c;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        return this.f29430b.mo6136n();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: o */
    public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC11326h mo4565p() {
        return (AbstractC11326h) m4569c();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return false;
    }

    public String toString() {
        return "IntegerValueType(" + this.f29429a + ')';
    }
}
