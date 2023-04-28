package sa;

import java.util.AbstractMap;

/* renamed from: sa.c */
/* loaded from: classes3.dex */
final class C12831c extends AbstractC12830b0 {

    /* renamed from: m */
    final /* synthetic */ C12833d f28900m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12831c(C12833d dVar) {
        this.f28900m = dVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f28900m.f28906o;
        C12853t.m5265a(i, i2, "index");
        C12833d dVar = this.f28900m;
        objArr = dVar.f28905n;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = dVar.f28905n;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // sa.AbstractC12858y
    /* renamed from: i */
    public final boolean mo5252i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f28900m.f28906o;
        return i;
    }
}
