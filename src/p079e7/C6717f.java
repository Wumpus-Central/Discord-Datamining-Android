package p079e7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.AbstractC5252t0;
import java.util.ArrayList;
import p117g7.AbstractC7453h;
import p117g7.AbstractC7478r;
import p117g7.AbstractC7481s;
import p117g7.C7434d0;
import p117g7.C7449f;
import p117g7.C7462k0;
import p119g9.C7558r;
import p133h9.AbstractC7940a0;
import p133h9.C7952h;
import p154i9.C8311b;
import p317r8.AbstractC12465l;
import p317r8.C12466m;
import p439y7.AbstractC14292p;
import p459z7.AbstractC14583f;
import p459z7.C14584g;

/* renamed from: e7.f */
/* loaded from: classes7.dex */
public class C6717f implements AbstractC6735v {

    /* renamed from: a */
    private final Context f14303a;

    /* renamed from: d */
    private boolean f14306d;

    /* renamed from: f */
    private boolean f14308f;

    /* renamed from: g */
    private boolean f14309g;

    /* renamed from: h */
    private boolean f14310h;

    /* renamed from: i */
    private boolean f14311i;

    /* renamed from: j */
    private boolean f14312j;

    /* renamed from: k */
    private boolean f14313k;

    /* renamed from: b */
    private int f14304b = 0;

    /* renamed from: c */
    private long f14305c = 5000;

    /* renamed from: e */
    private AbstractC14292p f14307e = AbstractC14292p.f32350a;

    public C6717f(Context context) {
        this.f14303a = context;
    }

    @Override // p079e7.AbstractC6735v
    /* renamed from: a */
    public AbstractC5252t0[] mo24423a(Handler handler, AbstractC7940a0 a0Var, AbstractC7478r rVar, AbstractC12465l lVar, AbstractC14583f fVar) {
        ArrayList<AbstractC5252t0> arrayList = new ArrayList<>();
        m24536h(this.f14303a, this.f14304b, this.f14307e, this.f14306d, handler, a0Var, this.f14305c, arrayList);
        AbstractC7481s c = m24541c(this.f14303a, this.f14311i, this.f14312j, this.f14313k);
        if (c != null) {
            m24542b(this.f14303a, this.f14304b, this.f14307e, this.f14306d, c, handler, rVar, arrayList);
        }
        m24537g(this.f14303a, lVar, handler.getLooper(), this.f14304b, arrayList);
        m24539e(this.f14303a, fVar, handler.getLooper(), this.f14304b, arrayList);
        m24540d(this.f14303a, this.f14304b, arrayList);
        m24538f(this.f14303a, handler, this.f14304b, arrayList);
        return (AbstractC5252t0[]) arrayList.toArray(new AbstractC5252t0[0]);
    }

    /* renamed from: b */
    protected void m24542b(Context context, int i, AbstractC14292p pVar, boolean z, AbstractC7481s sVar, Handler handler, AbstractC7478r rVar, ArrayList<AbstractC5252t0> arrayList) {
        int i2;
        C7462k0 k0Var = new C7462k0(context, pVar, z, handler, rVar, sVar);
        k0Var.m1047g0(this.f14308f);
        k0Var.m1045h0(this.f14309g);
        k0Var.m1043i0(this.f14310h);
        arrayList.add(k0Var);
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                } catch (ClassNotFoundException unused) {
                }
                try {
                    arrayList.add(size, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                    C7558r.m22106f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i2;
                    i2 = size;
                    try {
                        int i3 = i2 + 1;
                        try {
                            arrayList.add(i2, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                            C7558r.m22106f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused3) {
                            i2 = i3;
                            i3 = i2;
                            arrayList.add(i3, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                            C7558r.m22106f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        }
                        arrayList.add(i3, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                        C7558r.m22106f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating FLAC extension", e);
                    }
                }
                try {
                    int i32 = i2 + 1;
                    arrayList.add(i2, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                    C7558r.m22106f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i32, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AbstractC7478r.class, AbstractC7481s.class).newInstance(handler, rVar, sVar));
                    C7558r.m22106f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating Opus extension", e3);
            }
        }
    }

    /* renamed from: c */
    protected AbstractC7481s m24541c(Context context, boolean z, boolean z2, boolean z3) {
        return new C7434d0(C7449f.m22602b(context), new C7434d0.C7438d(new AbstractC7453h[0]), z, z2, z3);
    }

    /* renamed from: d */
    protected void m24540d(Context context, int i, ArrayList<AbstractC5252t0> arrayList) {
        arrayList.add(new C8311b());
    }

    /* renamed from: e */
    protected void m24539e(Context context, AbstractC14583f fVar, Looper looper, int i, ArrayList<AbstractC5252t0> arrayList) {
        arrayList.add(new C14584g(fVar, looper));
    }

    /* renamed from: f */
    protected void m24538f(Context context, Handler handler, int i, ArrayList<AbstractC5252t0> arrayList) {
    }

    /* renamed from: g */
    protected void m24537g(Context context, AbstractC12465l lVar, Looper looper, int i, ArrayList<AbstractC5252t0> arrayList) {
        arrayList.add(new C12466m(lVar, looper));
    }

    /* renamed from: h */
    protected void m24536h(Context context, int i, AbstractC14292p pVar, boolean z, Handler handler, AbstractC7940a0 a0Var, long j, ArrayList<AbstractC5252t0> arrayList) {
        int i2;
        C7952h hVar = new C7952h(context, pVar, j, z, handler, a0Var, 50);
        hVar.m1047g0(this.f14308f);
        hVar.m1045h0(this.f14309g);
        hVar.m1043i0(this.f14310h);
        arrayList.add(hVar);
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, AbstractC7940a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, a0Var, 50));
                        C7558r.m22106f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                        arrayList.add(i2, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, AbstractC7940a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, a0Var, 50));
                        C7558r.m22106f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    arrayList.add(i2, (AbstractC5252t0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, AbstractC7940a0.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, a0Var, 50));
                    C7558r.m22106f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating AV1 extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        }
    }

    /* renamed from: i */
    public C6717f m24535i(int i) {
        this.f14304b = i;
        return this;
    }
}
