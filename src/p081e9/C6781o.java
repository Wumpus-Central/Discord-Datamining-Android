package p081e9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import cc.AbstractC3884i0;
import cc.AbstractC3899l0;
import cc.C3892j0;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p081e9.AbstractC6769e;
import p081e9.C6781o;
import p119g9.AbstractC7516c;
import p119g9.C7510a;
import p119g9.C7523f0;
import p119g9.C7557q0;

/* renamed from: e9.o */
/* loaded from: classes5.dex */
public final class C6781o implements AbstractC6769e, AbstractC6795x {

    /* renamed from: p */
    public static final C3892j0<String, Integer> f14461p = m24338j();

    /* renamed from: q */
    public static final AbstractC3884i0<Long> f14462q = AbstractC3884i0.m33408A(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* renamed from: r */
    public static final AbstractC3884i0<Long> f14463r = AbstractC3884i0.m33408A(218000L, 159000L, 145000L, 130000L, 112000L);

    /* renamed from: s */
    public static final AbstractC3884i0<Long> f14464s = AbstractC3884i0.m33408A(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* renamed from: t */
    public static final AbstractC3884i0<Long> f14465t = AbstractC3884i0.m33408A(4800000L, 2700000L, 1800000L, 1200000L, 630000L);

    /* renamed from: u */
    public static final AbstractC3884i0<Long> f14466u = AbstractC3884i0.m33408A(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    /* renamed from: v */
    private static C6781o f14467v;

    /* renamed from: a */
    private final Context f14468a;

    /* renamed from: b */
    private final AbstractC3899l0<Integer, Long> f14469b;

    /* renamed from: c */
    private final AbstractC6769e.AbstractC6770a.C0205a f14470c;

    /* renamed from: d */
    private final C7523f0 f14471d;

    /* renamed from: e */
    private final AbstractC7516c f14472e;

    /* renamed from: f */
    private int f14473f;

    /* renamed from: g */
    private long f14474g;

    /* renamed from: h */
    private long f14475h;

    /* renamed from: i */
    private int f14476i;

    /* renamed from: j */
    private long f14477j;

    /* renamed from: k */
    private long f14478k;

    /* renamed from: l */
    private long f14479l;

    /* renamed from: m */
    private long f14480m;

    /* renamed from: n */
    private boolean f14481n;

    /* renamed from: o */
    private int f14482o;

    /* renamed from: e9.o$b */
    /* loaded from: classes5.dex */
    public static final class C6783b {

        /* renamed from: a */
        private final Context f14483a;

        /* renamed from: b */
        private Map<Integer, Long> f14484b;

        /* renamed from: c */
        private int f14485c;

        /* renamed from: d */
        private AbstractC7516c f14486d;

        /* renamed from: e */
        private boolean f14487e;

        public C6783b(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f14483a = context2;
            this.f14484b = m24330c(C7557q0.m22191M(context));
            this.f14485c = 2000;
            this.f14486d = AbstractC7516c.f16293a;
            this.f14487e = true;
        }

        /* renamed from: b */
        private static AbstractC3884i0<Integer> m24331b(String str) {
            AbstractC3884i0<Integer> A = C6781o.f14461p.get(str);
            if (A.isEmpty()) {
                return AbstractC3884i0.m33408A(2, 2, 2, 2, 2);
            }
            return A;
        }

        /* renamed from: c */
        private static Map<Integer, Long> m24330c(String str) {
            AbstractC3884i0<Integer> b = m24331b(str);
            HashMap hashMap = new HashMap(6);
            hashMap.put(0, 1000000L);
            AbstractC3884i0<Long> i0Var = C6781o.f14462q;
            hashMap.put(2, i0Var.get(b.get(0).intValue()));
            hashMap.put(3, C6781o.f14463r.get(b.get(1).intValue()));
            hashMap.put(4, C6781o.f14464s.get(b.get(2).intValue()));
            hashMap.put(5, C6781o.f14465t.get(b.get(3).intValue()));
            hashMap.put(9, C6781o.f14466u.get(b.get(4).intValue()));
            hashMap.put(7, i0Var.get(b.get(0).intValue()));
            return hashMap;
        }

        /* renamed from: a */
        public C6781o m24332a() {
            return new C6781o(this.f14483a, this.f14484b, this.f14485c, this.f14486d, this.f14487e);
        }
    }

    /* renamed from: e9.o$c */
    /* loaded from: classes5.dex */
    private static class C6784c extends BroadcastReceiver {

        /* renamed from: c */
        private static C6784c f14488c;

        /* renamed from: a */
        private final Handler f14489a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final ArrayList<WeakReference<C6781o>> f14490b = new ArrayList<>();

        private C6784c() {
        }

        /* renamed from: b */
        public static synchronized C6784c m24328b(Context context) {
            C6784c cVar;
            synchronized (C6784c.class) {
                if (f14488c == null) {
                    f14488c = new C6784c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f14488c, intentFilter);
                }
                cVar = f14488c;
            }
            return cVar;
        }

        /* renamed from: e */
        private void m24325e() {
            for (int size = this.f14490b.size() - 1; size >= 0; size--) {
                if (this.f14490b.get(size).get() == null) {
                    this.f14490b.remove(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m24327c(C6781o oVar) {
            oVar.m24333o();
        }

        /* renamed from: d */
        public synchronized void m24326d(final C6781o oVar) {
            m24325e();
            this.f14490b.add(new WeakReference<>(oVar));
            this.f14489a.post(new Runnable() { // from class: e9.p
                @Override // java.lang.Runnable
                public final void run() {
                    C6781o.C6784c.this.m24327c(oVar);
                }
            });
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                m24325e();
                for (int i = 0; i < this.f14490b.size(); i++) {
                    C6781o oVar = this.f14490b.get(i).get();
                    if (oVar != null) {
                        m24327c(oVar);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private static C3892j0<String, Integer> m24338j() {
        C3892j0.C3893a y = C3892j0.m33387y();
        y.m33383g("AD", 1, 2, 0, 0, 2);
        y.m33383g("AE", 1, 4, 4, 4, 1);
        y.m33383g("AF", 4, 4, 3, 4, 2);
        y.m33383g("AG", 2, 2, 1, 1, 2);
        y.m33383g("AI", 1, 2, 2, 2, 2);
        y.m33383g("AL", 1, 1, 0, 1, 2);
        y.m33383g("AM", 2, 2, 1, 2, 2);
        y.m33383g("AO", 3, 4, 4, 2, 2);
        y.m33383g("AR", 2, 4, 2, 2, 2);
        y.m33383g("AS", 2, 2, 4, 3, 2);
        y.m33383g("AT", 0, 3, 0, 0, 2);
        y.m33383g("AU", 0, 2, 0, 1, 1);
        y.m33383g("AW", 1, 2, 0, 4, 2);
        y.m33383g("AX", 0, 2, 2, 2, 2);
        y.m33383g("AZ", 3, 3, 3, 4, 2);
        y.m33383g("BA", 1, 1, 0, 1, 2);
        y.m33383g("BB", 0, 2, 0, 0, 2);
        y.m33383g("BD", 2, 0, 3, 3, 2);
        y.m33383g("BE", 0, 1, 2, 3, 2);
        y.m33383g("BF", 4, 4, 4, 2, 2);
        y.m33383g("BG", 0, 1, 0, 0, 2);
        y.m33383g("BH", 1, 0, 2, 4, 2);
        y.m33383g("BI", 4, 4, 4, 4, 2);
        y.m33383g("BJ", 4, 4, 3, 4, 2);
        y.m33383g("BL", 1, 2, 2, 2, 2);
        y.m33383g("BM", 1, 2, 0, 0, 2);
        y.m33383g("BN", 4, 0, 1, 1, 2);
        y.m33383g("BO", 2, 3, 3, 2, 2);
        y.m33383g("BQ", 1, 2, 1, 2, 2);
        y.m33383g("BR", 2, 4, 2, 1, 2);
        y.m33383g("BS", 3, 2, 2, 3, 2);
        y.m33383g("BT", 3, 0, 3, 2, 2);
        y.m33383g("BW", 3, 4, 2, 2, 2);
        y.m33383g("BY", 1, 0, 2, 1, 2);
        y.m33383g("BZ", 2, 2, 2, 1, 2);
        y.m33383g("CA", 0, 3, 1, 2, 3);
        y.m33383g("CD", 4, 3, 2, 2, 2);
        y.m33383g("CF", 4, 2, 2, 2, 2);
        y.m33383g("CG", 3, 4, 1, 1, 2);
        y.m33383g("CH", 0, 1, 0, 0, 0);
        y.m33383g("CI", 3, 3, 3, 3, 2);
        y.m33383g("CK", 3, 2, 1, 0, 2);
        y.m33383g("CL", 1, 1, 2, 3, 2);
        y.m33383g("CM", 3, 4, 3, 2, 2);
        y.m33383g("CN", 2, 2, 2, 1, 3);
        y.m33383g("CO", 2, 4, 3, 2, 2);
        y.m33383g("CR", 2, 3, 4, 4, 2);
        y.m33383g("CU", 4, 4, 2, 1, 2);
        y.m33383g("CV", 2, 3, 3, 3, 2);
        y.m33383g("CW", 1, 2, 0, 0, 2);
        y.m33383g("CY", 1, 2, 0, 0, 2);
        y.m33383g("CZ", 0, 1, 0, 0, 2);
        y.m33383g("DE", 0, 1, 1, 2, 0);
        y.m33383g("DJ", 4, 1, 4, 4, 2);
        y.m33383g("DK", 0, 0, 1, 0, 2);
        y.m33383g("DM", 1, 2, 2, 2, 2);
        y.m33383g("DO", 3, 4, 4, 4, 2);
        y.m33383g("DZ", 3, 2, 4, 4, 2);
        y.m33383g("EC", 2, 4, 3, 2, 2);
        y.m33383g("EE", 0, 0, 0, 0, 2);
        y.m33383g("EG", 3, 4, 2, 1, 2);
        y.m33383g("EH", 2, 2, 2, 2, 2);
        y.m33383g("ER", 4, 2, 2, 2, 2);
        y.m33383g("ES", 0, 1, 2, 1, 2);
        y.m33383g("ET", 4, 4, 4, 1, 2);
        y.m33383g("FI", 0, 0, 1, 0, 0);
        y.m33383g("FJ", 3, 0, 3, 3, 2);
        y.m33383g("FK", 2, 2, 2, 2, 2);
        y.m33383g("FM", 4, 2, 4, 3, 2);
        y.m33383g("FO", 0, 2, 0, 0, 2);
        y.m33383g("FR", 1, 0, 2, 1, 2);
        y.m33383g("GA", 3, 3, 1, 0, 2);
        y.m33383g("GB", 0, 0, 1, 2, 2);
        y.m33383g("GD", 1, 2, 2, 2, 2);
        y.m33383g("GE", 1, 0, 1, 3, 2);
        y.m33383g("GF", 2, 2, 2, 4, 2);
        y.m33383g("GG", 0, 2, 0, 0, 2);
        y.m33383g("GH", 3, 2, 3, 2, 2);
        y.m33383g("GI", 0, 2, 0, 0, 2);
        y.m33383g("GL", 1, 2, 2, 1, 2);
        y.m33383g("GM", 4, 3, 2, 4, 2);
        y.m33383g("GN", 4, 3, 4, 2, 2);
        y.m33383g("GP", 2, 2, 3, 4, 2);
        y.m33383g("GQ", 4, 2, 3, 4, 2);
        y.m33383g("GR", 1, 1, 0, 1, 2);
        y.m33383g("GT", 3, 2, 3, 2, 2);
        y.m33383g("GU", 1, 2, 4, 4, 2);
        y.m33383g("GW", 3, 4, 4, 3, 2);
        y.m33383g("GY", 3, 3, 1, 0, 2);
        y.m33383g("HK", 0, 2, 3, 4, 2);
        y.m33383g("HN", 3, 0, 3, 3, 2);
        y.m33383g("HR", 1, 1, 0, 1, 2);
        y.m33383g("HT", 4, 3, 4, 4, 2);
        y.m33383g("HU", 0, 1, 0, 0, 2);
        y.m33383g("ID", 3, 2, 2, 3, 2);
        y.m33383g("IE", 0, 0, 1, 1, 2);
        y.m33383g("IL", 1, 0, 2, 3, 2);
        y.m33383g("IM", 0, 2, 0, 1, 2);
        y.m33383g("IN", 2, 1, 3, 3, 2);
        y.m33383g("IO", 4, 2, 2, 4, 2);
        y.m33383g("IQ", 3, 2, 4, 3, 2);
        y.m33383g("IR", 4, 2, 3, 4, 2);
        y.m33383g("IS", 0, 2, 0, 0, 2);
        y.m33383g("IT", 0, 0, 1, 1, 2);
        y.m33383g("JE", 2, 2, 0, 2, 2);
        y.m33383g("JM", 3, 3, 4, 4, 2);
        y.m33383g("JO", 1, 2, 1, 1, 2);
        y.m33383g("JP", 0, 2, 0, 1, 3);
        y.m33383g("KE", 3, 4, 2, 2, 2);
        y.m33383g("KG", 1, 0, 2, 2, 2);
        y.m33383g("KH", 2, 0, 4, 3, 2);
        y.m33383g("KI", 4, 2, 3, 1, 2);
        y.m33383g("KM", 4, 2, 2, 3, 2);
        y.m33383g("KN", 1, 2, 2, 2, 2);
        y.m33383g("KP", 4, 2, 2, 2, 2);
        y.m33383g("KR", 0, 2, 1, 1, 1);
        y.m33383g("KW", 2, 3, 1, 1, 1);
        y.m33383g("KY", 1, 2, 0, 0, 2);
        y.m33383g("KZ", 1, 2, 2, 3, 2);
        y.m33383g("LA", 2, 2, 1, 1, 2);
        y.m33383g("LB", 3, 2, 0, 0, 2);
        y.m33383g("LC", 1, 1, 0, 0, 2);
        y.m33383g("LI", 0, 2, 2, 2, 2);
        y.m33383g("LK", 2, 0, 2, 3, 2);
        y.m33383g("LR", 3, 4, 3, 2, 2);
        y.m33383g("LS", 3, 3, 2, 3, 2);
        y.m33383g("LT", 0, 0, 0, 0, 2);
        y.m33383g("LU", 0, 0, 0, 0, 2);
        y.m33383g("LV", 0, 0, 0, 0, 2);
        y.m33383g("LY", 4, 2, 4, 3, 2);
        y.m33383g("MA", 2, 1, 2, 1, 2);
        y.m33383g("MC", 0, 2, 2, 2, 2);
        y.m33383g("MD", 1, 2, 0, 0, 2);
        y.m33383g("ME", 1, 2, 1, 2, 2);
        y.m33383g("MF", 1, 2, 1, 0, 2);
        y.m33383g("MG", 3, 4, 3, 3, 2);
        y.m33383g("MH", 4, 2, 2, 4, 2);
        y.m33383g("MK", 1, 0, 0, 0, 2);
        y.m33383g("ML", 4, 4, 1, 1, 2);
        y.m33383g("MM", 2, 3, 2, 2, 2);
        y.m33383g("MN", 2, 4, 1, 1, 2);
        y.m33383g("MO", 0, 2, 4, 4, 2);
        y.m33383g("MP", 0, 2, 2, 2, 2);
        y.m33383g("MQ", 2, 2, 2, 3, 2);
        y.m33383g("MR", 3, 0, 4, 2, 2);
        y.m33383g("MS", 1, 2, 2, 2, 2);
        y.m33383g("MT", 0, 2, 0, 1, 2);
        y.m33383g("MU", 3, 1, 2, 3, 2);
        y.m33383g("MV", 4, 3, 1, 4, 2);
        y.m33383g("MW", 4, 1, 1, 0, 2);
        y.m33383g("MX", 2, 4, 3, 3, 2);
        y.m33383g("MY", 2, 0, 3, 3, 2);
        y.m33383g("MZ", 3, 3, 2, 3, 2);
        y.m33383g("NA", 4, 3, 2, 2, 2);
        y.m33383g("NC", 2, 0, 4, 4, 2);
        y.m33383g("NE", 4, 4, 4, 4, 2);
        y.m33383g("NF", 2, 2, 2, 2, 2);
        y.m33383g("NG", 3, 3, 2, 2, 2);
        y.m33383g("NI", 3, 1, 4, 4, 2);
        y.m33383g("NL", 0, 2, 4, 2, 0);
        y.m33383g("NO", 0, 1, 1, 0, 2);
        y.m33383g("NP", 2, 0, 4, 3, 2);
        y.m33383g("NR", 4, 2, 3, 1, 2);
        y.m33383g("NU", 4, 2, 2, 2, 2);
        y.m33383g("NZ", 0, 2, 1, 2, 4);
        y.m33383g("OM", 2, 2, 0, 2, 2);
        y.m33383g("PA", 1, 3, 3, 4, 2);
        y.m33383g("PE", 2, 4, 4, 4, 2);
        y.m33383g("PF", 2, 2, 1, 1, 2);
        y.m33383g("PG", 4, 3, 3, 2, 2);
        y.m33383g("PH", 3, 0, 3, 4, 4);
        y.m33383g("PK", 3, 2, 3, 3, 2);
        y.m33383g("PL", 1, 0, 2, 2, 2);
        y.m33383g("PM", 0, 2, 2, 2, 2);
        y.m33383g("PR", 1, 2, 2, 3, 4);
        y.m33383g("PS", 3, 3, 2, 2, 2);
        y.m33383g("PT", 1, 1, 0, 0, 2);
        y.m33383g("PW", 1, 2, 3, 0, 2);
        y.m33383g("PY", 2, 0, 3, 3, 2);
        y.m33383g("QA", 2, 3, 1, 2, 2);
        y.m33383g("RE", 1, 0, 2, 1, 2);
        y.m33383g("RO", 1, 1, 1, 2, 2);
        y.m33383g("RS", 1, 2, 0, 0, 2);
        y.m33383g("RU", 0, 1, 0, 1, 2);
        y.m33383g("RW", 4, 3, 3, 4, 2);
        y.m33383g("SA", 2, 2, 2, 1, 2);
        y.m33383g("SB", 4, 2, 4, 2, 2);
        y.m33383g("SC", 4, 2, 0, 1, 2);
        y.m33383g("SD", 4, 4, 4, 3, 2);
        y.m33383g("SE", 0, 0, 0, 0, 2);
        y.m33383g("SG", 0, 0, 3, 3, 4);
        y.m33383g("SH", 4, 2, 2, 2, 2);
        y.m33383g("SI", 0, 1, 0, 0, 2);
        y.m33383g("SJ", 2, 2, 2, 2, 2);
        y.m33383g("SK", 0, 1, 0, 0, 2);
        y.m33383g("SL", 4, 3, 3, 1, 2);
        y.m33383g("SM", 0, 2, 2, 2, 2);
        y.m33383g("SN", 4, 4, 4, 3, 2);
        y.m33383g("SO", 3, 4, 4, 4, 2);
        y.m33383g("SR", 3, 2, 3, 1, 2);
        y.m33383g("SS", 4, 1, 4, 2, 2);
        y.m33383g("ST", 2, 2, 1, 2, 2);
        y.m33383g("SV", 2, 1, 4, 4, 2);
        y.m33383g("SX", 2, 2, 1, 0, 2);
        y.m33383g("SY", 4, 3, 2, 2, 2);
        y.m33383g("SZ", 3, 4, 3, 4, 2);
        y.m33383g("TC", 1, 2, 1, 0, 2);
        y.m33383g("TD", 4, 4, 4, 4, 2);
        y.m33383g("TG", 3, 2, 1, 0, 2);
        y.m33383g("TH", 1, 3, 4, 3, 0);
        y.m33383g("TJ", 4, 4, 4, 4, 2);
        y.m33383g("TL", 4, 1, 4, 4, 2);
        y.m33383g("TM", 4, 2, 1, 2, 2);
        y.m33383g("TN", 2, 1, 1, 1, 2);
        y.m33383g("TO", 3, 3, 4, 2, 2);
        y.m33383g("TR", 1, 2, 1, 1, 2);
        y.m33383g("TT", 1, 3, 1, 3, 2);
        y.m33383g("TV", 3, 2, 2, 4, 2);
        y.m33383g("TW", 0, 0, 0, 0, 1);
        y.m33383g("TZ", 3, 3, 3, 2, 2);
        y.m33383g("UA", 0, 3, 0, 0, 2);
        y.m33383g("UG", 3, 2, 2, 3, 2);
        y.m33383g("US", 0, 1, 3, 3, 3);
        y.m33383g("UY", 2, 1, 1, 1, 2);
        y.m33383g("UZ", 2, 0, 3, 2, 2);
        y.m33383g("VC", 2, 2, 2, 2, 2);
        y.m33383g("VE", 4, 4, 4, 4, 2);
        y.m33383g("VG", 2, 2, 1, 2, 2);
        y.m33383g("VI", 1, 2, 2, 4, 2);
        y.m33383g("VN", 0, 1, 4, 4, 2);
        y.m33383g("VU", 4, 1, 3, 1, 2);
        y.m33383g("WS", 3, 1, 4, 2, 2);
        y.m33383g("XK", 1, 1, 1, 0, 2);
        y.m33383g("YE", 4, 4, 4, 4, 2);
        y.m33383g("YT", 3, 2, 1, 3, 2);
        y.m33383g("ZA", 2, 3, 2, 2, 2);
        y.m33383g("ZM", 3, 2, 2, 3, 2);
        y.m33383g("ZW", 3, 3, 3, 3, 2);
        return y.m33385e();
    }

    /* renamed from: k */
    private long m24337k(int i) {
        Long l = this.f14469b.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f14469b.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: l */
    public static synchronized C6781o m24336l(Context context) {
        C6781o oVar;
        synchronized (C6781o.class) {
            if (f14467v == null) {
                f14467v = new C6783b(context).m24332a();
            }
            oVar = f14467v;
        }
        return oVar;
    }

    /* renamed from: m */
    private static boolean m24335m(C5288a aVar, boolean z) {
        return z && !aVar.m29626d(8);
    }

    /* renamed from: n */
    private void m24334n(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f14480m) {
            this.f14480m = j2;
            this.f14470c.m24367c(i, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public synchronized void m24333o() {
        int i;
        int i2 = 0;
        if (this.f14481n) {
            i = this.f14482o;
        } else {
            Context context = this.f14468a;
            if (context == null) {
                i = 0;
            } else {
                i = C7557q0.m22167Y(context);
            }
        }
        if (this.f14476i != i) {
            this.f14476i = i;
            if (!(i == 1 || i == 0 || i == 8)) {
                this.f14479l = m24337k(i);
                long b = this.f14472e.mo22292b();
                if (this.f14473f > 0) {
                    i2 = (int) (b - this.f14474g);
                }
                m24334n(i2, this.f14475h, this.f14479l);
                this.f14474g = b;
                this.f14475h = 0L;
                this.f14478k = 0L;
                this.f14477j = 0L;
                this.f14471d.m22326i();
            }
        }
    }

    @Override // p081e9.AbstractC6769e
    /* renamed from: a */
    public void mo24343a(AbstractC6769e.AbstractC6770a aVar) {
        this.f14470c.m24365e(aVar);
    }

    @Override // p081e9.AbstractC6795x
    /* renamed from: b */
    public synchronized void mo24316b(DataSource dataSource, C5288a aVar, boolean z) {
        boolean z2;
        if (m24335m(aVar, z)) {
            if (this.f14473f > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22366f(z2);
            long b = this.f14472e.mo22292b();
            int i = (int) (b - this.f14474g);
            this.f14477j += i;
            long j = this.f14478k;
            long j2 = this.f14475h;
            this.f14478k = j + j2;
            if (i > 0) {
                this.f14471d.m22332c((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.f14477j >= 2000 || this.f14478k >= 524288) {
                    this.f14479l = this.f14471d.m22329f(0.5f);
                }
                m24334n(i, this.f14475h, this.f14479l);
                this.f14474g = b;
                this.f14475h = 0L;
            }
            this.f14473f--;
        }
    }

    @Override // p081e9.AbstractC6769e
    /* renamed from: c */
    public AbstractC6795x mo24342c() {
        return this;
    }

    @Override // p081e9.AbstractC6769e
    /* renamed from: d */
    public synchronized long mo24341d() {
        return this.f14479l;
    }

    @Override // p081e9.AbstractC6795x
    /* renamed from: e */
    public synchronized void mo24315e(DataSource dataSource, C5288a aVar, boolean z, int i) {
        if (m24335m(aVar, z)) {
            this.f14475h += i;
        }
    }

    @Override // p081e9.AbstractC6795x
    /* renamed from: f */
    public synchronized void mo24314f(DataSource dataSource, C5288a aVar, boolean z) {
        if (m24335m(aVar, z)) {
            if (this.f14473f == 0) {
                this.f14474g = this.f14472e.mo22292b();
            }
            this.f14473f++;
        }
    }

    @Override // p081e9.AbstractC6769e
    /* renamed from: g */
    public void mo24340g(Handler handler, AbstractC6769e.AbstractC6770a aVar) {
        C7510a.m22367e(handler);
        C7510a.m22367e(aVar);
        this.f14470c.m24368b(handler, aVar);
    }

    @Override // p081e9.AbstractC6795x
    /* renamed from: h */
    public void mo24313h(DataSource dataSource, C5288a aVar, boolean z) {
    }

    @Deprecated
    public C6781o() {
        this(null, AbstractC3899l0.m33370r(), 2000, AbstractC7516c.f16293a, false);
    }

    private C6781o(Context context, Map<Integer, Long> map, int i, AbstractC7516c cVar, boolean z) {
        this.f14468a = context == null ? null : context.getApplicationContext();
        this.f14469b = AbstractC3899l0.m33378f(map);
        this.f14470c = new AbstractC6769e.AbstractC6770a.C0205a();
        this.f14471d = new C7523f0(i);
        this.f14472e = cVar;
        int Y = context == null ? 0 : C7557q0.m22167Y(context);
        this.f14476i = Y;
        this.f14479l = m24337k(Y);
        if (context != null && z) {
            C6784c.m24328b(context).m24326d(this);
        }
    }
}
