package p268og;

import kotlin.jvm.internal.C9971q;

/* renamed from: og.r */
/* loaded from: classes8.dex */
public abstract class AbstractC11369r extends AbstractC11387u {

    /* renamed from: a */
    private final AbstractC11362n1 f25291a;

    public AbstractC11369r(AbstractC11362n1 delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f25291a = delegate;
    }

    @Override // p268og.AbstractC11387u
    /* renamed from: b */
    public AbstractC11362n1 mo10153b() {
        return this.f25291a;
    }

    @Override // p268og.AbstractC11387u
    /* renamed from: c */
    public String mo10152c() {
        return mo10153b().mo5176b();
    }

    @Override // p268og.AbstractC11387u
    /* renamed from: f */
    public AbstractC11387u mo10150f() {
        AbstractC11387u j = C11373t.m10166j(mo10153b().mo5175d());
        C9971q.m14634f(j, "toDescriptorVisibility(delegate.normalize())");
        return j;
    }
}
