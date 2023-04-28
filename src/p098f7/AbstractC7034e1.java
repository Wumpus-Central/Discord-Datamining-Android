package p098f7;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.util.List;
import p030bc.C3456h;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7565v;
import p152i7.C8221f;
import p152i7.C8225i;
import p153i8.AbstractC8299u;
import p153i8.C8273n;
import p153i8.C8284q;
import p459z7.C14576a;

/* renamed from: f7.e1 */
/* loaded from: classes7.dex */
public interface AbstractC7034e1 {

    /* renamed from: f7.e1$a */
    /* loaded from: classes7.dex */
    public static final class C7035a {

        /* renamed from: a */
        public final long f15353a;

        /* renamed from: b */
        public final Timeline f15354b;

        /* renamed from: c */
        public final int f15355c;

        /* renamed from: d */
        public final AbstractC8299u.C8300a f15356d;

        /* renamed from: e */
        public final long f15357e;

        /* renamed from: f */
        public final Timeline f15358f;

        /* renamed from: g */
        public final int f15359g;

        /* renamed from: h */
        public final AbstractC8299u.C8300a f15360h;

        /* renamed from: i */
        public final long f15361i;

        /* renamed from: j */
        public final long f15362j;

        public C7035a(long j, Timeline timeline, int i, AbstractC8299u.C8300a aVar, long j2, Timeline timeline2, int i2, AbstractC8299u.C8300a aVar2, long j3, long j4) {
            this.f15353a = j;
            this.f15354b = timeline;
            this.f15355c = i;
            this.f15356d = aVar;
            this.f15357e = j2;
            this.f15358f = timeline2;
            this.f15359g = i2;
            this.f15360h = aVar2;
            this.f15361i = j3;
            this.f15362j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7035a.class != obj.getClass()) {
                return false;
            }
            C7035a aVar = (C7035a) obj;
            if (this.f15353a == aVar.f15353a && this.f15355c == aVar.f15355c && this.f15357e == aVar.f15357e && this.f15359g == aVar.f15359g && this.f15361i == aVar.f15361i && this.f15362j == aVar.f15362j && C3456h.m34362a(this.f15354b, aVar.f15354b) && C3456h.m34362a(this.f15356d, aVar.f15356d) && C3456h.m34362a(this.f15358f, aVar.f15358f) && C3456h.m34362a(this.f15360h, aVar.f15360h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C3456h.m34361b(Long.valueOf(this.f15353a), this.f15354b, Integer.valueOf(this.f15355c), this.f15356d, Long.valueOf(this.f15357e), this.f15358f, Integer.valueOf(this.f15359g), this.f15360h, Long.valueOf(this.f15361i), Long.valueOf(this.f15362j));
        }
    }

    /* renamed from: f7.e1$b */
    /* loaded from: classes7.dex */
    public static final class C7036b extends C7565v {

        /* renamed from: b */
        private final SparseArray<C7035a> f15363b = new SparseArray<>(0);

        @Override // p119g9.C7565v
        /* renamed from: b */
        public boolean mo22066b(int i) {
            return super.mo22066b(i);
        }

        @Override // p119g9.C7565v
        /* renamed from: d */
        public int mo22064d(int i) {
            return super.mo22064d(i);
        }

        /* renamed from: f */
        public void m23448f(SparseArray<C7035a> sparseArray) {
            this.f15363b.clear();
            for (int i = 0; i < m22063e(); i++) {
                int d = mo22064d(i);
                this.f15363b.append(d, (C7035a) C7510a.m22367e(sparseArray.get(d)));
            }
        }
    }

    @Deprecated
    /* renamed from: A */
    void m23505A(C7035a aVar, boolean z, int i);

    /* renamed from: B */
    void m23504B(C7035a aVar, String str, long j);

    /* renamed from: C */
    void m23503C(C7035a aVar, boolean z);

    /* renamed from: D */
    void m23502D(C7035a aVar, String str, long j);

    /* renamed from: E */
    void m23501E(C7035a aVar, int i, long j);

    /* renamed from: F */
    void m23500F(C7035a aVar, C8221f fVar);

    /* renamed from: G */
    void m23499G(C7035a aVar, C8284q qVar);

    /* renamed from: H */
    void m23498H(C7035a aVar);

    /* renamed from: I */
    void m23497I(C7035a aVar, long j);

    /* renamed from: J */
    void m23496J(C7035a aVar, long j, int i);

    /* renamed from: K */
    void m23495K(C7035a aVar, C8273n nVar, C8284q qVar, IOException iOException, boolean z);

    /* renamed from: L */
    void m23494L(C7035a aVar, Exception exc);

    /* renamed from: M */
    void m23493M(C7035a aVar, String str);

    @Deprecated
    /* renamed from: N */
    void m23492N(C7035a aVar, int i, C8221f fVar);

    @Deprecated
    /* renamed from: O */
    void m23491O(C7035a aVar);

    /* renamed from: P */
    void m23490P(C7035a aVar, C14576a aVar2);

    /* renamed from: Q */
    void m23489Q(C7035a aVar, List<C14576a> list);

    /* renamed from: R */
    void m23488R(C7035a aVar, int i);

    /* renamed from: S */
    void m23487S(C7035a aVar, Exception exc);

    @Deprecated
    /* renamed from: T */
    void m23486T(C7035a aVar, int i, String str, long j);

    /* renamed from: U */
    void m23485U(C7035a aVar, C8221f fVar);

    /* renamed from: V */
    void m23484V(C7035a aVar);

    /* renamed from: W */
    void m23483W(C7035a aVar, C8284q qVar);

    /* renamed from: X */
    void m23482X(Player player, C7036b bVar);

    /* renamed from: Y */
    void m23481Y(C7035a aVar, Surface surface);

    /* renamed from: Z */
    void m23480Z(C7035a aVar, boolean z);

    /* renamed from: a */
    void m23479a(C7035a aVar, C8273n nVar, C8284q qVar);

    @Deprecated
    /* renamed from: a0 */
    void m23478a0(C7035a aVar, int i, C8221f fVar);

    /* renamed from: b */
    void m23477b(C7035a aVar, MediaItem mediaItem, int i);

    /* renamed from: b0 */
    void m23476b0(C7035a aVar, int i, long j, long j2);

    /* renamed from: c */
    void m23475c(C7035a aVar, String str);

    /* renamed from: c0 */
    void m23474c0(C7035a aVar, C8221f fVar);

    /* renamed from: d */
    void m23473d(C7035a aVar, int i);

    /* renamed from: d0 */
    void m23472d0(C7035a aVar, C6722k kVar, C8225i iVar);

    /* renamed from: e */
    void m23471e(C7035a aVar, C8273n nVar, C8284q qVar);

    /* renamed from: e0 */
    void m23470e0(C7035a aVar);

    /* renamed from: f */
    void m23469f(C7035a aVar);

    /* renamed from: g */
    void m23468g(C7035a aVar, boolean z, int i);

    /* renamed from: h */
    void m23467h(C7035a aVar, int i, int i2);

    /* renamed from: i */
    void m23466i(C7035a aVar, PlaybackParameters playbackParameters);

    /* renamed from: j */
    void m23465j(C7035a aVar);

    /* renamed from: k */
    void m23464k(C7035a aVar, int i);

    /* renamed from: l */
    void m23463l(C7035a aVar, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    /* renamed from: m */
    void m23462m(C7035a aVar);

    @Deprecated
    /* renamed from: n */
    void m23461n(C7035a aVar, int i, C6722k kVar);

    /* renamed from: o */
    void m23460o(C7035a aVar, C8273n nVar, C8284q qVar);

    /* renamed from: p */
    void m23459p(C7035a aVar, float f);

    /* renamed from: q */
    void m23458q(C7035a aVar, boolean z);

    /* renamed from: r */
    void m23457r(C7035a aVar, int i);

    /* renamed from: s */
    void m23456s(C7035a aVar, int i, long j, long j2);

    /* renamed from: t */
    void m23455t(C7035a aVar, int i);

    /* renamed from: u */
    void m23454u(C7035a aVar, C8221f fVar);

    /* renamed from: v */
    void m23453v(C7035a aVar, int i, int i2, int i3, float f);

    /* renamed from: w */
    void m23452w(C7035a aVar, boolean z);

    /* renamed from: x */
    void m23451x(C7035a aVar, C6722k kVar, C8225i iVar);

    /* renamed from: y */
    void m23450y(C7035a aVar);

    /* renamed from: z */
    void m23449z(C7035a aVar, ExoPlaybackException exoPlaybackException);
}
