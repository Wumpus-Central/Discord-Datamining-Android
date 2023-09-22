package com.discord.bundle_updater;

import com.discord.bundle_updater.BundleUpdater;
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "metrics", "", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BundleUpdaterManager$addListener$2 extends s implements Function1<List<? extends BundleUpdater.OtaMetric>, Unit> {
    final  BundleUpdaterManager this$0;

    
    
    public BundleUpdaterManager$addListener$2(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override 
    public   Unit invoke(List<? extends BundleUpdater.OtaMetric> list) {
        invoke2(list);
        return Unit.f21600a;
    }

    
    public final void invoke2(List<? extends BundleUpdater.OtaMetric> metrics) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        q.h(metrics, "metrics");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new OtaCheckAttemptEvent(metrics));
    }
}
