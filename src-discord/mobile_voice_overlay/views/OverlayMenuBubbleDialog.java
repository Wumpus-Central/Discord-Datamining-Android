package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.databinding.OverlayMenuBubbleBinding;
import com.discord.theme.ThemeManagerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0014J\u0012\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/discord/mobile_voice_overlay/views/VoiceUserAdapter;", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayMenuBubbleBinding;", "linkedAnchorView", "Landroid/view/View;", "getLinkedAnchorView", "()Landroid/view/View;", "onDisconnectPressed", "Lkotlin/Function0;", "", "onGetInvitePressed", "onMutePressed", "onOpenDiscordPressed", "onShowSelectorDialog", "getOnShowSelectorDialog", "()Lkotlin/jvm/functions/Function0;", "setOnShowSelectorDialog", "(Lkotlin/jvm/functions/Function0;)V", "onSourcePressed", "onSwitchChannelsPressed", "getClosingAnimator", "Landroid/animation/Animator;", "onAttachedToWindow", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "setAssets", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OverlayMenuBubbleDialog extends OverlayDialog {
    private final OverlayMenuBubbleBinding binding;
    private final VoiceUserAdapter adapter = new VoiceUserAdapter();
    private Function0<Unit> onGetInvitePressed = OverlayMenuBubbleDialog$onGetInvitePressed$1.INSTANCE;
    private Function0<Unit> onSwitchChannelsPressed = OverlayMenuBubbleDialog$onSwitchChannelsPressed$1.INSTANCE;
    private Function0<Unit> onOpenDiscordPressed = OverlayMenuBubbleDialog$onOpenDiscordPressed$1.INSTANCE;
    private Function0<Unit> onSourcePressed = OverlayMenuBubbleDialog$onSourcePressed$1.INSTANCE;
    private Function0<Unit> onMutePressed = OverlayMenuBubbleDialog$onMutePressed$1.INSTANCE;
    private Function0<Unit> onDisconnectPressed = OverlayMenuBubbleDialog$onDisconnectPressed$1.INSTANCE;
    private Function0<Unit> onShowSelectorDialog = OverlayMenuBubbleDialog$onShowSelectorDialog$1.INSTANCE;

    
    public OverlayMenuBubbleDialog(Context context) {
        super(context);
        q.h(context, "context");
        OverlayMenuBubbleBinding inflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        inflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$0(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$1(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$2(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().srcToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$3(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$4(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$5(OverlayMenuBubbleDialog.this, view);
            }
        });
        setClipChildren(false);
        TextView _init_$lambda$6 = inflate.overlayMembersOverflowText;
        q.g(_init_$lambda$6, "_init_$lambda$6");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$6, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$6, 20.0f);
        TextView _init_$lambda$7 = inflate.overlayMembersOverflowText;
        _init_$lambda$7.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$7, "_init_$lambda$7");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$7, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
    }

    
    public static final void _init_$lambda$0(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onGetInvitePressed.invoke();
    }

    
    public static final void _init_$lambda$1(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onSwitchChannelsPressed.invoke();
    }

    
    public static final void _init_$lambda$2(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onOpenDiscordPressed.invoke();
    }

    
    public static final void _init_$lambda$3(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onSourcePressed.invoke();
    }

    
    public static final void _init_$lambda$4(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onMutePressed.invoke();
    }

    
    public static final void _init_$lambda$5(OverlayMenuBubbleDialog this$0, View view) {
        q.h(this$0, "this$0");
        this$0.onDisconnectPressed.invoke();
        this$0.closeDialog();
    }

    @Override 
    public Animator getClosingAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(getResources().getInteger(17694720));
        Animator loadAnimator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_down_fade_out);
        loadAnimator.setTarget(this.binding.overlayMenu);
        Unit unit = Unit.f21025a;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.overlay_slide_up_fade_out);
        loadAnimator2.setTarget(this.binding.overlayHeader);
        animatorSet.playTogether(loadAnimator, loadAnimator2);
        return animatorSet;
    }

    public final View getLinkedAnchorView() {
        View view = this.binding.overlayLinkedAnchorView;
        q.g(view, "binding.overlayLinkedAnchorView");
        return view;
    }

    public final Function0<Unit> getOnShowSelectorDialog() {
        return this.onShowSelectorDialog;
    }

    @Override 
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.overlayMenu.setAlpha(0.0f);
        this.binding.overlayHeader.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator loadAnimator = AnimatorInflater.loadAnimator(this.binding.overlayMenu.getContext(), R.animator.overlay_slide_up_fade_in);
        loadAnimator.setTarget(this.binding.overlayMenu);
        Unit unit = Unit.f21025a;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.overlay_slide_down_fade_in);
        loadAnimator2.setTarget(this.binding.overlayHeader);
        animatorSet.playTogether(loadAnimator, loadAnimator2);
        animatorSet.setStartDelay(getResources().getInteger(17694720));
        animatorSet.start();
        this.binding.overlayMembersRecycler.setAdapter(this.adapter);
    }

    
    @Override 
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getOnDialogClosed().invoke(this);
    }

    @Override 
    public void setAssets(MobileVoiceOverlayAssets assets) {
        q.h(assets, "assets");
        super.setAssets(assets);
        this.binding.overlayMenu.setAssets(assets);
    }

    @Override 
    public void setData(MobileVoiceOverlayData data) {
        List<MobileVoiceOverlayDataUser> list;
        int i10;
        String str;
        IntRange q10;
        q.h(data, "data");
        List<MobileVoiceOverlayDataUser> users = data.getUsers();
        if (users.size() < 2) {
            list = j.h();
        } else {
            q10 = ag.j.q(1, users.size());
            list = r.s0(users, q10);
        }
        this.adapter.setData(list);
        TextView textView = this.binding.overlayMembersOverflowText;
        if (data.getExtraUsers() == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (data.getExtraUsers() == 0) {
            str = null;
        } else {
            str = "+" + data.getExtraUsers();
        }
        textView.setText(str);
        this.binding.overlayMenu.setData(data);
        this.onGetInvitePressed = new OverlayMenuBubbleDialog$setData$2(this, data);
        this.onSwitchChannelsPressed = new OverlayMenuBubbleDialog$setData$3(this);
        this.onOpenDiscordPressed = new OverlayMenuBubbleDialog$setData$4(this, data);
        this.onSourcePressed = new OverlayMenuBubbleDialog$setData$5(this);
        this.onMutePressed = new OverlayMenuBubbleDialog$setData$6(this);
        this.onDisconnectPressed = new OverlayMenuBubbleDialog$setData$7(this, data);
    }

    public final void setOnShowSelectorDialog(Function0<Unit> function0) {
        q.h(function0, "<set-?>");
        this.onShowSelectorDialog = function0;
    }

    
    public OverlayMenuBubbleDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        OverlayMenuBubbleBinding inflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        inflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$0(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$1(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$2(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().srcToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$3(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$4(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$5(OverlayMenuBubbleDialog.this, view);
            }
        });
        setClipChildren(false);
        TextView _init_$lambda$6 = inflate.overlayMembersOverflowText;
        q.g(_init_$lambda$6, "_init_$lambda$6");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$6, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$6, 20.0f);
        TextView _init_$lambda$7 = inflate.overlayMembersOverflowText;
        _init_$lambda$7.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$7, "_init_$lambda$7");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$7, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
    }

    
    public OverlayMenuBubbleDialog(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        OverlayMenuBubbleBinding inflate = OverlayMenuBubbleBinding.inflate(LayoutInflater.from(getContext()), this, true);
        q.g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        inflate.overlayMenu.getBinding().overlayInviteLink.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$0(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlaySwitchChannels.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$1(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().overlayOpenApp.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$2(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().srcToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$3(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().muteToggle.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$4(OverlayMenuBubbleDialog.this, view);
            }
        });
        inflate.overlayMenu.getBinding().disconnectBtn.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                OverlayMenuBubbleDialog._init_$lambda$5(OverlayMenuBubbleDialog.this, view);
            }
        });
        setClipChildren(false);
        TextView _init_$lambda$6 = inflate.overlayMembersOverflowText;
        q.g(_init_$lambda$6, "_init_$lambda$6");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$6, DiscordFont.PrimaryExtraBold);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$6, 20.0f);
        TextView _init_$lambda$7 = inflate.overlayMembersOverflowText;
        _init_$lambda$7.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$7, "_init_$lambda$7");
        ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$7, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
    }
}
