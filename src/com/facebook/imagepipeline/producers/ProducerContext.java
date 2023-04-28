package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p314r5.AbstractC12393g;
import p380v5.EnumC13435f;

/* loaded from: classes7.dex */
public interface ProducerContext {
    /* renamed from: a */
    Object mo31170a();

    /* renamed from: b */
    <E> void mo31169b(String str, E e);

    /* renamed from: c */
    void mo31168c(AbstractC5008m0 m0Var);

    /* renamed from: d */
    AbstractC12393g mo31167d();

    /* renamed from: e */
    void mo31166e(String str, String str2);

    /* renamed from: f */
    String mo31165f();

    /* renamed from: g */
    void mo31164g(String str);

    Map<String, Object> getExtras();

    String getId();

    /* renamed from: h */
    AbstractC5011n0 mo31163h();

    /* renamed from: i */
    boolean mo31162i();

    /* renamed from: j */
    Priority mo31161j();

    /* renamed from: k */
    void mo31160k(EnumC13435f fVar);

    /* renamed from: l */
    ImageRequest mo31159l();

    /* renamed from: m */
    void mo31158m(Map<String, ?> map);

    /* renamed from: n */
    boolean mo31157n();

    /* renamed from: o */
    <E> E mo31156o(String str);

    /* renamed from: p */
    ImageRequest.RequestLevel mo31155p();
}
