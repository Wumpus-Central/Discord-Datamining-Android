package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.react_strings.RenderContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m15073d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerView$configureDuration$1 extends AbstractC9679s implements Function1<RenderContext, Unit> {
    final /* synthetic */ int $durationSecs;
    final /* synthetic */ int $timeRemaining;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$configureDuration$1(AudioPlayerView audioPlayerView, int i, int i2) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$durationSecs = i;
        this.$timeRemaining = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RenderContext i18nFormat) {
        String timeRemainingAccessibilityText;
        String timeRemainingAccessibilityText2;
        C9677q.m14633g(i18nFormat, "$this$i18nFormat");
        Map<String, String> args = i18nFormat.getArgs();
        timeRemainingAccessibilityText = this.this$0.timeRemainingAccessibilityText(this.$durationSecs);
        args.put("duration", timeRemainingAccessibilityText);
        Map<String, String> args2 = i18nFormat.getArgs();
        timeRemainingAccessibilityText2 = this.this$0.timeRemainingAccessibilityText(this.$durationSecs - this.$timeRemaining);
        args2.put("currentTime", timeRemainingAccessibilityText2);
    }
}
