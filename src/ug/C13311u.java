package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6887b;
import p086eh.AbstractC6888b0;
import p086eh.AbstractC6906r;
import ug.AbstractC13316z;

/* renamed from: ug.u */
/* loaded from: classes8.dex */
public final class C13311u extends AbstractC13310t implements AbstractC6906r {

    /* renamed from: a */
    private final Method f29854a;

    public C13311u(Method member) {
        C9971q.m14633g(member, "member");
        this.f29854a = member;
    }

    @Override // p086eh.AbstractC6906r
    /* renamed from: M */
    public boolean mo3979M() {
        return mo3976g() != null;
    }

    /* renamed from: S */
    public Method mo3969Q() {
        return this.f29854a;
    }

    /* renamed from: T */
    public AbstractC13316z getReturnType() {
        AbstractC13316z.C13317a aVar = AbstractC13316z.f29860a;
        Type genericReturnType = mo3969Q().getGenericReturnType();
        C9971q.m14634f(genericReturnType, "member.genericReturnType");
        return aVar.m3965a(genericReturnType);
    }

    @Override // p086eh.AbstractC6906r
    /* renamed from: g */
    public AbstractC6887b mo3976g() {
        Object defaultValue = mo3969Q().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC13287f.f29830b.m4036a(defaultValue, null);
        }
        return null;
    }

    @Override // p086eh.AbstractC6914z
    public List<C13276a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo3969Q().getTypeParameters();
        C9971q.m14634f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C13276a0(typeVariable));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6906r
    /* renamed from: i */
    public List<AbstractC6888b0> mo3975i() {
        Type[] genericParameterTypes = mo3969Q().getGenericParameterTypes();
        C9971q.m14634f(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo3969Q().getParameterAnnotations();
        C9971q.m14634f(parameterAnnotations, "member.parameterAnnotations");
        return m3982R(genericParameterTypes, parameterAnnotations, mo3969Q().isVarArgs());
    }
}
