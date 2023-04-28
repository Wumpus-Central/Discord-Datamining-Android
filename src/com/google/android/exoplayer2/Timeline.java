package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import p079e7.C6713c;
import p119g9.C7510a;
import p119g9.C7557q0;
import p173j8.C9503a;

/* loaded from: classes7.dex */
public abstract class Timeline {

    /* renamed from: a */
    public static final Timeline f9081a = new C5159a();

    /* renamed from: com.google.android.exoplayer2.Timeline$a */
    /* loaded from: classes7.dex */
    class C5159a extends Timeline {
        C5159a() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo20027b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public C5160b mo20026g(int i, C5160b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo20025i() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo20024m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public C5161c mo20023o(int i, C5161c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo20022p() {
            return 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$b */
    /* loaded from: classes7.dex */
    public static final class C5160b {

        /* renamed from: a */
        public Object f9082a;

        /* renamed from: b */
        public Object f9083b;

        /* renamed from: c */
        public int f9084c;

        /* renamed from: d */
        public long f9085d;

        /* renamed from: e */
        private long f9086e;

        /* renamed from: f */
        private C9503a f9087f = C9503a.f21081g;

        /* renamed from: a */
        public int m30433a(int i) {
            return this.f9087f.f21085d[i].f21088a;
        }

        /* renamed from: b */
        public long m30432b(int i, int i2) {
            C9503a.C0283a aVar = this.f9087f.f21085d[i];
            if (aVar.f21088a != -1) {
                return aVar.f21091d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m30431c() {
            return this.f9087f.f21083b;
        }

        /* renamed from: d */
        public int m30430d(long j) {
            return this.f9087f.m16121a(j, this.f9085d);
        }

        /* renamed from: e */
        public int m30429e(long j) {
            return this.f9087f.m16120b(j, this.f9085d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5160b.class.equals(obj.getClass())) {
                return false;
            }
            C5160b bVar = (C5160b) obj;
            if (!C7557q0.m22159c(this.f9082a, bVar.f9082a) || !C7557q0.m22159c(this.f9083b, bVar.f9083b) || this.f9084c != bVar.f9084c || this.f9085d != bVar.f9085d || this.f9086e != bVar.f9086e || !C7557q0.m22159c(this.f9087f, bVar.f9087f)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public long m30428f(int i) {
            return this.f9087f.f21084c[i];
        }

        /* renamed from: g */
        public long m30427g() {
            return this.f9087f.f21086e;
        }

        /* renamed from: h */
        public long m30426h() {
            return this.f9085d;
        }

        public int hashCode() {
            int i;
            Object obj = this.f9082a;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (217 + i) * 31;
            Object obj2 = this.f9083b;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j = this.f9085d;
            long j2 = this.f9086e;
            return ((((((((i3 + i2) * 31) + this.f9084c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f9087f.hashCode();
        }

        /* renamed from: i */
        public int m30425i(int i) {
            return this.f9087f.f21085d[i].m16118a();
        }

        /* renamed from: j */
        public int m30424j(int i, int i2) {
            return this.f9087f.f21085d[i].m16117b(i2);
        }

        /* renamed from: k */
        public long m30423k() {
            return C6713c.m24565d(this.f9086e);
        }

        /* renamed from: l */
        public long m30422l() {
            return this.f9086e;
        }

        /* renamed from: m */
        public boolean m30421m(int i) {
            return !this.f9087f.f21085d[i].m16116c();
        }

        /* renamed from: n */
        public C5160b m30420n(Object obj, Object obj2, int i, long j, long j2) {
            return m30419o(obj, obj2, i, j, j2, C9503a.f21081g);
        }

        /* renamed from: o */
        public C5160b m30419o(Object obj, Object obj2, int i, long j, long j2, C9503a aVar) {
            this.f9082a = obj;
            this.f9083b = obj2;
            this.f9084c = i;
            this.f9085d = j;
            this.f9086e = j2;
            this.f9087f = aVar;
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$c */
    /* loaded from: classes7.dex */
    public static final class C5161c {

        /* renamed from: r */
        public static final Object f9088r = new Object();

        /* renamed from: s */
        private static final MediaItem f9089s = new MediaItem.C5147c().m30548d("com.google.android.exoplayer2.Timeline").m30543i(Uri.EMPTY).m30551a();
        @Deprecated

        /* renamed from: b */
        public Object f9091b;

        /* renamed from: d */
        public Object f9093d;

        /* renamed from: e */
        public long f9094e;

        /* renamed from: f */
        public long f9095f;

        /* renamed from: g */
        public long f9096g;

        /* renamed from: h */
        public boolean f9097h;

        /* renamed from: i */
        public boolean f9098i;
        @Deprecated

        /* renamed from: j */
        public boolean f9099j;

        /* renamed from: k */
        public MediaItem.C5150f f9100k;

        /* renamed from: l */
        public boolean f9101l;

        /* renamed from: m */
        public int f9102m;

        /* renamed from: n */
        public int f9103n;

        /* renamed from: o */
        public long f9104o;

        /* renamed from: p */
        public long f9105p;

        /* renamed from: q */
        public long f9106q;

        /* renamed from: a */
        public Object f9090a = f9088r;

        /* renamed from: c */
        public MediaItem f9092c = f9089s;

        /* renamed from: a */
        public long m30418a() {
            return C7557q0.m22165Z(this.f9096g);
        }

        /* renamed from: b */
        public long m30417b() {
            return C6713c.m24565d(this.f9104o);
        }

        /* renamed from: c */
        public long m30416c() {
            return this.f9104o;
        }

        /* renamed from: d */
        public long m30415d() {
            return C6713c.m24565d(this.f9105p);
        }

        /* renamed from: e */
        public long m30414e() {
            return this.f9106q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5161c.class.equals(obj.getClass())) {
                return false;
            }
            C5161c cVar = (C5161c) obj;
            if (C7557q0.m22159c(this.f9090a, cVar.f9090a) && C7557q0.m22159c(this.f9092c, cVar.f9092c) && C7557q0.m22159c(this.f9093d, cVar.f9093d) && C7557q0.m22159c(this.f9100k, cVar.f9100k) && this.f9094e == cVar.f9094e && this.f9095f == cVar.f9095f && this.f9096g == cVar.f9096g && this.f9097h == cVar.f9097h && this.f9098i == cVar.f9098i && this.f9101l == cVar.f9101l && this.f9104o == cVar.f9104o && this.f9105p == cVar.f9105p && this.f9102m == cVar.f9102m && this.f9103n == cVar.f9103n && this.f9106q == cVar.f9106q) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m30413f() {
            boolean z;
            boolean z2;
            boolean z3 = this.f9099j;
            if (this.f9100k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22366f(z2);
            if (this.f9100k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public C5161c m30412g(Object obj, MediaItem mediaItem, Object obj2, long j, long j2, long j3, boolean z, boolean z2, MediaItem.C5150f fVar, long j4, long j5, int i, int i2, long j6) {
            MediaItem mediaItem2;
            Object obj3;
            boolean z3;
            MediaItem.C5151g gVar;
            this.f9090a = obj;
            if (mediaItem != null) {
                mediaItem2 = mediaItem;
            } else {
                mediaItem2 = f9089s;
            }
            this.f9092c = mediaItem2;
            if (mediaItem == null || (gVar = mediaItem.f8963b) == null) {
                obj3 = null;
            } else {
                obj3 = gVar.f9021h;
            }
            this.f9091b = obj3;
            this.f9093d = obj2;
            this.f9094e = j;
            this.f9095f = j2;
            this.f9096g = j3;
            this.f9097h = z;
            this.f9098i = z2;
            if (fVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f9099j = z3;
            this.f9100k = fVar;
            this.f9104o = j4;
            this.f9105p = j5;
            this.f9102m = i;
            this.f9103n = i2;
            this.f9106q = j6;
            this.f9101l = false;
            return this;
        }

        public int hashCode() {
            int i;
            int hashCode = (((217 + this.f9090a.hashCode()) * 31) + this.f9092c.hashCode()) * 31;
            Object obj = this.f9093d;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (hashCode + i) * 31;
            MediaItem.C5150f fVar = this.f9100k;
            if (fVar != null) {
                i2 = fVar.hashCode();
            }
            long j = this.f9094e;
            long j2 = this.f9095f;
            long j3 = this.f9096g;
            long j4 = this.f9104o;
            long j5 = this.f9105p;
            long j6 = this.f9106q;
            return ((((((((((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f9097h ? 1 : 0)) * 31) + (this.f9098i ? 1 : 0)) * 31) + (this.f9101l ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f9102m) * 31) + this.f9103n) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo20133a(boolean z) {
        return m30435q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo20027b(Object obj);

    /* renamed from: c */
    public int mo20132c(boolean z) {
        if (m30435q()) {
            return -1;
        }
        return mo20022p() - 1;
    }

    /* renamed from: d */
    public final int m30440d(int i, C5160b bVar, C5161c cVar, int i2, boolean z) {
        int i3 = m30439f(i, bVar).f9084c;
        if (m30436n(i3, cVar).f9103n != i) {
            return i + 1;
        }
        int e = mo20131e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return m30436n(e, cVar).f9102m;
    }

    /* renamed from: e */
    public int mo20131e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo20132c(z)) {
                return mo20133a(z);
            } else {
                return i + 1;
            }
        } else if (i == mo20132c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (!(timeline.mo20022p() == mo20022p() && timeline.mo20025i() == mo20025i())) {
            return false;
        }
        C5161c cVar = new C5161c();
        C5160b bVar = new C5160b();
        C5161c cVar2 = new C5161c();
        C5160b bVar2 = new C5160b();
        for (int i = 0; i < mo20022p(); i++) {
            if (!m30436n(i, cVar).equals(timeline.m30436n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo20025i(); i2++) {
            if (!mo20026g(i2, bVar, true).equals(timeline.mo20026g(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C5160b m30439f(int i, C5160b bVar) {
        return mo20026g(i, bVar, false);
    }

    /* renamed from: g */
    public abstract C5160b mo20026g(int i, C5160b bVar, boolean z);

    /* renamed from: h */
    public C5160b mo30409h(Object obj, C5160b bVar) {
        return mo20026g(mo20027b(obj), bVar, true);
    }

    public int hashCode() {
        C5161c cVar = new C5161c();
        C5160b bVar = new C5160b();
        int p = 217 + mo20022p();
        for (int i = 0; i < mo20022p(); i++) {
            p = (p * 31) + m30436n(i, cVar).hashCode();
        }
        int i2 = (p * 31) + mo20025i();
        for (int i3 = 0; i3 < mo20025i(); i3++) {
            i2 = (i2 * 31) + mo20026g(i3, bVar, true).hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    public abstract int mo20025i();

    /* renamed from: j */
    public final Pair<Object, Long> m30438j(C5161c cVar, C5160b bVar, int i, long j) {
        return (Pair) C7510a.m22367e(m30437k(cVar, bVar, i, j, 0L));
    }

    /* renamed from: k */
    public final Pair<Object, Long> m30437k(C5161c cVar, C5160b bVar, int i, long j, long j2) {
        C7510a.m22369c(i, 0, mo20022p());
        mo20023o(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.m30416c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f9102m;
        long e = cVar.m30414e() + j;
        long h = mo20026g(i2, bVar, true).m30426h();
        while (h != -9223372036854775807L && e >= h && i2 < cVar.f9103n) {
            e -= h;
            i2++;
            h = mo20026g(i2, bVar, true).m30426h();
        }
        return Pair.create(C7510a.m22367e(bVar.f9083b), Long.valueOf(e));
    }

    /* renamed from: l */
    public int mo20130l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo20133a(z)) {
                return mo20132c(z);
            } else {
                return i - 1;
            }
        } else if (i == mo20133a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: m */
    public abstract Object mo20024m(int i);

    /* renamed from: n */
    public final C5161c m30436n(int i, C5161c cVar) {
        return mo20023o(i, cVar, 0L);
    }

    /* renamed from: o */
    public abstract C5161c mo20023o(int i, C5161c cVar, long j);

    /* renamed from: p */
    public abstract int mo20022p();

    /* renamed from: q */
    public final boolean m30435q() {
        return mo20022p() == 0;
    }

    /* renamed from: r */
    public final boolean m30434r(int i, C5160b bVar, C5161c cVar, int i2, boolean z) {
        return m30440d(i, bVar, cVar, i2, z) == -1;
    }
}
