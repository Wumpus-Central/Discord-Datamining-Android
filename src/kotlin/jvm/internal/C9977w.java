package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.w */
/* loaded from: classes8.dex */
public class C9977w extends AbstractC9976v {
    public C9977w(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9947e.NO_RECEIVER, ((AbstractC9952g) kDeclarationContainer).mo14611i(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p107fg.AbstractC7148h
    public Object get(Object obj) {
        return mo14597f().call(obj);
    }

    public C9977w(Class cls, String str, String str2, int i) {
        super(AbstractC9947e.NO_RECEIVER, cls, str, str2, i);
    }
}
