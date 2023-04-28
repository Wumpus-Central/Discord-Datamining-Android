package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p107fg.AbstractC7142e;
import p107fg.AbstractC7148h;

/* renamed from: kotlin.jvm.internal.v */
/* loaded from: classes8.dex */
public abstract class AbstractC9976v extends AbstractC9978x implements AbstractC7142e {
    public AbstractC9976v(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9947e
    protected KCallable computeReflected() {
        return C9951f0.m14681e(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public AbstractC7148h.AbstractC7149a mo14597f() {
        return ((AbstractC7142e) getReflected()).mo14597f();
    }

    @Override // p107fg.AbstractC7140d
    /* renamed from: h */
    public AbstractC7142e.AbstractC7143a mo14612h() {
        return ((AbstractC7142e) getReflected()).mo14612h();
    }
}
