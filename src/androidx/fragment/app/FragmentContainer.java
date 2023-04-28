package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public abstract class FragmentContainer {
    @Deprecated
    /* renamed from: b */
    public Fragment m36249b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo36223c(int i);

    /* renamed from: d */
    public abstract boolean mo36222d();
}
