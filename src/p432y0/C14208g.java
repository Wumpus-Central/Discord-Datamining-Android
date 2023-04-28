package p432y0;

import p432y0.C14206f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0.g */
/* loaded from: classes.dex */
public class C14208g extends C14206f {

    /* renamed from: m */
    public int f32096m;

    public C14208g(AbstractC14216m mVar) {
        super(mVar);
        if (mVar instanceof C14211j) {
            this.f32079e = C14206f.EnumC14207a.HORIZONTAL_DIMENSION;
        } else {
            this.f32079e = C14206f.EnumC14207a.VERTICAL_DIMENSION;
        }
    }

    @Override // p432y0.C14206f
    /* renamed from: d */
    public void mo1376d(int i) {
        if (!this.f32084j) {
            this.f32084j = true;
            this.f32081g = i;
            for (AbstractC14204d dVar : this.f32085k) {
                dVar.mo1366a(dVar);
            }
        }
    }
}
