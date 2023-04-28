package p013ah;

import ch.C4008d;
import kotlin.Lazy;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p268og.AbstractC11327h0;
import p427xg.C14164y;

/* renamed from: ah.g */
/* loaded from: classes8.dex */
public final class C1399g {

    /* renamed from: a */
    private final C1391b f425a;

    /* renamed from: b */
    private final AbstractC1404k f426b;

    /* renamed from: c */
    private final Lazy<C14164y> f427c;

    /* renamed from: d */
    private final Lazy f428d;

    /* renamed from: e */
    private final C4008d f429e;

    public C1399g(C1391b components, AbstractC1404k typeParameterResolver, Lazy<C14164y> delegateForDefaultTypeQualifiers) {
        C9971q.m14633g(components, "components");
        C9971q.m14633g(typeParameterResolver, "typeParameterResolver");
        C9971q.m14633g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f425a = components;
        this.f426b = typeParameterResolver;
        this.f427c = delegateForDefaultTypeQualifiers;
        this.f428d = delegateForDefaultTypeQualifiers;
        this.f429e = new C4008d(this, typeParameterResolver);
    }

    /* renamed from: a */
    public final C1391b m41174a() {
        return this.f425a;
    }

    /* renamed from: b */
    public final C14164y m41173b() {
        return (C14164y) this.f428d.getValue();
    }

    /* renamed from: c */
    public final Lazy<C14164y> m41172c() {
        return this.f427c;
    }

    /* renamed from: d */
    public final AbstractC11327h0 m41171d() {
        return this.f425a.m41197m();
    }

    /* renamed from: e */
    public final AbstractC6944n m41170e() {
        return this.f425a.m41189u();
    }

    /* renamed from: f */
    public final AbstractC1404k m41169f() {
        return this.f426b;
    }

    /* renamed from: g */
    public final C4008d m41168g() {
        return this.f429e;
    }
}
