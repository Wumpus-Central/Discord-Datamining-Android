package p325rh;

import p268og.AbstractC11297a;
import p268og.AbstractC11313e;

/* renamed from: rh.f */
/* loaded from: classes8.dex */
public interface AbstractC12662f {

    /* renamed from: rh.f$a */
    /* loaded from: classes8.dex */
    public enum EnumC12663a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: rh.f$b */
    /* loaded from: classes8.dex */
    public enum EnumC12664b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    EnumC12664b mo1504a(AbstractC11297a aVar, AbstractC11297a aVar2, AbstractC11313e eVar);

    /* renamed from: b */
    EnumC12663a mo1503b();
}
