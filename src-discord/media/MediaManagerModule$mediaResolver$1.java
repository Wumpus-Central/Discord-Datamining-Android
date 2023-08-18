package com.discord.media;

import android.net.Uri;
import com.discord.media.react.events.CompressionProgressEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "uri", "Landroid/net/Uri;", "progress", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaManagerModule$mediaResolver$1 extends s implements Function2<Uri, Integer, Unit> {
    final  MediaManagerModule this$0;

    
    
    public MediaManagerModule$mediaResolver$1(MediaManagerModule mediaManagerModule) {
        super(2);
        this.this$0 = mediaManagerModule;
    }

    @Override 
    public   Unit invoke(Uri uri, Integer num) {
        invoke(uri, num.intValue());
        return Unit.f21210a;
    }

    public final void invoke(Uri uri, int i10) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        q.h(uri, "uri");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.getReactApplicationContext();
        q.g(reactApplicationContext, "reactApplicationContext");
        String uri2 = uri.toString();
        q.g(uri2, "uri.toString()");
        reactEvents.emitModuleEvent(reactApplicationContext, new CompressionProgressEvent(uri2, i10));
    }
}
