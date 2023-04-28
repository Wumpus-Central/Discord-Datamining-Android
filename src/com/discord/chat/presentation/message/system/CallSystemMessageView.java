package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C4254R;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.CallSystemMessageViewBinding;
import com.discord.chat.presentation.message.AddSystemMessageCardStyleKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10139l;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/message/system/CallSystemMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/CallSystemMessageViewBinding;", "grayIconColor", "", "greenIconColor", "redIconColor", "setMessage", "", "message", "Lcom/discord/chat/bridge/Message;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CallSystemMessageView extends ConstraintLayout {
    private final CallSystemMessageViewBinding binding;
    private final int grayIconColor;
    private final int greenIconColor;
    private final int redIconColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ CallSystemMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setMessage(Message message) {
        ReactAsset reactAsset;
        int i;
        int t;
        C9971q.m14633g(message, "message");
        SimpleDraweeView simpleDraweeView = this.binding.icon;
        C9971q.m14634f(simpleDraweeView, "binding.icon");
        Boolean missed = message.getMissed();
        Boolean bool = Boolean.TRUE;
        if (C9971q.m14638b(missed, bool)) {
            reactAsset = ReactAsset.CallDisconnect;
        } else {
            reactAsset = ReactAsset.CallConnect;
        }
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
        SimpleDraweeView simpleDraweeView2 = this.binding.icon;
        C9971q.m14634f(simpleDraweeView2, "binding.icon");
        if (C9971q.m14638b(message.isCallActive(), bool)) {
            i = this.greenIconColor;
        } else if (C9971q.m14638b(message.getMissed(), bool)) {
            i = this.redIconColor;
        } else {
            i = this.grayIconColor;
        }
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(i));
        this.binding.message.setText(message.getTitle());
        AttachedViewCoroutineScope attachedScope = CoroutineViewUtilsKt.getAttachedScope(this);
        String simpleName = CallSystemMessageView.class.getSimpleName();
        AttachedViewCoroutineScope.cancelAllWork$default(attachedScope, "Binding " + simpleName, null, 2, null);
        if (C9971q.m14638b(message.isCallActive(), bool)) {
            Long rawMilliseconds = message.getRawMilliseconds();
            C9971q.m14636d(rawMilliseconds);
            C10139l.m14174d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new CallSystemMessageView$setMessage$1(this, rawMilliseconds.longValue(), message, null), 3, null);
        } else {
            this.binding.info.setText(message.getDescription());
        }
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        List<String> avatarURLs = message.getAvatarURLs();
        if (avatarURLs == null) {
            avatarURLs = C9906j.m14820i();
        }
        t = C9907k.m14809t(avatarURLs, 10);
        ArrayList arrayList = new ArrayList(t);
        for (String str : avatarURLs) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView.setItems(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        this.greenIconColor = ColorUtilsKt.getColorCompat(this, C4254R.color.green_360);
        this.redIconColor = ColorUtilsKt.getColorCompat(this, C4254R.color.red_400);
        this.grayIconColor = ThemeManagerKt.getTheme().getInteractiveNormal();
        CallSystemMessageViewBinding inflate = CallSystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        AddSystemMessageCardStyleKt.addSystemMessageCardStyle(this);
        TextView _init_$lambda$0 = inflate.message;
        C9971q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView _init_$lambda$1 = inflate.info;
        C9971q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryNormal);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
