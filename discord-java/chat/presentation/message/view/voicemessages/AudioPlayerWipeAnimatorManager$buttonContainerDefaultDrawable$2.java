package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.discord.chat.R;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import e.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2 extends s implements Function0<Drawable> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        int i10;
        Context context = this.$context;
        if (ThemeManagerKt.getTheme() instanceof LightTheme) {
            i10 = R.drawable.drawable_audio_play_button_gradient_light;
        } else {
            i10 = R.drawable.drawable_audio_play_button_gradient_dark;
        }
        return a.b(context, i10);
    }
}
