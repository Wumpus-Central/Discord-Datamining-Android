package p244n8;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import cc.AbstractC3884i0;
import cc.C3976z0;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p029b9.AbstractC3402c;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p081e9.AbstractC6795x;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7548n0;
import p119g9.C7557q0;
import p153i8.C8232b;
import p153i8.C8302u0;
import p163j$.util.Spliterator;
import p194k8.AbstractC9823b;
import p194k8.AbstractC9827e;
import p194k8.AbstractC9836k;
import p194k8.AbstractC9838m;
import p194k8.AbstractC9839n;
import p260o8.AbstractC11232k;
import p260o8.C11220g;

/* renamed from: n8.f */
/* loaded from: classes7.dex */
class C10732f {

    /* renamed from: a */
    private final AbstractC10739h f23798a;

    /* renamed from: b */
    private final DataSource f23799b;

    /* renamed from: c */
    private final DataSource f23800c;

    /* renamed from: d */
    private final C10758t f23801d;

    /* renamed from: e */
    private final Uri[] f23802e;

    /* renamed from: f */
    private final C6722k[] f23803f;

    /* renamed from: g */
    private final AbstractC11232k f23804g;

    /* renamed from: h */
    private final C8302u0 f23805h;

    /* renamed from: i */
    private final List<C6722k> f23806i;

    /* renamed from: k */
    private boolean f23808k;

    /* renamed from: m */
    private IOException f23810m;

    /* renamed from: n */
    private Uri f23811n;

    /* renamed from: o */
    private boolean f23812o;

    /* renamed from: p */
    private AbstractC3415h f23813p;

    /* renamed from: r */
    private boolean f23815r;

    /* renamed from: j */
    private final C10730e f23807j = new C10730e(4);

    /* renamed from: l */
    private byte[] f23809l = C7557q0.f16373f;

    /* renamed from: q */
    private long f23814q = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n8.f$a */
    /* loaded from: classes7.dex */
    public static final class C10733a extends AbstractC9836k {

        /* renamed from: l */
        private byte[] f23816l;

        public C10733a(DataSource dataSource, C5288a aVar, C6722k kVar, int i, Object obj, byte[] bArr) {
            super(dataSource, aVar, 3, kVar, i, obj, bArr);
        }

        @Override // p194k8.AbstractC9836k
        /* renamed from: g */
        protected void mo12506g(byte[] bArr, int i) {
            this.f23816l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: j */
        public byte[] m12505j() {
            return this.f23816l;
        }
    }

    /* renamed from: n8.f$b */
    /* loaded from: classes7.dex */
    public static final class C10734b {

        /* renamed from: a */
        public AbstractC9827e f23817a;

        /* renamed from: b */
        public boolean f23818b;

        /* renamed from: c */
        public Uri f23819c;

        public C10734b() {
            m12504a();
        }

        /* renamed from: a */
        public void m12504a() {
            this.f23817a = null;
            this.f23818b = false;
            this.f23819c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n8.f$c */
    /* loaded from: classes7.dex */
    public static final class C10735c extends AbstractC9823b {

        /* renamed from: e */
        private final List<C11220g.C11225e> f23820e;

        /* renamed from: f */
        private final long f23821f;

        /* renamed from: g */
        private final String f23822g;

        public C10735c(String str, long j, List<C11220g.C11225e> list) {
            super(0L, list.size() - 1);
            this.f23822g = str;
            this.f23821f = j;
            this.f23820e = list;
        }
    }

    /* renamed from: n8.f$d */
    /* loaded from: classes7.dex */
    private static final class C10736d extends AbstractC3402c {

        /* renamed from: g */
        private int f23823g;

        public C10736d(C8302u0 u0Var, int[] iArr) {
            super(u0Var, iArr);
            this.f23823g = mo34410l(u0Var.m19990a(iArr[0]));
        }

        @Override // p029b9.AbstractC3415h
        /* renamed from: a */
        public int mo12503a() {
            return this.f23823g;
        }

        @Override // p029b9.AbstractC3415h
        /* renamed from: e */
        public void mo12502e(long j, long j2, long j3, List<? extends AbstractC9838m> list, AbstractC9839n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (m34501t(this.f23823g, elapsedRealtime)) {
                for (int i = this.f5458b - 1; i >= 0; i--) {
                    if (!m34501t(i, elapsedRealtime)) {
                        this.f23823g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p029b9.AbstractC3415h
        /* renamed from: g */
        public Object mo12501g() {
            return null;
        }

        @Override // p029b9.AbstractC3415h
        /* renamed from: q */
        public int mo12500q() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n8.f$e */
    /* loaded from: classes7.dex */
    public static final class C10737e {

        /* renamed from: a */
        public final C11220g.C11225e f23824a;

        /* renamed from: b */
        public final long f23825b;

        /* renamed from: c */
        public final int f23826c;

        /* renamed from: d */
        public final boolean f23827d;

        public C10737e(C11220g.C11225e eVar, long j, int i) {
            boolean z;
            this.f23824a = eVar;
            this.f23825b = j;
            this.f23826c = i;
            if (!(eVar instanceof C11220g.C11222b) || !((C11220g.C11222b) eVar).f25080w) {
                z = false;
            } else {
                z = true;
            }
            this.f23827d = z;
        }
    }

    public C10732f(AbstractC10739h hVar, AbstractC11232k kVar, Uri[] uriArr, C6722k[] kVarArr, AbstractC10738g gVar, AbstractC6795x xVar, C10758t tVar, List<C6722k> list) {
        this.f23798a = hVar;
        this.f23804g = kVar;
        this.f23802e = uriArr;
        this.f23803f = kVarArr;
        this.f23801d = tVar;
        this.f23806i = list;
        DataSource a = gVar.mo12499a(1);
        this.f23799b = a;
        if (xVar != null) {
            a.mo12541c(xVar);
        }
        this.f23800c = gVar.mo12499a(3);
        this.f23805h = new C8302u0(kVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((kVarArr[i].f14322o & Spliterator.SUBSIZED) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f23813p = new C10736d(this.f23805h, C7115d.m23358j(arrayList));
    }

    /* renamed from: c */
    private static Uri m12525c(C11220g gVar, C11220g.C11225e eVar) {
        String str;
        if (eVar == null || (str = eVar.f25092q) == null) {
            return null;
        }
        return C7548n0.m22233d(gVar.f25102a, str);
    }

    /* renamed from: e */
    private Pair<Long, Integer> m12523e(C10740i iVar, boolean z, C11220g gVar, long j, long j2) {
        boolean z2;
        List<C11220g.C11222b> list;
        long j3;
        long j4;
        int i = -1;
        if (iVar == null || z) {
            long j5 = gVar.f25077s + j;
            if (iVar != null && !this.f23812o) {
                j2 = iVar.f21893g;
            }
            if (!gVar.f25071m && j2 >= j5) {
                return new Pair<>(Long.valueOf(gVar.f25067i + gVar.f25074p.size()), -1);
            }
            long j6 = j2 - j;
            List<C11220g.C11224d> list2 = gVar.f25074p;
            Long valueOf = Long.valueOf(j6);
            int i2 = 0;
            if (!this.f23804g.mo10379h() || iVar == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int g = C7557q0.m22151g(list2, valueOf, true, z2);
            long j7 = g + gVar.f25067i;
            if (g >= 0) {
                C11220g.C11224d dVar = gVar.f25074p.get(g);
                if (j6 < dVar.f25090o + dVar.f25088m) {
                    list = dVar.f25085w;
                } else {
                    list = gVar.f25075q;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    C11220g.C11222b bVar = list.get(i2);
                    if (j6 >= bVar.f25090o + bVar.f25088m) {
                        i2++;
                    } else if (bVar.f25079v) {
                        if (list == gVar.f25075q) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        j7 += j3;
                        i = i2;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j7), Integer.valueOf(i));
        } else if (!iVar.mo12495h()) {
            return new Pair<>(Long.valueOf(iVar.f21931j), Integer.valueOf(iVar.f23833o));
        } else {
            if (iVar.f23833o == -1) {
                j4 = iVar.mo15205g();
            } else {
                j4 = iVar.f21931j;
            }
            Long valueOf2 = Long.valueOf(j4);
            int i3 = iVar.f23833o;
            if (i3 != -1) {
                i = i3 + 1;
            }
            return new Pair<>(valueOf2, Integer.valueOf(i));
        }
    }

    /* renamed from: f */
    private static C10737e m12522f(C11220g gVar, long j, int i) {
        int i2 = (int) (j - gVar.f25067i);
        if (i2 == gVar.f25074p.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < gVar.f25075q.size()) {
                return new C10737e(gVar.f25075q.get(i), j, i);
            }
            return null;
        }
        C11220g.C11224d dVar = gVar.f25074p.get(i2);
        if (i == -1) {
            return new C10737e(dVar, j, -1);
        }
        if (i < dVar.f25085w.size()) {
            return new C10737e(dVar.f25085w.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < gVar.f25074p.size()) {
            return new C10737e(gVar.f25074p.get(i3), j + 1, -1);
        }
        if (!gVar.f25075q.isEmpty()) {
            return new C10737e(gVar.f25075q.get(0), j + 1, 0);
        }
        return null;
    }

    /* renamed from: h */
    static List<C11220g.C11225e> m12520h(C11220g gVar, long j, int i) {
        int i2 = (int) (j - gVar.f25067i);
        if (i2 < 0 || gVar.f25074p.size() < i2) {
            return AbstractC3884i0.m33399x();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (i2 < gVar.f25074p.size()) {
            if (i != -1) {
                C11220g.C11224d dVar = gVar.f25074p.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.f25085w.size()) {
                    List<C11220g.C11222b> list = dVar.f25085w;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List<C11220g.C11224d> list2 = gVar.f25074p;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (gVar.f25070l != -9223372036854775807L) {
            if (i != -1) {
                i3 = i;
            }
            if (i3 < gVar.f25075q.size()) {
                List<C11220g.C11222b> list3 = gVar.f25075q;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: k */
    private AbstractC9827e m12517k(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] c = this.f23807j.m12528c(uri);
        if (c != null) {
            this.f23807j.m12529b(uri, c);
            return null;
        }
        return new C10733a(this.f23800c, new C5288a.C5289b().m29615i(uri).m29622b(1).m29623a(), this.f23803f[i], this.f23813p.mo12500q(), this.f23813p.mo12501g(), this.f23809l);
    }

    /* renamed from: q */
    private long m12511q(long j) {
        long j2 = this.f23814q;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    private void m12507u(C11220g gVar) {
        long j;
        if (gVar.f25071m) {
            j = -9223372036854775807L;
        } else {
            j = gVar.m10422e() - this.f23804g.mo10384c();
        }
        this.f23814q = j;
    }

    /* renamed from: a */
    public AbstractC9839n[] m12527a(C10740i iVar, long j) {
        int i;
        int i2;
        boolean z;
        if (iVar == null) {
            i = -1;
        } else {
            i = this.f23805h.m19989b(iVar.f21890d);
        }
        int length = this.f23813p.length();
        AbstractC9839n[] nVarArr = new AbstractC9839n[length];
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            int d = this.f23813p.mo34413d(i3);
            Uri uri = this.f23802e[d];
            if (!this.f23804g.mo10381f(uri)) {
                nVarArr[i3] = AbstractC9839n.f21932a;
                i2 = i3;
            } else {
                C11220g l = this.f23804g.mo10377l(uri, z2);
                C7510a.m22367e(l);
                long c = l.f25064f - this.f23804g.mo10384c();
                if (d != i) {
                    z = true;
                } else {
                    z = z2;
                }
                i2 = i3;
                Pair<Long, Integer> e = m12523e(iVar, z, l, c, j);
                nVarArr[i2] = new C10735c(l.f25102a, c, m12520h(l, ((Long) e.first).longValue(), ((Integer) e.second).intValue()));
            }
            i3 = i2 + 1;
            z2 = false;
        }
        return nVarArr;
    }

    /* renamed from: b */
    public int m12526b(C10740i iVar) {
        List<C11220g.C11222b> list;
        if (iVar.f23833o == -1) {
            return 1;
        }
        C11220g gVar = (C11220g) C7510a.m22367e(this.f23804g.mo10377l(this.f23802e[this.f23805h.m19989b(iVar.f21890d)], false));
        int i = (int) (iVar.f21931j - gVar.f25067i);
        if (i < 0) {
            return 1;
        }
        if (i < gVar.f25074p.size()) {
            list = gVar.f25074p.get(i).f25085w;
        } else {
            list = gVar.f25075q;
        }
        if (iVar.f23833o >= list.size()) {
            return 2;
        }
        C11220g.C11222b bVar = list.get(iVar.f23833o);
        if (bVar.f25080w) {
            return 0;
        }
        if (C7557q0.m22159c(Uri.parse(C7548n0.m22234c(gVar.f25102a, bVar.f25086k)), iVar.f21888b.f9746a)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: d */
    public void m12524d(long j, long j2, List<C10740i> list, boolean z, C10734b bVar) {
        C10740i iVar;
        int i;
        boolean z2;
        long j3;
        Uri uri;
        if (list.isEmpty()) {
            iVar = null;
        } else {
            iVar = (C10740i) C3976z0.m33215c(list);
        }
        if (iVar == null) {
            i = -1;
        } else {
            i = this.f23805h.m19989b(iVar.f21890d);
        }
        long j4 = j2 - j;
        long q = m12511q(j);
        if (iVar != null && !this.f23812o) {
            long d = iVar.m15255d();
            j4 = Math.max(0L, j4 - d);
            if (q != -9223372036854775807L) {
                q = Math.max(0L, q - d);
            }
        }
        this.f23813p.mo12502e(j, j4, q, list, m12527a(iVar, j2));
        int o = this.f23813p.mo34429o();
        if (i != o) {
            z2 = true;
        } else {
            z2 = false;
        }
        Uri uri2 = this.f23802e[o];
        if (!this.f23804g.mo10381f(uri2)) {
            bVar.f23819c = uri2;
            this.f23815r &= uri2.equals(this.f23811n);
            this.f23811n = uri2;
            return;
        }
        C11220g l = this.f23804g.mo10377l(uri2, true);
        C7510a.m22367e(l);
        this.f23812o = l.f25104c;
        m12507u(l);
        long c = l.f25064f - this.f23804g.mo10384c();
        Pair<Long, Integer> e = m12523e(iVar, z2, l, c, j2);
        long longValue = ((Long) e.first).longValue();
        int intValue = ((Integer) e.second).intValue();
        if (longValue >= l.f25067i || iVar == null || !z2) {
            j3 = c;
            uri = uri2;
            i = o;
        } else {
            Uri uri3 = this.f23802e[i];
            C11220g l2 = this.f23804g.mo10377l(uri3, true);
            C7510a.m22367e(l2);
            j3 = l2.f25064f - this.f23804g.mo10384c();
            Pair<Long, Integer> e2 = m12523e(iVar, false, l2, j3, j2);
            longValue = ((Long) e2.first).longValue();
            intValue = ((Integer) e2.second).intValue();
            uri = uri3;
            l = l2;
        }
        if (longValue < l.f25067i) {
            this.f23810m = new C8232b();
            return;
        }
        C10737e f = m12522f(l, longValue, intValue);
        if (f == null) {
            if (!l.f25071m) {
                bVar.f23819c = uri;
                this.f23815r &= uri.equals(this.f23811n);
                this.f23811n = uri;
                return;
            } else if (z || l.f25074p.isEmpty()) {
                bVar.f23818b = true;
                return;
            } else {
                f = new C10737e((C11220g.C11225e) C3976z0.m33215c(l.f25074p), (l.f25067i + l.f25074p.size()) - 1, -1);
            }
        }
        this.f23815r = false;
        this.f23811n = null;
        Uri c2 = m12525c(l, f.f23824a.f25087l);
        AbstractC9827e k = m12517k(c2, i);
        bVar.f23817a = k;
        if (k == null) {
            Uri c3 = m12525c(l, f.f23824a);
            AbstractC9827e k2 = m12517k(c3, i);
            bVar.f23817a = k2;
            if (k2 == null) {
                bVar.f23817a = C10740i.m12493j(this.f23798a, this.f23799b, this.f23803f[i], j3, l, f, uri, this.f23806i, this.f23813p.mo12500q(), this.f23813p.mo12501g(), this.f23808k, this.f23801d, iVar, this.f23807j.m12530a(c3), this.f23807j.m12530a(c2));
            }
        }
    }

    /* renamed from: g */
    public int m12521g(long j, List<? extends AbstractC9838m> list) {
        if (this.f23810m != null || this.f23813p.length() < 2) {
            return list.size();
        }
        return this.f23813p.mo34430n(j, list);
    }

    /* renamed from: i */
    public C8302u0 m12519i() {
        return this.f23805h;
    }

    /* renamed from: j */
    public AbstractC3415h m12518j() {
        return this.f23813p;
    }

    /* renamed from: l */
    public boolean m12516l(AbstractC9827e eVar, long j) {
        AbstractC3415h hVar = this.f23813p;
        return hVar.mo34435b(hVar.mo34412i(this.f23805h.m19989b(eVar.f21890d)), j);
    }

    /* renamed from: m */
    public void m12515m() {
        IOException iOException = this.f23810m;
        if (iOException == null) {
            Uri uri = this.f23811n;
            if (uri != null && this.f23815r) {
                this.f23804g.mo10385b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: n */
    public void m12514n(AbstractC9827e eVar) {
        if (eVar instanceof C10733a) {
            C10733a aVar = (C10733a) eVar;
            this.f23809l = aVar.m15208h();
            this.f23807j.m12529b(aVar.f21888b.f9746a, (byte[]) C7510a.m22367e(aVar.m12505j()));
        }
    }

    /* renamed from: o */
    public boolean m12513o(Uri uri, long j) {
        int i;
        int i2 = 0;
        while (true) {
            Uri[] uriArr = this.f23802e;
            if (i2 >= uriArr.length) {
                i2 = -1;
                break;
            } else if (uriArr[i2].equals(uri)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || (i = this.f23813p.mo34412i(i2)) == -1) {
            return true;
        }
        this.f23815r = uri.equals(this.f23811n) | this.f23815r;
        if (j == -9223372036854775807L || this.f23813p.mo34435b(i, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void m12512p() {
        this.f23810m = null;
    }

    /* renamed from: r */
    public void m12510r(boolean z) {
        this.f23808k = z;
    }

    /* renamed from: s */
    public void m12509s(AbstractC3415h hVar) {
        this.f23813p = hVar;
    }

    /* renamed from: t */
    public boolean m12508t(long j, AbstractC9827e eVar, List<? extends AbstractC9838m> list) {
        if (this.f23810m != null) {
            return false;
        }
        return this.f23813p.mo34432j(j, eVar, list);
    }
}
