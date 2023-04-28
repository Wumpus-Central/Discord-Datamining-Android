package ug;

import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6901m;
import p249nh.C11136b;
import p249nh.C11142f;

/* renamed from: ug.q */
/* loaded from: classes8.dex */
public final class C13307q extends AbstractC13287f implements AbstractC6901m {

    /* renamed from: c */
    private final Enum<?> f29851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13307q(C11142f fVar, Enum<?> value) {
        super(fVar, null);
        C9971q.m14633g(value, "value");
        this.f29851c = value;
    }

    @Override // p086eh.AbstractC6901m
    /* renamed from: d */
    public C11136b mo3990d() {
        Class<?> enumClass = this.f29851c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        C9971q.m14634f(enumClass, "enumClass");
        return C13283d.m4053a(enumClass);
    }

    @Override // p086eh.AbstractC6901m
    /* renamed from: e */
    public C11142f mo3989e() {
        return C11142f.m10767f(this.f29851c.name());
    }
}
