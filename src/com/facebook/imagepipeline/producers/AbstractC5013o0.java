package com.facebook.imagepipeline.producers;

import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.o0 */
/* loaded from: classes7.dex */
public interface AbstractC5013o0 {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z);

    boolean requiresExtraMap(String str);
}
