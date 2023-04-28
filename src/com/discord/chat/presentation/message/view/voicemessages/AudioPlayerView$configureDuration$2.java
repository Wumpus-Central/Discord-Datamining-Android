package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.react_strings.RenderContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerView$configureDuration$2 extends AbstractC9973s implements Function1<RenderContext, Unit> {
    final /* synthetic */ int $durationSecs;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$configureDuration$2(AudioPlayerView audioPlayerView, int i) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$durationSecs = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RenderContext i18nFormat) {
        String timeRemainingAccessibilityText;
        C9971q.m14633g(i18nFormat, "$this$i18nFormat");
        Map<String, String> args = i18nFormat.getArgs();
        timeRemainingAccessibilityText = this.this$0.timeRemainingAccessibilityText(this.$durationSecs);
        args.put("duration", timeRemainingAccessibilityText);
    }
}
