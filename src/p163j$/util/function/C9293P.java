package p163j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.P */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9293P implements AbstractC9294Q {

    /* renamed from: a */
    public final /* synthetic */ LongPredicate f20389a;

    private /* synthetic */ C9293P(LongPredicate longPredicate) {
        this.f20389a = longPredicate;
    }

    /* renamed from: a */
    public static /* synthetic */ C9293P m16540a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C9293P(longPredicate);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean m16539b(long j) {
        return this.f20389a.test(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9293P) {
            obj = ((C9293P) obj).f20389a;
        }
        return this.f20389a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20389a.hashCode();
    }
}
