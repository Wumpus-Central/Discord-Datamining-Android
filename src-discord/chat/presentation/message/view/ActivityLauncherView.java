package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.ActivityLauncherViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0018\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/view/ActivityLauncherView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/ActivityLauncherViewBinding;", "setAvatarUris", "", "avatarUris", "", "", "setDescription", "description", "setHeaderText", "headerText", "", "setLaunchButton", "text", ViewProps.BACKGROUND_COLOR, "(Ljava/lang/String;Ljava/lang/Integer;)V", "setOnLaunchButtonClickListener", "onLaunchButtonClickListener", "Landroid/view/View$OnClickListener;", "setParticipantsText", "setSplash", "splashUrl", "constrainedWidth", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityLauncherView extends ConstraintLayout {
    private final ActivityLauncherViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ActivityLauncherView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setAvatarUris(List<String> avatarUris) {
        int i10;
        int t10;
        q.g(avatarUris, "avatarUris");
        boolean z10 = !avatarUris.isEmpty();
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        q.f(overlappingCirclesView, "binding.participants");
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        overlappingCirclesView.setVisibility(i10);
        OverlappingCirclesView overlappingCirclesView2 = this.binding.participants;
        t10 = k.t(avatarUris, 10);
        ArrayList arrayList = new ArrayList(t10);
        for (String str : avatarUris) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView2.setItems(arrayList);
        LinearLayout linearLayout = this.binding.participantsInfoContainer;
        q.f(linearLayout, "binding.participantsInfoContainer");
        if (!(!z10)) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    public final void setDescription(String str) {
        if (str != null) {
            this.binding.itemDescription.setText(str);
        }
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z10;
        int i10 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = true ^ z10;
        TextView textView = this.binding.itemHeader;
        q.f(textView, "binding.itemHeader");
        if (!z11) {
            i10 = 8;
        }
        textView.setVisibility(i10);
        this.binding.itemHeader.setText(charSequence);
    }

    public final void setLaunchButton(String str, Integer num) {
        boolean z10;
        DCDButton setLaunchButton$lambda$6 = this.binding.launchButton;
        q.f(setLaunchButton$lambda$6, "setLaunchButton$lambda$6");
        int i10 = 0;
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(true ^ z10)) {
            i10 = 8;
        }
        setLaunchButton$lambda$6.setVisibility(i10);
        setLaunchButton$lambda$6.setText(str);
        setLaunchButton$lambda$6.setBackgroundColor(num);
    }

    public final void setOnLaunchButtonClickListener(View.OnClickListener onLaunchButtonClickListener) {
        q.g(onLaunchButtonClickListener, "onLaunchButtonClickListener");
        this.binding.launchButton.setOnClickButtonListener(onLaunchButtonClickListener);
    }

    public final void setParticipantsText(String text) {
        q.g(text, "text");
        this.binding.participantsInfo.setText(text);
    }

    public final void setSplash(String str, int i10) {
        boolean z10;
        SimpleDraweeView simpleDraweeView = this.binding.itemHero;
        q.f(simpleDraweeView, "binding.itemHero");
        int i11 = 0;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = 8;
        }
        simpleDraweeView.setVisibility(i11);
        this.binding.itemHero.setImageURI(str);
        int width = MessageAccessoriesView.Companion.getWidth(i10);
        int i12 = (width * 9) / 16;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        SimpleDraweeView simpleDraweeView2 = this.binding.itemHero;
        q.f(simpleDraweeView2, "binding.itemHero");
        mediaContainingViewResizer.resizeLayoutParams(simpleDraweeView2, width, i12, width, i12, MediaContainingViewResizer.ResizeMode.Fill);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        ActivityLauncherViewBinding inflate = ActivityLauncherViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$4$lambda$0 = inflate.itemHeader;
        lambda$4$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.f(lambda$4$lambda$0, "lambda$4$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$0, 24.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$0, discordFont);
        TextView lambda$4$lambda$1 = inflate.itemDescription;
        lambda$4$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(lambda$4$lambda$1, "lambda$4$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$1, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$1, DiscordFont.PrimaryMedium);
        SimpleDraweeView lambda$4$lambda$2 = inflate.icon;
        q.f(lambda$4$lambda$2, "lambda$4$lambda$2");
        ReactAssetUtilsKt.setReactAsset(lambda$4$lambda$2, ReactAsset.Members);
        ColorUtilsKt.setTintColor(lambda$4$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView lambda$4$lambda$3 = inflate.participantsInfo;
        lambda$4$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(lambda$4$lambda$3, "lambda$4$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$3, discordFont);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
    }
}
