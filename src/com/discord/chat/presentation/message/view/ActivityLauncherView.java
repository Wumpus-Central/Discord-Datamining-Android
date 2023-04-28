package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C3147R;
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
import kotlin.collections.C9611k;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0018\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/ActivityLauncherView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/ActivityLauncherViewBinding;", "setAvatarUris", "", "avatarUris", "", "", "setDescription", "description", "setHeaderText", "headerText", "", "setLaunchButton", "text", ViewProps.BACKGROUND_COLOR, "(Ljava/lang/String;Ljava/lang/Integer;)V", "setOnLaunchButtonClickListener", "onLaunchButtonClickListener", "Landroid/view/View$OnClickListener;", "setParticipantsText", "setSplash", "splashUrl", "constrainedWidth", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ActivityLauncherView extends ConstraintLayout {
    private final ActivityLauncherViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ ActivityLauncherView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setAvatarUris(List<String> avatarUris) {
        int i;
        int t;
        C9677q.m14633g(avatarUris, "avatarUris");
        boolean z = !avatarUris.isEmpty();
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        C9677q.m14634f(overlappingCirclesView, "binding.participants");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        overlappingCirclesView.setVisibility(i);
        OverlappingCirclesView overlappingCirclesView2 = this.binding.participants;
        t = C9611k.m14809t(avatarUris, 10);
        ArrayList arrayList = new ArrayList(t);
        for (String str : avatarUris) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView2.setItems(arrayList);
        LinearLayout linearLayout = this.binding.participantsInfoContainer;
        C9677q.m14634f(linearLayout, "binding.participantsInfoContainer");
        if (!(!z)) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    public final void setDescription(String str) {
        if (str != null) {
            this.binding.itemDescription.setText(str);
        }
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = true ^ z;
        TextView textView = this.binding.itemHeader;
        C9677q.m14634f(textView, "binding.itemHeader");
        if (!z2) {
            i = 8;
        }
        textView.setVisibility(i);
        this.binding.itemHeader.setText(charSequence);
    }

    public final void setLaunchButton(String str, Integer num) {
        boolean z;
        DCDButton setLaunchButton$lambda$6 = this.binding.launchButton;
        C9677q.m14634f(setLaunchButton$lambda$6, "setLaunchButton$lambda$6");
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(true ^ z)) {
            i = 8;
        }
        setLaunchButton$lambda$6.setVisibility(i);
        setLaunchButton$lambda$6.setText(str);
        setLaunchButton$lambda$6.setBackgroundColor(num);
    }

    public final void setOnLaunchButtonClickListener(View.OnClickListener onLaunchButtonClickListener) {
        C9677q.m14633g(onLaunchButtonClickListener, "onLaunchButtonClickListener");
        this.binding.launchButton.setOnClickButtonListener(onLaunchButtonClickListener);
    }

    public final void setParticipantsText(String text) {
        C9677q.m14633g(text, "text");
        this.binding.participantsInfo.setText(text);
    }

    public final void setSplash(String str, int i) {
        boolean z;
        SimpleDraweeView simpleDraweeView = this.binding.itemHero;
        C9677q.m14634f(simpleDraweeView, "binding.itemHero");
        int i2 = 0;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        simpleDraweeView.setVisibility(i2);
        this.binding.itemHero.setImageURI(str);
        int width = MessageAccessoriesView.Companion.getWidth(i);
        int i3 = (width * 9) / 16;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        SimpleDraweeView simpleDraweeView2 = this.binding.itemHero;
        C9677q.m14634f(simpleDraweeView2, "binding.itemHero");
        mediaContainingViewResizer.resizeLayoutParams(simpleDraweeView2, width, i3, width, i3, MediaContainingViewResizer.ResizeMode.Fill);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityLauncherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9677q.m14633g(context, "context");
        ActivityLauncherViewBinding inflate = ActivityLauncherViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$4$lambda$0 = inflate.itemHeader;
        lambda$4$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9677q.m14634f(lambda$4$lambda$0, "lambda$4$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$0, 24.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$0, discordFont);
        TextView lambda$4$lambda$1 = inflate.itemDescription;
        lambda$4$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9677q.m14634f(lambda$4$lambda$1, "lambda$4$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$1, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$1, DiscordFont.PrimaryMedium);
        SimpleDraweeView lambda$4$lambda$2 = inflate.icon;
        C9677q.m14634f(lambda$4$lambda$2, "lambda$4$lambda$2");
        ReactAssetUtilsKt.setReactAsset(lambda$4$lambda$2, ReactAsset.Members);
        ColorUtilsKt.setTintColor(lambda$4$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView lambda$4$lambda$3 = inflate.participantsInfo;
        lambda$4$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9677q.m14634f(lambda$4$lambda$3, "lambda$4$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(lambda$4$lambda$3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$4$lambda$3, discordFont);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(C3147R.color.primary_130, C3147R.color.primary_630)), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
    }
}
