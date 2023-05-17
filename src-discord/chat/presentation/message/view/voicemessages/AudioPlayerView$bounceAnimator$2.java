package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.discord.chat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class AudioPlayerView$bounceAnimator$2 extends s implements Function0<Animation> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$bounceAnimator$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Animation invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.$context, R.anim.bounce);
        loadAnimation.setDuration(100L);
        loadAnimation.start();
        return loadAnimation;
    }
}
