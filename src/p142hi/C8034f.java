package p142hi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9920v;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14411h;
import p448yh.C14403d;

/* renamed from: hi.f */
/* loaded from: classes8.dex */
public class C8034f implements AbstractC14411h {

    /* renamed from: b */
    private final EnumC8035g f17342b;

    /* renamed from: c */
    private final String f17343c;

    public C8034f(EnumC8035g kind, String... formatParams) {
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
        this.f17342b = kind;
        String b = kind.m20786b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(b, Arrays.copyOf(copyOf, copyOf.length));
        C9971q.m14634f(format, "format(this, *args)");
        this.f17343c = format;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        String format = String.format(EnumC8029b.ERROR_CLASS.m20791b(), Arrays.copyOf(new Object[]{name}, 1));
        C9971q.m14634f(format, "format(this, *args)");
        C11142f i = C11142f.m10764i(format);
        C9971q.m14634f(i, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new C8028a(i);
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    /* renamed from: h */
    public Set<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        Set<AbstractC11404z0> c;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        c = C9920v.m14723c(new C8030c(C8039k.f17408a.m20770h()));
        return c;
    }

    /* renamed from: i */
    public Set<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return C8039k.f17408a.m20768j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final String m20788j() {
        return this.f17343c;
    }

    public String toString() {
        return "ErrorScope{" + this.f17343c + '}';
    }
}
