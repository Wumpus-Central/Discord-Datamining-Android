package ug;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6911w;
import p086eh.AbstractC6912x;

/* renamed from: ug.y */
/* loaded from: classes8.dex */
public final class C13315y extends AbstractC13310t implements AbstractC6911w {

    /* renamed from: a */
    private final Object f29859a;

    public C13315y(Object recordComponent) {
        C9971q.m14633g(recordComponent, "recordComponent");
        this.f29859a = recordComponent;
    }

    @Override // ug.AbstractC13310t
    /* renamed from: Q */
    public Member mo3969Q() {
        Method c = C13275a.f29801a.m4078c(this.f29859a);
        if (c != null) {
            return c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // p086eh.AbstractC6911w
    /* renamed from: a */
    public boolean mo3968a() {
        return false;
    }

    @Override // p086eh.AbstractC6911w
    public AbstractC6912x getType() {
        Class<?> d = C13275a.f29801a.m4077d(this.f29859a);
        if (d != null) {
            return new C13304n(d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
