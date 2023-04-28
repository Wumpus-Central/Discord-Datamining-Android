package p142hi;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import gi.AbstractC7664g;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p217lg.C10416e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: hi.i */
/* loaded from: classes8.dex */
public final class C8037i implements AbstractC7268g1 {

    /* renamed from: a */
    private final EnumC8038j f17363a;

    /* renamed from: b */
    private final String[] f17364b;

    /* renamed from: c */
    private final String f17365c;

    public C8037i(EnumC8038j kind, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        this.f17363a = kind;
        this.f17364b = formatParams;
        String b = EnumC8029b.ERROR_TYPE.m20791b();
        String b2 = kind.m20779b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(b2, Arrays.copyOf(copyOf, copyOf.length));
        C9971q.m14634f(format, "format(this, *args)");
        String format2 = String.format(b, Arrays.copyOf(new Object[]{format}, 1));
        C9971q.m14634f(format2, "format(this, *args)");
        this.f17365c = format2;
    }

    /* renamed from: c */
    public final EnumC8038j m20782c() {
        return this.f17363a;
    }

    /* renamed from: d */
    public final String m20781d(int i) {
        return this.f17364b[i];
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
        List i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        return C10416e.f22826h.m13452a();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: o */
    public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public AbstractC11326h mo4565p() {
        return C8039k.f17408a.m20770h();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return false;
    }

    public String toString() {
        return this.f17365c;
    }
}
