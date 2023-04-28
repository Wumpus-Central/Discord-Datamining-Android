package com.budiyev.android.codescanner;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.view.WindowManager;
import com.google.zxing.Result;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p066dd.AbstractC6439h;
import p066dd.C6434c;
import p066dd.C6440i;
import p066dd.C6441j;
import p137hd.C8005j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.budiyev.android.codescanner.n */
/* loaded from: classes.dex */
public final class C4189n {

    /* renamed from: com.budiyev.android.codescanner.n$b */
    /* loaded from: classes.dex */
    private static final class C4191b implements Comparator<Camera.Size> {
        private C4191b() {
        }

        /* renamed from: b */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Integer.compare(size2.height * size2.width, size.height * size.width);
        }
    }

    /* renamed from: com.budiyev.android.codescanner.n$c */
    /* loaded from: classes.dex */
    private static final class C4192c implements Comparator<int[]> {
        private C4192c() {
        }

        /* renamed from: b */
        public int compare(int[] iArr, int[] iArr2) {
            int compare = Integer.compare(iArr2[1], iArr[1]);
            if (compare == 0) {
                return Integer.compare(iArr2[0], iArr[0]);
            }
            return compare;
        }
    }

    /* renamed from: a */
    public static void m32405a(Camera.Parameters parameters, C4182g gVar, C4187l lVar) {
        C4184i d = gVar.m32424d();
        m32404b(parameters, lVar, gVar.m32423e(), gVar.m32422f(), d.m32417a(), d.m32416b(), gVar.m32425c());
    }

    /* renamed from: b */
    public static void m32404b(Camera.Parameters parameters, C4187l lVar, C4184i iVar, C4184i iVar2, int i, int i2, int i3) {
        int i4;
        boolean o = m32391o(i3);
        if (o) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (!o) {
            i = i2;
        }
        m32403c(parameters, m32393m(i4, i, lVar, iVar, iVar2), i4, i, i3);
    }

    /* renamed from: c */
    public static void m32403c(Camera.Parameters parameters, C4187l lVar, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(1);
        C4187l a = lVar.m32406j(-i3, i / 2.0f, i2 / 2.0f).m32415a(0, 0, i, i2);
        arrayList.add(new Camera.Area(new Rect(m32390p(a.m32411e(), i), m32390p(a.m32409g(), i2), m32390p(a.m32410f(), i), m32390p(a.m32413c(), i2)), RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    /* renamed from: d */
    public static void m32402d(Camera.Parameters parameters) {
        List<String> supportedFocusModes;
        if (!"auto".equals(parameters.getFocusMode()) && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
        }
    }

    /* renamed from: e */
    public static void m32401e(Camera.Parameters parameters) {
        int i;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (!(supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty())) {
            Collections.sort(supportedPreviewFpsRange, new C4192c());
            for (int[] iArr : supportedPreviewFpsRange) {
                int i2 = iArr[0];
                if (i2 >= 10000 && (i = iArr[1]) <= 30000) {
                    parameters.setPreviewFpsRange(i2, i);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m32400f(Camera.Parameters parameters) {
        List<String> supportedSceneModes;
        if (!"barcode".equals(parameters.getSceneMode()) && (supportedSceneModes = parameters.getSupportedSceneModes()) != null && supportedSceneModes.contains("barcode")) {
            parameters.setSceneMode("barcode");
        }
    }

    /* renamed from: g */
    public static void m32399g(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    /* renamed from: h */
    public static Result m32398h(C6440i iVar, AbstractC6439h hVar) {
        try {
            return iVar.m25553c(new C6434c(new C8005j(hVar)));
        } catch (C6441j unused) {
            return iVar.m25553c(new C6434c(new C8005j(hVar.mo25557e())));
        } finally {
            iVar.reset();
        }
    }

    /* renamed from: i */
    public static void m32397i(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
            String focusMode = parameters.getFocusMode();
            if (supportedFocusModes.contains("fixed")) {
                if (!"fixed".equals(focusMode)) {
                    parameters.setFocusMode("fixed");
                }
            } else if (supportedFocusModes.contains("auto") && !"auto".equals(focusMode)) {
                parameters.setFocusMode("auto");
            }
        }
    }

    /* renamed from: j */
    public static C4184i m32396j(Camera.Parameters parameters, int i, int i2) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
            Collections.sort(supportedPreviewSizes, new C4191b());
            float f = i / i2;
            for (float f2 = 0.3f; f2 <= 3.0f; f2 += 0.1f) {
                for (Camera.Size size : supportedPreviewSizes) {
                    int i3 = size.width;
                    int i4 = size.height;
                    if (i3 * i4 >= 589824 && Math.abs(f - (i3 / i4)) <= f2) {
                        return new C4184i(i3, i4);
                    }
                }
            }
        }
        Camera.Size previewSize = parameters.getPreviewSize();
        if (previewSize != null) {
            return new C4184i(previewSize.width, previewSize.height);
        }
        throw new C4175c("Unable to configure camera preview size");
    }

    /* renamed from: k */
    public static int m32395k(Context context, Camera.CameraInfo cameraInfo) {
        int i;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            int i2 = 180;
            if (rotation == 0) {
                i = 0;
            } else if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            } else if (rotation % 90 == 0) {
                i = (rotation + 360) % 360;
            } else {
                throw new C4175c("Invalid display rotation");
            }
            if (cameraInfo.facing != 1) {
                i2 = 360;
            }
            return ((i2 + cameraInfo.orientation) - i) % 360;
        }
        throw new C4175c("Unable to access window manager");
    }

    /* renamed from: l */
    public static Drawable m32394l(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: m */
    public static C4187l m32393m(int i, int i2, C4187l lVar, C4184i iVar, C4184i iVar2) {
        int a = iVar.m32417a();
        int b = iVar.m32416b();
        int a2 = (a - iVar2.m32417a()) / 2;
        int b2 = (b - iVar2.m32416b()) / 2;
        float f = i / a;
        float f2 = i2 / b;
        return new C4187l(Math.max(Math.round((lVar.m32411e() + a2) * f), 0), Math.max(Math.round((lVar.m32409g() + b2) * f2), 0), Math.min(Math.round((lVar.m32410f() + a2) * f), i), Math.min(Math.round((lVar.m32413c() + b2) * f2), i2));
    }

    /* renamed from: n */
    public static C4184i m32392n(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return new C4184i(i3, i4);
        }
        int i5 = (i * i4) / i2;
        if (i5 < i3) {
            return new C4184i(i3, (i2 * i3) / i);
        }
        return new C4184i(i5, i4);
    }

    /* renamed from: o */
    public static boolean m32391o(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: p */
    private static int m32390p(int i, int i2) {
        return ((i * 2000) / i2) - 1000;
    }

    /* renamed from: q */
    public static byte[] m32389q(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i3 == 0 || i3 == 360) {
            return bArr;
        }
        if (i3 % 90 != 0 || i3 < 0 || i3 > 270) {
            throw new IllegalArgumentException("Invalid rotation (valid: 0, 90, 180, 270)");
        }
        byte[] bArr2 = new byte[bArr.length];
        int i8 = i * i2;
        if (i3 % 180 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 % 270 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 >= 180) {
            z3 = true;
        } else {
            z3 = false;
        }
        for (int i9 = 0; i9 < i2; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = (i9 * i) + i10;
                int i12 = ((i9 >> 1) * i) + i8 + (i10 & (-2));
                int i13 = i12 + 1;
                if (z) {
                    i4 = i2;
                } else {
                    i4 = i;
                }
                if (z) {
                    i5 = i;
                } else {
                    i5 = i2;
                }
                if (z) {
                    i6 = i9;
                } else {
                    i6 = i10;
                }
                if (z) {
                    i7 = i10;
                } else {
                    i7 = i9;
                }
                if (z2) {
                    i6 = (i4 - i6) - 1;
                }
                if (z3) {
                    i7 = (i5 - i7) - 1;
                }
                int i14 = i8 + ((i7 >> 1) * i4) + (i6 & (-2));
                bArr2[(i7 * i4) + i6] = (byte) (bArr[i11] & 255);
                bArr2[i14] = (byte) (bArr[i12] & 255);
                bArr2[i14 + 1] = (byte) (bArr[i13] & 255);
            }
        }
        return bArr2;
    }

    /* renamed from: r */
    public static void m32388r(Camera.Parameters parameters, EnumC4173a aVar) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
            if (aVar == EnumC4173a.CONTINUOUS) {
                if (!"continuous-picture".equals(parameters.getFocusMode())) {
                    if (supportedFocusModes.contains("continuous-picture")) {
                        parameters.setFocusMode("continuous-picture");
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!"auto".equals(parameters.getFocusMode()) && supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
            }
        }
    }

    /* renamed from: s */
    public static void m32387s(Camera.Parameters parameters, String str) {
        List<String> supportedFlashModes;
        if (!str.equals(parameters.getFlashMode()) && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && supportedFlashModes.contains(str)) {
            parameters.setFlashMode(str);
        }
    }

    /* renamed from: t */
    public static void m32386t(Camera.Parameters parameters, int i) {
        if (parameters.isZoomSupported() && parameters.getZoom() != i) {
            parameters.setZoom(Math.min(i, parameters.getMaxZoom()));
        }
    }
}
