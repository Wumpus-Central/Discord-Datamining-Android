package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.a1 */
/* loaded from: classes7.dex */
public final class C4953a1 {
    /* renamed from: a */
    public static int m31203a(int i) {
        return (int) (i * 1.3333334f);
    }

    /* renamed from: b */
    public static boolean m31202b(int i, int i2, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            if (m31203a(i) < 2048.0f || m31203a(i2) < 2048) {
                return false;
            }
            return true;
        } else if (m31203a(i) < resizeOptions.f8141a || m31203a(i2) < resizeOptions.f8142b) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m31201c(C13434e eVar, ResizeOptions resizeOptions) {
        if (eVar == null) {
            return false;
        }
        int H = eVar.m3723H();
        if (H == 90 || H == 270) {
            return m31202b(eVar.getHeight(), eVar.getWidth(), resizeOptions);
        }
        return m31202b(eVar.getWidth(), eVar.getHeight(), resizeOptions);
    }
}
