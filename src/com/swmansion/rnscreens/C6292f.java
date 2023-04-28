package com.swmansion.rnscreens;

import androidx.activity.AbstractC1486b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lcom/swmansion/rnscreens/f;", "", "", "b", "c", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/activity/b;", "Landroidx/activity/b;", "mOnBackPressedCallback", "", "Z", "mIsBackCallbackAdded", "d", "()Z", "(Z)V", "overrideBackAction", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/activity/b;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.f */
/* loaded from: classes8.dex */
public final class C6292f {

    /* renamed from: a */
    private final Fragment f12739a;

    /* renamed from: b */
    private final AbstractC1486b f12740b;

    /* renamed from: c */
    private boolean f12741c;

    /* renamed from: d */
    private boolean f12742d = true;

    public C6292f(Fragment fragment, AbstractC1486b mOnBackPressedCallback) {
        C9971q.m14633g(fragment, "fragment");
        C9971q.m14633g(mOnBackPressedCallback, "mOnBackPressedCallback");
        this.f12739a = fragment;
        this.f12740b = mOnBackPressedCallback;
    }

    /* renamed from: a */
    public final boolean m25967a() {
        return this.f12742d;
    }

    /* renamed from: b */
    public final void m25966b() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (!this.f12741c && this.f12742d) {
            FragmentActivity activity = this.f12739a.getActivity();
            if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
                onBackPressedDispatcher.m41007a(this.f12739a, this.f12740b);
            }
            this.f12741c = true;
        }
    }

    /* renamed from: c */
    public final void m25965c() {
        if (this.f12741c) {
            this.f12740b.m41002d();
            this.f12741c = false;
        }
    }

    /* renamed from: d */
    public final void m25964d(boolean z) {
        this.f12742d = z;
    }
}
