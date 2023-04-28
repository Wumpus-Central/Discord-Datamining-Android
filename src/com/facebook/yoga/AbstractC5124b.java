package com.facebook.yoga;

/* renamed from: com.facebook.yoga.b */
/* loaded from: classes7.dex */
public abstract class AbstractC5124b extends YogaConfig {

    /* renamed from: a */
    long f8897a;

    private AbstractC5124b(long j) {
        if (j != 0) {
            this.f8897a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.YogaConfig
    /* renamed from: a */
    public void mo30599a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f8897a, f);
    }

    @Override // com.facebook.yoga.YogaConfig
    /* renamed from: b */
    public void mo30598b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f8897a, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5124b() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
