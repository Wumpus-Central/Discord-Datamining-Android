package com.mkuczera;

import android.os.Vibrator;

/* renamed from: com.mkuczera.g */
/* loaded from: classes6.dex */
public class C6020g implements AbstractC6015b {

    /* renamed from: a */
    int f12216a;

    public C6020g(int i) {
        this.f12216a = i;
    }

    @Override // com.mkuczera.AbstractC6015b
    /* renamed from: a */
    public void mo26433a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f12216a);
            }
        } catch (Exception unused) {
        }
    }
}
