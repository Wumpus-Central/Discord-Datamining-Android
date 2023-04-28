package p398w7;

import android.net.Uri;
import java.util.Map;
import p117g7.C7429c;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10533x;
import p398w7.AbstractC13772i0;

/* renamed from: w7.e */
/* loaded from: classes7.dex */
public final class C13760e implements AbstractC10514i {

    /* renamed from: d */
    public static final AbstractC10521o f30758d = new AbstractC10521o() { // from class: w7.d
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] f;
            f = C13760e.m2793f();
            return f;
        }
    };

    /* renamed from: a */
    private final C13763f f30759a = new C13763f();

    /* renamed from: b */
    private final C7570y f30760b = new C7570y((int) Spliterator.SUBSIZED);

    /* renamed from: c */
    private boolean f30761c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ AbstractC10514i[] m2793f() {
        return new AbstractC10514i[]{new C13760e()};
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f30761c = false;
        this.f30759a.mo2658c();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f30759a.mo2657d(kVar, new AbstractC13772i0.C13776d(0, 1));
        kVar.mo7935s();
        kVar.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        C7570y yVar = new C7570y(10);
        int i = 0;
        while (true) {
            jVar.mo12930n(yVar.m22012d(), 0, 10);
            yVar.m22017P(0);
            if (yVar.m22026G() != 4801587) {
                break;
            }
            yVar.m22016Q(3);
            int C = yVar.m22030C();
            i += C + 10;
            jVar.mo12934i(C);
        }
        jVar.mo12936f();
        jVar.mo12934i(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            jVar.mo12930n(yVar.m22012d(), 0, 7);
            yVar.m22017P(0);
            int J = yVar.m22023J();
            if (J == 44096 || J == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int e = C7429c.m22683e(yVar.m22012d(), J);
                if (e == -1) {
                    return false;
                }
                jVar.mo12934i(e - 7);
            } else {
                jVar.mo12936f();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                jVar.mo12934i(i3);
                i2 = 0;
            }
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        int read = jVar.read(this.f30760b.m22012d(), 0, Spliterator.SUBSIZED);
        if (read == -1) {
            return -1;
        }
        this.f30760b.m22017P(0);
        this.f30760b.m22018O(read);
        if (!this.f30761c) {
            this.f30759a.mo2655f(0L, 4);
            this.f30761c = true;
        }
        this.f30759a.mo2659b(this.f30760b);
        return 0;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
