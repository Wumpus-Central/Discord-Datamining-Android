package com.discord.media.engine;

import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getMediaEngine", "Lcom/discord/media/engine/MediaEngine;", "Lcom/facebook/react/bridge/ReactContext;", "media_engine_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class MediaEngineKt {
    public static final MediaEngine getMediaEngine(ReactContext reactContext) {
        MediaEngine mediaEngine;
        q.h(reactContext, "<this>");
        MediaEngineModule mediaEngineModule = (MediaEngineModule) reactContext.getNativeModule(MediaEngineModule.class);
        if (mediaEngineModule != null && (mediaEngine = mediaEngineModule.getMediaEngine()) != null) {
            return mediaEngine;
        }
        throw new IllegalStateException("Unable to get MediaEngine native module".toString());
    }
}
