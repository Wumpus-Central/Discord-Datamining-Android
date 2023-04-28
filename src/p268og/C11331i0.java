package p268og;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9620k;
import p249nh.C11142f;
import p267of.C11289v;

/* renamed from: og.i0 */
/* loaded from: classes8.dex */
public final class C11331i0<Type extends AbstractC9620k> extends AbstractC11329h1<Type> {

    /* renamed from: a */
    private final List<Pair<C11142f, Type>> f25260a;

    /* renamed from: b */
    private final Map<C11142f, Type> f25261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11331i0(List<? extends Pair<C11142f, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Map<C11142f, Type> r;
        boolean z;
        C9971q.m14633g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f25260a = underlyingPropertyNamesToTypes;
        r = C11289v.m10241r(mo10136a());
        if (r.size() == mo10136a().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f25261b = r;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // p268og.AbstractC11329h1
    /* renamed from: a */
    public List<Pair<C11142f, Type>> mo10136a() {
        return this.f25260a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + mo10136a() + ')';
    }
}
