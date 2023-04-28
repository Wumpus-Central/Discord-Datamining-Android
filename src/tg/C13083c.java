package tg;

import gh.AbstractC7637r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import ng.C11105c;
import p217lg.C10434k;
import p217lg.EnumC10426i;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p249nh.C11144h;
import p407wh.EnumC13886e;
import p446yf.C14376a;
import th.C13103f;
import ug.C13283d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tg.c */
/* loaded from: classes8.dex */
public final class C13083c {

    /* renamed from: a */
    public static final C13083c f29391a = new C13083c();

    private C13083c() {
    }

    /* renamed from: a */
    private final C13103f m4643a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C9971q.m14634f(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C11136b a = C13283d.m4053a(cls);
            C11105c cVar = C11105c.f24626a;
            C11137c b = a.m10816b();
            C9971q.m14634f(b, "javaClassId.asSingleFqName()");
            C11136b m = cVar.m10897m(b);
            if (m != null) {
                a = m;
            }
            return new C13103f(a, i);
        } else if (C9971q.m14638b(cls, Void.TYPE)) {
            C11136b m2 = C11136b.m10805m(C10434k.C10435a.f22910f.m10782l());
            C9971q.m14634f(m2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new C13103f(m2, i);
        } else {
            EnumC10426i f = EnumC13886e.m2394b(cls.getName()).m2390f();
            C9971q.m14634f(f, "get(currentClass.name).primitiveType");
            if (i > 0) {
                C11136b m3 = C11136b.m10805m(f.m13346b());
                C9971q.m14634f(m3, "topLevel(primitiveType.arrayTypeFqName)");
                return new C13103f(m3, i - 1);
            }
            C11136b m4 = C11136b.m10805m(f.m13344d());
            C9971q.m14634f(m4, "topLevel(primitiveType.typeFqName)");
            return new C13103f(m4, i);
        }
    }

    /* renamed from: c */
    private final void m4641c(Class<?> cls, AbstractC7637r.AbstractC7641d dVar) {
        int i;
        Constructor<?>[] constructorArr;
        boolean z;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C9971q.m14634f(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            C11142f fVar = C11144h.f24742j;
            C13096m mVar = C13096m.f29405a;
            C9971q.m14634f(constructor, "constructor");
            AbstractC7637r.AbstractC7642e a = dVar.mo21817a(fVar, mVar.m4609a(constructor));
            if (a == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                C9971q.m14634f(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9971q.m14634f(annotation, "annotation");
                    m4638f(a, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C9971q.m14634f(parameterAnnotations, "parameterAnnotations");
                if (parameterAnnotations.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotations = parameterAnnotations[i3];
                        C9971q.m14634f(annotations, "annotations");
                        int length4 = annotations.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotations[i4];
                            Class<?> b = C14376a.m737b(C14376a.m738a(annotation2));
                            C11136b a2 = C13283d.m4053a(b);
                            C9971q.m14634f(annotation2, "annotation");
                            AbstractC7637r.AbstractC7638a c = a.mo21815c(i3 + length2, a2, new C13082b(annotation2));
                            if (c != null) {
                                f29391a.m4636h(c, annotation2, b);
                            }
                            i4++;
                            declaredConstructors = declaredConstructors;
                            length = length;
                            length2 = length2;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                a.mo15156a();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: d */
    private final void m4640d(Class<?> cls, AbstractC7637r.AbstractC7641d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        C9971q.m14634f(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C11142f f = C11142f.m10767f(field.getName());
            C9971q.m14634f(f, "identifier(field.name)");
            C13096m mVar = C13096m.f29405a;
            C9971q.m14634f(field, "field");
            AbstractC7637r.AbstractC7640c b = dVar.mo21816b(f, mVar.m4608b(field), null);
            if (b != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                C9971q.m14634f(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9971q.m14634f(annotation, "annotation");
                    m4638f(b, annotation);
                }
                b.mo15156a();
            }
        }
    }

    /* renamed from: e */
    private final void m4639e(Class<?> cls, AbstractC7637r.AbstractC7641d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9971q.m14634f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C11142f f = C11142f.m10767f(method.getName());
            C9971q.m14634f(f, "identifier(method.name)");
            C13096m mVar = C13096m.f29405a;
            C9971q.m14634f(method, "method");
            AbstractC7637r.AbstractC7642e a = dVar.mo21817a(f, mVar.m4607c(method));
            if (a == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                C9971q.m14634f(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    C9971q.m14634f(annotation, "annotation");
                    m4638f(a, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C9971q.m14634f(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotations = annotationArr[i2];
                    C9971q.m14634f(annotations, "annotations");
                    int length3 = annotations.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotations[i3];
                        Class<?> b = C14376a.m737b(C14376a.m738a(annotation2));
                        C11136b a2 = C13283d.m4053a(b);
                        C9971q.m14634f(annotation2, "annotation");
                        AbstractC7637r.AbstractC7638a c = a.mo21815c(i2, a2, new C13082b(annotation2));
                        if (c != null) {
                            f29391a.m4636h(c, annotation2, b);
                        }
                        i3++;
                        declaredMethods = declaredMethods;
                    }
                }
                methodArr = declaredMethods;
                a.mo15156a();
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: f */
    private final void m4638f(AbstractC7637r.AbstractC7640c cVar, Annotation annotation) {
        Class<?> b = C14376a.m737b(C14376a.m738a(annotation));
        AbstractC7637r.AbstractC7638a b2 = cVar.mo15155b(C13283d.m4053a(b), new C13082b(annotation));
        if (b2 != null) {
            f29391a.m4636h(b2, annotation, b);
        }
    }

    /* renamed from: g */
    private final void m4637g(AbstractC7637r.AbstractC7638a aVar, C11142f fVar, Object obj) {
        Set set;
        Object h0;
        Class<?> cls = obj.getClass();
        if (C9971q.m14638b(cls, Class.class)) {
            C9971q.m14635e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.mo20800e(fVar, m4643a((Class) obj));
            return;
        }
        set = C13090i.f29398a;
        if (set.contains(cls)) {
            aVar.mo20799f(fVar, obj);
        } else if (C13283d.m4046h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C9971q.m14634f(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            C11136b a = C13283d.m4053a(cls);
            C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C11142f f = C11142f.m10767f(((Enum) obj).name());
            C9971q.m14634f(f, "identifier((value as Enum<*>).name)");
            aVar.mo20802c(fVar, a, f);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            C9971q.m14634f(interfaces, "clazz.interfaces");
            h0 = C9899f.m14929h0(interfaces);
            Class<?> annotationClass = (Class) h0;
            C9971q.m14634f(annotationClass, "annotationClass");
            AbstractC7637r.AbstractC7638a d = aVar.mo20801d(fVar, C13283d.m4053a(annotationClass));
            if (d != null) {
                C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Annotation");
                m4636h(d, (Annotation) obj, annotationClass);
            }
        } else if (cls.isArray()) {
            AbstractC7637r.AbstractC7639b b = aVar.mo20803b(fVar);
            if (b != null) {
                Class<?> componentType = cls.getComponentType();
                int i = 0;
                if (componentType.isEnum()) {
                    C9971q.m14634f(componentType, "componentType");
                    C11136b a2 = C13283d.m4053a(componentType);
                    C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        C9971q.m14635e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                        C11142f f2 = C11142f.m10767f(((Enum) obj2).name());
                        C9971q.m14634f(f2, "identifier((element as Enum<*>).name)");
                        b.mo20815d(a2, f2);
                        i++;
                    }
                } else if (C9971q.m14638b(componentType, Class.class)) {
                    C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        Object obj3 = objArr2[i];
                        C9971q.m14635e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                        b.mo20817b(m4643a((Class) obj3));
                        i++;
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        Object obj4 = objArr3[i];
                        C9971q.m14634f(componentType, "componentType");
                        AbstractC7637r.AbstractC7638a c = b.mo20816c(C13283d.m4053a(componentType));
                        if (c != null) {
                            C9971q.m14635e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                            m4636h(c, (Annotation) obj4, componentType);
                        }
                        i++;
                    }
                } else {
                    C9971q.m14635e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i < length4) {
                        b.mo20814e(objArr4[i]);
                        i++;
                    }
                }
                b.mo20818a();
            }
        } else {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        }
    }

    /* renamed from: h */
    private final void m4636h(AbstractC7637r.AbstractC7638a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C9971q.m14634f(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C9971q.m14636d(invoke);
                C11142f f = C11142f.m10767f(method.getName());
                C9971q.m14634f(f, "identifier(method.name)");
                m4637g(aVar, f, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo20804a();
    }

    /* renamed from: b */
    public final void m4642b(Class<?> klass, AbstractC7637r.AbstractC7640c visitor) {
        C9971q.m14633g(klass, "klass");
        C9971q.m14633g(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        C9971q.m14634f(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            C9971q.m14634f(annotation, "annotation");
            m4638f(visitor, annotation);
        }
        visitor.mo15156a();
    }

    /* renamed from: i */
    public final void m4635i(Class<?> klass, AbstractC7637r.AbstractC7641d memberVisitor) {
        C9971q.m14633g(klass, "klass");
        C9971q.m14633g(memberVisitor, "memberVisitor");
        m4639e(klass, memberVisitor);
        m4641c(klass, memberVisitor);
        m4640d(klass, memberVisitor);
    }
}
