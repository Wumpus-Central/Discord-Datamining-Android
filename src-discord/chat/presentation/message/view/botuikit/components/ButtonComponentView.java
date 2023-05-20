package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.chat.databinding.MessageComponentButtonViewBinding;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001(B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030'H\u0016¨\u0006)"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentActionListener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "configureEmoji", "emojiView", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "isLoading", "", "configureLabelPadding", "label", "Landroid/widget/TextView;", "messageComponent", "configureLinkIcon", "icon", "Lcom/facebook/drawee/view/SimpleDraweeView;", "showIcon", "configureStyle", "button", "Landroid/widget/Button;", "style", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "getComponentType", "Lkotlin/reflect/KClass;", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonComponentView extends ConstraintLayout implements ComponentView<ButtonComponent> {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView$Companion;", "", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView;", "context", "Landroid/content/Context;", "root", "Landroid/view/ViewGroup;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ButtonComponentView inflateComponent(Context context, ViewGroup root) {
            q.g(context, "context");
            q.g(root, "root");
            ButtonComponentView root2 = MessageComponentButtonViewBinding.inflate(LayoutInflater.from(context), root, false).getRoot();
            q.f(root2, "inflate(\n               …false,\n            ).root");
            return root2;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyle.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyle.DANGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonStyle.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ButtonComponentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$1(ButtonComponent component, ComponentActionListener componentActionListener, View view) {
        q.g(component, "$component");
        q.g(componentActionListener, "$componentActionListener");
        if (component.getUrl() != null) {
            componentActionListener.openLink(component.getUrl());
        } else if (component.getCustomId() != null) {
            componentActionListener.mo307onTapButtonActionComponenty43Yjpg(component.getCustomId(), component.m32getApplicationIdVavddsQ(), component.getIndices());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$2(View view) {
    }

    private final void configureEmoji(SimpleDraweeSpanTextView simpleDraweeSpanTextView, ComponentEmoji componentEmoji, boolean z10) {
        if (componentEmoji == null || !z10) {
            ComponentViewKt.setEmojiOrHide(simpleDraweeSpanTextView, componentEmoji);
        } else {
            simpleDraweeSpanTextView.setVisibility(4);
        }
    }

    private final void configureLabelPadding(TextView textView, ButtonComponent buttonComponent) {
        int i10;
        int i11;
        int i12;
        if (buttonComponent.getLabel() == null) {
            if (!ButtonComponentViewKt.access$hasEmoji(buttonComponent) || !ButtonComponentViewKt.access$hasIcon(buttonComponent)) {
                i12 = SizeUtilsKt.getDpToPx(16);
            } else {
                i12 = SizeUtilsKt.getDpToPx(8);
            }
            textView.setPadding(0, 0, i12, 0);
            return;
        }
        if (ButtonComponentViewKt.access$hasEmoji(buttonComponent)) {
            i10 = SizeUtilsKt.getDpToPx(8);
        } else {
            i10 = SizeUtilsKt.getDpToPx(16);
        }
        if (ButtonComponentViewKt.access$hasIcon(buttonComponent)) {
            i11 = SizeUtilsKt.getDpToPx(8);
        } else {
            i11 = SizeUtilsKt.getDpToPx(16);
        }
        textView.setPadding(i10, 0, i11, 0);
    }

    private final void configureLinkIcon(SimpleDraweeView simpleDraweeView, boolean z10) {
        int i10;
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Launch);
        ColorUtilsKt.setTintColor(simpleDraweeView, (Integer) (-1));
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
    }

    private final void configureStyle(Button button, ButtonStyle buttonStyle) {
        switch (WhenMappings.$EnumSwitchMapping$0[buttonStyle.ordinal()]) {
            case 1:
                ButtonComponentViewKt.access$setSecondaryColor(button);
                return;
            case 2:
                ButtonComponentViewKt.access$setBrandColor(button);
                return;
            case 3:
                ButtonComponentViewKt.access$setSecondaryColor(button);
                return;
            case 4:
                ButtonComponentViewKt.access$setSecondaryColor(button);
                return;
            case 5:
                ButtonComponentViewKt.access$setDangerColor(button);
                return;
            case 6:
                ButtonComponentViewKt.access$setSuccessColor(button);
                return;
            default:
                return;
        }
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public KClass<ButtonComponent> getComponentType() {
        return f0.b(ButtonComponent.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }

    public void configure(final ButtonComponent component, ComponentProvider componentProvider, final ComponentActionListener componentActionListener) {
        q.g(component, "component");
        q.g(componentProvider, "componentProvider");
        q.g(componentActionListener, "componentActionListener");
        MessageComponentButtonViewBinding bind = MessageComponentButtonViewBinding.bind(this);
        q.f(bind, "bind(this)");
        int i10 = 0;
        boolean z10 = component.getState() == ActionComponentState.DISABLED || component.getDisabled();
        boolean z11 = component.getState() == ActionComponentState.LOADING;
        MaterialButton materialButton = bind.button;
        q.f(materialButton, "binding.button");
        configureStyle(materialButton, component.getStyle());
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = bind.emoji;
        q.f(simpleDraweeSpanTextView, "binding.emoji");
        configureEmoji(simpleDraweeSpanTextView, component.getEmoji(), z11);
        SimpleDraweeView simpleDraweeView = bind.linkIcon;
        q.f(simpleDraweeView, "binding.linkIcon");
        configureLinkIcon(simpleDraweeView, component.getStyle() == ButtonStyle.LINK);
        MaterialTextView materialTextView = bind.label;
        q.f(materialTextView, "binding.label");
        configureLabelPadding(materialTextView, component);
        float f10 = 1.0f;
        bind.label.setAlpha(z10 ? 0.5f : 1.0f);
        bind.emoji.setAlpha(z10 ? 0.3f : 1.0f);
        SimpleDraweeView simpleDraweeView2 = bind.linkIcon;
        if (z10) {
            f10 = 0.3f;
        }
        simpleDraweeView2.setAlpha(f10);
        bind.button.setEnabled(!z10);
        MaterialTextView configure$lambda$0 = bind.label;
        configure$lambda$0.setText(component.getLabel());
        q.f(configure$lambda$0, "configure$lambda$0");
        configure$lambda$0.setVisibility(z11 ? 4 : 0);
        DiscordFontUtilsKt.setDiscordFont(configure$lambda$0, DiscordFont.PrimaryMedium);
        configure$lambda$0.setTextColor(ColorUtilsKt.getColorCompat(configure$lambda$0, R.color.white));
        if (!z11) {
            MaterialButton materialButton2 = bind.button;
            q.f(materialButton2, "binding.button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(materialButton2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.botuikit.components.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ButtonComponentView.configure$lambda$1(ButtonComponent.this, componentActionListener, view);
                }
            }, 1, null);
        } else {
            MaterialButton materialButton3 = bind.button;
            q.f(materialButton3, "binding.button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(materialButton3, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.botuikit.components.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ButtonComponentView.configure$lambda$2(view);
                }
            }, 1, null);
        }
        ProgressDots progressDots = bind.loadingDots;
        q.f(progressDots, "binding.loadingDots");
        if (!z11) {
            i10 = 8;
        }
        progressDots.setVisibility(i10);
    }
}
