package me;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import ke.AbstractC9852c;
import ke.C9853d;
import ne.AbstractC10777a;
import p215le.C10407a;
import pe.C11644f;

/* renamed from: me.b */
/* loaded from: classes6.dex */
public class C10593b implements AbstractC9852c {

    /* renamed from: a */
    private final String f23437a;

    /* renamed from: b */
    private final String f23438b;

    /* renamed from: c */
    private final AbstractC10777a[] f23439c;

    /* renamed from: d */
    private final C9853d f23440d;

    /* renamed from: e */
    private float[] f23441e = new float[16];

    /* renamed from: f */
    private float[] f23442f = new float[16];

    /* renamed from: g */
    private int f23443g;

    /* renamed from: h */
    private FloatBuffer f23444h;

    /* renamed from: i */
    private final float[] f23445i;

    /* renamed from: j */
    private int f23446j;

    /* renamed from: k */
    private int f23447k;

    /* renamed from: l */
    private int f23448l;

    /* renamed from: m */
    private int f23449m;

    /* renamed from: n */
    private int f23450n;

    /* renamed from: o */
    private int f23451o;

    /* renamed from: p */
    private int f23452p;

    /* renamed from: q */
    private int f23453q;

    /* JADX INFO: Access modifiers changed from: protected */
    public C10593b(String str, String str2, AbstractC10777a[] aVarArr, C9853d dVar) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f23445i = fArr;
        this.f23437a = str;
        this.f23438b = str2;
        this.f23439c = aVarArr;
        this.f23440d = dVar == null ? new C9853d(new PointF(1.0f, 1.0f), new PointF(0.5f, 0.5f), 0.0f) : dVar;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f23444h = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    @Override // ke.AbstractC9851b
    /* renamed from: a */
    public void mo12782a(float[] fArr, int i) {
        this.f23441e = C10407a.m13474a(fArr, this.f23440d);
        this.f23443g = i;
    }

    @Override // ke.AbstractC9851b
    public void apply(long j) {
        this.f23444h.position(0);
        GLES20.glVertexAttribPointer(this.f23452p, 3, 5126, false, 20, (Buffer) this.f23444h);
        C11644f.m9165a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f23452p);
        C11644f.m9165a("glEnableVertexAttribArray aPositionHandle");
        this.f23444h.position(3);
        GLES20.glVertexAttribPointer(this.f23453q, 2, 5126, false, 20, (Buffer) this.f23444h);
        C11644f.m9165a("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f23453q);
        C11644f.m9165a("glEnableVertexAttribArray aTextureHandle");
        C11644f.m9165a("onDrawFrame start");
        GLES20.glUseProgram(this.f23448l);
        C11644f.m9165a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f23451o);
        AbstractC10777a[] aVarArr = this.f23439c;
        if (aVarArr == null || aVarArr.length <= 0) {
            GLES20.glUniformMatrix4fv(this.f23449m, 1, false, this.f23441e, this.f23443g);
            GLES20.glUniformMatrix4fv(this.f23450n, 1, false, this.f23442f, 0);
            GLES20.glDrawArrays(5, 0, 4);
            C11644f.m9165a("glDrawArrays");
            return;
        }
        AbstractC10777a aVar = aVarArr[0];
        throw null;
    }

    @Override // ke.AbstractC9852c
    /* renamed from: b */
    public void mo12781b(int i, float[] fArr) {
        this.f23451o = i;
        this.f23442f = fArr;
    }

    @Override // ke.AbstractC9851b
    /* renamed from: c */
    public void mo12780c() {
        Matrix.setIdentityM(this.f23442f, 0);
        int c = C11644f.m9163c(35633, this.f23437a);
        this.f23446j = c;
        if (c != 0) {
            int c2 = C11644f.m9163c(35632, this.f23438b);
            this.f23447k = c2;
            if (c2 != 0) {
                int b = C11644f.m9164b(this.f23446j, c2);
                this.f23448l = b;
                if (b != 0) {
                    this.f23452p = GLES20.glGetAttribLocation(b, "aPosition");
                    C11644f.m9165a("glGetAttribLocation aPosition");
                    if (this.f23452p != -1) {
                        this.f23453q = GLES20.glGetAttribLocation(this.f23448l, "aTextureCoord");
                        C11644f.m9165a("glGetAttribLocation aTextureCoord");
                        if (this.f23453q != -1) {
                            this.f23449m = GLES20.glGetUniformLocation(this.f23448l, "uMVPMatrix");
                            C11644f.m9165a("glGetUniformLocation uMVPMatrix");
                            if (this.f23449m != -1) {
                                this.f23450n = GLES20.glGetUniformLocation(this.f23448l, "uSTMatrix");
                                C11644f.m9165a("glGetUniformLocation uSTMatrix");
                                if (this.f23450n == -1) {
                                    throw new RuntimeException("Could not get attrib location for uSTMatrix");
                                }
                                return;
                            }
                            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                        }
                        throw new RuntimeException("Could not get attrib location for aTextureCoord");
                    }
                    throw new RuntimeException("Could not get attrib location for aPosition");
                }
                release();
                throw new RuntimeException("failed creating glProgram");
            }
            release();
            throw new RuntimeException("failed loading fragment shader");
        }
        throw new RuntimeException("failed loading vertex shader");
    }

    @Override // ke.AbstractC9851b
    public void release() {
        GLES20.glDeleteProgram(this.f23448l);
        GLES20.glDeleteShader(this.f23446j);
        GLES20.glDeleteShader(this.f23447k);
        GLES20.glDeleteBuffers(1, new int[]{this.f23453q}, 0);
        this.f23448l = 0;
        this.f23446j = 0;
        this.f23447k = 0;
        this.f23453q = 0;
    }
}
