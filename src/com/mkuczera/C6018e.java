package com.mkuczera;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.mkuczera.e */
/* loaded from: classes6.dex */
public class C6018e implements AbstractC6015b {

    /* renamed from: a */
    int f12214a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6018e(int i) {
        this.f12214a = i;
    }

    @Override // com.mkuczera.AbstractC6015b
    /* renamed from: a */
    public void mo26433a(Vibrator vibrator) {
        VibrationEffect createPredefined;
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                if (vibrator.hasVibrator()) {
                    createPredefined = VibrationEffect.createPredefined(this.f12214a);
                    vibrator.vibrate(createPredefined);
                }
            } catch (Exception unused) {
            }
        }
    }
}
