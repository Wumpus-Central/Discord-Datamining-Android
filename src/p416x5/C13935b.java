package p416x5;

import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p414x3.C13925a;

/* renamed from: x5.b */
/* loaded from: classes7.dex */
public class C13935b implements AbstractC13937d {

    /* renamed from: a */
    private final List<AbstractC13937d> f31403a;

    public C13935b(Set<AbstractC13937d> set) {
        this.f31403a = new ArrayList(set.size());
        for (AbstractC13937d dVar : set) {
            if (dVar != null) {
                this.f31403a.add(dVar);
            }
        }
    }

    /* renamed from: l */
    private void m2239l(String str, Throwable th2) {
        C13925a.m2287k("ForwardingRequestListener2", str, th2);
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: a */
    public void mo2236a(ProducerContext producerContext) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2236a(producerContext);
            } catch (Exception e) {
                m2239l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: b */
    public void mo2246b(ProducerContext producerContext, String str, boolean z) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2246b(producerContext, str, z);
            } catch (Exception e) {
                m2239l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: c */
    public void mo2245c(ProducerContext producerContext, String str, Map<String, String> map) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2245c(producerContext, str, map);
            } catch (Exception e) {
                m2239l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: d */
    public void mo2244d(ProducerContext producerContext, String str) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2244d(producerContext, str);
            } catch (Exception e) {
                m2239l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: e */
    public void mo2235e(ProducerContext producerContext) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2235e(producerContext);
            } catch (Exception e) {
                m2239l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: f */
    public boolean mo2243f(ProducerContext producerContext, String str) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            if (this.f31403a.get(i).mo2243f(producerContext, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: g */
    public void mo2234g(ProducerContext producerContext) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2234g(producerContext);
            } catch (Exception e) {
                m2239l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: h */
    public void mo2242h(ProducerContext producerContext, String str, String str2) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2242h(producerContext, str, str2);
            } catch (Exception e) {
                m2239l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: i */
    public void mo2233i(ProducerContext producerContext, Throwable th2) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2233i(producerContext, th2);
            } catch (Exception e) {
                m2239l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: j */
    public void mo2241j(ProducerContext producerContext, String str, Map<String, String> map) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2241j(producerContext, str, map);
            } catch (Exception e) {
                m2239l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: k */
    public void mo2240k(ProducerContext producerContext, String str, Throwable th2, Map<String, String> map) {
        int size = this.f31403a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31403a.get(i).mo2240k(producerContext, str, th2, map);
            } catch (Exception e) {
                m2239l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }
}
