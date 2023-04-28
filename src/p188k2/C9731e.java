package p188k2;

import java.util.List;
import p254o2.C11171d;
import p358u2.C13178a;

/* renamed from: k2.e */
/* loaded from: classes.dex */
public class C9731e extends AbstractC9733g<C11171d> {

    /* renamed from: i */
    private final C11171d f21629i;

    public C9731e(List<C13178a<C11171d>> list) {
        super(list);
        int i = 0;
        C11171d dVar = list.get(0).f29540b;
        i = dVar != null ? dVar.m10612c() : i;
        this.f21629i = new C11171d(new float[i], new int[i]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C11171d mo15448i(C13178a<C11171d> aVar, float f) {
        this.f21629i.m10611d(aVar.f29540b, aVar.f29541c, f);
        return this.f21629i;
    }
}
