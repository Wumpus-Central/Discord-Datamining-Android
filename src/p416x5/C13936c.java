package p416x5;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p414x3.C13925a;

/* renamed from: x5.c */
/* loaded from: classes7.dex */
public class C13936c implements RequestListener {

    /* renamed from: a */
    private final List<RequestListener> f31404a;

    public C13936c(Set<RequestListener> set) {
        this.f31404a = new ArrayList(set.size());
        for (RequestListener requestListener : set) {
            if (requestListener != null) {
                this.f31404a.add(requestListener);
            }
        }
    }

    /* renamed from: b */
    private void m2237b(String str, Throwable th2) {
        C13925a.m2287k("ForwardingRequestListener", str, th2);
    }

    /* renamed from: a */
    public void m2238a(RequestListener requestListener) {
        this.f31404a.add(requestListener);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerEvent(String str, String str2, String str3) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                m2237b("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                m2237b("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onProducerFinishWithFailure(str, str2, th2, map);
            } catch (Exception e) {
                m2237b("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                m2237b("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerStart(String str, String str2) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onProducerStart(str, str2);
            } catch (Exception e) {
                m2237b("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onRequestCancellation(str);
            } catch (Exception e) {
                m2237b("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onRequestFailure(imageRequest, str, th2, z);
            } catch (Exception e) {
                m2237b("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onRequestStart(imageRequest, obj, str, z);
            } catch (Exception e) {
                m2237b("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onRequestSuccess(imageRequest, str, z);
            } catch (Exception e) {
                m2237b("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f31404a.get(i).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                m2237b("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public boolean requiresExtraMap(String str) {
        int size = this.f31404a.size();
        for (int i = 0; i < size; i++) {
            if (this.f31404a.get(i).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C13936c(RequestListener... requestListenerArr) {
        this.f31404a = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.f31404a.add(requestListener);
            }
        }
    }
}
