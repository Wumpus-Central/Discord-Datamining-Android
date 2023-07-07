package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.widget.Button;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.misc.utilities.view.ButtonBackgroundUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"hasEmoji", "", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "hasIcon", "setBrandColor", "", "Landroid/widget/Button;", "setDangerColor", "setSecondaryColor", "setSuccessColor", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonComponentViewKt {
    public static final /* synthetic */ boolean access$hasEmoji(ButtonComponent buttonComponent) {
        return hasEmoji(buttonComponent);
    }

    public static final /* synthetic */ boolean access$hasIcon(ButtonComponent buttonComponent) {
        return hasIcon(buttonComponent);
    }

    public static final /* synthetic */ void access$setBrandColor(Button button) {
        setBrandColor(button);
    }

    public static final /* synthetic */ void access$setDangerColor(Button button) {
        setDangerColor(button);
    }

    public static final /* synthetic */ void access$setSecondaryColor(Button button) {
        setSecondaryColor(button);
    }

    public static final /* synthetic */ void access$setSuccessColor(Button button) {
        setSuccessColor(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEmoji(ButtonComponent buttonComponent) {
        return buttonComponent.getEmoji() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasIcon(ButtonComponent buttonComponent) {
        return buttonComponent.getStyle() == ButtonStyle.LINK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBrandColor(Button button) {
        ButtonBackgroundUtilsKt.setBackgroundColors(button, ColorUtilsKt.getColorCompat(button, R.color.brand_500), Integer.valueOf(ColorUtilsKt.getColorCompat(button, R.color.brand_new_500_alpha_20)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDangerColor(Button button) {
        ButtonBackgroundUtilsKt.setBackgroundColors(button, ColorUtilsKt.getColorCompat(button, R.color.red_400), Integer.valueOf(ColorUtilsKt.getColorCompat(button, R.color.status_red_500_alpha_20)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSecondaryColor(Button button) {
        Context context = button.getContext();
        q.f(context, "context");
        int themeColor = ColorUtilsKt.getThemeColor(context, R.color.primary_400, R.color.primary_500);
        Context context2 = button.getContext();
        q.f(context2, "context");
        ButtonBackgroundUtilsKt.setBackgroundColors(button, themeColor, Integer.valueOf(ColorUtilsKt.getThemeColor(context2, R.color.primary_light_500_alpha_20, R.color.primary_dark_500_alpha_20)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSuccessColor(Button button) {
        ButtonBackgroundUtilsKt.setBackgroundColors(button, ColorUtilsKt.getColorCompat(button, R.color.green_360), Integer.valueOf(ColorUtilsKt.getColorCompat(button, R.color.status_green_500_alpha_20)));
    }
}
