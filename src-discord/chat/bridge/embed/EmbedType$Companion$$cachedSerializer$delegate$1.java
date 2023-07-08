package com.discord.chat.bridge.embed;

import com.facebook.react.util.JSStackTrace;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;
import si.c0;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EmbedType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final EmbedType$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmbedType$Companion$$cachedSerializer$delegate$1();

    EmbedType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return c0.a("com.discord.chat.bridge.embed.EmbedType", EmbedType.values(), new String[]{"article", "image", MediaStreamTrack.VIDEO_TRACK_KIND, "tweet", "link", "html", JSStackTrace.FILE_KEY, "gifv", "rich", "text", "application_news", "post_preview", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }
}
