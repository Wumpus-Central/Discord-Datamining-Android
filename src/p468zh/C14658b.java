package p468zh;

import fi.AbstractC7267g0;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11313e;

/* renamed from: zh.b */
/* loaded from: classes8.dex */
public final class C14658b extends AbstractC14657a implements AbstractC14662f {

    /* renamed from: c */
    private final AbstractC11313e f33135c;

    /* renamed from: d */
    private final C11142f f33136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14658b(AbstractC11313e classDescriptor, AbstractC7267g0 receiverType, C11142f fVar, AbstractC14663g gVar) {
        super(receiverType, gVar);
        C9971q.m14633g(classDescriptor, "classDescriptor");
        C9971q.m14633g(receiverType, "receiverType");
        this.f33135c = classDescriptor;
        this.f33136d = fVar;
    }

    @Override // p468zh.AbstractC14662f
    /* renamed from: a */
    public C11142f mo47a() {
        return this.f33136d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f33135c + " }";
    }
}
