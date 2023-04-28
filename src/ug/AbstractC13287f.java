package ug;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086eh.AbstractC6887b;
import p249nh.C11142f;

/* renamed from: ug.f */
/* loaded from: classes8.dex */
public abstract class AbstractC13287f implements AbstractC6887b {

    /* renamed from: b */
    public static final C13288a f29830b = new C13288a(null);

    /* renamed from: a */
    private final C11142f f29831a;

    /* renamed from: ug.f$a */
    /* loaded from: classes8.dex */
    public static final class C13288a {
        private C13288a() {
        }

        public /* synthetic */ C13288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13287f m4036a(Object value, C11142f fVar) {
            C9971q.m14633g(value, "value");
            if (C13283d.m4046h(value.getClass())) {
                return new C13307q(fVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new C13289g(fVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new C13292j(fVar, (Object[]) value);
            }
            if (value instanceof Class) {
                return new C13303m(fVar, (Class) value);
            }
            return new C13309s(fVar, value);
        }
    }

    private AbstractC13287f(C11142f fVar) {
        this.f29831a = fVar;
    }

    public /* synthetic */ AbstractC13287f(C11142f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // p086eh.AbstractC6887b
    public C11142f getName() {
        return this.f29831a;
    }
}
