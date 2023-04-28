package p278p5;

import com.facebook.cache.common.CacheKey;
import p455z3.AbstractC14535g;

/* renamed from: p5.n */
/* loaded from: classes7.dex */
public class C11555n {

    /* renamed from: p5.n$a */
    /* loaded from: classes7.dex */
    static class C11556a implements AbstractC11566t<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11557o f25793a;

        C11556a(AbstractC11557o oVar) {
            this.f25793a = oVar;
        }

        /* renamed from: d */
        public void mo9352a(CacheKey cacheKey) {
            this.f25793a.mo9339k(cacheKey);
        }

        /* renamed from: e */
        public void mo9351b(CacheKey cacheKey) {
            this.f25793a.mo9342h(cacheKey);
        }

        /* renamed from: f */
        public void mo9350c(CacheKey cacheKey) {
            this.f25793a.mo9344f(cacheKey);
        }
    }

    /* renamed from: a */
    public static C11558p<CacheKey, AbstractC14535g> m9387a(AbstractC11564s<CacheKey, AbstractC14535g> sVar, AbstractC11557o oVar) {
        oVar.mo9346d(sVar);
        return new C11558p<>(sVar, new C11556a(oVar));
    }
}
