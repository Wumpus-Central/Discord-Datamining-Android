package p316r7;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p079e7.C6713c;
import p079e7.C6728o;
import p117g7.C7426b;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7560s;
import p119g9.C7566w;
import p119g9.C7570y;
import p193k7.C9798l;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10504d;
import p228m7.C10520n;
import p228m7.C10533x;

/* renamed from: r7.e */
/* loaded from: classes7.dex */
public class C12445e implements AbstractC10514i {

    /* renamed from: b0 */
    public static final AbstractC10521o f27998b0 = new AbstractC10521o() { // from class: r7.d
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] A;
            A = C12445e.m6765A();
            return A;
        }
    };

    /* renamed from: c0 */
    private static final byte[] f27999c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    private static final byte[] f28000d0 = C7557q0.m22140l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f28001e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0 */
    private static final UUID f28002f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    private static final Map<String, Integer> f28003g0;

    /* renamed from: A */
    private long f39238A;

    /* renamed from: B */
    private long f39239B;

    /* renamed from: C */
    private C7560s f39240C;

    /* renamed from: D */
    private C7560s f39241D;

    /* renamed from: E */
    private boolean f39242E;

    /* renamed from: F */
    private boolean f39243F;

    /* renamed from: G */
    private int f39244G;

    /* renamed from: H */
    private long f39245H;

    /* renamed from: I */
    private long f39246I;

    /* renamed from: J */
    private int f39247J;

    /* renamed from: K */
    private int f39248K;

    /* renamed from: L */
    private int[] f39249L;

    /* renamed from: M */
    private int f39250M;

    /* renamed from: N */
    private int f39251N;

    /* renamed from: O */
    private int f39252O;

    /* renamed from: P */
    private int f39253P;

    /* renamed from: Q */
    private boolean f39254Q;

    /* renamed from: R */
    private int f39255R;

    /* renamed from: S */
    private int f39256S;

    /* renamed from: T */
    private int f39257T;

    /* renamed from: U */
    private boolean f39258U;

    /* renamed from: V */
    private boolean f39259V;

    /* renamed from: W */
    private boolean f39260W;

    /* renamed from: X */
    private int f39261X;

    /* renamed from: Y */
    private byte f39262Y;

    /* renamed from: Z */
    private boolean f39263Z;

    /* renamed from: a */
    private final AbstractC12443c f28004a;

    /* renamed from: a0 */
    private AbstractC10516k f28005a0;

    /* renamed from: b */
    private final C12451g f28006b;

    /* renamed from: c */
    private final SparseArray<C12448c> f28007c;

    /* renamed from: d */
    private final boolean f28008d;

    /* renamed from: e */
    private final C7570y f28009e;

    /* renamed from: f */
    private final C7570y f28010f;

    /* renamed from: g */
    private final C7570y f28011g;

    /* renamed from: h */
    private final C7570y f28012h;

    /* renamed from: i */
    private final C7570y f28013i;

    /* renamed from: j */
    private final C7570y f28014j;

    /* renamed from: k */
    private final C7570y f28015k;

    /* renamed from: l */
    private final C7570y f28016l;

    /* renamed from: m */
    private final C7570y f28017m;

    /* renamed from: n */
    private final C7570y f28018n;

    /* renamed from: o */
    private ByteBuffer f28019o;

    /* renamed from: p */
    private long f28020p;

    /* renamed from: q */
    private long f28021q;

    /* renamed from: r */
    private long f28022r;

    /* renamed from: s */
    private long f28023s;

    /* renamed from: t */
    private long f28024t;

    /* renamed from: u */
    private C12448c f28025u;

    /* renamed from: v */
    private boolean f28026v;

    /* renamed from: w */
    private int f28027w;

    /* renamed from: x */
    private long f28028x;

    /* renamed from: y */
    private boolean f28029y;

    /* renamed from: z */
    private long f28030z;

    /* renamed from: r7.e$b */
    /* loaded from: classes7.dex */
    private final class C12447b implements AbstractC12442b {
        private C12447b() {
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: a */
        public void mo6731a(int i) {
            C12445e.this.m6743o(i);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: b */
        public void mo6730b(int i, double d) {
            C12445e.this.m6740r(i, d);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: c */
        public void mo6729c(int i, long j) {
            C12445e.this.m6734x(i, j);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: d */
        public int mo6728d(int i) {
            return C12445e.this.m6737u(i);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: e */
        public void mo6727e(int i, int i2, AbstractC10515j jVar) {
            C12445e.this.m6746l(i, i2, jVar);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: f */
        public boolean mo6726f(int i) {
            return C12445e.this.m6732z(i);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: g */
        public void mo6725g(int i, String str) {
            C12445e.this.m6758H(i, str);
        }

        @Override // p316r7.AbstractC12442b
        /* renamed from: h */
        public void mo6724h(int i, long j, long j2) {
            C12445e.this.m6759G(i, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7.e$c */
    /* loaded from: classes7.dex */
    public static final class C12448c {

        /* renamed from: A */
        public int f39264A;

        /* renamed from: B */
        public int f39265B;

        /* renamed from: C */
        public int f39266C;

        /* renamed from: D */
        public float f39267D;

        /* renamed from: E */
        public float f39268E;

        /* renamed from: F */
        public float f39269F;

        /* renamed from: G */
        public float f39270G;

        /* renamed from: H */
        public float f39271H;

        /* renamed from: I */
        public float f39272I;

        /* renamed from: J */
        public float f39273J;

        /* renamed from: K */
        public float f39274K;

        /* renamed from: L */
        public float f39275L;

        /* renamed from: M */
        public float f39276M;

        /* renamed from: N */
        public byte[] f39277N;

        /* renamed from: O */
        public int f39278O;

        /* renamed from: P */
        public int f39279P;

        /* renamed from: Q */
        public int f39280Q;

        /* renamed from: R */
        public long f39281R;

        /* renamed from: S */
        public long f39282S;

        /* renamed from: T */
        public C12449d f39283T;

        /* renamed from: U */
        public boolean f39284U;

        /* renamed from: V */
        public boolean f39285V;

        /* renamed from: W */
        private String f39286W;

        /* renamed from: X */
        public AbstractC10500b0 f39287X;

        /* renamed from: Y */
        public int f39288Y;

        /* renamed from: a */
        public String f28032a;

        /* renamed from: b */
        public String f28033b;

        /* renamed from: c */
        public int f28034c;

        /* renamed from: d */
        public int f28035d;

        /* renamed from: e */
        public int f28036e;

        /* renamed from: f */
        public int f28037f;

        /* renamed from: g */
        private int f28038g;

        /* renamed from: h */
        public boolean f28039h;

        /* renamed from: i */
        public byte[] f28040i;

        /* renamed from: j */
        public AbstractC10500b0.C10501a f28041j;

        /* renamed from: k */
        public byte[] f28042k;

        /* renamed from: l */
        public C9798l f28043l;

        /* renamed from: m */
        public int f28044m;

        /* renamed from: n */
        public int f28045n;

        /* renamed from: o */
        public int f28046o;

        /* renamed from: p */
        public int f28047p;

        /* renamed from: q */
        public int f28048q;

        /* renamed from: r */
        public int f28049r;

        /* renamed from: s */
        public float f28050s;

        /* renamed from: t */
        public float f28051t;

        /* renamed from: u */
        public float f28052u;

        /* renamed from: v */
        public byte[] f28053v;

        /* renamed from: w */
        public int f28054w;

        /* renamed from: x */
        public boolean f28055x;

        /* renamed from: y */
        public int f28056y;

        /* renamed from: z */
        public int f28057z;

        private C12448c() {
            this.f28044m = -1;
            this.f28045n = -1;
            this.f28046o = -1;
            this.f28047p = -1;
            this.f28048q = 0;
            this.f28049r = -1;
            this.f28050s = 0.0f;
            this.f28051t = 0.0f;
            this.f28052u = 0.0f;
            this.f28053v = null;
            this.f28054w = -1;
            this.f28055x = false;
            this.f28056y = -1;
            this.f28057z = -1;
            this.f39264A = -1;
            this.f39265B = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            this.f39266C = ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION;
            this.f39267D = -1.0f;
            this.f39268E = -1.0f;
            this.f39269F = -1.0f;
            this.f39270G = -1.0f;
            this.f39271H = -1.0f;
            this.f39272I = -1.0f;
            this.f39273J = -1.0f;
            this.f39274K = -1.0f;
            this.f39275L = -1.0f;
            this.f39276M = -1.0f;
            this.f39278O = 1;
            this.f39279P = -1;
            this.f39280Q = 8000;
            this.f39281R = 0L;
            this.f39282S = 0L;
            this.f39285V = true;
            this.f39286W = "eng";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m6719e() {
            C7510a.m22367e(this.f39287X);
        }

        /* renamed from: f */
        private byte[] m6718f(String str) {
            byte[] bArr = this.f28042k;
            if (bArr != null) {
                return bArr;
            }
            throw new C6728o("Missing CodecPrivate for codec " + str);
        }

        /* renamed from: g */
        private byte[] m6717g() {
            if (this.f39267D == -1.0f || this.f39268E == -1.0f || this.f39269F == -1.0f || this.f39270G == -1.0f || this.f39271H == -1.0f || this.f39272I == -1.0f || this.f39273J == -1.0f || this.f39274K == -1.0f || this.f39275L == -1.0f || this.f39276M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f39267D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39268E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39269F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39270G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39271H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39272I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39273J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f39274K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f39275L + 0.5f));
            order.putShort((short) (this.f39276M + 0.5f));
            order.putShort((short) this.f39265B);
            order.putShort((short) this.f39266C);
            return bArr;
        }

        /* renamed from: j */
        private static Pair<String, List<byte[]>> m6714j(C7570y yVar) {
            try {
                yVar.m22016Q(16);
                long t = yVar.m21996t();
                if (t == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (t == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (t == 826496599) {
                    byte[] d = yVar.m22012d();
                    for (int e = yVar.m22011e() + 20; e < d.length - 4; e++) {
                        if (d[e] == 0 && d[e + 1] == 0 && d[e + 2] == 1 && d[e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, e, d.length)));
                        }
                    }
                    throw new C6728o("Failed to find FourCC VC1 initialization data");
                }
                C7558r.m22104h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C6728o("Error parsing FourCC private data");
            }
        }

        /* renamed from: k */
        private static boolean m6713k(C7570y yVar) {
            try {
                int v = yVar.m21994v();
                if (v == 1) {
                    return true;
                }
                if (v != 65534) {
                    return false;
                }
                yVar.m22017P(24);
                if (yVar.m21993w() == C12445e.f28002f0.getMostSignificantBits()) {
                    if (yVar.m21993w() == C12445e.f28002f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C6728o("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: l */
        private static List<byte[]> m6712l(byte[] bArr) {
            byte b;
            byte b2;
            try {
                if (bArr[0] == 2) {
                    int i = 0;
                    int i2 = 1;
                    while (true) {
                        b = bArr[i2];
                        if ((b & 255) != 255) {
                            break;
                        }
                        i += 255;
                        i2++;
                    }
                    int i3 = i2 + 1;
                    int i4 = i + (b & 255);
                    int i5 = 0;
                    while (true) {
                        b2 = bArr[i3];
                        if ((b2 & 255) != 255) {
                            break;
                        }
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (b2 & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i9];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new C6728o("Error parsing vorbis codec private");
                        }
                        throw new C6728o("Error parsing vorbis codec private");
                    }
                    throw new C6728o("Error parsing vorbis codec private");
                }
                throw new C6728o("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C6728o("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:163:0x043d  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0455  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x0476  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0580  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m6716h(p228m7.AbstractC10516k r21, int r22) {
            /*
                Method dump skipped, instructions count: 1680
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p316r7.C12445e.C12448c.m6716h(m7.k, int):void");
        }

        /* renamed from: i */
        public void m6715i() {
            C12449d dVar = this.f39283T;
            if (dVar != null) {
                dVar.m6710a(this);
            }
        }

        /* renamed from: m */
        public void m6711m() {
            C12449d dVar = this.f39283T;
            if (dVar != null) {
                dVar.m6709b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7.e$d */
    /* loaded from: classes7.dex */
    public static final class C12449d {

        /* renamed from: a */
        private final byte[] f28058a = new byte[10];

        /* renamed from: b */
        private boolean f28059b;

        /* renamed from: c */
        private int f28060c;

        /* renamed from: d */
        private long f28061d;

        /* renamed from: e */
        private int f28062e;

        /* renamed from: f */
        private int f28063f;

        /* renamed from: g */
        private int f28064g;

        /* renamed from: a */
        public void m6710a(C12448c cVar) {
            if (this.f28060c > 0) {
                cVar.f39287X.mo12382c(this.f28061d, this.f28062e, this.f28063f, this.f28064g, cVar.f28041j);
                this.f28060c = 0;
            }
        }

        /* renamed from: b */
        public void m6709b() {
            this.f28059b = false;
            this.f28060c = 0;
        }

        /* renamed from: c */
        public void m6708c(C12448c cVar, long j, int i, int i2, int i3) {
            if (this.f28059b) {
                int i4 = this.f28060c;
                int i5 = i4 + 1;
                this.f28060c = i5;
                if (i4 == 0) {
                    this.f28061d = j;
                    this.f28062e = i;
                    this.f28063f = 0;
                }
                this.f28063f += i2;
                this.f28064g = i3;
                if (i5 >= 16) {
                    m6710a(cVar);
                }
            }
        }

        /* renamed from: d */
        public void m6707d(AbstractC10515j jVar) {
            if (!this.f28059b) {
                jVar.mo12930n(this.f28058a, 0, 10);
                jVar.mo12936f();
                if (C7426b.m22689i(this.f28058a) != 0) {
                    this.f28059b = true;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f28003g0 = Collections.unmodifiableMap(hashMap);
    }

    public C12445e() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ AbstractC10514i[] m6765A() {
        return new AbstractC10514i[]{new C12445e()};
    }

    /* renamed from: B */
    private boolean m6764B(C10533x xVar, long j) {
        if (this.f28029y) {
            this.f39238A = j;
            xVar.f23290a = this.f28030z;
            this.f28029y = false;
            return true;
        }
        if (this.f28026v) {
            long j2 = this.f39238A;
            if (j2 != -1) {
                xVar.f23290a = j2;
                this.f39238A = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m6763C(AbstractC10515j jVar, int i) {
        if (this.f28011g.m22010f() < i) {
            if (this.f28011g.m22014b() < i) {
                C7570y yVar = this.f28011g;
                yVar.m22013c(Math.max(yVar.m22014b() * 2, i));
            }
            jVar.readFully(this.f28011g.m22012d(), this.f28011g.m22010f(), i - this.f28011g.m22010f());
            this.f28011g.m22018O(i);
        }
    }

    /* renamed from: D */
    private void m6762D() {
        this.f39255R = 0;
        this.f39256S = 0;
        this.f39257T = 0;
        this.f39258U = false;
        this.f39259V = false;
        this.f39260W = false;
        this.f39261X = 0;
        this.f39262Y = (byte) 0;
        this.f39263Z = false;
        this.f28014j.m22021L(0);
    }

    /* renamed from: E */
    private long m6761E(long j) {
        long j2 = this.f28022r;
        if (j2 != -9223372036854775807L) {
            return C7557q0.m22198I0(j, j2, 1000L);
        }
        throw new C6728o("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: F */
    private static void m6760F(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArr2 = m6739s(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArr2 = m6739s(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* renamed from: I */
    private int m6757I(AbstractC10515j jVar, C12448c cVar, int i) {
        boolean z;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f28033b)) {
            m6756J(jVar, f27999c0, i);
            return m6741q();
        } else if ("S_TEXT/ASS".equals(cVar.f28033b)) {
            m6756J(jVar, f28001e0, i);
            return m6741q();
        } else {
            AbstractC10500b0 b0Var = cVar.f39287X;
            boolean z3 = true;
            if (!this.f39258U) {
                if (cVar.f28039h) {
                    this.f39252O &= -1073741825;
                    int i3 = 128;
                    if (!this.f39259V) {
                        jVar.readFully(this.f28011g.m22012d(), 0, 1);
                        this.f39255R++;
                        if ((this.f28011g.m22012d()[0] & 128) != 128) {
                            this.f39262Y = this.f28011g.m22012d()[0];
                            this.f39259V = true;
                        } else {
                            throw new C6728o("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.f39262Y;
                    if ((b & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if ((b & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f39252O |= 1073741824;
                        if (!this.f39263Z) {
                            jVar.readFully(this.f28016l.m22012d(), 0, 8);
                            this.f39255R += 8;
                            this.f39263Z = true;
                            byte[] d = this.f28011g.m22012d();
                            if (!z2) {
                                i3 = 0;
                            }
                            d[0] = (byte) (i3 | 8);
                            this.f28011g.m22017P(0);
                            b0Var.mo12389b(this.f28011g, 1, 1);
                            this.f39256S++;
                            this.f28016l.m22017P(0);
                            b0Var.mo12389b(this.f28016l, 8, 1);
                            this.f39256S += 8;
                        }
                        if (z2) {
                            if (!this.f39260W) {
                                jVar.readFully(this.f28011g.m22012d(), 0, 1);
                                this.f39255R++;
                                this.f28011g.m22017P(0);
                                this.f39261X = this.f28011g.m22029D();
                                this.f39260W = true;
                            }
                            int i4 = this.f39261X * 4;
                            this.f28011g.m22021L(i4);
                            jVar.readFully(this.f28011g.m22012d(), 0, i4);
                            this.f39255R += i4;
                            short s = (short) ((this.f39261X / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f28019o;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f28019o = ByteBuffer.allocate(i5);
                            }
                            this.f28019o.position(0);
                            this.f28019o.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f39261X;
                                if (i6 >= i2) {
                                    break;
                                }
                                int H = this.f28011g.m22025H();
                                if (i6 % 2 == 0) {
                                    this.f28019o.putShort((short) (H - i7));
                                } else {
                                    this.f28019o.putInt(H - i7);
                                }
                                i6++;
                                i7 = H;
                            }
                            int i8 = (i - this.f39255R) - i7;
                            if (i2 % 2 == 1) {
                                this.f28019o.putInt(i8);
                            } else {
                                this.f28019o.putShort((short) i8);
                                this.f28019o.putInt(0);
                            }
                            this.f28017m.m22019N(this.f28019o.array(), i5);
                            b0Var.mo12389b(this.f28017m, i5, 1);
                            this.f39256S += i5;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f28040i;
                    if (bArr != null) {
                        this.f28014j.m22019N(bArr, bArr.length);
                    }
                }
                if (cVar.f28037f > 0) {
                    this.f39252O |= 268435456;
                    this.f28018n.m22021L(0);
                    this.f28011g.m22021L(4);
                    this.f28011g.m22012d()[0] = (byte) ((i >> 24) & 255);
                    this.f28011g.m22012d()[1] = (byte) ((i >> 16) & 255);
                    this.f28011g.m22012d()[2] = (byte) ((i >> 8) & 255);
                    this.f28011g.m22012d()[3] = (byte) (i & 255);
                    b0Var.mo12389b(this.f28011g, 4, 2);
                    this.f39256S += 4;
                }
                this.f39258U = true;
            }
            int f = i + this.f28014j.m22010f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f28033b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f28033b)) {
                if (cVar.f39283T != null) {
                    if (this.f28014j.m22010f() != 0) {
                        z3 = false;
                    }
                    C7510a.m22366f(z3);
                    cVar.f39283T.m6707d(jVar);
                }
                while (true) {
                    int i9 = this.f39255R;
                    if (i9 >= f) {
                        break;
                    }
                    int K = m6755K(jVar, b0Var, f - i9);
                    this.f39255R += K;
                    this.f39256S += K;
                }
            } else {
                byte[] d2 = this.f28010f.m22012d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i10 = cVar.f39288Y;
                int i11 = 4 - i10;
                while (this.f39255R < f) {
                    int i12 = this.f39257T;
                    if (i12 == 0) {
                        m6754L(jVar, d2, i11, i10);
                        this.f39255R += i10;
                        this.f28010f.m22017P(0);
                        this.f39257T = this.f28010f.m22025H();
                        this.f28009e.m22017P(0);
                        b0Var.mo12386f(this.f28009e, 4);
                        this.f39256S += 4;
                    } else {
                        int K2 = m6755K(jVar, b0Var, i12);
                        this.f39255R += K2;
                        this.f39256S += K2;
                        this.f39257T -= K2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f28033b)) {
                this.f28012h.m22017P(0);
                b0Var.mo12386f(this.f28012h, 4);
                this.f39256S += 4;
            }
            return m6741q();
        }
    }

    /* renamed from: J */
    private void m6756J(AbstractC10515j jVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f28015k.m22014b() < length) {
            this.f28015k.m22020M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f28015k.m22012d(), 0, bArr.length);
        }
        jVar.readFully(this.f28015k.m22012d(), bArr.length, i);
        this.f28015k.m22017P(0);
        this.f28015k.m22018O(length);
    }

    /* renamed from: K */
    private int m6755K(AbstractC10515j jVar, AbstractC10500b0 b0Var, int i) {
        int a = this.f28014j.m22015a();
        if (a <= 0) {
            return b0Var.mo12387e(jVar, i, false);
        }
        int min = Math.min(i, a);
        b0Var.mo12386f(this.f28014j, min);
        return min;
    }

    /* renamed from: L */
    private void m6754L(AbstractC10515j jVar, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f28014j.m22015a());
        jVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f28014j.m22006j(bArr, i, min);
        }
    }

    /* renamed from: i */
    private void m6749i(int i) {
        if (this.f39240C == null || this.f39241D == null) {
            throw new C6728o("Element " + i + " must be in a Cues");
        }
    }

    /* renamed from: j */
    private void m6748j(int i) {
        if (this.f28025u == null) {
            throw new C6728o("Element " + i + " must be in a TrackEntry");
        }
    }

    /* renamed from: k */
    private void m6747k() {
        C7510a.m22364h(this.f28005a0);
    }

    /* renamed from: m */
    private AbstractC10534y m6745m(C7560s sVar, C7560s sVar2) {
        int i;
        if (this.f28021q == -1 || this.f28024t == -9223372036854775807L || sVar == null || sVar.m22092c() == 0 || sVar2 == null || sVar2.m22092c() != sVar.m22092c()) {
            return new AbstractC10534y.C10536b(this.f28024t);
        }
        int c = sVar.m22092c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            jArr3[i3] = sVar.m22093b(i3);
            jArr[i3] = this.f28021q + sVar2.m22093b(i3);
        }
        while (true) {
            i = c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f28021q + this.f28020p) - jArr[i]);
        long j = this.f28024t - jArr3[i];
        jArr2[i] = j;
        if (j <= 0) {
            C7558r.m22104h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new C10504d(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: n */
    private void m6744n(C12448c cVar, long j, int i, int i2, int i3) {
        C12449d dVar = cVar.f39283T;
        if (dVar != null) {
            dVar.m6708c(cVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f28033b) || "S_TEXT/ASS".equals(cVar.f28033b)) {
                if (this.f39248K > 1) {
                    C7558r.m22104h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f39246I;
                    if (j2 == -9223372036854775807L) {
                        C7558r.m22104h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m6760F(cVar.f28033b, j2, this.f28015k.m22012d());
                        int e = this.f28015k.m22011e();
                        while (true) {
                            if (e >= this.f28015k.m22010f()) {
                                break;
                            } else if (this.f28015k.m22012d()[e] == 0) {
                                this.f28015k.m22018O(e);
                                break;
                            } else {
                                e++;
                            }
                        }
                        AbstractC10500b0 b0Var = cVar.f39287X;
                        C7570y yVar = this.f28015k;
                        b0Var.mo12386f(yVar, yVar.m22010f());
                        i2 += this.f28015k.m22010f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f39248K > 1) {
                    i &= -268435457;
                } else {
                    int f = this.f28018n.m22010f();
                    cVar.f39287X.mo12389b(this.f28018n, f, 2);
                    i2 += f;
                }
            }
            cVar.f39287X.mo12382c(j, i, i2, i3, cVar.f28041j);
        }
        this.f39243F = true;
    }

    /* renamed from: p */
    private static int[] m6742p(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: q */
    private int m6741q() {
        int i = this.f39256S;
        m6762D();
        return i;
    }

    /* renamed from: s */
    private static byte[] m6739s(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C7557q0.m22140l0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    /* renamed from: t */
    private C12448c m6738t(int i) {
        m6748j(i);
        return this.f28025u;
    }

    /* renamed from: y */
    private static boolean m6733y(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 31;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: G */
    protected void m6759G(int i, long j, long j2) {
        m6747k();
        if (i == 160) {
            this.f39254Q = false;
        } else if (i == 174) {
            this.f28025u = new C12448c();
        } else if (i == 187) {
            this.f39242E = false;
        } else if (i == 19899) {
            this.f28027w = -1;
            this.f28028x = -1L;
        } else if (i == 20533) {
            m6738t(i).f28039h = true;
        } else if (i == 21968) {
            m6738t(i).f28055x = true;
        } else if (i == 408125543) {
            long j3 = this.f28021q;
            if (j3 == -1 || j3 == j) {
                this.f28021q = j;
                this.f28020p = j2;
                return;
            }
            throw new C6728o("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f39240C = new C7560s();
            this.f39241D = new C7560s();
        } else if (i != 524531317 || this.f28026v) {
        } else {
            if (!this.f28008d || this.f28030z == -1) {
                this.f28005a0.mo7936j(new AbstractC10534y.C10536b(this.f28024t));
                this.f28026v = true;
                return;
            }
            this.f28029y = true;
        }
    }

    /* renamed from: H */
    protected void m6758H(int i, String str) {
        if (i == 134) {
            m6738t(i).f28033b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m6738t(i).f28032a = str;
            } else if (i == 2274716) {
                m6738t(i).f39286W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new C6728o("DocType " + str + " not supported");
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f39239B = -9223372036854775807L;
        this.f39244G = 0;
        this.f28004a.reset();
        this.f28006b.m6700e();
        m6762D();
        for (int i = 0; i < this.f28007c.size(); i++) {
            this.f28007c.valueAt(i).m6711m();
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public final void mo2227b(AbstractC10516k kVar) {
        this.f28005a0 = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public final boolean mo2225d(AbstractC10515j jVar) {
        return new C12450f().m6705b(jVar);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public final int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        this.f39243F = false;
        boolean z = true;
        while (z && !this.f39243F) {
            z = this.f28004a.mo6767a(jVar);
            if (z && m6764B(xVar, jVar.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f28007c.size(); i++) {
            C12448c valueAt = this.f28007c.valueAt(i);
            valueAt.m6719e();
            valueAt.m6715i();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0236, code lost:
        throw new p079e7.C6728o("EBML lacing sample size out of range.");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m6746l(int r21, int r22, p228m7.AbstractC10515j r23) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p316r7.C12445e.m6746l(int, int, m7.j):void");
    }

    /* renamed from: o */
    protected void m6743o(int i) {
        m6747k();
        if (i != 160) {
            if (i == 174) {
                C12448c cVar = (C12448c) C7510a.m22364h(this.f28025u);
                String str = cVar.f28033b;
                if (str != null) {
                    if (m6733y(str)) {
                        cVar.m6716h(this.f28005a0, cVar.f28034c);
                        this.f28007c.put(cVar.f28034c, cVar);
                    }
                    this.f28025u = null;
                    return;
                }
                throw new C6728o("CodecId is missing in TrackEntry element");
            } else if (i == 19899) {
                int i2 = this.f28027w;
                if (i2 != -1) {
                    long j = this.f28028x;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f28030z = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C6728o("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                m6748j(i);
                C12448c cVar2 = this.f28025u;
                if (!cVar2.f28039h) {
                    return;
                }
                if (cVar2.f28041j != null) {
                    cVar2.f28043l = new C9798l(new C9798l.C9800b(C6713c.f14277a, "video/webm", this.f28025u.f28041j.f23199b));
                    return;
                }
                throw new C6728o("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                m6748j(i);
                C12448c cVar3 = this.f28025u;
                if (cVar3.f28039h && cVar3.f28040i != null) {
                    throw new C6728o("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f28022r == -9223372036854775807L) {
                    this.f28022r = 1000000L;
                }
                long j2 = this.f28023s;
                if (j2 != -9223372036854775807L) {
                    this.f28024t = m6761E(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f28026v) {
                        this.f28005a0.mo7936j(m6745m(this.f39240C, this.f39241D));
                        this.f28026v = true;
                    }
                    this.f39240C = null;
                    this.f39241D = null;
                }
            } else if (this.f28007c.size() != 0) {
                this.f28005a0.mo7935s();
            } else {
                throw new C6728o("No valid tracks were found");
            }
        } else if (this.f39244G == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f39248K; i4++) {
                i3 += this.f39249L[i4];
            }
            C12448c cVar4 = this.f28007c.get(this.f39250M);
            cVar4.m6719e();
            for (int i5 = 0; i5 < this.f39248K; i5++) {
                long j3 = ((cVar4.f28036e * i5) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + this.f39245H;
                int i6 = this.f39252O;
                if (i5 == 0 && !this.f39254Q) {
                    i6 |= 1;
                }
                int i7 = this.f39249L[i5];
                i3 -= i7;
                m6744n(cVar4, j3, i6, i7, i3);
            }
            this.f39244G = 0;
        }
    }

    /* renamed from: r */
    protected void m6740r(int i, double d) {
        if (i == 181) {
            m6738t(i).f39280Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m6738t(i).f39267D = (float) d;
                    return;
                case 21970:
                    m6738t(i).f39268E = (float) d;
                    return;
                case 21971:
                    m6738t(i).f39269F = (float) d;
                    return;
                case 21972:
                    m6738t(i).f39270G = (float) d;
                    return;
                case 21973:
                    m6738t(i).f39271H = (float) d;
                    return;
                case 21974:
                    m6738t(i).f39272I = (float) d;
                    return;
                case 21975:
                    m6738t(i).f39273J = (float) d;
                    return;
                case 21976:
                    m6738t(i).f39274K = (float) d;
                    return;
                case 21977:
                    m6738t(i).f39275L = (float) d;
                    return;
                case 21978:
                    m6738t(i).f39276M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m6738t(i).f28050s = (float) d;
                            return;
                        case 30324:
                            m6738t(i).f28051t = (float) d;
                            return;
                        case 30325:
                            m6738t(i).f28052u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f28023s = (long) d;
        }
    }

    @Override // p228m7.AbstractC10514i
    public final void release() {
    }

    /* renamed from: u */
    protected int m6737u(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    protected void m6736v(C12448c cVar, AbstractC10515j jVar, int i) {
        if (cVar.f28038g == 1685485123 || cVar.f28038g == 1685480259) {
            byte[] bArr = new byte[i];
            cVar.f39277N = bArr;
            jVar.readFully(bArr, 0, i);
            return;
        }
        jVar.mo12932k(i);
    }

    /* renamed from: w */
    protected void m6735w(C12448c cVar, int i, AbstractC10515j jVar, int i2) {
        if (i != 4 || !"V_VP9".equals(cVar.f28033b)) {
            jVar.mo12932k(i2);
            return;
        }
        this.f28018n.m22021L(i2);
        jVar.readFully(this.f28018n.m22012d(), 0, i2);
    }

    /* renamed from: x */
    protected void m6734x(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m6738t(i).f28035d = (int) j;
                        return;
                    case 136:
                        C12448c t = m6738t(i);
                        if (j == 1) {
                            z = true;
                        }
                        t.f39285V = z;
                        return;
                    case 155:
                        this.f39246I = m6761E(j);
                        return;
                    case 159:
                        m6738t(i).f39278O = (int) j;
                        return;
                    case 176:
                        m6738t(i).f28044m = (int) j;
                        return;
                    case 179:
                        m6749i(i);
                        this.f39240C.m22094a(m6761E(j));
                        return;
                    case 186:
                        m6738t(i).f28045n = (int) j;
                        return;
                    case 215:
                        m6738t(i).f28034c = (int) j;
                        return;
                    case 231:
                        this.f39239B = m6761E(j);
                        return;
                    case 238:
                        this.f39253P = (int) j;
                        return;
                    case 241:
                        if (!this.f39242E) {
                            m6749i(i);
                            this.f39241D.m22094a(j);
                            this.f39242E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f39254Q = true;
                        return;
                    case 16871:
                        m6738t(i).f28038g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new C6728o("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new C6728o("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new C6728o("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new C6728o("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new C6728o("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f28028x = j + this.f28021q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m6748j(i);
                        if (i2 == 0) {
                            this.f28025u.f28054w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f28025u.f28054w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f28025u.f28054w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f28025u.f28054w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m6738t(i).f28046o = (int) j;
                        return;
                    case 21682:
                        m6738t(i).f28048q = (int) j;
                        return;
                    case 21690:
                        m6738t(i).f28047p = (int) j;
                        return;
                    case 21930:
                        C12448c t2 = m6738t(i);
                        if (j == 1) {
                            z = true;
                        }
                        t2.f39284U = z;
                        return;
                    case 21998:
                        m6738t(i).f28037f = (int) j;
                        return;
                    case 22186:
                        m6738t(i).f39281R = j;
                        return;
                    case 22203:
                        m6738t(i).f39282S = j;
                        return;
                    case 25188:
                        m6738t(i).f39279P = (int) j;
                        return;
                    case 30321:
                        m6748j(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f28025u.f28049r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f28025u.f28049r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f28025u.f28049r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f28025u.f28049r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m6738t(i).f28036e = (int) j;
                        return;
                    case 2807729:
                        this.f28022r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m6748j(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f28025u.f39264A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f28025u.f39264A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m6748j(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f28025u.f28057z = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f28025u.f28057z = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f28025u.f28057z = 3;
                                return;
                            case 21947:
                                m6748j(i);
                                C12448c cVar = this.f28025u;
                                cVar.f28055x = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    cVar.f28056y = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar.f28056y = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    cVar.f28056y = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                m6738t(i).f39265B = (int) j;
                                return;
                            case 21949:
                                m6738t(i).f39266C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new C6728o("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new C6728o("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* renamed from: z */
    protected boolean m6732z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public C12445e(int i) {
        this(new C12440a(), i);
    }

    C12445e(AbstractC12443c cVar, int i) {
        this.f28021q = -1L;
        this.f28022r = -9223372036854775807L;
        this.f28023s = -9223372036854775807L;
        this.f28024t = -9223372036854775807L;
        this.f28030z = -1L;
        this.f39238A = -1L;
        this.f39239B = -9223372036854775807L;
        this.f28004a = cVar;
        cVar.mo6766b(new C12447b());
        this.f28008d = (i & 1) == 0;
        this.f28006b = new C12451g();
        this.f28007c = new SparseArray<>();
        this.f28011g = new C7570y(4);
        this.f28012h = new C7570y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f28013i = new C7570y(4);
        this.f28009e = new C7570y(C7566w.f16395a);
        this.f28010f = new C7570y(4);
        this.f28014j = new C7570y();
        this.f28015k = new C7570y();
        this.f28016l = new C7570y(8);
        this.f28017m = new C7570y();
        this.f28018n = new C7570y();
        this.f39249L = new int[1];
    }
}
