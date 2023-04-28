package com.discord.notifications.renderer.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;
import kotlin.text.MatchResult;
import p327ri.C12567f;
import p327ri.C12587u;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.notifications.renderer.utils.RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2 */
/* loaded from: classes3.dex */
final class C3559xb68ee08d extends AbstractC9679s implements Function1<MatchResult, CharSequence> {
    public static final C3559xb68ee08d INSTANCE = new C3559xb68ee08d();

    C3559xb68ee08d() {
        super(1);
    }

    public final CharSequence invoke(MatchResult it) {
        String z;
        C9677q.m14633g(it, "it");
        C12567f fVar = it.mo5839d().get(1);
        C9677q.m14636d(fVar);
        z = C12587u.m5726z("X", fVar.m5843a().length());
        return z;
    }
}
