package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p342t1.AbstractC12937a;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements AbstractC12937a<LifecycleOwner> {
    @Override // p342t1.AbstractC12937a
    /* renamed from: a */
    public List<Class<? extends AbstractC12937a<?>>> mo5027a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public LifecycleOwner mo5026b(Context context) {
        C3036i.m35773a(context);
        ProcessLifecycleOwner.m35805i(context);
        return ProcessLifecycleOwner.m35806h();
    }
}
