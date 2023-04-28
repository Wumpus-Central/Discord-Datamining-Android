package pe;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: pe.f */
/* loaded from: classes6.dex */
public class C11644f {

    /* renamed from: a */
    private static final String f25975a = "f";

    /* renamed from: a */
    public static void m9165a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String str2 = f25975a;
            Log.e(str2, str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }

    /* renamed from: b */
    public static int m9164b(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m9165a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e(f25975a, "Could not create glProgram");
        }
        GLES20.glAttachShader(glCreateProgram, i);
        m9165a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, i2);
        m9165a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        String str = f25975a;
        Log.e(str, "Could not link glProgram: ");
        Log.e(str, GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    /* renamed from: c */
    public static int m9163c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m9165a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String str2 = f25975a;
        Log.e(str2, "Could not compile shader " + i + ":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e(str2, sb2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
