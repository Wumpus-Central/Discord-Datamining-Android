package com.mkuczera;

import android.os.Vibrator;

/* renamed from: com.mkuczera.f */
/* loaded from: classes6.dex */
public class C6019f implements AbstractC6015b {

    /* renamed from: a */
    long[] f12215a;

    public C6019f(long[] jArr) {
        this.f12215a = jArr;
    }

    @Override // com.mkuczera.AbstractC6015b
    /* renamed from: a */
    public void mo26433a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f12215a, -1);
            }
        } catch (Exception unused) {
        }
    }
}
