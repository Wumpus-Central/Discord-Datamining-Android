package pe;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import ie.C8392c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC9851b;
import ke.AbstractC9852c;
import me.C10592a;

/* renamed from: pe.g */
/* loaded from: classes6.dex */
public class C11645g implements AbstractC11647i {

    /* renamed from: g */
    protected static final String f25976g = "rotation-degrees";

    /* renamed from: a */
    private final boolean f25977a;

    /* renamed from: b */
    private C11648j f25978b;

    /* renamed from: c */
    private C11649k f25979c;

    /* renamed from: f */
    private boolean f25982f;

    /* renamed from: e */
    private float[] f25981e = new float[16];

    /* renamed from: d */
    private List<AbstractC9851b> f25980d = new ArrayList();

    public C11645g(List<AbstractC9851b> list) {
        boolean z;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.f25977a = z;
        if (list == null) {
            this.f25980d.add(new C10592a());
            return;
        }
        Iterator<AbstractC9851b> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof AbstractC9852c) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            this.f25980d.add(new C10592a());
        }
        this.f25980d.addAll(list);
    }

    /* renamed from: e */
    private void m9162e(long j) {
        m9160g();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (AbstractC9851b bVar : this.f25980d) {
            bVar.apply(j);
        }
        GLES20.glFinish();
    }

    /* renamed from: g */
    private void m9160g() {
        if (!this.f25982f) {
            for (AbstractC9851b bVar : this.f25980d) {
                if (bVar instanceof AbstractC9852c) {
                    ((AbstractC9852c) bVar).mo12781b(this.f25978b.m9150d(), this.f25978b.m9149e());
                }
            }
            this.f25982f = true;
        }
    }

    /* renamed from: h */
    private void m9159h(int i, float f) {
        float f2;
        float f3;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.orthoM(fArr, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (i != 0) {
            if (i != 90) {
                f4 = -1.0f;
                if (i != 180) {
                    if (i != 270) {
                        double d = (i / 180) * 3.141592653589793d;
                        f5 = (float) Math.sin(d);
                        f2 = (float) Math.cos(d);
                        f3 = f5;
                        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
                        Matrix.setIdentityM(this.f25981e, 0);
                        Matrix.multiplyMM(this.f25981e, 0, fArr, 0, fArr2, 0);
                    }
                }
            }
            f3 = f4;
            f2 = 0.0f;
            Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
            Matrix.setIdentityM(this.f25981e, 0);
            Matrix.multiplyMM(this.f25981e, 0, fArr, 0, fArr2, 0);
        }
        f2 = f4;
        f3 = f5;
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f3, f2, 0.0f);
        Matrix.setIdentityM(this.f25981e, 0);
        Matrix.multiplyMM(this.f25981e, 0, fArr, 0, fArr2, 0);
    }

    @Override // pe.AbstractC11647i
    /* renamed from: a */
    public boolean mo9157a() {
        return this.f25977a;
    }

    @Override // pe.AbstractC11647i
    /* renamed from: b */
    public void mo9156b(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        int i;
        float f;
        int i2;
        if (surface == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires an output surface");
        } else if (mediaFormat2 != null) {
            String str = f25976g;
            if (mediaFormat2.containsKey(str)) {
                i = mediaFormat2.getInteger(str);
            } else if (mediaFormat == null || !mediaFormat.containsKey(str)) {
                i = 0;
            } else {
                i = mediaFormat.getInteger(str);
            }
            if (!mediaFormat2.containsKey("width") || !mediaFormat2.containsKey("height")) {
                f = 1.0f;
            } else {
                f = mediaFormat2.getInteger("width") / mediaFormat2.getInteger("height");
            }
            this.f25979c = new C11649k(surface);
            int i3 = -1;
            if (mediaFormat == null || !mediaFormat.containsKey("width")) {
                i2 = -1;
            } else {
                i2 = mediaFormat.getInteger("width");
            }
            if (mediaFormat != null && mediaFormat.containsKey("height")) {
                i3 = mediaFormat.getInteger("height");
            }
            this.f25978b = new C11648j(i2, i3);
            m9159h(i, f);
            for (AbstractC9851b bVar : this.f25980d) {
                bVar.mo12780c();
                float[] fArr = this.f25981e;
                bVar.mo12782a(Arrays.copyOf(fArr, fArr.length), 0);
            }
        } else {
            throw new IllegalArgumentException("GlVideoRenderer requires target media format");
        }
    }

    @Override // pe.AbstractC11647i
    /* renamed from: c */
    public void mo9155c(C8392c cVar, long j) {
        this.f25978b.m9153a();
        m9162e(j);
        this.f25979c.m9143e(j);
        this.f25979c.m9142f();
    }

    @Override // pe.AbstractC11647i
    /* renamed from: d */
    public void mo9154d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
    }

    /* renamed from: f */
    public Surface m9161f() {
        C11648j jVar = this.f25978b;
        if (jVar != null) {
            return jVar.m9151c();
        }
        return null;
    }

    @Override // pe.AbstractC11647i
    public void release() {
        for (AbstractC9851b bVar : this.f25980d) {
            bVar.release();
        }
        this.f25978b.m9148f();
        this.f25979c.m9144d();
    }
}
