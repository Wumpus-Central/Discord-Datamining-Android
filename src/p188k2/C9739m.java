package p188k2;

import android.graphics.Path;
import java.util.List;
import p167j2.AbstractC9483s;
import p254o2.C11184n;
import p343t2.C12948i;
import p358u2.C13178a;

/* renamed from: k2.m */
/* loaded from: classes.dex */
public class C9739m extends AbstractC9721a<C11184n, Path> {

    /* renamed from: i */
    private final C11184n f21641i = new C11184n();

    /* renamed from: j */
    private final Path f21642j = new Path();

    /* renamed from: k */
    private List<AbstractC9483s> f21643k;

    public C9739m(List<C13178a<C11184n>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path mo15448i(C13178a<C11184n> aVar, float f) {
        this.f21641i.m10555c(aVar.f29540b, aVar.f29541c, f);
        C11184n nVar = this.f21641i;
        List<AbstractC9483s> list = this.f21643k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVar = this.f21643k.get(size).mo16162e(nVar);
            }
        }
        C12948i.m4975h(nVar, this.f21642j);
        return this.f21642j;
    }

    /* renamed from: q */
    public void m15468q(List<AbstractC9483s> list) {
        this.f21643k = list;
    }
}
