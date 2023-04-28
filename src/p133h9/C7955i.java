package p133h9;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p119g9.C7510a;
import p119g9.C7543l;
import p163j$.util.Spliterator;

/* renamed from: h9.i */
/* loaded from: classes5.dex */
class C7955i implements GLSurfaceView.Renderer, AbstractC7958l {

    /* renamed from: u */
    private static final float[] f17113u = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* renamed from: v */
    private static final float[] f17114v = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* renamed from: w */
    private static final float[] f17115w = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

    /* renamed from: x */
    private static final String[] f17116x = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: y */
    private static final FloatBuffer f17117y = C7543l.m22270f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: k */
    private final GLSurfaceView f17118k;

    /* renamed from: o */
    private int f17122o;

    /* renamed from: q */
    private int f17124q;

    /* renamed from: t */
    private C7957k f17127t;

    /* renamed from: l */
    private final int[] f17119l = new int[3];

    /* renamed from: m */
    private final AtomicReference<C7957k> f17120m = new AtomicReference<>();

    /* renamed from: n */
    private FloatBuffer[] f17121n = new FloatBuffer[3];

    /* renamed from: p */
    private int[] f17123p = new int[3];

    /* renamed from: r */
    private int[] f17125r = new int[3];

    /* renamed from: s */
    private int[] f17126s = new int[3];

    public C7955i(GLSurfaceView gLSurfaceView) {
        this.f17118k = gLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f17125r;
            this.f17126s[i] = -1;
            iArr[i] = -1;
        }
    }

    /* renamed from: a */
    private void m21013a() {
        GLES20.glGenTextures(3, this.f17119l, 0);
        for (int i = 0; i < 3; i++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f17122o, f17116x[i]), i);
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.f17119l[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        C7543l.m22274b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z;
        int i;
        C7957k andSet = this.f17120m.getAndSet(null);
        if (!(andSet == null && this.f17127t == null)) {
            if (andSet != null) {
                C7957k kVar = this.f17127t;
                if (kVar != null) {
                    kVar.mo5319n();
                }
                this.f17127t = andSet;
            }
            C7957k kVar2 = (C7957k) C7510a.m22367e(this.f17127t);
            float[] fArr = f17114v;
            int i2 = kVar2.f17133r;
            if (i2 == 1) {
                fArr = f17113u;
            } else if (i2 == 3) {
                fArr = f17115w;
            }
            GLES20.glUniformMatrix3fv(this.f17124q, 1, false, fArr, 0);
            int[] iArr = (int[]) C7510a.m22367e(kVar2.f17132q);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C7510a.m22367e(kVar2.f17131p);
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 == 0) {
                    i = kVar2.f17130o;
                } else {
                    i = (kVar2.f17130o + 1) / 2;
                }
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.f17119l[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i, 0, 6409, 5121, byteBufferArr[i3]);
            }
            int i4 = kVar2.f17129n;
            int i5 = (i4 + 1) / 2;
            int[] iArr2 = {i4, i5, i5};
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.f17125r[i6] != iArr2[i6] || this.f17126s[i6] != iArr[i6]) {
                    if (iArr[i6] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7510a.m22366f(z);
                    float f = iArr2[i6] / iArr[i6];
                    this.f17121n[i6] = C7543l.m22270f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f17123p[i6], 2, 5126, false, 0, (Buffer) this.f17121n[i6]);
                    this.f17125r[i6] = iArr2[i6];
                    this.f17126s[i6] = iArr[i6];
                }
            }
            GLES20.glClear(Spliterator.SUBSIZED);
            GLES20.glDrawArrays(5, 0, 4);
            C7543l.m22274b();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int c = C7543l.m22273c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f17122o = c;
        GLES20.glUseProgram(c);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f17122o, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f17117y);
        this.f17123p[0] = GLES20.glGetAttribLocation(this.f17122o, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f17123p[0]);
        this.f17123p[1] = GLES20.glGetAttribLocation(this.f17122o, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f17123p[1]);
        this.f17123p[2] = GLES20.glGetAttribLocation(this.f17122o, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f17123p[2]);
        C7543l.m22274b();
        this.f17124q = GLES20.glGetUniformLocation(this.f17122o, "mColorConversion");
        C7543l.m22274b();
        m21013a();
        C7543l.m22274b();
    }
}
