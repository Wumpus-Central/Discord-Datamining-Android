package p233mi;

import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;

/* renamed from: mi.e */
/* loaded from: classes8.dex */
public abstract class AbstractC10627e<K, T> extends AbstractC10621a<K, T> {

    /* renamed from: k */
    private AbstractC10623c<T> f23520k;

    protected AbstractC10627e(AbstractC10623c<T> arrayMap) {
        C9971q.m14633g(arrayMap, "arrayMap");
        this.f23520k = arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p233mi.AbstractC10621a
    /* renamed from: a */
    public final AbstractC10623c<T> mo12709a() {
        return this.f23520k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m12708f(KClass<? extends K> tClass, T value) {
        C9971q.m14633g(tClass, "tClass");
        C9971q.m14633g(value, "value");
        int d = mo12714b().m12678d(tClass);
        int a = this.f23520k.mo12695a();
        if (a != 0) {
            if (a == 1) {
                AbstractC10623c<T> cVar = this.f23520k;
                C9971q.m14635e(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                C10648o oVar = (C10648o) cVar;
                if (oVar.m12693f() == d) {
                    this.f23520k = new C10648o(value, d);
                    return;
                }
                C10624d dVar = new C10624d();
                this.f23520k = dVar;
                dVar.mo12694b(oVar.m12693f(), oVar.m12692g());
            }
            this.f23520k.mo12694b(d, value);
            return;
        }
        this.f23520k = new C10648o(value, d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC10627e() {
        /*
            r2 = this;
            mi.i r0 = p233mi.C10638i.f23533k
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C9971q.m14635e(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p233mi.AbstractC10627e.<init>():void");
    }
}
