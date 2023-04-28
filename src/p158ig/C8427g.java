package p158ig;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11388u0;
import p268og.AbstractC11397y;
import p324rg.C12618l;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lig/g;", "Lrg/l;", "Lig/l;", "", "Log/y;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lig/l;", "Log/u0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lig/l;", "Lig/p;", "a", "Lig/p;", "container", "<init>", "(Lig/p;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.g */
/* loaded from: classes8.dex */
public class C8427g extends C12618l<AbstractC8453l<?>, Unit> {

    /* renamed from: a */
    private final AbstractC8494p f18377a;

    public C8427g(AbstractC8494p container) {
        C9971q.m14633g(container, "container");
        this.f18377a = container;
    }

    /* renamed from: p */
    public AbstractC8453l<?> mo6314k(AbstractC11397y descriptor, Unit data) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(data, "data");
        return new C8505q(this.f18377a, descriptor);
    }

    /* renamed from: q */
    public AbstractC8453l<?> mo7601i(AbstractC11388u0 descriptor, Unit data) {
        int i;
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(data, "data");
        int i2 = 0;
        if (descriptor.mo6266J() != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (descriptor.mo6264M() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        if (descriptor.mo6277L()) {
            if (i3 == 0) {
                return new C8510r(this.f18377a, descriptor);
            }
            if (i3 == 1) {
                return new C8513s(this.f18377a, descriptor);
            }
            if (i3 == 2) {
                return new C8516t(this.f18377a, descriptor);
            }
        } else if (i3 == 0) {
            return new C8530x(this.f18377a, descriptor);
        } else {
            if (i3 == 1) {
                return new C8534y(this.f18377a, descriptor);
            }
            if (i3 == 2) {
                return new C8538z(this.f18377a, descriptor);
            }
        }
        throw new C8430h0("Unsupported property: " + descriptor);
    }
}
