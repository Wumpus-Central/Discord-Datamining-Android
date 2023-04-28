package p278p5;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import p455z3.AbstractC14531c;
import p455z3.AbstractC14535g;

/* renamed from: p5.m */
/* loaded from: classes7.dex */
public class C11553m {

    /* renamed from: p5.m$a */
    /* loaded from: classes7.dex */
    static class C11554a implements AbstractC11570x<AbstractC14535g> {
        C11554a() {
        }

        /* renamed from: b */
        public int mo9326a(AbstractC14535g gVar) {
            return gVar.size();
        }
    }

    /* renamed from: a */
    public static AbstractC11547i<CacheKey, AbstractC14535g> m9389a(Supplier<MemoryCacheParams> supplier, AbstractC14531c cVar) {
        C11561r rVar = new C11561r(new C11554a(), new C11567u(), supplier, null);
        cVar.mo271a(rVar);
        return rVar;
    }
}
