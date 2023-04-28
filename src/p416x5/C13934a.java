package p416x5;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: x5.a */
/* loaded from: classes7.dex */
public class C13934a implements RequestListener {
    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerEvent(String str, String str2, String str3) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onProducerStart(String str, String str2) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public void onUltimateProducerReached(String str, String str2, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5013o0
    public boolean requiresExtraMap(String str) {
        return false;
    }
}
