package com.discord.external_pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J7\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0004\u0012\u00020\u00040\rø\u0001\u0000R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/external_pip/ExternalPipManager;", "", "", ViewProps.ENABLED, "", "setEnabled", "", "numerator", "denominator", "setPipAspectRatio", "Landroid/app/Activity;", "activity", "force", "Lkotlin/Function1;", "Lnf/s;", "onResult", "enterPipMode", "Z", "Landroid/util/Rational;", ViewProps.ASPECT_RATIO, "Landroid/util/Rational;", "<init>", "()V", "external_pip_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ExternalPipManager {
    private Rational aspectRatio = new Rational(1, 1);
    private boolean enabled;

    public static /* synthetic */ void enterPipMode$default(ExternalPipManager externalPipManager, Activity activity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        externalPipManager.enterPipMode(activity, z, function1);
    }

    public final void enterPipMode(Activity activity, boolean z, Function1<? super C11090s<Unit>, Unit> onResult) {
        boolean z2;
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams build;
        C9971q.m14633g(onResult, "onResult");
        if (this.enabled || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || Build.VERSION.SDK_INT < 26) {
            C11090s.C11091a aVar = C11090s.f24606l;
            onResult.invoke(C11090s.m10941a(C11090s.m10940b(C11093t.m10931a(new Exception("Disabled or unsupported.")))));
            return;
        }
        if (activity != null) {
            try {
                aspectRatio = new PictureInPictureParams.Builder().setAspectRatio(this.aspectRatio);
                build = aspectRatio.build();
                activity.enterPictureInPictureMode(build);
            } catch (Exception e) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                onResult.invoke(C11090s.m10941a(C11090s.m10940b(C11093t.m10931a(e))));
                return;
            }
        }
        C11090s.C11091a aVar3 = C11090s.f24606l;
        onResult.invoke(C11090s.m10941a(C11090s.m10940b(Unit.f22042a)));
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setPipAspectRatio(int i, int i2) {
        this.aspectRatio = new Rational(i, i2);
    }
}
