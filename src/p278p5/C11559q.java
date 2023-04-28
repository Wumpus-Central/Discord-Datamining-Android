package p278p5;

import com.facebook.cache.common.CacheKey;
import p380v5.AbstractC13432c;

/* renamed from: p5.q */
/* loaded from: classes7.dex */
public class C11559q {

    /* renamed from: p5.q$a */
    /* loaded from: classes7.dex */
    static class C11560a implements AbstractC11566t<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11557o f25796a;

        C11560a(AbstractC11557o oVar) {
            this.f25796a = oVar;
        }

        /* renamed from: d */
        public void mo9352a(CacheKey cacheKey) {
            this.f25796a.mo9341i(cacheKey);
        }

        /* renamed from: e */
        public void mo9351b(CacheKey cacheKey) {
            this.f25796a.mo9348b(cacheKey);
        }

        /* renamed from: f */
        public void mo9350c(CacheKey cacheKey) {
            this.f25796a.mo9337m(cacheKey);
        }
    }

    /* renamed from: a */
    public static C11558p<CacheKey, AbstractC13432c> m9383a(AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11557o oVar) {
        oVar.mo9349a(sVar);
        return new C11558p<>(sVar, new C11560a(oVar));
    }
}
