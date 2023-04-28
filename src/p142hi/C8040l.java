package p142hi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p406wg.AbstractC13878b;
import p448yh.C14403d;

/* renamed from: hi.l */
/* loaded from: classes8.dex */
public final class C8040l extends C8034f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8040l(EnumC8035g kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(formatParams, "formatParams");
    }

    @Override // p142hi.C8034f, p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        throw new IllegalStateException();
    }

    @Override // p142hi.C8034f, p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        throw new IllegalStateException();
    }

    @Override // p142hi.C8034f, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        throw new IllegalStateException(m20788j() + ", required name: " + name);
    }

    @Override // p142hi.C8034f, p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        throw new IllegalStateException(m20788j());
    }

    @Override // p142hi.C8034f, p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        throw new IllegalStateException();
    }

    @Override // p142hi.C8034f
    /* renamed from: h */
    public Set<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        throw new IllegalStateException(m20788j() + ", required name: " + name);
    }

    @Override // p142hi.C8034f
    /* renamed from: i */
    public Set<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        throw new IllegalStateException(m20788j() + ", required name: " + name);
    }

    @Override // p142hi.C8034f
    public String toString() {
        return "ThrowingScope{" + m20788j() + '}';
    }
}
