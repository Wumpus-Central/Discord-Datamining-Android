package bj;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m15073d2 = {"", "T", "", "serialName", "", "values", "names", "", "annotations", "Lkotlinx/serialization/KSerializer;", "a", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: bj.c0 */
/* loaded from: classes8.dex */
public final class C3631c0 {
    /* renamed from: a */
    public static final <T extends Enum<T>> KSerializer<T> m33941a(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        Object K;
        Object K2;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(values, "values");
        C9971q.m14633g(names, "names");
        C9971q.m14633g(annotations, "annotations");
        C3619a0 a0Var = new C3619a0(serialName, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = values[i];
            int i3 = i2 + 1;
            K = C9899f.m14952K(names, i2);
            String str = (String) K;
            if (str == null) {
                str = t.name();
            }
            PluginGeneratedSerialDescriptor.m13840m(a0Var, str, false, 2, null);
            K2 = C9899f.m14952K(annotations, i2);
            Annotation[] annotationArr = (Annotation[]) K2;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    a0Var.m13835r(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        return new C3624b0(serialName, values, a0Var);
    }
}
