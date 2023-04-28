package ug;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6912x;
import p249nh.C11136b;
import p249nh.C11137c;

/* renamed from: ug.z */
/* loaded from: classes8.dex */
public abstract class AbstractC13316z implements AbstractC6912x {

    /* renamed from: a */
    public static final C13317a f29860a = new C13317a(null);

    /* renamed from: ug.z$a */
    /* loaded from: classes8.dex */
    public static final class C13317a {
        private C13317a() {
        }

        public /* synthetic */ C13317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13316z m3965a(Type type) {
            AbstractC13316z zVar;
            C9971q.m14633g(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C13314x(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                zVar = new C13293k(type);
            } else if (type instanceof WildcardType) {
                zVar = new C13282c0((WildcardType) type);
            } else {
                zVar = new C13304n(type);
            }
            return zVar;
        }
    }

    /* renamed from: P */
    protected abstract Type mo3967P();

    @Override // p086eh.AbstractC6891d
    /* renamed from: c */
    public AbstractC6885a mo3966c(C11137c fqName) {
        Object obj;
        C9971q.m14633g(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C11136b k = ((AbstractC6885a) next).mo4039k();
            if (k != null) {
                obj = k.m10816b();
            }
            if (C9971q.m14638b(obj, fqName)) {
                obj = next;
                break;
            }
        }
        return (AbstractC6885a) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13316z) && C9971q.m14638b(mo3967P(), ((AbstractC13316z) obj).mo3967P());
    }

    public int hashCode() {
        return mo3967P().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo3967P();
    }
}
