package com.discord.reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.reactions.ReactionView;
import com.discord.reactions.databinding.AddReactionViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/reactions/AddReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/AddReactionViewBinding;", "configure", "", "addReactionLabel", "", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "isBurst", "", "Companion", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"SetTextI18n"})
/* loaded from: classes6.dex */
public final class AddReactionView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private static final int VERTICAL_PADDING = SizeUtilsKt.getDpToPx(4);
    private final AddReactionViewBinding binding;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/reactions/AddReactionView$Companion;", "", "()V", "VERTICAL_PADDING", "", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddReactionView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ AddReactionView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(String addReactionLabel, ReactionView.ReactionsTheme reactionsTheme, boolean z10) {
        boolean z11;
        int i10;
        ReactAsset reactAsset;
        int i11;
        Integer num;
        Integer reactionBackgroundColor;
        Integer reactionTextColor;
        q.g(addReactionLabel, "addReactionLabel");
        TextView textView = this.binding.addReactionText;
        textView.setText(addReactionLabel);
        if (addReactionLabel.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (reactionsTheme == null || (reactionTextColor = reactionsTheme.getReactionTextColor()) == null) {
            i10 = ThemeManagerKt.getTheme().getTextMuted();
        } else {
            i10 = reactionTextColor.intValue();
        }
        textView.setTextColor(i10);
        SimpleDraweeView it = this.binding.addReactionImage;
        if (z10) {
            reactAsset = ReactAsset.AddBurstReaction;
        } else {
            reactAsset = ReactAsset.AddReaction;
        }
        q.f(it, "it");
        ReactAssetUtilsKt.setReactAsset(it, reactAsset);
        if (reactionsTheme == null || (reactionBackgroundColor = reactionsTheme.getReactionBackgroundColor()) == null) {
            i11 = ThemeManagerKt.getTheme().getBackgroundSecondary();
        } else {
            i11 = reactionBackgroundColor.intValue();
        }
        if (reactionsTheme != null) {
            num = reactionsTheme.getReactionBorderColor();
        } else {
            num = null;
        }
        ReactionView.Companion companion = ReactionView.Companion;
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, i11, companion.getCORNER_RADIUS(), num, companion.getSTROKE_WIDTH());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        AddReactionViewBinding inflate = AddReactionViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setOrientation(0);
        setGravity(16);
        ReactionView.Companion companion = ReactionView.Companion;
        int horiz_padding = companion.getHORIZ_PADDING();
        int i10 = VERTICAL_PADDING;
        setPadding(horiz_padding, i10, companion.getHORIZ_PADDING(), i10);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundSecondary(), companion.getCORNER_RADIUS(), null, 0, 12, null);
        TextView it = inflate.addReactionText;
        q.f(it, "it");
        DiscordFontUtilsKt.setDiscordFont(it, DiscordFont.PrimarySemibold);
        SetTextSizeSpKt.setTextSizeSp(it, 14.0f, 14.0f);
        it.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        it.setPadding(companion.getHORIZ_PADDING(), 0, companion.getHORIZ_PADDING(), 0);
        SimpleDraweeView it2 = inflate.addReactionImage;
        q.f(it2, "it");
        ReactAssetUtilsKt.setReactAsset(it2, ReactAsset.AddReaction);
        ColorUtilsKt.setTintColor(it2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        it2.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
