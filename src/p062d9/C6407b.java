package p062d9;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p119g9.C7543l;
import p154i9.C8313d;

/* renamed from: d9.b */
/* loaded from: classes5.dex */
final class C6407b {

    /* renamed from: j */
    private static final String[] f13398j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    private static final String[] f13399k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    private static final float[] f13400l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f13401m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    private static final float[] f13402n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    private static final float[] f13403o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    private static final float[] f13404p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f13405a;

    /* renamed from: b */
    private C6408a f13406b;

    /* renamed from: c */
    private C6408a f13407c;

    /* renamed from: d */
    private int f13408d;

    /* renamed from: e */
    private int f13409e;

    /* renamed from: f */
    private int f13410f;

    /* renamed from: g */
    private int f13411g;

    /* renamed from: h */
    private int f13412h;

    /* renamed from: i */
    private int f13413i;

    /* renamed from: d9.b$a */
    /* loaded from: classes5.dex */
    private static class C6408a {

        /* renamed from: a */
        private final int f13414a;

        /* renamed from: b */
        private final FloatBuffer f13415b;

        /* renamed from: c */
        private final FloatBuffer f13416c;

        /* renamed from: d */
        private final int f13417d;

        public C6408a(C8313d.C8315b bVar) {
            this.f13414a = bVar.m19972a();
            this.f13415b = C7543l.m22270f(bVar.f18139c);
            this.f13416c = C7543l.m22270f(bVar.f18140d);
            int i = bVar.f18138b;
            if (i == 1) {
                this.f13417d = 5;
            } else if (i != 2) {
                this.f13417d = 4;
            } else {
                this.f13417d = 6;
            }
        }
    }

    /* renamed from: c */
    public static boolean m25603c(C8313d dVar) {
        C8313d.C8314a aVar = dVar.f18132a;
        C8313d.C8314a aVar2 = dVar.f18133b;
        if (aVar.m19973b() == 1 && aVar.m19974a(0).f18137a == 0 && aVar2.m19973b() == 1 && aVar2.m19974a(0).f18137a == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25605a(int i, float[] fArr, boolean z) {
        C6408a aVar;
        float[] fArr2;
        if (z) {
            aVar = this.f13407c;
        } else {
            aVar = this.f13406b;
        }
        if (aVar != null) {
            GLES20.glUseProgram(this.f13408d);
            C7543l.m22274b();
            GLES20.glEnableVertexAttribArray(this.f13411g);
            GLES20.glEnableVertexAttribArray(this.f13412h);
            C7543l.m22274b();
            int i2 = this.f13405a;
            if (i2 == 1) {
                if (z) {
                    fArr2 = f13402n;
                } else {
                    fArr2 = f13401m;
                }
            } else if (i2 != 2) {
                fArr2 = f13400l;
            } else if (z) {
                fArr2 = f13404p;
            } else {
                fArr2 = f13403o;
            }
            GLES20.glUniformMatrix3fv(this.f13410f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f13409e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f13413i, 0);
            C7543l.m22274b();
            GLES20.glVertexAttribPointer(this.f13411g, 3, 5126, false, 12, (Buffer) aVar.f13415b);
            C7543l.m22274b();
            GLES20.glVertexAttribPointer(this.f13412h, 2, 5126, false, 8, (Buffer) aVar.f13416c);
            C7543l.m22274b();
            GLES20.glDrawArrays(aVar.f13417d, 0, aVar.f13414a);
            C7543l.m22274b();
            GLES20.glDisableVertexAttribArray(this.f13411g);
            GLES20.glDisableVertexAttribArray(this.f13412h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m25604b() {
        int d = C7543l.m22272d(f13398j, f13399k);
        this.f13408d = d;
        this.f13409e = GLES20.glGetUniformLocation(d, "uMvpMatrix");
        this.f13410f = GLES20.glGetUniformLocation(this.f13408d, "uTexMatrix");
        this.f13411g = GLES20.glGetAttribLocation(this.f13408d, "aPosition");
        this.f13412h = GLES20.glGetAttribLocation(this.f13408d, "aTexCoords");
        this.f13413i = GLES20.glGetUniformLocation(this.f13408d, "uTexture");
    }

    /* renamed from: d */
    public void m25602d(C8313d dVar) {
        if (m25603c(dVar)) {
            this.f13405a = dVar.f18134c;
            C6408a aVar = new C6408a(dVar.f18132a.m19974a(0));
            this.f13406b = aVar;
            if (!dVar.f18135d) {
                aVar = new C6408a(dVar.f18133b.m19974a(0));
            }
            this.f13407c = aVar;
        }
    }
}
