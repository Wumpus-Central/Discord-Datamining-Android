package p268og;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9905i;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p182ji.AbstractC9620k;
import p249nh.C11142f;

/* renamed from: og.z */
/* loaded from: classes8.dex */
public final class C11403z<Type extends AbstractC9620k> extends AbstractC11329h1<Type> {

    /* renamed from: a */
    private final C11142f f25324a;

    /* renamed from: b */
    private final Type f25325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11403z(C11142f underlyingPropertyName, Type underlyingType) {
        super(null);
        C9971q.m14633g(underlyingPropertyName, "underlyingPropertyName");
        C9971q.m14633g(underlyingType, "underlyingType");
        this.f25324a = underlyingPropertyName;
        this.f25325b = underlyingType;
    }

    @Override // p268og.AbstractC11329h1
    /* renamed from: a */
    public List<Pair<C11142f, Type>> mo10136a() {
        List<Pair<C11142f, Type>> d;
        d = C9905i.m14825d(C11098x.m10921a(this.f25324a, this.f25325b));
        return d;
    }

    /* renamed from: c */
    public final C11142f m10135c() {
        return this.f25324a;
    }

    /* renamed from: d */
    public final Type m10134d() {
        return this.f25325b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f25324a + ", underlyingType=" + this.f25325b + ')';
    }
}
