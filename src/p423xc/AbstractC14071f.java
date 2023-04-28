package p423xc;

import p423xc.C14064b;

/* renamed from: xc.f */
/* loaded from: classes3.dex */
public abstract class AbstractC14071f {

    /* renamed from: xc.f$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14072a {
        /* renamed from: a */
        public abstract AbstractC14071f mo1771a();

        /* renamed from: b */
        public abstract AbstractC14072a mo1770b(EnumC14073b bVar);

        /* renamed from: c */
        public abstract AbstractC14072a mo1769c(String str);

        /* renamed from: d */
        public abstract AbstractC14072a mo1768d(long j);
    }

    /* renamed from: xc.f$b */
    /* loaded from: classes3.dex */
    public enum EnumC14073b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static AbstractC14072a m1775a() {
        return new C14064b.C0454b().mo1768d(0L);
    }

    /* renamed from: b */
    public abstract EnumC14073b mo1774b();

    /* renamed from: c */
    public abstract String mo1773c();

    /* renamed from: d */
    public abstract long mo1772d();
}
