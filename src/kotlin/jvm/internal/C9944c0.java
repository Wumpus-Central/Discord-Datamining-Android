package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.c0 */
/* loaded from: classes8.dex */
public class C9944c0 extends AbstractC9942b0 {
    public C9944c0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(AbstractC9947e.NO_RECEIVER, ((AbstractC9952g) kDeclarationContainer).mo14611i(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p107fg.AbstractC7148h
    public Object get(Object obj) {
        return mo14597f().call(obj);
    }
}
