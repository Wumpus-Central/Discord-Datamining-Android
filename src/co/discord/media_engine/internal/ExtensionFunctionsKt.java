package co.discord.media_engine.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import org.webrtc.Logging;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, m15073d2 = {"logi", "", "tag", "", "msg", "android_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class ExtensionFunctionsKt {
    public static final void logi(String tag, String msg) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(msg, "msg");
        Logging.log(Logging.Severity.LS_INFO, tag, msg);
    }
}
