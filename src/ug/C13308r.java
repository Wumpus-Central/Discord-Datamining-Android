package ug;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6902n;
import ug.AbstractC13316z;

/* renamed from: ug.r */
/* loaded from: classes8.dex */
public final class C13308r extends AbstractC13310t implements AbstractC6902n {

    /* renamed from: a */
    private final Field f29852a;

    public C13308r(Field member) {
        C9971q.m14633g(member, "member");
        this.f29852a = member;
    }

    @Override // p086eh.AbstractC6902n
    /* renamed from: I */
    public boolean mo3988I() {
        return mo3969Q().isEnumConstant();
    }

    @Override // p086eh.AbstractC6902n
    /* renamed from: N */
    public boolean mo3987N() {
        return false;
    }

    /* renamed from: S */
    public Field mo3969Q() {
        return this.f29852a;
    }

    /* renamed from: T */
    public AbstractC13316z getType() {
        AbstractC13316z.C13317a aVar = AbstractC13316z.f29860a;
        Type genericType = mo3969Q().getGenericType();
        C9971q.m14634f(genericType, "member.genericType");
        return aVar.m3965a(genericType);
    }
}
