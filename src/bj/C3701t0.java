package bj;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\u001c\u0010\b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014J$\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J3\u0010\u0010\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m15073d2 = {"Lbj/t0;", "E", "Lbj/t;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "q", "", "r", "v", "u", "size", "", "s", "index", "element", "t", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.t0 */
/* loaded from: classes8.dex */
public final class C3701t0<E> extends AbstractC3700t<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b */
    private final SerialDescriptor f6017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701t0(KSerializer<E> eSerializer) {
        super(eSerializer);
        C9971q.m14633g(eSerializer, "eSerializer");
        this.f6017b = new C3698s0(eSerializer.getDescriptor());
    }

    @Override // bj.AbstractC3697s, kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f6017b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public LinkedHashSet<E> mo33780a() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public int mo33779b(LinkedHashSet<E> linkedHashSet) {
        C9971q.m14633g(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void mo33778c(LinkedHashSet<E> linkedHashSet, int i) {
        C9971q.m14633g(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33775n(LinkedHashSet<E> linkedHashSet, int i, E e) {
        C9971q.m14633g(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public LinkedHashSet<E> mo13774k(Set<? extends E> set) {
        LinkedHashSet<E> linkedHashSet;
        C9971q.m14633g(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet<>(set);
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Set<E> mo33776l(LinkedHashSet<E> linkedHashSet) {
        C9971q.m14633g(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
