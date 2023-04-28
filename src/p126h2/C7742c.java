package p126h2;

import android.content.Context;
import androidx.core.p018os.C2458t;
import java.io.File;
import p291q2.AbstractC11976e;
import p291q2.AbstractC11977f;
import p291q2.C11973b;
import p291q2.C11978g;
import p291q2.C11979h;

/* renamed from: h2.c */
/* loaded from: classes.dex */
public class C7742c {

    /* renamed from: a */
    public static boolean f16781a = false;

    /* renamed from: b */
    private static boolean f16782b = false;

    /* renamed from: c */
    private static String[] f16783c;

    /* renamed from: d */
    private static long[] f16784d;

    /* renamed from: e */
    private static int f16785e;

    /* renamed from: f */
    private static int f16786f;

    /* renamed from: g */
    private static AbstractC11977f f16787g;

    /* renamed from: h */
    private static AbstractC11976e f16788h;

    /* renamed from: i */
    private static volatile C11979h f16789i;

    /* renamed from: j */
    private static volatile C11978g f16790j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2.c$a */
    /* loaded from: classes.dex */
    public class C7743a implements AbstractC11976e {

        /* renamed from: a */
        final /* synthetic */ Context f16791a;

        C7743a(Context context) {
            this.f16791a = context;
        }

        @Override // p291q2.AbstractC11976e
        /* renamed from: a */
        public File mo8088a() {
            return new File(this.f16791a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m21543a(String str) {
        if (f16782b) {
            int i = f16785e;
            if (i == 20) {
                f16786f++;
                return;
            }
            f16783c[i] = str;
            f16784d[i] = System.nanoTime();
            C2458t.m37717a(str);
            f16785e++;
        }
    }

    /* renamed from: b */
    public static float m21542b(String str) {
        int i = f16786f;
        if (i > 0) {
            f16786f = i - 1;
            return 0.0f;
        } else if (!f16782b) {
            return 0.0f;
        } else {
            int i2 = f16785e - 1;
            f16785e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f16783c[i2])) {
                C2458t.m37716b();
                return ((float) (System.nanoTime() - f16784d[f16785e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f16783c[f16785e] + ".");
            }
        }
    }

    /* renamed from: c */
    public static C11978g m21541c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C11978g gVar = f16790j;
        if (gVar == null) {
            synchronized (C11978g.class) {
                gVar = f16790j;
                if (gVar == null) {
                    AbstractC11976e eVar = f16788h;
                    if (eVar == null) {
                        eVar = new C7743a(applicationContext);
                    }
                    gVar = new C11978g(eVar);
                    f16790j = gVar;
                }
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public static C11979h m21540d(Context context) {
        C11979h hVar = f16789i;
        if (hVar == null) {
            synchronized (C11979h.class) {
                hVar = f16789i;
                if (hVar == null) {
                    C11978g c = m21541c(context);
                    AbstractC11977f fVar = f16787g;
                    if (fVar == null) {
                        fVar = new C11973b();
                    }
                    hVar = new C11979h(c, fVar);
                    f16789i = hVar;
                }
            }
        }
        return hVar;
    }
}
