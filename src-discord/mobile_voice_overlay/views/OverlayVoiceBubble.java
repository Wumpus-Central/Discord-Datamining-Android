package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.discord.icons.IconUrlUtils;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceBubbleBinding;
import com.discord.primitives.UserId;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceBubbleBinding;", "imageView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getImageView$mobile_voice_overlay_release", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "configureUI", "", "user", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "fadeActive", "fadeDormant", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OverlayVoiceBubble extends OverlayBubbleWrap {
    private static final long ACTIVE_DURATION_MS = 100;
    public static final Companion Companion = new Companion(null);
    private static final float SETTLING_ALPHA = 0.5f;
    private static final long SETTLING_DURATION_MS = 200;
    private final OverlayVoiceBubbleBinding binding;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble$Companion;", "", "()V", "ACTIVE_DURATION_MS", "", "SETTLING_ALPHA", "", "SETTLING_DURATION_MS", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public OverlayVoiceBubble(Context context) {
        super(context);
        q.g(context, "context");
        OverlayVoiceBubbleBinding inflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
    }

    private final void fadeActive() {
        getImageView$mobile_voice_overlay_release().animate().setDuration(100L).alpha(1.0f).start();
    }

    private final void fadeDormant() {
        getImageView$mobile_voice_overlay_release().animate().setDuration(SETTLING_DURATION_MS).alpha(SETTLING_ALPHA).start();
    }

    public final void configureUI(MobileVoiceOverlayDataUser user) {
        String str;
        q.g(user, "user");
        SimpleDraweeView simpleDraweeView = this.binding.overlayBubbleIv;
        IconUrlUtils iconUrlUtils = IconUrlUtils.INSTANCE;
        Context context = getContext();
        q.f(context, "context");
        str = iconUrlUtils.m467getForUser_fRzTXg(context, UserId.m630boximpl(user.m480getUserIdre6GcUE()), user.getAvatar(), (r16 & 8) != 0 ? null : Integer.valueOf(user.getDiscriminator()), (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? null : null);
        simpleDraweeView.setImageURI(str);
        if (user.getSpeaking()) {
            fadeActive();
        } else {
            fadeDormant();
        }
    }

    public final SimpleDraweeView getImageView$mobile_voice_overlay_release() {
        SimpleDraweeView simpleDraweeView = this.binding.overlayBubbleIv;
        q.f(simpleDraweeView, "binding.overlayBubbleIv");
        return simpleDraweeView;
    }

    
    @Override 
    public void onConfigurationChanged(Configuration configuration) {
        int i10;
        int i11 = getWindowLayoutParams().x;
        Context context = getContext();
        q.f(context, "context");
        if (i11 > getAllowedAreaBounds(context).centerX()) {
            i10 = ViewDefaults.NUMBER_OF_LINES;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        super.onConfigurationChanged(configuration);
        OverlayBubbleWrap.animateToCoordinate$default(this, i10, getWindowLayoutParams().y, null, 4, null);
        getSpringAnimationX().u();
        getSpringAnimationY().u();
    }

    @Override 
    public void setData(MobileVoiceOverlayData data) {
        Object U;
        q.g(data, "data");
        U = r.U(data.getUsers());
        MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser = (MobileVoiceOverlayDataUser) U;
        if (mobileVoiceOverlayDataUser != null) {
            configureUI(mobileVoiceOverlayDataUser);
        }
    }

    
    public OverlayVoiceBubble(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        OverlayVoiceBubbleBinding inflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
    }

    
    public OverlayVoiceBubble(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        OverlayVoiceBubbleBinding inflate = OverlayVoiceBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
    }
}
