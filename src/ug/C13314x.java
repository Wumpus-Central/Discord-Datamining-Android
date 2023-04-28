package ug;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6885a;
import p086eh.AbstractC6910v;
import p217lg.EnumC10426i;
import p407wh.EnumC13886e;

/* renamed from: ug.x */
/* loaded from: classes8.dex */
public final class C13314x extends AbstractC13316z implements AbstractC6910v {

    /* renamed from: b */
    private final Class<?> f29856b;

    /* renamed from: c */
    private final Collection<AbstractC6885a> f29857c;

    /* renamed from: d */
    private final boolean f29858d;

    public C13314x(Class<?> reflectType) {
        List i;
        C9971q.m14633g(reflectType, "reflectType");
        this.f29856b = reflectType;
        i = C9906j.m14820i();
        this.f29857c = i;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return this.f29858d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public Class<?> mo3967P() {
        return this.f29856b;
    }

    @Override // p086eh.AbstractC6891d
    public Collection<AbstractC6885a> getAnnotations() {
        return this.f29857c;
    }

    @Override // p086eh.AbstractC6910v
    public EnumC10426i getType() {
        if (C9971q.m14638b(mo3967P(), Void.TYPE)) {
            return null;
        }
        return EnumC13886e.m2394b(mo3967P().getName()).m2390f();
    }
}
