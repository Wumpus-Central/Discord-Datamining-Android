package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.react_strings.RenderContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class AudioPlayerView$configureDuration$2 extends s implements Function1<RenderContext, Unit> {
    final  int $durationSecs;
    final  AudioPlayerView this$0;

    
    
    public AudioPlayerView$configureDuration$2(AudioPlayerView audioPlayerView, int i10) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$durationSecs = i10;
    }

    @Override 
    public   Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f21444a;
    }

    
    public final void invoke2(RenderContext i18nFormat) {
        String timeRemainingAccessibilityText;
        q.h(i18nFormat, "$this$i18nFormat");
        Map<String, String> args = i18nFormat.getArgs();
        timeRemainingAccessibilityText = this.this$0.timeRemainingAccessibilityText(this.$durationSecs);
        args.put("duration", timeRemainingAccessibilityText);
    }
}
