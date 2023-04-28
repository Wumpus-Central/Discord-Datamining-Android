package p153i8;

import cc.AbstractC3897k1;
import cc.AbstractC3904l1;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p153i8.AbstractC8299u;

/* renamed from: i8.e0 */
/* loaded from: classes7.dex */
public final class C8243e0 extends AbstractC8246f<Integer> {

    /* renamed from: E */
    private static final MediaItem f38565E = new MediaItem.C5147c().m30548d("MergingMediaSource").m30551a();

    /* renamed from: A */
    private final AbstractC3897k1<Object, C8237d> f38566A;

    /* renamed from: B */
    private int f38567B;

    /* renamed from: C */
    private long[][] f38568C;

    /* renamed from: D */
    private C8245b f38569D;

    /* renamed from: t */
    private final boolean f17870t;

    /* renamed from: u */
    private final boolean f17871u;

    /* renamed from: v */
    private final AbstractC8299u[] f17872v;

    /* renamed from: w */
    private final Timeline[] f17873w;

    /* renamed from: x */
    private final ArrayList<AbstractC8299u> f17874x;

    /* renamed from: y */
    private final AbstractC8252h f17875y;

    /* renamed from: z */
    private final Map<Object, Long> f17876z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.e0$a */
    /* loaded from: classes7.dex */
    public static final class C8244a extends AbstractC8267l {

        /* renamed from: c */
        private final long[] f17877c;

        /* renamed from: d */
        private final long[] f17878d;

        public C8244a(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int p = timeline.mo20022p();
            this.f17878d = new long[timeline.mo20022p()];
            Timeline.C5161c cVar = new Timeline.C5161c();
            for (int i = 0; i < p; i++) {
                this.f17878d[i] = timeline.m30436n(i, cVar).f9105p;
            }
            int i2 = timeline.mo20025i();
            this.f17877c = new long[i2];
            Timeline.C5160b bVar = new Timeline.C5160b();
            for (int i3 = 0; i3 < i2; i3++) {
                timeline.mo20026g(i3, bVar, true);
                long longValue = ((Long) C7510a.m22367e(map.get(bVar.f9083b))).longValue();
                long[] jArr = this.f17877c;
                longValue = longValue == Long.MIN_VALUE ? bVar.f9085d : longValue;
                jArr[i3] = longValue;
                long j = bVar.f9085d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f17878d;
                    int i4 = bVar.f9084c;
                    jArr2[i4] = jArr2[i4] - (j - longValue);
                }
            }
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
            super.mo20026g(i, bVar, z);
            bVar.f9085d = this.f17877c[i];
            return bVar;
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
            long j2;
            super.mo20023o(i, cVar, j);
            long j3 = this.f17878d[i];
            cVar.f9105p = j3;
            if (j3 != -9223372036854775807L) {
                long j4 = cVar.f9104o;
                if (j4 != -9223372036854775807L) {
                    j2 = Math.min(j4, j3);
                    cVar.f9104o = j2;
                    return cVar;
                }
            }
            j2 = cVar.f9104o;
            cVar.f9104o = j2;
            return cVar;
        }
    }

    /* renamed from: i8.e0$b */
    /* loaded from: classes7.dex */
    public static final class C8245b extends IOException {

        /* renamed from: k */
        public final int f17879k;

        public C8245b(int i) {
            this.f17879k = i;
        }
    }

    public C8243e0(AbstractC8299u... uVarArr) {
        this(false, uVarArr);
    }

    /* renamed from: K */
    private void m20216K() {
        Timeline.C5160b bVar = new Timeline.C5160b();
        for (int i = 0; i < this.f38567B; i++) {
            long j = -this.f17873w[0].m30439f(i, bVar).m30422l();
            int i2 = 1;
            while (true) {
                Timeline[] timelineArr = this.f17873w;
                if (i2 < timelineArr.length) {
                    this.f38568C[i][i2] = j - (-timelineArr[i2].m30439f(i, bVar).m30422l());
                    i2++;
                }
            }
        }
    }

    /* renamed from: N */
    private void m20213N() {
        Timeline[] timelineArr;
        Timeline.C5160b bVar = new Timeline.C5160b();
        for (int i = 0; i < this.f38567B; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.f17873w;
                if (i2 >= timelineArr.length) {
                    break;
                }
                long h = timelineArr[i2].m30439f(i, bVar).m30426h();
                if (h != -9223372036854775807L) {
                    long j2 = h + this.f38568C[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object m = timelineArr[0].mo20024m(i);
            this.f17876z.put(m, Long.valueOf(j));
            for (C8237d dVar : this.f38566A.get(m)) {
                dVar.m20223v(0L, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8230a
    /* renamed from: A */
    public void mo20008A(AbstractC6795x xVar) {
        super.mo20008A(xVar);
        for (int i = 0; i < this.f17872v.length; i++) {
            m20208J(Integer.valueOf(i), this.f17872v[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8230a
    /* renamed from: C */
    public void mo20007C() {
        super.mo20007C();
        Arrays.fill(this.f17873w, (Object) null);
        this.f38567B = -1;
        this.f38569D = null;
        this.f17874x.clear();
        Collections.addAll(this.f17874x, this.f17872v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public AbstractC8299u.C8300a mo20049E(Integer num, AbstractC8299u.C8300a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void mo20048I(Integer num, AbstractC8299u uVar, Timeline timeline) {
        if (this.f38569D == null) {
            if (this.f38567B == -1) {
                this.f38567B = timeline.mo20025i();
            } else if (timeline.mo20025i() != this.f38567B) {
                this.f38569D = new C8245b(0);
                return;
            }
            if (this.f38568C.length == 0) {
                this.f38568C = (long[][]) Array.newInstance(Long.TYPE, this.f38567B, this.f17873w.length);
            }
            this.f17874x.remove(uVar);
            this.f17873w[num.intValue()] = timeline;
            if (this.f17874x.isEmpty()) {
                if (this.f17870t) {
                    m20216K();
                }
                C8244a aVar = this.f17873w[0];
                if (this.f17871u) {
                    m20213N();
                    aVar = new C8244a(aVar, this.f17876z);
                }
                m20266B(aVar);
            }
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        AbstractC8299u[] uVarArr = this.f17872v;
        return uVarArr.length > 0 ? uVarArr[0].mo20004c() : f38565E;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        if (this.f17871u) {
            C8237d dVar = (C8237d) rVar;
            Iterator<Map.Entry<Object, C8237d>> it = this.f38566A.mo33300a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C8237d> next = it.next();
                if (next.getValue().equals(dVar)) {
                    this.f38566A.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            rVar = dVar.f17846k;
        }
        C8239d0 d0Var = (C8239d0) rVar;
        int i = 0;
        while (true) {
            AbstractC8299u[] uVarArr = this.f17872v;
            if (i < uVarArr.length) {
                uVarArr[i].mo19998l(d0Var.m20221e(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        int length = this.f17872v.length;
        AbstractC8287r[] rVarArr = new AbstractC8287r[length];
        int b = this.f17873w[0].mo20027b(aVar.f18059a);
        for (int i = 0; i < length; i++) {
            rVarArr[i] = this.f17872v[i].mo19997m(aVar.m19992c(this.f17873w[i].mo20024m(b)), bVar, j - this.f38568C[b][i]);
        }
        C8239d0 d0Var = new C8239d0(this.f17875y, this.f38568C[b], rVarArr);
        if (!this.f17871u) {
            return d0Var;
        }
        C8237d dVar = new C8237d(d0Var, true, 0L, ((Long) C7510a.m22367e(this.f17876z.get(aVar.f18059a))).longValue());
        this.f38566A.put(aVar.f18059a, dVar);
        return dVar;
    }

    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
        C8245b bVar = this.f38569D;
        if (bVar == null) {
            super.mo19996n();
            return;
        }
        throw bVar;
    }

    public C8243e0(boolean z, AbstractC8299u... uVarArr) {
        this(z, false, uVarArr);
    }

    public C8243e0(boolean z, boolean z2, AbstractC8299u... uVarArr) {
        this(z, z2, new C8254i(), uVarArr);
    }

    public C8243e0(boolean z, boolean z2, AbstractC8252h hVar, AbstractC8299u... uVarArr) {
        this.f17870t = z;
        this.f17871u = z2;
        this.f17872v = uVarArr;
        this.f17875y = hVar;
        this.f17874x = new ArrayList<>(Arrays.asList(uVarArr));
        this.f38567B = -1;
        this.f17873w = new Timeline[uVarArr.length];
        this.f38568C = new long[0];
        this.f17876z = new HashMap();
        this.f38566A = AbstractC3904l1.m33362a().m33357a().mo33354e();
    }
}
