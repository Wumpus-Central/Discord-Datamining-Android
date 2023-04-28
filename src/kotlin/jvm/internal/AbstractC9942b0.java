package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p107fg.AbstractC7148h;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: classes8.dex */
public abstract class AbstractC9942b0 extends AbstractC9946d0 implements AbstractC7148h {
    public AbstractC9942b0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9947e
    protected KCallable computeReflected() {
        return C9951f0.m14679g(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public AbstractC7148h.AbstractC7149a mo14597f() {
        return ((AbstractC7148h) getReflected()).mo14597f();
    }
}
