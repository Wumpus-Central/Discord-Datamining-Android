package p153i8;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6795x;
import p119g9.C7557q0;
import p153i8.AbstractC8299u;

/* renamed from: i8.p */
/* loaded from: classes7.dex */
public final class C8279p extends AbstractC8246f<Void> {

    /* renamed from: A */
    private boolean f38605A;

    /* renamed from: B */
    private boolean f38606B;

    /* renamed from: t */
    private final AbstractC8299u f18024t;

    /* renamed from: u */
    private final boolean f18025u;

    /* renamed from: v */
    private final Timeline.C5161c f18026v;

    /* renamed from: w */
    private final Timeline.C5160b f18027w;

    /* renamed from: x */
    private C8280a f18028x;

    /* renamed from: y */
    private C8277o f18029y;

    /* renamed from: z */
    private boolean f18030z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.p$a */
    /* loaded from: classes7.dex */
    public static final class C8280a extends AbstractC8267l {

        /* renamed from: e */
        public static final Object f18031e = new Object();

        /* renamed from: c */
        private final Object f18032c;

        /* renamed from: d */
        private final Object f18033d;

        private C8280a(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.f18032c = obj;
            this.f18033d = obj2;
        }

        /* renamed from: u */
        public static C8280a m20038u(MediaItem mediaItem) {
            return new C8280a(new C8281b(mediaItem), Timeline.C5161c.f9088r, f18031e);
        }

        /* renamed from: v */
        public static C8280a m20037v(Timeline timeline, Object obj, Object obj2) {
            return new C8280a(timeline, obj, obj2);
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo20027b(Object obj) {
            Object obj2;
            Timeline timeline = this.f17961b;
            if (f18031e.equals(obj) && (obj2 = this.f18033d) != null) {
                obj = obj2;
            }
            return timeline.mo20027b(obj);
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
            this.f17961b.mo20026g(i, bVar, z);
            if (C7557q0.m22159c(bVar.f9083b, this.f18033d) && z) {
                bVar.f9083b = f18031e;
            }
            return bVar;
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo20024m(int i) {
            Object m = this.f17961b.mo20024m(i);
            if (C7557q0.m22159c(m, this.f18033d)) {
                return f18031e;
            }
            return m;
        }

        @Override // p153i8.AbstractC8267l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
            this.f17961b.mo20023o(i, cVar, j);
            if (C7557q0.m22159c(cVar.f9090a, this.f18032c)) {
                cVar.f9090a = Timeline.C5161c.f9088r;
            }
            return cVar;
        }

        /* renamed from: t */
        public C8280a m20039t(Timeline timeline) {
            return new C8280a(timeline, this.f18032c, this.f18033d);
        }
    }

    /* renamed from: i8.p$b */
    /* loaded from: classes7.dex */
    public static final class C8281b extends Timeline {

        /* renamed from: b */
        private final MediaItem f18034b;

        public C8281b(MediaItem mediaItem) {
            this.f18034b = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo20027b(Object obj) {
            return obj == C8280a.f18031e ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
            Integer num;
            Object obj = null;
            if (z) {
                num = 0;
            } else {
                num = null;
            }
            if (z) {
                obj = C8280a.f18031e;
            }
            return bVar.m30420n(num, obj, 0, -9223372036854775807L, 0L);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo20025i() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo20024m(int i) {
            return C8280a.f18031e;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
            cVar.m30412g(Timeline.C5161c.f9088r, this.f18034b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f9101l = true;
            return cVar;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo20022p() {
            return 1;
        }
    }

    public C8279p(AbstractC8299u uVar, boolean z) {
        boolean z2;
        this.f18024t = uVar;
        if (!z || !uVar.mo19995p()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f18025u = z2;
        this.f18026v = new Timeline.C5161c();
        this.f18027w = new Timeline.C5160b();
        Timeline q = uVar.mo19994q();
        if (q != null) {
            this.f18028x = C8280a.m20037v(q, null, null);
            this.f38606B = true;
            return;
        }
        this.f18028x = C8280a.m20038u(uVar.mo20004c());
    }

    /* renamed from: L */
    private Object m20046L(Object obj) {
        if (this.f18028x.f18033d == null || !this.f18028x.f18033d.equals(obj)) {
            return obj;
        }
        return C8280a.f18031e;
    }

    /* renamed from: M */
    private Object m20045M(Object obj) {
        if (this.f18028x.f18033d == null || !obj.equals(C8280a.f18031e)) {
            return obj;
        }
        return this.f18028x.f18033d;
    }

    /* renamed from: Q */
    private void m20041Q(long j) {
        C8277o oVar = this.f18029y;
        int b = this.f18028x.mo20027b(oVar.f18017k.f18059a);
        if (b != -1) {
            long j2 = this.f18028x.m30439f(b, this.f18027w).f9085d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0L, j2 - 1);
            }
            oVar.m20052w(j);
        }
    }

    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8230a
    /* renamed from: A */
    public void mo20008A(AbstractC6795x xVar) {
        super.mo20008A(xVar);
        if (!this.f18025u) {
            this.f18030z = true;
            m20208J(null, this.f18024t);
        }
    }

    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8230a
    /* renamed from: C */
    public void mo20007C() {
        this.f38605A = false;
        this.f18030z = false;
        super.mo20007C();
    }

    /* renamed from: K */
    public C8277o mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        C8277o oVar = new C8277o(aVar, bVar, j);
        oVar.m20050y(this.f18024t);
        if (this.f38605A) {
            oVar.m20057e(aVar.m19992c(m20045M(aVar.f18059a)));
        } else {
            this.f18029y = oVar;
            if (!this.f18030z) {
                this.f18030z = true;
                m20208J(null, this.f18024t);
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public AbstractC8299u.C8300a mo20049E(Void r1, AbstractC8299u.C8300a aVar) {
        return aVar.m19992c(m20046L(aVar.f18059a));
    }

    /* renamed from: O */
    public Timeline m20043O() {
        return this.f18028x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo20048I(java.lang.Void r13, p153i8.AbstractC8299u r14, com.google.android.exoplayer2.Timeline r15) {
        /*
            r12 = this;
            boolean r13 = r12.f38605A
            if (r13 == 0) goto L_0x0019
            i8.p$a r13 = r12.f18028x
            i8.p$a r13 = r13.m20039t(r15)
            r12.f18028x = r13
            i8.o r13 = r12.f18029y
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.m20056k()
            r12.m20041Q(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.m30435q()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f38606B
            if (r13 == 0) goto L_0x002a
            i8.p$a r13 = r12.f18028x
            i8.p$a r13 = r13.m20039t(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = com.google.android.exoplayer2.Timeline.C5161c.f9088r
            java.lang.Object r14 = p153i8.C8279p.C8280a.f18031e
            i8.p$a r13 = p153i8.C8279p.C8280a.m20037v(r15, r13, r14)
        L_0x0032:
            r12.f18028x = r13
            goto L_0x00ae
        L_0x0036:
            com.google.android.exoplayer2.Timeline$c r13 = r12.f18026v
            r14 = 0
            r15.m30436n(r14, r13)
            com.google.android.exoplayer2.Timeline$c r13 = r12.f18026v
            long r0 = r13.m30416c()
            com.google.android.exoplayer2.Timeline$c r13 = r12.f18026v
            java.lang.Object r13 = r13.f9090a
            i8.o r2 = r12.f18029y
            if (r2 == 0) goto L_0x0074
            long r2 = r2.m20055p()
            i8.p$a r4 = r12.f18028x
            i8.o r5 = r12.f18029y
            i8.u$a r5 = r5.f18017k
            java.lang.Object r5 = r5.f18059a
            com.google.android.exoplayer2.Timeline$b r6 = r12.f18027w
            r4.mo30409h(r5, r6)
            com.google.android.exoplayer2.Timeline$b r4 = r12.f18027w
            long r4 = r4.m30422l()
            long r4 = r4 + r2
            i8.p$a r2 = r12.f18028x
            com.google.android.exoplayer2.Timeline$c r3 = r12.f18026v
            com.google.android.exoplayer2.Timeline$c r14 = r2.m30436n(r14, r3)
            long r2 = r14.m30416c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            com.google.android.exoplayer2.Timeline$c r7 = r12.f18026v
            com.google.android.exoplayer2.Timeline$b r8 = r12.f18027w
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.m30438j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f38606B
            if (r14 == 0) goto L_0x0094
            i8.p$a r13 = r12.f18028x
            i8.p$a r13 = r13.m20039t(r15)
            goto L_0x0098
        L_0x0094:
            i8.p$a r13 = p153i8.C8279p.C8280a.m20037v(r15, r13, r0)
        L_0x0098:
            r12.f18028x = r13
            i8.o r13 = r12.f18029y
            if (r13 == 0) goto L_0x00ae
            r12.m20041Q(r1)
            i8.u$a r13 = r13.f18017k
            java.lang.Object r14 = r13.f18059a
            java.lang.Object r14 = r12.m20045M(r14)
            i8.u$a r13 = r13.m19992c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f38606B = r14
            r12.f38605A = r14
            i8.p$a r14 = r12.f18028x
            r12.m20266B(r14)
            if (r13 == 0) goto L_0x00c6
            i8.o r14 = r12.f18029y
            java.lang.Object r14 = p119g9.C7510a.m22367e(r14)
            i8.o r14 = (p153i8.C8277o) r14
            r14.m20057e(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8279p.mo20048I(java.lang.Void, i8.u, com.google.android.exoplayer2.Timeline):void");
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f18024t.mo20004c();
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        ((C8277o) rVar).m20051x();
        if (rVar == this.f18029y) {
            this.f18029y = null;
        }
    }

    @Override // p153i8.AbstractC8246f, p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
    }
}
