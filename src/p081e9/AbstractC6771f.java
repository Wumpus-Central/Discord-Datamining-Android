package p081e9;

import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: e9.f */
/* loaded from: classes5.dex */
public abstract class AbstractC6771f implements DataSource {

    /* renamed from: a */
    private final boolean f14432a;

    /* renamed from: b */
    private final ArrayList<AbstractC6795x> f14433b = new ArrayList<>(1);

    /* renamed from: c */
    private int f14434c;

    /* renamed from: d */
    private C5288a f14435d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC6771f(boolean z) {
        this.f14432a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public final void mo12541c(AbstractC6795x xVar) {
        C7510a.m22367e(xVar);
        if (!this.f14433b.contains(xVar)) {
            this.f14433b.add(xVar);
            this.f14434c++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public /* synthetic */ Map mo12540e() {
        return C6777k.m24355a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m24360o(int i) {
        C5288a aVar = (C5288a) C7557q0.m22145j(this.f14435d);
        for (int i2 = 0; i2 < this.f14434c; i2++) {
            this.f14433b.get(i2).mo24315e(this, aVar, this.f14432a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final void m24359p() {
        C5288a aVar = (C5288a) C7557q0.m22145j(this.f14435d);
        for (int i = 0; i < this.f14434c; i++) {
            this.f14433b.get(i).mo24316b(this, aVar, this.f14432a);
        }
        this.f14435d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m24358q(C5288a aVar) {
        for (int i = 0; i < this.f14434c; i++) {
            this.f14433b.get(i).mo24313h(this, aVar, this.f14432a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m24357r(C5288a aVar) {
        this.f14435d = aVar;
        for (int i = 0; i < this.f14434c; i++) {
            this.f14433b.get(i).mo24314f(this, aVar, this.f14432a);
        }
    }
}
