package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes8.dex */
public class C9968n extends C9965m {
    public C9968n(int i, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i, AbstractC9947e.NO_RECEIVER, ((AbstractC9952g) kDeclarationContainer).mo14611i(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public C9968n(int i, Class cls, String str, String str2, int i2) {
        super(i, AbstractC9947e.NO_RECEIVER, cls, str, str2, i2);
    }

    public C9968n(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
