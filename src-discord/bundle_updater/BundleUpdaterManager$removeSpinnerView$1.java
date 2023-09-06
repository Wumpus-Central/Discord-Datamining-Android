package com.discord.bundle_updater;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class BundleUpdaterManager$removeSpinnerView$1 extends s implements Function1<ViewGroup, Unit> {
    final  BundleUpdaterManager this$0;

    
    
    public BundleUpdaterManager$removeSpinnerView$1(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override 
    public   Unit invoke(ViewGroup viewGroup) {
        invoke2(viewGroup);
        return Unit.f21436a;
    }

    
    public final void invoke2(ViewGroup runOnActivity) {
        ViewGroup viewGroup;
        q.h(runOnActivity, "$this$runOnActivity");
        viewGroup = this.this$0.progressLayout;
        if (viewGroup != null) {
            runOnActivity.removeView(viewGroup);
        }
        this.this$0.progressLayout = null;
    }
}
