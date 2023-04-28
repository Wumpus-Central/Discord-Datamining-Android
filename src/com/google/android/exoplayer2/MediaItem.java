package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.C5194i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p119g9.C7510a;
import p119g9.C7557q0;
import p132h8.C7937c;

/* loaded from: classes7.dex */
public final class MediaItem {

    /* renamed from: a */
    public final String f8962a;

    /* renamed from: b */
    public final C5151g f8963b;

    /* renamed from: c */
    public final C5150f f8964c;

    /* renamed from: d */
    public final C5194i0 f8965d;

    /* renamed from: e */
    public final C5148d f8966e;

    /* renamed from: com.google.android.exoplayer2.MediaItem$b */
    /* loaded from: classes7.dex */
    public static final class C5146b {

        /* renamed from: a */
        public final Uri f8967a;

        /* renamed from: b */
        public final Object f8968b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5146b)) {
                return false;
            }
            C5146b bVar = (C5146b) obj;
            if (!this.f8967a.equals(bVar.f8967a) || !C7557q0.m22159c(this.f8968b, bVar.f8968b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f8967a.hashCode() * 31;
            Object obj = this.f8968b;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        private C5146b(Uri uri, Object obj) {
            this.f8967a = uri;
            this.f8968b = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$c */
    /* loaded from: classes7.dex */
    public static final class C5147c {

        /* renamed from: A */
        private float f37205A;

        /* renamed from: B */
        private float f37206B;

        /* renamed from: a */
        private String f8969a;

        /* renamed from: b */
        private Uri f8970b;

        /* renamed from: c */
        private String f8971c;

        /* renamed from: d */
        private long f8972d;

        /* renamed from: e */
        private long f8973e;

        /* renamed from: f */
        private boolean f8974f;

        /* renamed from: g */
        private boolean f8975g;

        /* renamed from: h */
        private boolean f8976h;

        /* renamed from: i */
        private Uri f8977i;

        /* renamed from: j */
        private Map<String, String> f8978j;

        /* renamed from: k */
        private UUID f8979k;

        /* renamed from: l */
        private boolean f8980l;

        /* renamed from: m */
        private boolean f8981m;

        /* renamed from: n */
        private boolean f8982n;

        /* renamed from: o */
        private List<Integer> f8983o;

        /* renamed from: p */
        private byte[] f8984p;

        /* renamed from: q */
        private List<C7937c> f8985q;

        /* renamed from: r */
        private String f8986r;

        /* renamed from: s */
        private List<C5152h> f8987s;

        /* renamed from: t */
        private Uri f8988t;

        /* renamed from: u */
        private Object f8989u;

        /* renamed from: v */
        private Object f8990v;

        /* renamed from: w */
        private C5194i0 f8991w;

        /* renamed from: x */
        private long f8992x;

        /* renamed from: y */
        private long f8993y;

        /* renamed from: z */
        private long f8994z;

        /* renamed from: a */
        public MediaItem m30551a() {
            boolean z;
            C5151g gVar;
            C5149e eVar;
            C5146b bVar;
            if (this.f8977i == null || this.f8979k != null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            Uri uri = this.f8970b;
            if (uri != null) {
                String str = this.f8971c;
                UUID uuid = this.f8979k;
                if (uuid != null) {
                    eVar = new C5149e(uuid, this.f8977i, this.f8978j, this.f8980l, this.f8982n, this.f8981m, this.f8983o, this.f8984p);
                } else {
                    eVar = null;
                }
                Uri uri2 = this.f8988t;
                if (uri2 != null) {
                    bVar = new C5146b(uri2, this.f8989u);
                } else {
                    bVar = null;
                }
                C5151g gVar2 = new C5151g(uri, str, eVar, bVar, this.f8985q, this.f8986r, this.f8987s, this.f8990v);
                String str2 = this.f8969a;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.f8969a = str2;
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String str3 = (String) C7510a.m22367e(this.f8969a);
            C5148d dVar = new C5148d(this.f8972d, this.f8973e, this.f8974f, this.f8975g, this.f8976h);
            C5150f fVar = new C5150f(this.f8992x, this.f8993y, this.f8994z, this.f37205A, this.f37206B);
            C5194i0 i0Var = this.f8991w;
            if (i0Var == null) {
                i0Var = new C5194i0.C5196b().m30129a();
            }
            return new MediaItem(str3, dVar, gVar, fVar, i0Var);
        }

        /* renamed from: b */
        public C5147c m30550b(String str) {
            this.f8986r = str;
            return this;
        }

        /* renamed from: c */
        public C5147c m30549c(long j) {
            this.f8992x = j;
            return this;
        }

        /* renamed from: d */
        public C5147c m30548d(String str) {
            this.f8969a = str;
            return this;
        }

        /* renamed from: e */
        public C5147c m30547e(String str) {
            this.f8971c = str;
            return this;
        }

        /* renamed from: f */
        public C5147c m30546f(List<C7937c> list) {
            List<C7937c> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f8985q = list2;
            return this;
        }

        /* renamed from: g */
        public C5147c m30545g(List<C5152h> list) {
            List<C5152h> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f8987s = list2;
            return this;
        }

        /* renamed from: h */
        public C5147c m30544h(Object obj) {
            this.f8990v = obj;
            return this;
        }

        /* renamed from: i */
        public C5147c m30543i(Uri uri) {
            this.f8970b = uri;
            return this;
        }

        /* renamed from: j */
        public C5147c m30542j(String str) {
            return m30543i(str == null ? null : Uri.parse(str));
        }

        public C5147c() {
            this.f8973e = Long.MIN_VALUE;
            this.f8983o = Collections.emptyList();
            this.f8978j = Collections.emptyMap();
            this.f8985q = Collections.emptyList();
            this.f8987s = Collections.emptyList();
            this.f8992x = -9223372036854775807L;
            this.f8993y = -9223372036854775807L;
            this.f8994z = -9223372036854775807L;
            this.f37205A = -3.4028235E38f;
            this.f37206B = -3.4028235E38f;
        }

        private C5147c(MediaItem mediaItem) {
            this();
            C5148d dVar = mediaItem.f8966e;
            this.f8973e = dVar.f8996b;
            this.f8974f = dVar.f8997c;
            this.f8975g = dVar.f8998d;
            this.f8972d = dVar.f8995a;
            this.f8976h = dVar.f8999e;
            this.f8969a = mediaItem.f8962a;
            this.f8991w = mediaItem.f8965d;
            C5150f fVar = mediaItem.f8964c;
            this.f8992x = fVar.f9009a;
            this.f8993y = fVar.f9010b;
            this.f8994z = fVar.f9011c;
            this.f37205A = fVar.f9012d;
            this.f37206B = fVar.f9013e;
            C5151g gVar = mediaItem.f8963b;
            if (gVar != null) {
                this.f8986r = gVar.f9019f;
                this.f8971c = gVar.f9015b;
                this.f8970b = gVar.f9014a;
                this.f8985q = gVar.f9018e;
                this.f8987s = gVar.f9020g;
                this.f8990v = gVar.f9021h;
                C5149e eVar = gVar.f9016c;
                if (eVar != null) {
                    this.f8977i = eVar.f9001b;
                    this.f8978j = eVar.f9002c;
                    this.f8980l = eVar.f9003d;
                    this.f8982n = eVar.f9005f;
                    this.f8981m = eVar.f9004e;
                    this.f8983o = eVar.f9006g;
                    this.f8979k = eVar.f9000a;
                    this.f8984p = eVar.m30541a();
                }
                C5146b bVar = gVar.f9017d;
                if (bVar != null) {
                    this.f8988t = bVar.f8967a;
                    this.f8989u = bVar.f8968b;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$d */
    /* loaded from: classes7.dex */
    public static final class C5148d {

        /* renamed from: a */
        public final long f8995a;

        /* renamed from: b */
        public final long f8996b;

        /* renamed from: c */
        public final boolean f8997c;

        /* renamed from: d */
        public final boolean f8998d;

        /* renamed from: e */
        public final boolean f8999e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5148d)) {
                return false;
            }
            C5148d dVar = (C5148d) obj;
            if (this.f8995a == dVar.f8995a && this.f8996b == dVar.f8996b && this.f8997c == dVar.f8997c && this.f8998d == dVar.f8998d && this.f8999e == dVar.f8999e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f8995a;
            long j2 = this.f8996b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f8997c ? 1 : 0)) * 31) + (this.f8998d ? 1 : 0)) * 31) + (this.f8999e ? 1 : 0);
        }

        private C5148d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f8995a = j;
            this.f8996b = j2;
            this.f8997c = z;
            this.f8998d = z2;
            this.f8999e = z3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$e */
    /* loaded from: classes7.dex */
    public static final class C5149e {

        /* renamed from: a */
        public final UUID f9000a;

        /* renamed from: b */
        public final Uri f9001b;

        /* renamed from: c */
        public final Map<String, String> f9002c;

        /* renamed from: d */
        public final boolean f9003d;

        /* renamed from: e */
        public final boolean f9004e;

        /* renamed from: f */
        public final boolean f9005f;

        /* renamed from: g */
        public final List<Integer> f9006g;

        /* renamed from: h */
        private final byte[] f9007h;

        /* renamed from: a */
        public byte[] m30541a() {
            byte[] bArr = this.f9007h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5149e)) {
                return false;
            }
            C5149e eVar = (C5149e) obj;
            if (!this.f9000a.equals(eVar.f9000a) || !C7557q0.m22159c(this.f9001b, eVar.f9001b) || !C7557q0.m22159c(this.f9002c, eVar.f9002c) || this.f9003d != eVar.f9003d || this.f9005f != eVar.f9005f || this.f9004e != eVar.f9004e || !this.f9006g.equals(eVar.f9006g) || !Arrays.equals(this.f9007h, eVar.f9007h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f9000a.hashCode() * 31;
            Uri uri = this.f9001b;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.f9002c.hashCode()) * 31) + (this.f9003d ? 1 : 0)) * 31) + (this.f9005f ? 1 : 0)) * 31) + (this.f9004e ? 1 : 0)) * 31) + this.f9006g.hashCode()) * 31) + Arrays.hashCode(this.f9007h);
        }

        private C5149e(UUID uuid, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            C7510a.m22371a(!z2 || uri != null);
            this.f9000a = uuid;
            this.f9001b = uri;
            this.f9002c = map;
            this.f9003d = z;
            this.f9005f = z2;
            this.f9004e = z3;
            this.f9006g = list;
            this.f9007h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$f */
    /* loaded from: classes7.dex */
    public static final class C5150f {

        /* renamed from: f */
        public static final C5150f f9008f = new C5150f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: a */
        public final long f9009a;

        /* renamed from: b */
        public final long f9010b;

        /* renamed from: c */
        public final long f9011c;

        /* renamed from: d */
        public final float f9012d;

        /* renamed from: e */
        public final float f9013e;

        public C5150f(long j, long j2, long j3, float f, float f2) {
            this.f9009a = j;
            this.f9010b = j2;
            this.f9011c = j3;
            this.f9012d = f;
            this.f9013e = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5150f)) {
                return false;
            }
            C5150f fVar = (C5150f) obj;
            if (this.f9009a == fVar.f9009a && this.f9010b == fVar.f9010b && this.f9011c == fVar.f9011c && this.f9012d == fVar.f9012d && this.f9013e == fVar.f9013e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.f9009a;
            long j2 = this.f9010b;
            long j3 = this.f9011c;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f9012d;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f9013e;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$g */
    /* loaded from: classes7.dex */
    public static final class C5151g {

        /* renamed from: a */
        public final Uri f9014a;

        /* renamed from: b */
        public final String f9015b;

        /* renamed from: c */
        public final C5149e f9016c;

        /* renamed from: d */
        public final C5146b f9017d;

        /* renamed from: e */
        public final List<C7937c> f9018e;

        /* renamed from: f */
        public final String f9019f;

        /* renamed from: g */
        public final List<C5152h> f9020g;

        /* renamed from: h */
        public final Object f9021h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5151g)) {
                return false;
            }
            C5151g gVar = (C5151g) obj;
            if (!this.f9014a.equals(gVar.f9014a) || !C7557q0.m22159c(this.f9015b, gVar.f9015b) || !C7557q0.m22159c(this.f9016c, gVar.f9016c) || !C7557q0.m22159c(this.f9017d, gVar.f9017d) || !this.f9018e.equals(gVar.f9018e) || !C7557q0.m22159c(this.f9019f, gVar.f9019f) || !this.f9020g.equals(gVar.f9020g) || !C7557q0.m22159c(this.f9021h, gVar.f9021h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int hashCode = this.f9014a.hashCode() * 31;
            String str = this.f9015b;
            int i5 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i6 = (hashCode + i) * 31;
            C5149e eVar = this.f9016c;
            if (eVar == null) {
                i2 = 0;
            } else {
                i2 = eVar.hashCode();
            }
            int i7 = (i6 + i2) * 31;
            C5146b bVar = this.f9017d;
            if (bVar == null) {
                i3 = 0;
            } else {
                i3 = bVar.hashCode();
            }
            int hashCode2 = (((i7 + i3) * 31) + this.f9018e.hashCode()) * 31;
            String str2 = this.f9019f;
            if (str2 == null) {
                i4 = 0;
            } else {
                i4 = str2.hashCode();
            }
            int hashCode3 = (((hashCode2 + i4) * 31) + this.f9020g.hashCode()) * 31;
            Object obj = this.f9021h;
            if (obj != null) {
                i5 = obj.hashCode();
            }
            return hashCode3 + i5;
        }

        private C5151g(Uri uri, String str, C5149e eVar, C5146b bVar, List<C7937c> list, String str2, List<C5152h> list2, Object obj) {
            this.f9014a = uri;
            this.f9015b = str;
            this.f9016c = eVar;
            this.f9017d = bVar;
            this.f9018e = list;
            this.f9019f = str2;
            this.f9020g = list2;
            this.f9021h = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$h */
    /* loaded from: classes7.dex */
    public static final class C5152h {

        /* renamed from: a */
        public final Uri f9022a;

        /* renamed from: b */
        public final String f9023b;

        /* renamed from: c */
        public final String f9024c;

        /* renamed from: d */
        public final int f9025d;

        /* renamed from: e */
        public final int f9026e;

        /* renamed from: f */
        public final String f9027f;

        public C5152h(Uri uri, String str, String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5152h)) {
                return false;
            }
            C5152h hVar = (C5152h) obj;
            if (!this.f9022a.equals(hVar.f9022a) || !this.f9023b.equals(hVar.f9023b) || !C7557q0.m22159c(this.f9024c, hVar.f9024c) || this.f9025d != hVar.f9025d || this.f9026e != hVar.f9026e || !C7557q0.m22159c(this.f9027f, hVar.f9027f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f9022a.hashCode() * 31) + this.f9023b.hashCode()) * 31;
            String str = this.f9024c;
            int i2 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i3 = (((((hashCode + i) * 31) + this.f9025d) * 31) + this.f9026e) * 31;
            String str2 = this.f9027f;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public C5152h(Uri uri, String str, String str2, int i, int i2, String str3) {
            this.f9022a = uri;
            this.f9023b = str;
            this.f9024c = str2;
            this.f9025d = i;
            this.f9026e = i2;
            this.f9027f = str3;
        }
    }

    /* renamed from: b */
    public static MediaItem m30552b(String str) {
        return new C5147c().m30542j(str).m30551a();
    }

    /* renamed from: a */
    public C5147c m30553a() {
        return new C5147c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        if (!C7557q0.m22159c(this.f8962a, mediaItem.f8962a) || !this.f8966e.equals(mediaItem.f8966e) || !C7557q0.m22159c(this.f8963b, mediaItem.f8963b) || !C7557q0.m22159c(this.f8964c, mediaItem.f8964c) || !C7557q0.m22159c(this.f8965d, mediaItem.f8965d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f8962a.hashCode() * 31;
        C5151g gVar = this.f8963b;
        if (gVar != null) {
            i = gVar.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + this.f8964c.hashCode()) * 31) + this.f8966e.hashCode()) * 31) + this.f8965d.hashCode();
    }

    private MediaItem(String str, C5148d dVar, C5151g gVar, C5150f fVar, C5194i0 i0Var) {
        this.f8962a = str;
        this.f8963b = gVar;
        this.f8964c = fVar;
        this.f8965d = i0Var;
        this.f8966e = dVar;
    }
}
