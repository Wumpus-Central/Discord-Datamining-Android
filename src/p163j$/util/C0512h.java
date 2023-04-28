package p163j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.h */
/* loaded from: classes2.dex */
public final class C0512h {

    /* renamed from: b */
    private static final C0512h f20428b = new C0512h();

    /* renamed from: a */
    private final Object f20429a;

    private C0512h() {
        this.f20429a = null;
    }

    private C0512h(Object obj) {
        obj.getClass();
        this.f20429a = obj;
    }

    /* renamed from: a */
    public static C0512h m16509a() {
        return f20428b;
    }

    /* renamed from: d */
    public static C0512h m16506d(Object obj) {
        return new C0512h(obj);
    }

    /* renamed from: b */
    public final Object m16508b() {
        Object obj = this.f20429a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m16507c() {
        return this.f20429a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0512h)) {
            return false;
        }
        return AbstractC0518n.m16483k(this.f20429a, ((C0512h) obj).f20429a);
    }

    public final int hashCode() {
        Object obj = this.f20429a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f20429a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
