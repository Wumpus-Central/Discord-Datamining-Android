package com.discord.notifications.renderer.utils;

import ki.f;
import ki.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.text.MatchResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2 extends s implements Function1<MatchResult, CharSequence> {
    public static final RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2 INSTANCE = new RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2();

    RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2() {
        super(1);
    }

    public final CharSequence invoke(MatchResult it) {
        String z10;
        q.g(it, "it");
        f fVar = it.c().get(1);
        q.d(fVar);
        z10 = u.z("X", fVar.a().length());
        return z10;
    }
}
