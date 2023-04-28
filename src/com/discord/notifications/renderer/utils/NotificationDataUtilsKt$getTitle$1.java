package com.discord.notifications.renderer.utils;

import com.discord.notifications.api.NotificationData;
import com.discord.react_strings.RenderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
final class NotificationDataUtilsKt$getTitle$1 extends AbstractC9679s implements Function1<RenderContext, Unit> {
    final /* synthetic */ NotificationData $this_getTitle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDataUtilsKt$getTitle$1(NotificationData notificationData) {
        super(1);
        this.$this_getTitle = notificationData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RenderContext i18nFormat) {
        C9677q.m14633g(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("guildName", this.$this_getTitle.getGuildName());
    }
}
