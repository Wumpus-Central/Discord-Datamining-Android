package p468zh;

import fi.AbstractC7267g0;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11297a;

/* renamed from: zh.c */
/* loaded from: classes8.dex */
public final class C14659c extends AbstractC14657a implements AbstractC14662f {

    /* renamed from: c */
    private final AbstractC11297a f33137c;

    /* renamed from: d */
    private final C11142f f33138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14659c(AbstractC11297a declarationDescriptor, AbstractC7267g0 receiverType, C11142f fVar, AbstractC14663g gVar) {
        super(receiverType, gVar);
        C9971q.m14633g(declarationDescriptor, "declarationDescriptor");
        C9971q.m14633g(receiverType, "receiverType");
        this.f33137c = declarationDescriptor;
        this.f33138d = fVar;
    }

    @Override // p468zh.AbstractC14662f
    /* renamed from: a */
    public C11142f mo47a() {
        return this.f33138d;
    }

    /* renamed from: d */
    public AbstractC11297a m50d() {
        return this.f33137c;
    }

    public String toString() {
        return "Cxt { " + m50d() + " }";
    }
}
