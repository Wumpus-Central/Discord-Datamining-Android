package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.dash.AbstractC5232a;
import com.google.android.exoplayer2.source.dash.C5235c;
import com.google.android.exoplayer2.source.dash.C5239e;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.C5328i;
import com.google.android.exoplayer2.upstream.DataSource;
import com.reactnativecommunity.webview.RNCWebViewManager;
import ec.C6814b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p030bc.C3452d;
import p079e7.C6713c;
import p079e7.C6720i;
import p079e7.C6728o;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6790t;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p119g9.C7527g0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p132h8.C7936b;
import p132h8.C7937c;
import p153i8.AbstractC8230a;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8236c0;
import p153i8.AbstractC8252h;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p153i8.C8254i;
import p153i8.C8273n;
import p153i8.C8284q;
import p163j$.util.DesugarTimeZone;
import p193k7.AbstractC9818x;
import p193k7.AbstractC9820y;
import p193k7.C9796k;
import p212l8.AbstractC10357e;
import p229m8.AbstractC10547i;
import p229m8.C10538a;
import p229m8.C10539b;
import p229m8.C10540c;
import p229m8.C10544f;
import p229m8.C10560n;

/* loaded from: classes7.dex */
public final class DashMediaSource extends AbstractC8230a {

    /* renamed from: A */
    private final C5228e f37251A;

    /* renamed from: B */
    private final Object f37252B;

    /* renamed from: C */
    private final SparseArray<C5233b> f37253C;

    /* renamed from: D */
    private final Runnable f37254D;

    /* renamed from: E */
    private final Runnable f37255E;

    /* renamed from: F */
    private final C5239e.AbstractC5241b f37256F;

    /* renamed from: G */
    private final AbstractC6790t f37257G;

    /* renamed from: H */
    private DataSource f37258H;

    /* renamed from: I */
    private C5320h f37259I;

    /* renamed from: J */
    private AbstractC6795x f37260J;

    /* renamed from: K */
    private IOException f37261K;

    /* renamed from: L */
    private Handler f37262L;

    /* renamed from: M */
    private MediaItem.C5150f f37263M;

    /* renamed from: N */
    private Uri f37264N;

    /* renamed from: O */
    private Uri f37265O;

    /* renamed from: P */
    private C10539b f37266P;

    /* renamed from: Q */
    private boolean f37267Q;

    /* renamed from: R */
    private long f37268R;

    /* renamed from: S */
    private long f37269S;

    /* renamed from: T */
    private long f37270T;

    /* renamed from: U */
    private int f37271U;

    /* renamed from: V */
    private long f37272V;

    /* renamed from: W */
    private int f37273W;

    /* renamed from: q */
    private final MediaItem f9365q;

    /* renamed from: r */
    private final boolean f9366r;

    /* renamed from: s */
    private final DataSource.Factory f9367s;

    /* renamed from: t */
    private final AbstractC5232a.AbstractC0140a f9368t;

    /* renamed from: u */
    private final AbstractC8252h f9369u;

    /* renamed from: v */
    private final AbstractC9818x f9370v;

    /* renamed from: w */
    private final AbstractC5318g f9371w;

    /* renamed from: x */
    private final long f9372x;

    /* renamed from: y */
    private final AbstractC8233b0.C8234a f9373y;

    /* renamed from: z */
    private final C5328i.AbstractC5329a<? extends C10539b> f9374z;

    /* loaded from: classes7.dex */
    public static final class Factory implements AbstractC8236c0 {

        /* renamed from: a */
        private final AbstractC5232a.AbstractC0140a f9375a;

        /* renamed from: b */
        private final DataSource.Factory f9376b;

        /* renamed from: c */
        private boolean f9377c;

        /* renamed from: d */
        private AbstractC9820y f9378d;

        /* renamed from: e */
        private AbstractC8252h f9379e;

        /* renamed from: f */
        private AbstractC5318g f9380f;

        /* renamed from: g */
        private long f9381g;

        /* renamed from: h */
        private long f9382h;

        /* renamed from: i */
        private C5328i.AbstractC5329a<? extends C10539b> f9383i;

        /* renamed from: j */
        private List<C7937c> f9384j;

        /* renamed from: k */
        private Object f9385k;

        public Factory(DataSource.Factory factory) {
            this(new C5235c.C5236a(factory), factory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ AbstractC9818x m29958d(AbstractC9818x xVar, MediaItem mediaItem) {
            return xVar;
        }

        @Deprecated
        /* renamed from: b */
        public DashMediaSource m29960b(Uri uri) {
            return m29959c(new MediaItem.C5147c().m30543i(uri).m30547e("application/dash+xml").m30544h(this.f9385k).m30551a());
        }

        /* renamed from: c */
        public DashMediaSource m29959c(MediaItem mediaItem) {
            List<C7937c> list;
            C7936b bVar;
            boolean z;
            boolean z2;
            MediaItem mediaItem2 = mediaItem;
            C7510a.m22367e(mediaItem2.f8963b);
            C5328i.AbstractC5329a aVar = this.f9383i;
            if (aVar == null) {
                aVar = new C10540c();
            }
            if (mediaItem2.f8963b.f9018e.isEmpty()) {
                list = this.f9384j;
            } else {
                list = mediaItem2.f8963b.f9018e;
            }
            if (!list.isEmpty()) {
                bVar = new C7936b(aVar, list);
            } else {
                bVar = aVar;
            }
            MediaItem.C5151g gVar = mediaItem2.f8963b;
            boolean z3 = true;
            if (gVar.f9021h != null || this.f9385k == null) {
                z = false;
            } else {
                z = true;
            }
            if (!gVar.f9018e.isEmpty() || list.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (mediaItem2.f8964c.f9009a != -9223372036854775807L || this.f9381g == -9223372036854775807L) {
                z3 = false;
            }
            if (z || z2 || z3) {
                MediaItem.C5147c a = mediaItem.m30553a();
                if (z) {
                    a.m30544h(this.f9385k);
                }
                if (z2) {
                    a.m30546f(list);
                }
                if (z3) {
                    a.m30549c(this.f9381g);
                }
                mediaItem2 = a.m30551a();
            }
            return new DashMediaSource(mediaItem2, null, this.f9376b, bVar, this.f9375a, this.f9379e, this.f9378d.mo9295a(mediaItem2), this.f9380f, this.f9382h, null);
        }

        /* renamed from: e */
        public Factory m29957e(final AbstractC9818x xVar) {
            if (xVar == null) {
                m29956f(null);
            } else {
                m29956f(new AbstractC9820y() { // from class: l8.d
                    @Override // p193k7.AbstractC9820y
                    /* renamed from: a */
                    public final AbstractC9818x mo9295a(MediaItem mediaItem) {
                        AbstractC9818x d;
                        d = DashMediaSource.Factory.m29958d(AbstractC9818x.this, mediaItem);
                        return d;
                    }
                });
            }
            return this;
        }

        /* renamed from: f */
        public Factory m29956f(AbstractC9820y yVar) {
            if (yVar != null) {
                this.f9378d = yVar;
                this.f9377c = true;
            } else {
                this.f9378d = new C9796k();
                this.f9377c = false;
            }
            return this;
        }

        /* renamed from: g */
        public Factory m29955g(AbstractC5318g gVar) {
            if (gVar == null) {
                gVar = new C5309d();
            }
            this.f9380f = gVar;
            return this;
        }

        public Factory(AbstractC5232a.AbstractC0140a aVar, DataSource.Factory factory) {
            this.f9375a = (AbstractC5232a.AbstractC0140a) C7510a.m22367e(aVar);
            this.f9376b = factory;
            this.f9378d = new C9796k();
            this.f9380f = new C5309d();
            this.f9381g = -9223372036854775807L;
            this.f9382h = 30000L;
            this.f9379e = new C8254i();
            this.f9384j = Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    /* loaded from: classes7.dex */
    public class C5224a implements C7527g0.AbstractC7529b {
        C5224a() {
        }

        @Override // p119g9.C7527g0.AbstractC7529b
        /* renamed from: a */
        public void mo22310a(IOException iOException) {
            DashMediaSource.this.m29971Y(iOException);
        }

        @Override // p119g9.C7527g0.AbstractC7529b
        /* renamed from: b */
        public void mo22309b() {
            DashMediaSource.this.m29970Z(C7527g0.m22318h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    /* loaded from: classes7.dex */
    public static final class C5225b extends Timeline {

        /* renamed from: b */
        private final long f9387b;

        /* renamed from: c */
        private final long f9388c;

        /* renamed from: d */
        private final long f9389d;

        /* renamed from: e */
        private final int f9390e;

        /* renamed from: f */
        private final long f9391f;

        /* renamed from: g */
        private final long f9392g;

        /* renamed from: h */
        private final long f9393h;

        /* renamed from: i */
        private final C10539b f9394i;

        /* renamed from: j */
        private final MediaItem f9395j;

        /* renamed from: k */
        private final MediaItem.C5150f f9396k;

        public C5225b(long j, long j2, long j3, int i, long j4, long j5, long j6, C10539b bVar, MediaItem mediaItem, MediaItem.C5150f fVar) {
            boolean z;
            boolean z2 = bVar.f23307d;
            boolean z3 = true;
            if (fVar != null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z2 != z ? false : z3);
            this.f9387b = j;
            this.f9388c = j2;
            this.f9389d = j3;
            this.f9390e = i;
            this.f9391f = j4;
            this.f9392g = j5;
            this.f9393h = j6;
            this.f9394i = bVar;
            this.f9395j = mediaItem;
            this.f9396k = fVar;
        }

        /* renamed from: s */
        private long m29954s(long j) {
            long j2 = this.f9393h;
            if (!m29953t(this.f9394i)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f9392g) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f9391f + j2;
            long g = this.f9394i.m12919g(0);
            int i = 0;
            while (i < this.f9394i.m12921e() - 1 && j3 >= g) {
                j3 -= g;
                i++;
                g = this.f9394i.m12919g(i);
            }
            C10544f d = this.f9394i.m12922d(i);
            int a = d.m12849a(2);
            if (a == -1) {
                return j2;
            }
            AbstractC10357e b = d.f23339c.get(a).f23300c.get(0).mo12841b();
            if (b == null || b.mo12820i(g) == 0) {
                return j2;
            }
            return (j2 + b.mo12826c(b.mo12821h(j3, g))) - j3;
        }

        /* renamed from: t */
        private static boolean m29953t(C10539b bVar) {
            return bVar.f23307d && bVar.f23308e != -9223372036854775807L && bVar.f23305b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo20027b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f9390e) >= 0 && intValue < mo20025i()) {
                return intValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
            String str;
            C7510a.m22369c(i, 0, mo20025i());
            Integer num = null;
            if (z) {
                str = this.f9394i.m12922d(i).f23337a;
            } else {
                str = null;
            }
            if (z) {
                num = Integer.valueOf(this.f9390e + i);
            }
            return bVar.m30420n(str, num, 0, this.f9394i.m12919g(i), C6713c.m24566c(this.f9394i.m12922d(i).f23338b - this.f9394i.m12922d(0).f23338b) - this.f9391f);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo20025i() {
            return this.f9394i.m12921e();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo20024m(int i) {
            C7510a.m22369c(i, 0, mo20025i());
            return Integer.valueOf(this.f9390e + i);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
            C7510a.m22369c(i, 0, 1);
            long s = m29954s(j);
            Object obj = Timeline.C5161c.f9088r;
            MediaItem mediaItem = this.f9395j;
            C10539b bVar = this.f9394i;
            return cVar.m30412g(obj, mediaItem, bVar, this.f9387b, this.f9388c, this.f9389d, true, m29953t(bVar), this.f9396k, s, this.f9392g, 0, mo20025i() - 1, this.f9391f);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo20022p() {
            return 1;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    /* loaded from: classes7.dex */
    private final class C5226c implements C5239e.AbstractC5241b {
        private C5226c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.C5239e.AbstractC5241b
        /* renamed from: a */
        public void mo29876a(long j) {
            DashMediaSource.this.m29978R(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.C5239e.AbstractC5241b
        /* renamed from: b */
        public void mo29875b() {
            DashMediaSource.this.m29977S();
        }

        /* synthetic */ C5226c(DashMediaSource dashMediaSource, C5224a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    /* loaded from: classes7.dex */
    public static final class C5227d implements C5328i.AbstractC5329a<Long> {

        /* renamed from: a */
        private static final Pattern f9398a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        C5227d() {
        }

        /* renamed from: b */
        public Long mo7921a(Uri uri, InputStream inputStream) {
            long j;
            long j2;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, C3452d.f5595c)).readLine();
            try {
                Matcher matcher = f9398a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if ("+".equals(matcher.group(4))) {
                            j = 1;
                        } else {
                            j = -1;
                        }
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            j2 = 0;
                        } else {
                            j2 = Long.parseLong(group2);
                        }
                        time -= j * ((((parseLong * 60) + j2) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw new C6728o("Couldn't parse timestamp: " + readLine);
            } catch (ParseException e) {
                throw new C6728o(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    /* loaded from: classes7.dex */
    public final class C5228e implements C5320h.AbstractC5322b<C5328i<C10539b>> {
        private C5228e() {
        }

        /* renamed from: a */
        public void mo10446i(C5328i<C10539b> iVar, long j, long j2, boolean z) {
            DashMediaSource.this.m29976T(iVar, j, j2);
        }

        /* renamed from: b */
        public void mo10444k(C5328i<C10539b> iVar, long j, long j2) {
            DashMediaSource.this.m29975U(iVar, j, j2);
        }

        /* renamed from: c */
        public C5320h.C5323c mo10440o(C5328i<C10539b> iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m29974V(iVar, j, j2, iOException, i);
        }

        /* synthetic */ C5228e(DashMediaSource dashMediaSource, C5224a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    /* loaded from: classes7.dex */
    final class C5229f implements AbstractC6790t {
        C5229f() {
        }

        /* renamed from: b */
        private void m29948b() {
            if (DashMediaSource.this.f37261K != null) {
                throw DashMediaSource.this.f37261K;
            }
        }

        @Override // p081e9.AbstractC6790t
        /* renamed from: a */
        public void mo24321a() {
            DashMediaSource.this.f37259I.mo24321a();
            m29948b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    /* loaded from: classes7.dex */
    public final class C5230g implements C5320h.AbstractC5322b<C5328i<Long>> {
        private C5230g() {
        }

        /* renamed from: a */
        public void mo10446i(C5328i<Long> iVar, long j, long j2, boolean z) {
            DashMediaSource.this.m29976T(iVar, j, j2);
        }

        /* renamed from: b */
        public void mo10444k(C5328i<Long> iVar, long j, long j2) {
            DashMediaSource.this.m29973W(iVar, j, j2);
        }

        /* renamed from: c */
        public C5320h.C5323c mo10440o(C5328i<Long> iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.m29972X(iVar, j, j2, iOException);
        }

        /* synthetic */ C5230g(DashMediaSource dashMediaSource, C5224a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    /* loaded from: classes7.dex */
    public static final class C5231h implements C5328i.AbstractC5329a<Long> {
        private C5231h() {
        }

        /* synthetic */ C5231h(C5224a aVar) {
            this();
        }

        /* renamed from: b */
        public Long mo7921a(Uri uri, InputStream inputStream) {
            return Long.valueOf(C7557q0.m22208D0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C6720i.m24534a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(MediaItem mediaItem, C10539b bVar, DataSource.Factory factory, C5328i.AbstractC5329a aVar, AbstractC5232a.AbstractC0140a aVar2, AbstractC8252h hVar, AbstractC9818x xVar, AbstractC5318g gVar, long j, C5224a aVar3) {
        this(mediaItem, bVar, factory, aVar, aVar2, hVar, xVar, gVar, j);
    }

    /* renamed from: J */
    private static long m29986J(C10544f fVar, long j, long j2) {
        int i;
        long c = C6713c.m24566c(fVar.f23338b);
        boolean N = m29982N(fVar);
        long j3 = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (i3 < fVar.f23339c.size()) {
            C10538a aVar = fVar.f23339c.get(i3);
            List<AbstractC10547i> list = aVar.f23300c;
            if ((!N || aVar.f23299b != 3) && !list.isEmpty()) {
                AbstractC10357e b = list.get(i2).mo12841b();
                if (b == null) {
                    return c + j;
                }
                int l = b.mo12817l(j, j2);
                if (l == 0) {
                    return c;
                }
                i = i3;
                long e = (b.mo12824e(j, j2) + l) - 1;
                j3 = Math.min(j3, b.mo12826c(e) + c + b.mo12825d(e, j));
            } else {
                i = i3;
            }
            i3 = i + 1;
            i2 = 0;
        }
        return j3;
    }

    /* renamed from: K */
    private static long m29985K(C10544f fVar, long j, long j2) {
        long c = C6713c.m24566c(fVar.f23338b);
        boolean N = m29982N(fVar);
        long j3 = c;
        for (int i = 0; i < fVar.f23339c.size(); i++) {
            C10538a aVar = fVar.f23339c.get(i);
            List<AbstractC10547i> list = aVar.f23300c;
            if ((!N || aVar.f23299b != 3) && !list.isEmpty()) {
                AbstractC10357e b = list.get(0).mo12841b();
                if (b == null) {
                    return c;
                }
                if (b.mo12817l(j, j2) == 0) {
                    return c;
                }
                j3 = Math.max(j3, b.mo12826c(b.mo12824e(j, j2)) + c);
            }
        }
        return j3;
    }

    /* renamed from: L */
    private static long m29984L(C10539b bVar, long j) {
        AbstractC10357e b;
        int e = bVar.m12921e() - 1;
        C10544f d = bVar.m12922d(e);
        long c = C6713c.m24566c(d.f23338b);
        long g = bVar.m12919g(e);
        long c2 = C6713c.m24566c(j);
        long c3 = C6713c.m24566c(bVar.f23304a);
        long c4 = C6713c.m24566c(5000L);
        for (int i = 0; i < d.f23339c.size(); i++) {
            List<AbstractC10547i> list = d.f23339c.get(i).f23300c;
            if (!list.isEmpty() && (b = list.get(0).mo12841b()) != null) {
                long f = ((c3 + c) + b.mo12823f(g, c2)) - c2;
                if (f < c4 - 100000 || (f > c4 && f < c4 + 100000)) {
                    c4 = f;
                }
            }
        }
        return C6814b.m24296a(c4, 1000L, RoundingMode.CEILING);
    }

    /* renamed from: M */
    private long m29983M() {
        return Math.min((this.f37271U - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
    }

    /* renamed from: N */
    private static boolean m29982N(C10544f fVar) {
        for (int i = 0; i < fVar.f23339c.size(); i++) {
            int i2 = fVar.f23339c.get(i).f23299b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    private static boolean m29981O(C10544f fVar) {
        for (int i = 0; i < fVar.f23339c.size(); i++) {
            AbstractC10357e b = fVar.f23339c.get(i).f23300c.get(0).mo12841b();
            if (b == null || b.mo12819j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m29980P() {
        m29969a0(false);
    }

    /* renamed from: Q */
    private void m29979Q() {
        C7527g0.m22316j(this.f37259I, new C5224a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m29971Y(IOException iOException) {
        C7558r.m22108d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m29969a0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m29970Z(long j) {
        this.f37270T = j;
        m29969a0(true);
    }

    /* renamed from: a0 */
    private void m29969a0(boolean z) {
        boolean z2;
        long j;
        long j2;
        C10544f fVar;
        MediaItem.C5150f fVar2;
        boolean z3;
        for (int i = 0; i < this.f37253C.size(); i++) {
            int keyAt = this.f37253C.keyAt(i);
            if (keyAt >= this.f37273W) {
                this.f37253C.valueAt(i).m29931M(this.f37266P, keyAt - this.f37273W);
            }
        }
        C10544f d = this.f37266P.m12922d(0);
        int e = this.f37266P.m12921e() - 1;
        C10544f d2 = this.f37266P.m12922d(e);
        long g = this.f37266P.m12919g(e);
        long c = C6713c.m24566c(C7557q0.m22165Z(this.f37270T));
        long K = m29985K(d, this.f37266P.m12919g(0), c);
        long J = m29986J(d2, g, c);
        if (!this.f37266P.f23307d || m29981O(d2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            long j3 = this.f37266P.f23309f;
            if (j3 != -9223372036854775807L) {
                K = Math.max(K, J - C6713c.m24566c(j3));
            }
        }
        long j4 = J - K;
        C10539b bVar = this.f37266P;
        if (bVar.f23307d) {
            if (bVar.f23304a != -9223372036854775807L) {
                z3 = true;
            } else {
                z3 = false;
            }
            C7510a.m22366f(z3);
            long c2 = (c - C6713c.m24566c(this.f37266P.f23304a)) - K;
            m29962h0(c2, j4);
            long d3 = this.f37266P.f23304a + C6713c.m24565d(K);
            long c3 = c2 - C6713c.m24566c(this.f37263M.f9009a);
            long min = Math.min(5000000L, j4 / 2);
            j2 = d3;
            if (c3 < min) {
                j = min;
            } else {
                j = c3;
            }
            fVar = d;
        } else {
            fVar = d;
            j2 = -9223372036854775807L;
            j = 0;
        }
        long c4 = K - C6713c.m24566c(fVar.f23338b);
        C10539b bVar2 = this.f37266P;
        long j5 = bVar2.f23304a;
        long j6 = this.f37270T;
        int i2 = this.f37273W;
        MediaItem mediaItem = this.f9365q;
        if (bVar2.f23307d) {
            fVar2 = this.f37263M;
        } else {
            fVar2 = null;
        }
        m20266B(new C5225b(j5, j2, j6, i2, c4, j4, j, bVar2, mediaItem, fVar2));
        if (!this.f9366r) {
            this.f37262L.removeCallbacks(this.f37255E);
            if (z2) {
                this.f37262L.postDelayed(this.f37255E, m29984L(this.f37266P, C7557q0.m22165Z(this.f37270T)));
            }
            if (this.f37267Q) {
                m29963g0();
            } else if (z) {
                C10539b bVar3 = this.f37266P;
                if (bVar3.f23307d) {
                    long j7 = bVar3.f23308e;
                    if (j7 != -9223372036854775807L) {
                        if (j7 == 0) {
                            j7 = 5000;
                        }
                        m29965e0(Math.max(0L, (this.f37268R + j7) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    private void m29968b0(C10560n nVar) {
        String str = nVar.f23390a;
        if (C7557q0.m22159c(str, "urn:mpeg:dash:utc:direct:2014") || C7557q0.m22159c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m29967c0(nVar);
        } else if (C7557q0.m22159c(str, "urn:mpeg:dash:utc:http-iso:2014") || C7557q0.m22159c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m29966d0(nVar, new C5227d());
        } else if (C7557q0.m22159c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || C7557q0.m22159c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m29966d0(nVar, new C5231h(null));
        } else if (C7557q0.m22159c(str, "urn:mpeg:dash:utc:ntp:2014") || C7557q0.m22159c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m29979Q();
        } else {
            m29971Y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: c0 */
    private void m29967c0(C10560n nVar) {
        try {
            m29970Z(C7557q0.m22208D0(nVar.f23391b) - this.f37269S);
        } catch (C6728o e) {
            m29971Y(e);
        }
    }

    /* renamed from: d0 */
    private void m29966d0(C10560n nVar, C5328i.AbstractC5329a<Long> aVar) {
        m29964f0(new C5328i(this.f37258H, Uri.parse(nVar.f23391b), 5, aVar), new C5230g(this, null), 1);
    }

    /* renamed from: e0 */
    private void m29965e0(long j) {
        this.f37262L.postDelayed(this.f37254D, j);
    }

    /* renamed from: f0 */
    private <T> void m29964f0(C5328i<T> iVar, C5320h.AbstractC5322b<C5328i<T>> bVar, int i) {
        this.f9373y.m20228z(new C8273n(iVar.f9894a, iVar.f9895b, this.f37259I.m29473n(iVar, bVar, i)), iVar.f9896c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m29963g0() {
        Uri uri;
        this.f37262L.removeCallbacks(this.f37254D);
        if (!this.f37259I.m29478i()) {
            if (this.f37259I.m29477j()) {
                this.f37267Q = true;
                return;
            }
            synchronized (this.f37252B) {
                uri = this.f37264N;
            }
            this.f37267Q = false;
            m29964f0(new C5328i(this.f37258H, uri, 4, this.f9374z), this.f37251A, this.f9371w.mo29487c(4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r5 != (-9223372036854775807L)) goto L_0x002c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 != (-9223372036854775807L)) goto L_0x0022;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29962h0(long r15, long r17) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m29962h0(long, long):void");
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    protected void mo20008A(AbstractC6795x xVar) {
        this.f37260J = xVar;
        this.f9370v.mo15275c();
        if (this.f9366r) {
            m29969a0(false);
            return;
        }
        this.f37258H = this.f9367s.createDataSource();
        this.f37259I = new C5320h("Loader:DashMediaSource");
        this.f37262L = C7557q0.m22117x();
        m29963g0();
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    protected void mo20007C() {
        C10539b bVar;
        this.f37267Q = false;
        this.f37258H = null;
        C5320h hVar = this.f37259I;
        if (hVar != null) {
            hVar.m29475l();
            this.f37259I = null;
        }
        this.f37268R = 0L;
        this.f37269S = 0L;
        if (this.f9366r) {
            bVar = this.f37266P;
        } else {
            bVar = null;
        }
        this.f37266P = bVar;
        this.f37264N = this.f37265O;
        this.f37261K = null;
        Handler handler = this.f37262L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f37262L = null;
        }
        this.f37270T = -9223372036854775807L;
        this.f37271U = 0;
        this.f37272V = -9223372036854775807L;
        this.f37273W = 0;
        this.f37253C.clear();
        this.f9370v.release();
    }

    /* renamed from: R */
    void m29978R(long j) {
        long j2 = this.f37272V;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f37272V = j;
        }
    }

    /* renamed from: S */
    void m29977S() {
        this.f37262L.removeCallbacks(this.f37255E);
        m29963g0();
    }

    /* renamed from: T */
    void m29976T(C5328i<?> iVar, long j, long j2) {
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        this.f9371w.mo29486d(iVar.f9894a);
        this.f9373y.m20237q(nVar, iVar.f9896c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m29975U(com.google.android.exoplayer2.upstream.C5328i<p229m8.C10539b> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m29975U(com.google.android.exoplayer2.upstream.i, long, long):void");
    }

    /* renamed from: V */
    C5320h.C5323c m29974V(C5328i<C10539b> iVar, long j, long j2, IOException iOException, int i) {
        C5320h.C5323c cVar;
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        long a = this.f9371w.mo29489a(new AbstractC5318g.C5319a(nVar, new C8284q(iVar.f9896c), iOException, i));
        if (a == -9223372036854775807L) {
            cVar = C5320h.f9877g;
        } else {
            cVar = C5320h.m29479h(false, a);
        }
        boolean z = !cVar.m29470c();
        this.f9373y.m20230x(nVar, iVar.f9896c, iOException, z);
        if (z) {
            this.f9371w.mo29486d(iVar.f9894a);
        }
        return cVar;
    }

    /* renamed from: W */
    void m29973W(C5328i<Long> iVar, long j, long j2) {
        C8273n nVar = new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b());
        this.f9371w.mo29486d(iVar.f9894a);
        this.f9373y.m20234t(nVar, iVar.f9896c);
        m29970Z(iVar.m29461e().longValue() - j);
    }

    /* renamed from: X */
    C5320h.C5323c m29972X(C5328i<Long> iVar, long j, long j2, IOException iOException) {
        this.f9373y.m20230x(new C8273n(iVar.f9894a, iVar.f9895b, iVar.m29460f(), iVar.m29462d(), j, j2, iVar.m29463b()), iVar.f9896c, iOException, true);
        this.f9371w.mo29486d(iVar.f9894a);
        m29971Y(iOException);
        return C5320h.f9876f;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: c */
    public MediaItem mo20004c() {
        return this.f9365q;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: l */
    public void mo19998l(AbstractC8287r rVar) {
        C5233b bVar = (C5233b) rVar;
        bVar.m29935I();
        this.f37253C.remove(bVar.f9402k);
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: m */
    public AbstractC8287r mo19997m(AbstractC8299u.C8300a aVar, AbstractC6765b bVar, long j) {
        int intValue = ((Integer) aVar.f18059a).intValue() - this.f37273W;
        AbstractC8233b0.C8234a w = m20261w(aVar, this.f37266P.m12922d(intValue).f23338b);
        C5233b bVar2 = new C5233b(this.f37273W + intValue, this.f37266P, intValue, this.f9368t, this.f37260J, this.f9370v, m20264t(aVar), this.f9371w, w, this.f37270T, this.f37257G, bVar, this.f9369u, this.f37256F);
        this.f37253C.put(bVar2.f9402k, bVar2);
        return bVar2;
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
        this.f37257G.mo24321a();
    }

    private DashMediaSource(MediaItem mediaItem, C10539b bVar, DataSource.Factory factory, C5328i.AbstractC5329a<? extends C10539b> aVar, AbstractC5232a.AbstractC0140a aVar2, AbstractC8252h hVar, AbstractC9818x xVar, AbstractC5318g gVar, long j) {
        this.f9365q = mediaItem;
        this.f37263M = mediaItem.f8964c;
        this.f37264N = ((MediaItem.C5151g) C7510a.m22367e(mediaItem.f8963b)).f9014a;
        this.f37265O = mediaItem.f8963b.f9014a;
        this.f37266P = bVar;
        this.f9367s = factory;
        this.f9374z = aVar;
        this.f9368t = aVar2;
        this.f9370v = xVar;
        this.f9371w = gVar;
        this.f9372x = j;
        this.f9369u = hVar;
        boolean z = bVar != null;
        this.f9366r = z;
        this.f9373y = m20262v(null);
        this.f37252B = new Object();
        this.f37253C = new SparseArray<>();
        this.f37256F = new C5226c(this, null);
        this.f37272V = -9223372036854775807L;
        this.f37270T = -9223372036854775807L;
        if (z) {
            C7510a.m22366f(true ^ bVar.f23307d);
            this.f37251A = null;
            this.f37254D = null;
            this.f37255E = null;
            this.f37257G = new AbstractC6790t.C6791a();
            return;
        }
        this.f37251A = new C5228e(this, null);
        this.f37257G = new C5229f();
        this.f37254D = new Runnable() { // from class: l8.b
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.m29963g0();
            }
        };
        this.f37255E = new Runnable() { // from class: l8.c
            @Override // java.lang.Runnable
            public final void run() {
                DashMediaSource.this.m29980P();
            }
        };
    }
}
