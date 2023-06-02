package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.react_strings.RenderContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AudioPlayerView$configureDuration$1 extends s implements Function1<RenderContext, Unit> {
    final /* synthetic */ int $durationSecs;
    final /* synthetic */ int $timeRemaining;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$configureDuration$1(AudioPlayerView audioPlayerView, int i10, int i11) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$durationSecs = i10;
        this.$timeRemaining = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f22080a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RenderContext i18nFormat) {
        String timeRemainingAccessibilityText;
        String timeRemainingAccessibilityText2;
        q.g(i18nFormat, "$this$i18nFormat");
        Map<String, String> args = i18nFormat.getArgs();
        timeRemainingAccessibilityText = this.this$0.timeRemainingAccessibilityText(this.$durationSecs);
        args.put("duration", timeRemainingAccessibilityText);
        Map<String, String> args2 = i18nFormat.getArgs();
        timeRemainingAccessibilityText2 = this.this$0.timeRemainingAccessibilityText(this.$durationSecs - this.$timeRemaining);
        args2.put("currentTime", timeRemainingAccessibilityText2);
    }
}
