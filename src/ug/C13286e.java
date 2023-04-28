package ug;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6887b;
import p249nh.C11136b;
import p249nh.C11142f;
import p446yf.C14376a;
import ug.AbstractC13287f;

/* renamed from: ug.e */
/* loaded from: classes8.dex */
public final class C13286e extends AbstractC13306p implements AbstractC6885a {

    /* renamed from: a */
    private final Annotation f29829a;

    public C13286e(Annotation annotation) {
        C9971q.m14633g(annotation, "annotation");
        this.f29829a = annotation;
    }

    @Override // p086eh.AbstractC6885a
    /* renamed from: G */
    public boolean mo4043G() {
        return false;
    }

    /* renamed from: P */
    public final Annotation m4042P() {
        return this.f29829a;
    }

    /* renamed from: Q */
    public C13294l mo4037t() {
        return new C13294l(C14376a.m737b(C14376a.m738a(this.f29829a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13286e) && this.f29829a == ((C13286e) obj).f29829a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f29829a);
    }

    @Override // p086eh.AbstractC6885a
    /* renamed from: j */
    public Collection<AbstractC6887b> mo4040j() {
        Method[] declaredMethods = C14376a.m737b(C14376a.m738a(this.f29829a)).getDeclaredMethods();
        C9971q.m14634f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC13287f.C13288a aVar = AbstractC13287f.f29830b;
            Object invoke = method.invoke(this.f29829a, new Object[0]);
            C9971q.m14634f(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.m4036a(invoke, C11142f.m10767f(method.getName())));
        }
        return arrayList;
    }

    @Override // p086eh.AbstractC6885a
    /* renamed from: k */
    public C11136b mo4039k() {
        return C13283d.m4053a(C14376a.m737b(C14376a.m738a(this.f29829a)));
    }

    @Override // p086eh.AbstractC6885a
    /* renamed from: n */
    public boolean mo4038n() {
        return false;
    }

    public String toString() {
        return C13286e.class.getName() + ": " + this.f29829a;
    }
}
