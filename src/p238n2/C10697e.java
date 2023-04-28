package p238n2;

import android.graphics.PointF;
import java.util.List;
import p188k2.AbstractC9721a;
import p188k2.C9736j;
import p188k2.C9737k;
import p358u2.C13178a;

/* renamed from: n2.e */
/* loaded from: classes.dex */
public class C10697e implements AbstractC10705m<PointF, PointF> {

    /* renamed from: a */
    private final List<C13178a<PointF>> f23660a;

    public C10697e(List<C13178a<PointF>> list) {
        this.f23660a = list;
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: a */
    public AbstractC9721a<PointF, PointF> mo12624a() {
        if (this.f23660a.get(0).m4412h()) {
            return new C9737k(this.f23660a);
        }
        return new C9736j(this.f23660a);
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: b */
    public List<C13178a<PointF>> mo12623b() {
        return this.f23660a;
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: f */
    public boolean mo12622f() {
        return this.f23660a.size() == 1 && this.f23660a.get(0).m4412h();
    }
}
