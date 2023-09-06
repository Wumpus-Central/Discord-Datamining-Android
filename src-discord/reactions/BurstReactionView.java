package com.discord.reactions;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.core.graphics.a;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.reactions.ReactionView;
import com.discord.reactions.databinding.ReactionViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import yf.c;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/discord/reactions/BurstReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/ReactionViewBinding;", "currentCount", "", "Ljava/lang/Integer;", "currentEmojiId", "", "currentShouldAnimate", "", "Ljava/lang/Boolean;", "configureBackground", "", "isMe", "palette", "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "configureCount", "count", "animate", "configureTextColor", "setReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "BurstColorPalette", "ThemedBurstColorPalette", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BurstReactionView extends LinearLayout {
    private final ReactionViewBinding binding;
    private Integer currentCount;
    private String currentEmojiId;
    private Boolean currentShouldAnimate;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "", "accentColor", "", "getAccentColor", "()Ljava/lang/String;", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "highlightColor", "getHighlightColor", ViewProps.OPACITY, "", "getOpacity", "()F", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface BurstColorPalette {
        String getAccentColor();

        String getBackgroundColor();

        String getHighlightColor();

        float getOpacity();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "", "dark", "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "getDark", "()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "light", "getLight", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface ThemedBurstColorPalette {
        BurstColorPalette getDark();

        BurstColorPalette getLight();
    }

    
    public BurstReactionView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  BurstReactionView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void configureBackground(boolean z10, BurstColorPalette burstColorPalette) {
        Integer num;
        Integer num2;
        int i10;
        int i11;
        String accentColor;
        String backgroundColor;
        int i12 = 255;
        if (burstColorPalette != null) {
            i12 = c.b(burstColorPalette.getOpacity() * 255);
        }
        Integer num3 = null;
        if (burstColorPalette == null || (backgroundColor = burstColorPalette.getBackgroundColor()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(a.k(Color.parseColor(backgroundColor), i12));
        }
        if (burstColorPalette == null || (accentColor = burstColorPalette.getAccentColor()) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(Color.parseColor(accentColor));
        }
        if (num != null) {
            i10 = num.intValue();
        } else if (z10) {
            Context context = getContext();
            q.g(context, "context");
            i10 = ColorUtilsKt.getColorCompat(context, R.color.brand_new_500_alpha_20);
        } else {
            i10 = ThemeManagerKt.getTheme().getBackgroundSecondary();
        }
        if (z10) {
            if (num2 != null) {
                i11 = num2.intValue();
            } else {
                Context context2 = getContext();
                q.g(context2, "context");
                i11 = ColorUtilsKt.getColorCompat(context2, R.color.brand_560);
            }
            num3 = Integer.valueOf(i11);
        }
        ReactionView.Companion companion = ReactionView.Companion;
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, i10, companion.getCORNER_RADIUS(), num3, companion.getSTROKE_WIDTH());
    }

    private final void configureCount(int i10, boolean z10) {
        int i11;
        TextSwitcher textSwitcher = this.binding.reactionCountSwitcher;
        if (z10) {
            Integer num = this.currentCount;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            if (i10 > i11) {
                textSwitcher.setInAnimation(textSwitcher.getContext(), R.anim.anim_slide_in_up);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), R.anim.anim_slide_out_up);
            } else {
                textSwitcher.setInAnimation(textSwitcher.getContext(), R.anim.anim_slide_in_down);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), R.anim.anim_slide_out_down);
            }
            textSwitcher.setText(String.valueOf(i10));
        } else {
            textSwitcher.setCurrentText(String.valueOf(i10));
        }
        this.currentCount = Integer.valueOf(i10);
    }

    private final void configureTextColor(BurstColorPalette burstColorPalette) {
        int i10;
        String accentColor;
        if (burstColorPalette == null || (accentColor = burstColorPalette.getAccentColor()) == null) {
            i10 = ThemeManagerKt.getTheme().getInteractiveNormal();
        } else {
            i10 = Color.parseColor(accentColor);
        }
        this.binding.reactionEmoji.setTextColor(i10);
        this.binding.reactionCount1.setTextColor(i10);
        this.binding.reactionCount2.setTextColor(i10);
    }

    
    
    
    
    
    
    public final void setReaction(com.discord.reactions.ReactionView.Reaction r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.BurstReactionView.setReaction(com.discord.reactions.ReactionView$Reaction):void");
    }

    
    public BurstReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        ReactionViewBinding inflate = ReactionViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        setOrientation(0);
        setGravity(16);
        ReactionView.Companion companion = ReactionView.Companion;
        setMinimumWidth(companion.getMINIMUM_WIDTH());
        setPadding(companion.getHORIZ_PADDING(), 0, companion.getHORIZ_PADDING(), 0);
        TextView textView = inflate.reactionCount1;
        q.g(textView, "binding.reactionCount1");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.reactionCount1;
        q.g(textView2, "binding.reactionCount1");
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f, 14.0f);
        TextView textView3 = inflate.reactionCount2;
        q.g(textView3, "binding.reactionCount2");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.reactionCount2;
        q.g(textView4, "binding.reactionCount2");
        SetTextSizeSpKt.setTextSizeSp(textView4, 14.0f, 14.0f);
        inflate.reactionCountSwitcher.setMeasureAllChildren(false);
    }
}
