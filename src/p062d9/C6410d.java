package p062d9;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7542k0;
import p119g9.C7543l;
import p133h9.AbstractC7959m;
import p154i9.AbstractC8310a;
import p154i9.C8312c;
import p154i9.C8313d;
import p154i9.C8316e;
import p163j$.util.Spliterator;

/* renamed from: d9.d */
/* loaded from: classes5.dex */
final class C6410d implements AbstractC7959m, AbstractC8310a {

    /* renamed from: i */
    private int f13427i;

    /* renamed from: j */
    private SurfaceTexture f13428j;

    /* renamed from: m */
    private byte[] f13431m;

    /* renamed from: a */
    private final AtomicBoolean f13419a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f13420b = new AtomicBoolean(true);

    /* renamed from: c */
    private final C6407b f13421c = new C6407b();

    /* renamed from: d */
    private final C8312c f13422d = new C8312c();

    /* renamed from: e */
    private final C7542k0<Long> f13423e = new C7542k0<>();

    /* renamed from: f */
    private final C7542k0<C8313d> f13424f = new C7542k0<>();

    /* renamed from: g */
    private final float[] f13425g = new float[16];

    /* renamed from: h */
    private final float[] f13426h = new float[16];

    /* renamed from: k */
    private volatile int f13429k = 0;

    /* renamed from: l */
    private int f13430l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m25594g(SurfaceTexture surfaceTexture) {
        this.f13419a.set(true);
    }

    /* renamed from: i */
    private void m25592i(byte[] bArr, int i, long j) {
        C8313d dVar;
        byte[] bArr2 = this.f13431m;
        int i2 = this.f13430l;
        this.f13431m = bArr;
        if (i == -1) {
            i = this.f13429k;
        }
        this.f13430l = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f13431m)) {
            byte[] bArr3 = this.f13431m;
            if (bArr3 != null) {
                dVar = C8316e.m19971a(bArr3, this.f13430l);
            } else {
                dVar = null;
            }
            if (dVar == null || !C6407b.m25603c(dVar)) {
                dVar = C8313d.m19975b(this.f13430l);
            }
            this.f13424f.m22287a(j, dVar);
        }
    }

    @Override // p154i9.AbstractC8310a
    /* renamed from: a */
    public void mo19986a(long j, float[] fArr) {
        this.f13422d.m19977e(j, fArr);
    }

    @Override // p133h9.AbstractC7959m
    /* renamed from: b */
    public void mo21012b(long j, long j2, C6722k kVar, MediaFormat mediaFormat) {
        this.f13423e.m22287a(j2, Long.valueOf(j));
        m25592i(kVar.f37966F, kVar.f37967G, j2);
    }

    @Override // p154i9.AbstractC8310a
    /* renamed from: c */
    public void mo19985c() {
        this.f13423e.m22285c();
        this.f13422d.m19978d();
        this.f13420b.set(true);
    }

    /* renamed from: e */
    public void m25596e(float[] fArr, boolean z) {
        GLES20.glClear(Spliterator.SUBSIZED);
        C7543l.m22274b();
        if (this.f13419a.compareAndSet(true, false)) {
            ((SurfaceTexture) C7510a.m22367e(this.f13428j)).updateTexImage();
            C7543l.m22274b();
            if (this.f13420b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f13425g, 0);
            }
            long timestamp = this.f13428j.getTimestamp();
            Long g = this.f13423e.m22281g(timestamp);
            if (g != null) {
                this.f13422d.m19979c(this.f13425g, g.longValue());
            }
            C8313d j = this.f13424f.m22278j(timestamp);
            if (j != null) {
                this.f13421c.m25602d(j);
            }
        }
        Matrix.multiplyMM(this.f13426h, 0, fArr, 0, this.f13425g, 0);
        this.f13421c.m25605a(this.f13427i, this.f13426h, z);
    }

    /* renamed from: f */
    public SurfaceTexture m25595f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C7543l.m22274b();
        this.f13421c.m25604b();
        C7543l.m22274b();
        this.f13427i = C7543l.m22269g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13427i);
        this.f13428j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: d9.c
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C6410d.this.m25594g(surfaceTexture2);
            }
        });
        return this.f13428j;
    }

    /* renamed from: h */
    public void m25593h(int i) {
        this.f13429k = i;
    }
}
