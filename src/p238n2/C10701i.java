package p238n2;

import android.graphics.PointF;
import java.util.List;
import p188k2.AbstractC9721a;
import p188k2.C9740n;
import p358u2.C13178a;

/* renamed from: n2.i */
/* loaded from: classes.dex */
public class C10701i implements AbstractC10705m<PointF, PointF> {

    /* renamed from: a */
    private final C10694b f23661a;

    /* renamed from: b */
    private final C10694b f23662b;

    public C10701i(C10694b bVar, C10694b bVar2) {
        this.f23661a = bVar;
        this.f23662b = bVar2;
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: a */
    public AbstractC9721a<PointF, PointF> mo12624a() {
        return new C9740n(this.f23661a.mo12624a(), this.f23662b.mo12624a());
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: b */
    public List<C13178a<PointF>> mo12623b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p238n2.AbstractC10705m
    /* renamed from: f */
    public boolean mo12622f() {
        return this.f23661a.mo12622f() && this.f23662b.mo12622f();
    }
}
