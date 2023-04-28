package p163j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.w */
/* loaded from: classes2.dex */
final class C9445w extends C9248P {

    /* renamed from: f */
    final /* synthetic */ SortedSet f20801f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9445w(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f20801f = sortedSet;
    }

    @Override // p163j$.util.C9248P, p163j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f20801f.comparator();
    }
}
