package bj;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\u001c\u0010\b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014J$\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J3\u0010\u0010\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m15073d2 = {"Lbj/j0;", "E", "Lbj/t;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "q", "", "r", "v", "u", "size", "", "s", "index", "element", "t", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.j0 */
/* loaded from: classes8.dex */
public final class C3663j0<E> extends AbstractC3700t<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b */
    private final SerialDescriptor f5979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663j0(KSerializer<E> eSerializer) {
        super(eSerializer);
        C9971q.m14633g(eSerializer, "eSerializer");
        this.f5979b = new C3658i0(eSerializer.getDescriptor());
    }

    @Override // bj.AbstractC3697s, kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f5979b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public HashSet<E> mo33780a() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public int mo33779b(HashSet<E> hashSet) {
        C9971q.m14633g(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void mo33778c(HashSet<E> hashSet, int i) {
        C9971q.m14633g(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33775n(HashSet<E> hashSet, int i, E e) {
        C9971q.m14633g(hashSet, "<this>");
        hashSet.add(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public HashSet<E> mo13774k(Set<? extends E> set) {
        HashSet<E> hashSet;
        C9971q.m14633g(set, "<this>");
        if (set instanceof HashSet) {
            hashSet = (HashSet) set;
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            return new HashSet<>(set);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Set<E> mo33776l(HashSet<E> hashSet) {
        C9971q.m14633g(hashSet, "<this>");
        return hashSet;
    }
}
