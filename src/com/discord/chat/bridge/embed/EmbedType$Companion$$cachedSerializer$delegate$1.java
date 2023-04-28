package com.discord.chat.bridge.embed;

import bj.C3631c0;
import com.facebook.react.util.JSStackTrace;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class EmbedType$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final EmbedType$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmbedType$Companion$$cachedSerializer$delegate$1();

    EmbedType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C3631c0.m33941a("com.discord.chat.bridge.embed.EmbedType", EmbedType.values(), new String[]{"article", "image", MediaStreamTrack.VIDEO_TRACK_KIND, "tweet", "link", "html", JSStackTrace.FILE_KEY, "gifv", "rich", "text", "application_news", "post_preview", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }
}
