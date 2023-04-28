package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import p107fg.AbstractC7146g;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes8.dex */
public abstract class AbstractC9980z extends AbstractC9946d0 implements AbstractC7146g {
    public AbstractC9980z(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC9947e
    protected KCallable computeReflected() {
        return C9951f0.m14680f(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: f */
    public AbstractC7146g.AbstractC7147a mo14597f() {
        return ((AbstractC7146g) getReflected()).mo14597f();
    }
}
