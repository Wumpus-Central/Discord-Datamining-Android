package com.discord.notifications.renderer.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.text.MatchResult;
import p326ri.C12698f;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.notifications.renderer.utils.RenderNotificationMessageContentKt$renderNotificationMessageContent$cleaned$2 */
/* loaded from: classes3.dex */
final class C4609xb68ee08d extends AbstractC9973s implements Function1<MatchResult, CharSequence> {
    public static final C4609xb68ee08d INSTANCE = new C4609xb68ee08d();

    C4609xb68ee08d() {
        super(1);
    }

    public final CharSequence invoke(MatchResult it) {
        String z;
        C9971q.m14633g(it, "it");
        C12698f fVar = it.mo5839d().get(1);
        C9971q.m14636d(fVar);
        z = C12718u.m5726z("X", fVar.m5843a().length());
        return z;
    }
}
