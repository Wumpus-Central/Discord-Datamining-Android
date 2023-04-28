package p145i0;

import p390w.AbstractC13568a2;
import p390w.C13673t0;

/* renamed from: i0.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC8205z0 {

    /* renamed from: a */
    static final Integer f17742a = 0;

    /* renamed from: b */
    static final AbstractC8205z0 f17743b = m20307c(0, EnumC8206a.INACTIVE);

    /* renamed from: c */
    static final AbstractC13568a2<AbstractC8205z0> f17744c = C13673t0.m3081g(m20307c(0, EnumC8206a.ACTIVE));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.z0$a */
    /* loaded from: classes.dex */
    public enum EnumC8206a {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static AbstractC8205z0 m20307c(Integer num, EnumC8206a aVar) {
        return new C8155l(num, aVar);
    }

    /* renamed from: a */
    public abstract Integer mo20309a();

    /* renamed from: b */
    public abstract EnumC8206a mo20308b();
}
