package p278p5;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import p278p5.AbstractC11547i;
import p278p5.AbstractC11564s;
import p380v5.AbstractC13432c;
import p455z3.AbstractC14531c;

/* renamed from: p5.g */
/* loaded from: classes7.dex */
public class C11544g implements AbstractC11534a {

    /* renamed from: p5.g$a */
    /* loaded from: classes7.dex */
    class C11545a implements AbstractC11570x<AbstractC13432c> {
        C11545a() {
        }

        /* renamed from: b */
        public int mo9326a(AbstractC13432c cVar) {
            return cVar.mo3733g();
        }
    }

    @Override // p278p5.AbstractC11534a
    /* renamed from: a */
    public AbstractC11547i<CacheKey, AbstractC13432c> mo9411a(Supplier<MemoryCacheParams> supplier, AbstractC14531c cVar, AbstractC11564s.AbstractC11565a aVar, AbstractC11547i.AbstractC11549b<CacheKey> bVar) {
        C11561r rVar = new C11561r(new C11545a(), aVar, supplier, bVar);
        cVar.mo271a(rVar);
        return rVar;
    }
}
