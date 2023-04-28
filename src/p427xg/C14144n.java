package p427xg;

import bh.C3495c;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11297a;
import p268og.AbstractC11313e;
import p268og.AbstractC11388u0;
import p325rh.AbstractC12662f;

/* renamed from: xg.n */
/* loaded from: classes8.dex */
public final class C14144n implements AbstractC12662f {
    @Override // p325rh.AbstractC12662f
    /* renamed from: a */
    public AbstractC12662f.EnumC12664b mo1504a(AbstractC11297a superDescriptor, AbstractC11297a subDescriptor, AbstractC11313e eVar) {
        C9971q.m14633g(superDescriptor, "superDescriptor");
        C9971q.m14633g(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof AbstractC11388u0) || !(superDescriptor instanceof AbstractC11388u0)) {
            return AbstractC12662f.EnumC12664b.UNKNOWN;
        }
        AbstractC11388u0 u0Var = (AbstractC11388u0) subDescriptor;
        AbstractC11388u0 u0Var2 = (AbstractC11388u0) superDescriptor;
        if (!C9971q.m14638b(u0Var.getName(), u0Var2.getName())) {
            return AbstractC12662f.EnumC12664b.UNKNOWN;
        }
        if (C3495c.m34294a(u0Var) && C3495c.m34294a(u0Var2)) {
            return AbstractC12662f.EnumC12664b.OVERRIDABLE;
        }
        if (C3495c.m34294a(u0Var) || C3495c.m34294a(u0Var2)) {
            return AbstractC12662f.EnumC12664b.INCOMPATIBLE;
        }
        return AbstractC12662f.EnumC12664b.UNKNOWN;
    }

    @Override // p325rh.AbstractC12662f
    /* renamed from: b */
    public AbstractC12662f.EnumC12663a mo1503b() {
        return AbstractC12662f.EnumC12663a.BOTH;
    }
}
