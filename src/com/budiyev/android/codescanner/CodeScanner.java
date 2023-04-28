package com.budiyev.android.codescanner;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Process;
import android.view.SurfaceHolder;
import com.budiyev.android.codescanner.C4178f;
import com.budiyev.android.codescanner.CodeScannerView;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p066dd.EnumC6432a;

/* loaded from: classes.dex */
public final class CodeScanner {

    /* renamed from: K */
    public static final List<EnumC6432a> f35919K;

    /* renamed from: N */
    private static final List<EnumC6432a> f35922N;

    /* renamed from: b */
    private final Context f6998b;

    /* renamed from: d */
    private final CodeScannerView f7000d;

    /* renamed from: e */
    private final SurfaceHolder f7001e;

    /* renamed from: L */
    public static final List<EnumC6432a> f35920L = Collections.unmodifiableList(Arrays.asList(EnumC6432a.CODABAR, EnumC6432a.CODE_39, EnumC6432a.CODE_93, EnumC6432a.CODE_128, EnumC6432a.EAN_8, EnumC6432a.EAN_13, EnumC6432a.ITF, EnumC6432a.RSS_14, EnumC6432a.RSS_EXPANDED, EnumC6432a.UPC_A, EnumC6432a.UPC_E, EnumC6432a.UPC_EAN_EXTENSION));

    /* renamed from: M */
    public static final List<EnumC6432a> f35921M = Collections.unmodifiableList(Arrays.asList(EnumC6432a.AZTEC, EnumC6432a.DATA_MATRIX, EnumC6432a.MAXICODE, EnumC6432a.PDF_417, EnumC6432a.QR_CODE));

    /* renamed from: O */
    private static final EnumC4188m f35923O = EnumC4188m.SINGLE;

    /* renamed from: P */
    private static final EnumC4173a f35924P = EnumC4173a.SAFE;

    /* renamed from: a */
    private final Object f6997a = new Object();

    /* renamed from: n */
    private volatile List<EnumC6432a> f7010n = f35922N;

    /* renamed from: o */
    private volatile EnumC4188m f7011o = f35923O;

    /* renamed from: p */
    private volatile EnumC4173a f7012p = f35924P;

    /* renamed from: q */
    private volatile AbstractC4176d f7013q = null;

    /* renamed from: r */
    private volatile AbstractC4183h f7014r = null;

    /* renamed from: s */
    private volatile C4182g f7015s = null;

    /* renamed from: t */
    private volatile boolean f7016t = false;

    /* renamed from: u */
    private volatile boolean f7017u = false;

    /* renamed from: v */
    private volatile boolean f7018v = false;

    /* renamed from: w */
    private volatile boolean f7019w = true;

    /* renamed from: x */
    private volatile boolean f7020x = false;

    /* renamed from: y */
    private volatile long f7021y = 2000;

    /* renamed from: z */
    private volatile int f7022z = -1;

    /* renamed from: A */
    private volatile int f35925A = 0;

    /* renamed from: B */
    private boolean f35926B = true;

    /* renamed from: C */
    private boolean f35927C = false;

    /* renamed from: D */
    private boolean f35928D = false;

    /* renamed from: E */
    private boolean f35929E = false;

    /* renamed from: F */
    private boolean f35930F = false;

    /* renamed from: G */
    private boolean f35931G = false;

    /* renamed from: H */
    private int f35932H = 0;

    /* renamed from: I */
    private int f35933I = 0;

    /* renamed from: J */
    private int f35934J = 0;

    /* renamed from: c */
    private final Handler f6999c = new Handler();

    /* renamed from: f */
    private final SurfaceHolder.Callback f7002f = new SurfaceHolder$CallbackC4166k();

    /* renamed from: g */
    private final Camera.PreviewCallback f7003g = new C4161f();

    /* renamed from: h */
    private final Camera.AutoFocusCallback f7004h = new C4167l();

    /* renamed from: i */
    private final Camera.AutoFocusCallback f7005i = new C4162g();

    /* renamed from: j */
    private final Runnable f7006j = new RunnableC4163h();

    /* renamed from: k */
    private final Runnable f7007k = new RunnableC4165j();

    /* renamed from: l */
    private final C4157b f7008l = new C4157b();

    /* renamed from: m */
    private final C4158c f7009m = new C4158c();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$b */
    /* loaded from: classes.dex */
    public final class C4157b implements C4178f.AbstractC4181c {
        private C4157b() {
        }

        @Override // com.budiyev.android.codescanner.C4178f.AbstractC4181c
        /* renamed from: a */
        public boolean mo32428a(C4178f.EnumC4180b bVar) {
            if (bVar == C4178f.EnumC4180b.DECODED) {
                EnumC4188m mVar = CodeScanner.this.f7011o;
                if (mVar == EnumC4188m.PREVIEW) {
                    return false;
                }
                if (mVar == EnumC4188m.SINGLE) {
                    CodeScanner.this.f7018v = true;
                    CodeScanner.this.f6999c.post(CodeScanner.this.f7007k);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$c */
    /* loaded from: classes.dex */
    public final class C4158c implements Thread.UncaughtExceptionHandler {
        private C4158c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            CodeScanner.this.m32495V();
            AbstractC4183h hVar = CodeScanner.this.f7014r;
            if (hVar != null) {
                hVar.onError(th2);
                return;
            }
            throw new C4175c(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$d */
    /* loaded from: classes.dex */
    public final class RunnableC4159d implements Runnable {

        /* renamed from: k */
        private final C4184i f7025k;

        @Override // java.lang.Runnable
        public void run() {
            if (CodeScanner.this.f7017u) {
                CodeScanner.this.f7000d.setPreviewSize(this.f7025k);
                CodeScanner.this.f7000d.setAutoFocusEnabled(CodeScanner.this.m32502O());
                CodeScanner.this.f7000d.setFlashEnabled(CodeScanner.this.m32500Q());
                CodeScanner.this.m32477g0();
            }
        }

        private RunnableC4159d(C4184i iVar) {
            this.f7025k = iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$e */
    /* loaded from: classes.dex */
    public final class C4160e extends Thread {

        /* renamed from: k */
        private final int f7027k;

        /* renamed from: l */
        private final int f7028l;

        public C4160e(int i, int i2) {
            super("cs-init");
            this.f7027k = i;
            this.f7028l = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m32452a() {
            /*
                Method dump skipped, instructions count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.budiyev.android.codescanner.CodeScanner.C4160e.m32452a():void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            m32452a();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$f */
    /* loaded from: classes.dex */
    private final class C4161f implements Camera.PreviewCallback {
        private C4161f() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C4182g gVar;
            C4187l frameRect;
            if (CodeScanner.this.f7017u && !CodeScanner.this.f7018v && CodeScanner.this.f7011o != EnumC4188m.PREVIEW && bArr != null && (gVar = CodeScanner.this.f7015s) != null) {
                C4178f b = gVar.m32426b();
                if (b.m32434h() == C4178f.EnumC4180b.IDLE && (frameRect = CodeScanner.this.f7000d.getFrameRect()) != null && frameRect.m32408h() >= 1 && frameRect.m32412d() >= 1) {
                    b.m32435g(new C4177e(bArr, gVar.m32424d(), gVar.m32423e(), gVar.m32422f(), frameRect, gVar.m32425c(), gVar.m32418j()));
                }
            }
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$g */
    /* loaded from: classes.dex */
    private final class C4162g implements Camera.AutoFocusCallback {
        private C4162g() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CodeScanner.this.f35929E = false;
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$h */
    /* loaded from: classes.dex */
    private final class RunnableC4163h implements Runnable {
        private RunnableC4163h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodeScanner.this.f35930F = false;
            if (CodeScanner.this.f7012p == EnumC4173a.SAFE) {
                CodeScanner.this.m32494W();
            }
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$i */
    /* loaded from: classes.dex */
    private final class C4164i implements CodeScannerView.AbstractC4172e {
        private C4164i() {
        }

        @Override // com.budiyev.android.codescanner.CodeScannerView.AbstractC4172e
        /* renamed from: a */
        public void mo32443a(int i, int i2) {
            synchronized (CodeScanner.this.f6997a) {
                if (!(i == CodeScanner.this.f35933I && i2 == CodeScanner.this.f35934J)) {
                    boolean z = CodeScanner.this.f35928D;
                    if (CodeScanner.this.f7017u) {
                        CodeScanner.this.m32496U();
                    }
                    if (z || CodeScanner.this.f35931G) {
                        CodeScanner.this.m32503N(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$j */
    /* loaded from: classes.dex */
    private final class RunnableC4165j implements Runnable {
        private RunnableC4165j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodeScanner.this.m32471j0();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$k */
    /* loaded from: classes.dex */
    private final class SurfaceHolder$CallbackC4166k implements SurfaceHolder.Callback {
        private SurfaceHolder$CallbackC4166k() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder.getSurface() == null) {
                CodeScanner.this.f35928D = false;
                return;
            }
            CodeScanner.this.m32467l0();
            CodeScanner.this.m32473i0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CodeScanner.this.m32473i0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CodeScanner.this.m32467l0();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$l */
    /* loaded from: classes.dex */
    private final class C4167l implements Camera.AutoFocusCallback {
        private C4167l() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CodeScanner.this.f35927C = false;
        }
    }

    static {
        List<EnumC6432a> unmodifiableList = Collections.unmodifiableList(Arrays.asList(EnumC6432a.values()));
        f35919K = unmodifiableList;
        f35922N = unmodifiableList;
    }

    public CodeScanner(Context context, CodeScannerView codeScannerView) {
        this.f6998b = context;
        this.f7000d = codeScannerView;
        this.f7001e = codeScannerView.getPreviewView().getHolder();
        codeScannerView.setCodeScanner(this);
        codeScannerView.setSizeListener(new C4164i());
    }

    /* renamed from: M */
    private void m32504M() {
        m32503N(this.f7000d.getWidth(), this.f7000d.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m32503N(int i, int i2) {
        this.f35933I = i;
        this.f35934J = i2;
        if (i <= 0 || i2 <= 0) {
            this.f35931G = true;
            return;
        }
        this.f7016t = true;
        this.f35931G = false;
        C4160e eVar = new C4160e(i, i2);
        eVar.setUncaughtExceptionHandler(this.f7009m);
        eVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m32495V() {
        this.f7017u = false;
        this.f7016t = false;
        this.f7018v = false;
        this.f35928D = false;
        this.f35929E = false;
        C4182g gVar = this.f7015s;
        if (gVar != null) {
            this.f7015s = null;
            gVar.m32419i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m32494W() {
        C4182g gVar;
        int i;
        if (this.f7017u && this.f35928D && (gVar = this.f7015s) != null && gVar.m32421g() && this.f7019w) {
            if (!this.f35929E || (i = this.f35932H) >= 2) {
                try {
                    Camera a = gVar.m32427a();
                    a.cancelAutoFocus();
                    a.autoFocus(this.f7005i);
                    this.f35932H = 0;
                    this.f35929E = true;
                } catch (Exception unused) {
                    this.f35929E = false;
                }
            } else {
                this.f35932H = i + 1;
            }
            m32493X();
        }
    }

    /* renamed from: X */
    private void m32493X() {
        if (!this.f35930F) {
            this.f35930F = true;
            this.f6999c.postDelayed(this.f7006j, this.f7021y);
        }
    }

    /* renamed from: Z */
    private void m32491Z(boolean z) {
        C4187l frameRect;
        try {
            C4182g gVar = this.f7015s;
            if (gVar != null) {
                Camera a = gVar.m32427a();
                a.cancelAutoFocus();
                this.f35927C = false;
                Camera.Parameters parameters = a.getParameters();
                EnumC4173a aVar = this.f7012p;
                if (z) {
                    C4189n.m32388r(parameters, aVar);
                } else {
                    C4189n.m32397i(parameters);
                }
                if (z && (frameRect = this.f7000d.getFrameRect()) != null) {
                    C4189n.m32405a(parameters, gVar, frameRect);
                }
                a.setParameters(parameters);
                if (z) {
                    this.f35932H = 0;
                    this.f35929E = false;
                    if (aVar == EnumC4173a.SAFE) {
                        m32493X();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e0 */
    private void m32481e0(boolean z) {
        Camera a;
        Camera.Parameters parameters;
        try {
            C4182g gVar = this.f7015s;
            if (gVar != null && (parameters = (a = gVar.m32427a()).getParameters()) != null) {
                if (z) {
                    C4189n.m32387s(parameters, "torch");
                } else {
                    C4189n.m32387s(parameters, "off");
                }
                a.setParameters(parameters);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: h0 */
    private void m32475h0(boolean z) {
        try {
            C4182g gVar = this.f7015s;
            if (gVar != null) {
                Camera a = gVar.m32427a();
                a.setPreviewCallback(this.f7003g);
                a.setPreviewDisplay(this.f7001e);
                if (!z && gVar.m32420h() && this.f7020x) {
                    m32481e0(true);
                }
                a.startPreview();
                this.f7018v = false;
                this.f35928D = true;
                this.f35929E = false;
                this.f35932H = 0;
                if (gVar.m32421g() && this.f7019w) {
                    C4187l frameRect = this.f7000d.getFrameRect();
                    if (frameRect != null) {
                        Camera.Parameters parameters = a.getParameters();
                        C4189n.m32405a(parameters, gVar, frameRect);
                        a.setParameters(parameters);
                    }
                    if (this.f7012p == EnumC4173a.SAFE) {
                        m32493X();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m32473i0() {
        if (this.f7017u && !this.f35928D) {
            m32475h0(true);
        }
    }

    /* renamed from: k0 */
    private void m32469k0(boolean z) {
        try {
            C4182g gVar = this.f7015s;
            if (gVar != null) {
                Camera a = gVar.m32427a();
                a.cancelAutoFocus();
                Camera.Parameters parameters = a.getParameters();
                if (!z && gVar.m32420h() && this.f7020x) {
                    C4189n.m32387s(parameters, "off");
                }
                a.setParameters(parameters);
                a.setPreviewCallback(null);
                a.stopPreview();
            }
        } catch (Exception unused) {
        }
        this.f7018v = false;
        this.f35928D = false;
        this.f35929E = false;
        this.f35932H = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m32467l0() {
        if (this.f7017u && this.f35928D) {
            m32469k0(true);
        }
    }

    /* renamed from: O */
    public boolean m32502O() {
        return this.f7019w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean m32501P() {
        C4182g gVar = this.f7015s;
        if (gVar == null || gVar.m32421g()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m32500Q() {
        return this.f7020x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean m32499R() {
        C4182g gVar = this.f7015s;
        if (gVar == null || gVar.m32420h()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean m32498S() {
        return this.f35926B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m32497T(C4187l lVar) {
        synchronized (this.f6997a) {
            if (this.f7017u && this.f35928D && !this.f35927C) {
                try {
                    m32492Y(false);
                    C4182g gVar = this.f7015s;
                    if (this.f35928D && gVar != null && gVar.m32421g()) {
                        C4184i d = gVar.m32424d();
                        int a = d.m32417a();
                        int b = d.m32416b();
                        int c = gVar.m32425c();
                        if (c == 90 || c == 270) {
                            a = b;
                            b = a;
                        }
                        C4187l m = C4189n.m32393m(a, b, lVar, gVar.m32423e(), gVar.m32422f());
                        Camera a2 = gVar.m32427a();
                        a2.cancelAutoFocus();
                        Camera.Parameters parameters = a2.getParameters();
                        C4189n.m32403c(parameters, m, a, b, c);
                        C4189n.m32402d(parameters);
                        a2.setParameters(parameters);
                        a2.autoFocus(this.f7004h);
                        this.f35927C = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: U */
    public void m32496U() {
        if (this.f7017u) {
            if (this.f35928D) {
                m32471j0();
            }
            m32495V();
        }
    }

    /* renamed from: Y */
    public void m32492Y(boolean z) {
        boolean z2;
        synchronized (this.f6997a) {
            if (this.f7019w != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f7019w = z;
            this.f7000d.setAutoFocusEnabled(z);
            C4182g gVar = this.f7015s;
            if (this.f7017u && this.f35928D && z2 && gVar != null && gVar.m32421g()) {
                m32491Z(z);
            }
        }
    }

    /* renamed from: a0 */
    public void m32489a0(int i) {
        synchronized (this.f6997a) {
            if (this.f7022z != i) {
                this.f7022z = i;
                if (this.f7017u) {
                    boolean z = this.f35928D;
                    m32496U();
                    if (z) {
                        m32504M();
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public void m32487b0(AbstractC4176d dVar) {
        C4182g gVar;
        synchronized (this.f6997a) {
            this.f7013q = dVar;
            if (this.f7017u && (gVar = this.f7015s) != null) {
                gVar.m32426b().m32433i(dVar);
            }
        }
    }

    /* renamed from: c0 */
    public void m32485c0(AbstractC4183h hVar) {
        this.f7014r = hVar;
    }

    /* renamed from: d0 */
    public void m32483d0(boolean z) {
        boolean z2;
        synchronized (this.f6997a) {
            if (this.f7020x != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f7020x = z;
            this.f7000d.setFlashEnabled(z);
            C4182g gVar = this.f7015s;
            if (this.f7017u && this.f35928D && z2 && gVar != null && gVar.m32420h()) {
                m32481e0(z);
            }
        }
    }

    /* renamed from: f0 */
    public void m32479f0(List<EnumC6432a> list) {
        C4182g gVar;
        synchronized (this.f6997a) {
            Objects.requireNonNull(list);
            this.f7010n = list;
            if (this.f7017u && (gVar = this.f7015s) != null) {
                gVar.m32426b().m32432j(list);
            }
        }
    }

    /* renamed from: g0 */
    public void m32477g0() {
        synchronized (this.f6997a) {
            if (!this.f7017u && !this.f7016t) {
                m32504M();
            } else if (!this.f35928D) {
                this.f7001e.addCallback(this.f7002f);
                m32475h0(false);
            }
        }
    }

    /* renamed from: j0 */
    public void m32471j0() {
        if (this.f7017u && this.f35928D) {
            this.f7001e.removeCallback(this.f7002f);
            m32469k0(false);
        }
    }
}
