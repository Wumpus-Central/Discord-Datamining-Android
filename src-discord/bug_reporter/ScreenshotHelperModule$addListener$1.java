package com.discord.bug_reporter;

import com.discord.bug_reporter.react.events.ScreenshotTakenEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ScreenshotHelperModule$addListener$1 extends s implements Function0<Unit> {
    final  ScreenshotHelperModule this$0;

    
    
    public ScreenshotHelperModule$addListener$1(ScreenshotHelperModule screenshotHelperModule) {
        super(0);
        this.this$0 = screenshotHelperModule;
    }

    @Override 
    
    public final void invoke2() {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new ScreenshotTakenEvent());
    }
}
