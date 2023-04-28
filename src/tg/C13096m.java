package tg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9971q;
import ug.C13283d;

/* renamed from: tg.m */
/* loaded from: classes8.dex */
final class C13096m {

    /* renamed from: a */
    public static final C13096m f29405a = new C13096m();

    private C13096m() {
    }

    /* renamed from: a */
    public final String m4609a(Constructor<?> constructor) {
        C9971q.m14633g(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C9971q.m14634f(parameterTypes, "constructor.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            C9971q.m14634f(parameterType, "parameterType");
            sb2.append(C13283d.m4052b(parameterType));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: b */
    public final String m4608b(Field field) {
        C9971q.m14633g(field, "field");
        Class<?> type = field.getType();
        C9971q.m14634f(type, "field.type");
        return C13283d.m4052b(type);
    }

    /* renamed from: c */
    public final String m4607c(Method method) {
        C9971q.m14633g(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9971q.m14634f(parameterTypes, "method.parameterTypes");
        for (Class<?> parameterType : parameterTypes) {
            C9971q.m14634f(parameterType, "parameterType");
            sb2.append(C13283d.m4052b(parameterType));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        C9971q.m14634f(returnType, "method.returnType");
        sb2.append(C13283d.m4052b(returnType));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "sb.toString()");
        return sb3;
    }
}
