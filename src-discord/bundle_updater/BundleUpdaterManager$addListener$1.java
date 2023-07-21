package com.discord.bundle_updater;

import com.discord.bundle_updater.react.events.BundleDownloadedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "versionRequired", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BundleUpdaterManager$addListener$1 extends s implements Function1<Boolean, Unit> {
    final  BundleUpdaterManager this$0;

    
    
    public BundleUpdaterManager$addListener$1(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override 
    public   Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f20664a;
    }

    public final void invoke(boolean z10) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new BundleDownloadedEvent(z10));
    }
}
