package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import nf.C11075i;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\b"}, m15073d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "a", "subClass", "b", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.c */
/* loaded from: classes8.dex */
public final class C3630c {
    /* renamed from: a */
    public static final Void m33943a(String str, KClass<?> baseClass) {
        String str2;
        C9971q.m14633g(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.mo14598l() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.mo14598l() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new C14436g(str2);
    }

    /* renamed from: b */
    public static final Void m33942b(KClass<?> subClass, KClass<?> baseClass) {
        C9971q.m14633g(subClass, "subClass");
        C9971q.m14633g(baseClass, "baseClass");
        String l = subClass.mo14598l();
        if (l == null) {
            l = String.valueOf(subClass);
        }
        m33943a(l, baseClass);
        throw new C11075i();
    }
}
