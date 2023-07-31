package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.SearchableSelectItem;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.SelectItem;
import com.discord.chat.bridge.botuikit.SelectOptionType;
import com.discord.chat.databinding.MessageComponentSelectViewBinding;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewGroupUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.controller.a;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import ff.n;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import l3.c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001(B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J/\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0002¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020\u0012*\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "postProcessor", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "getPostProcessor", "()Lcom/facebook/imagepipeline/request/BasePostprocessor;", "postProcessor$delegate", "Lkotlin/Lazy;", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentActionListener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "getComponentType", "Lkotlin/reflect/KClass;", "setImage", "view", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "imageUrl", "", ViewProps.COLOR, "asCircle", "", "(Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Ljava/lang/String;Ljava/lang/Integer;Z)V", "setSelectedOptions", "Lcom/google/android/flexbox/FlexboxLayout;", "selectedItems", "", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SelectComponentView extends ConstraintLayout implements ComponentView<SelectComponent> {
    public static final Companion Companion = new Companion(null);
    private final Lazy postProcessor$delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView$Companion;", "", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/SelectComponentView;", "context", "Landroid/content/Context;", "root", "Landroid/view/ViewGroup;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SelectComponentView inflateComponent(Context context, ViewGroup root) {
            q.g(context, "context");
            q.g(root, "root");
            SelectComponentView root2 = MessageComponentSelectViewBinding.inflate(LayoutInflater.from(context), root, false).getRoot();
            q.f(root2, "inflate(\n               …false,\n            ).root");
            return root2;
        }
    }

    
    public SelectComponentView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    
    public SelectComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public  SelectComponentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public static final void configure$lambda$1(ComponentActionListener componentActionListener, SelectComponent component, View view) {
        q.g(componentActionListener, "$componentActionListener");
        q.g(component, "$component");
        componentActionListener.onTapSelectActionComponent(component);
    }

    private final BasePostprocessor getPostProcessor() {
        return (BasePostprocessor) this.postProcessor$delegate.getValue();
    }

    private final void setImage(SimpleDraweeSpanTextView simpleDraweeSpanTextView, String str, Integer num, boolean z10) {
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        int dpToPx = SizeUtilsKt.getDpToPx(20);
        draweeSpanStringBuilder.append((char) 8203);
        ImageRequestBuilder z11 = ImageRequestBuilder.s(Uri.parse(str)).E(new ResizeOptions(dpToPx, dpToPx)).z(ImageRequest.RequestLevel.FULL_FETCH);
        if (z10) {
            z11.A(getPostProcessor());
        }
        a c10 = c.g().D(z11.a()).build();
        q.f(c10, "newDraweeControllerBuild…d())\n            .build()");
        GenericDraweeHierarchyBuilder w10 = GenericDraweeHierarchyBuilder.u(getContext().getResources()).w(ScalingUtils.ScaleType.f7409e);
        q.f(w10, "newInstance(context.reso…ils.ScaleType.FIT_CENTER)");
        if (num != null) {
            w10.v(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        draweeSpanStringBuilder.j(getContext(), w10.a(), c10, 0, dpToPx, dpToPx, false, 1);
        simpleDraweeSpanTextView.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
    }

    private final void setSelectedOptions(FlexboxLayout flexboxLayout, List<? extends SelectItem> list) {
        TextView textView;
        ViewGroupUtilsKt.setUpLayoutForList(flexboxLayout, list.size(), new SelectComponentView$setSelectedOptions$1(LayoutInflater.from(flexboxLayout.getContext())));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j.r();
            }
            SelectItem selectItem = (SelectItem) obj;
            View childAt = flexboxLayout.getChildAt(i10);
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(selectItem.getLabel());
            }
            i10 = i11;
        }
    }

    @Override 
    public KClass<SelectComponent> getComponentType() {
        return f0.b(SelectComponent.class);
    }

    
    public SelectComponentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Lazy b10;
        q.g(context, "context");
        b10 = n.b(SelectComponentView$postProcessor$2.INSTANCE);
        this.postProcessor$delegate = b10;
    }

    public void configure(final SelectComponent component, ComponentProvider componentProvider, final ComponentActionListener componentActionListener) {
        Object U;
        q.g(component, "component");
        q.g(componentProvider, "componentProvider");
        q.g(componentActionListener, "componentActionListener");
        MessageComponentSelectViewBinding bind = MessageComponentSelectViewBinding.bind(this);
        q.f(bind, "bind(this)");
        String placeholder = component.getPlaceholder();
        SelectComponentView root = bind.getRoot();
        q.f(root, "binding.root");
        int i10 = 4;
        RippleUtilsKt.addRipple(root, true, SizeUtilsKt.getDpToPx(4));
        SelectComponentView root2 = bind.getRoot();
        q.f(root2, "binding.root");
        ViewBackgroundUtilsKt.setBackgroundRectangle(root2, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()), SizeUtilsKt.getDpToPx(1));
        MaterialTextView materialTextView = bind.selectComponentSelectionText;
        q.f(materialTextView, "binding.selectComponentSelectionText");
        DiscordFontUtilsKt.setDiscordFont(materialTextView, DiscordFont.PrimaryMedium);
        SimpleDraweeView simpleDraweeView = bind.selectComponentChevron;
        q.f(simpleDraweeView, "binding.selectComponentChevron");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.ArrowRight);
        List<SelectItem> selectedItems = component.getSelectedItems();
        boolean z10 = false;
        if (!(!selectedItems.isEmpty())) {
            MaterialTextView materialTextView2 = bind.selectComponentSelectionText;
            q.f(materialTextView2, "binding.selectComponentSelectionText");
            materialTextView2.setVisibility(0);
            FlexboxLayout flexboxLayout = bind.selectComponentSelectionsRoot;
            q.f(flexboxLayout, "binding.selectComponentSelectionsRoot");
            flexboxLayout.setVisibility(8);
            bind.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            bind.selectComponentSelectionText.setText(placeholder);
        } else if (component.getMaxValues() == 1) {
            MaterialTextView materialTextView3 = bind.selectComponentSelectionText;
            q.f(materialTextView3, "binding.selectComponentSelectionText");
            materialTextView3.setVisibility(0);
            FlexboxLayout flexboxLayout2 = bind.selectComponentSelectionsRoot;
            q.f(flexboxLayout2, "binding.selectComponentSelectionsRoot");
            flexboxLayout2.setVisibility(8);
            bind.selectComponentSelectionText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            U = r.U(selectedItems);
            SelectItem selectItem = (SelectItem) U;
            if (selectItem != null) {
                bind.selectComponentSelectionText.setText(selectItem.getLabel());
                if (selectItem.getEmoji() != null) {
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = bind.selectComponentSelectionIcon;
                    q.f(simpleDraweeSpanTextView, "binding.selectComponentSelectionIcon");
                    ComponentViewKt.setEmojiOrHide(simpleDraweeSpanTextView, selectItem.getEmoji());
                } else {
                    if (selectItem instanceof SearchableSelectItem) {
                        SearchableSelectItem searchableSelectItem = (SearchableSelectItem) selectItem;
                        if (searchableSelectItem.getIconSrc() != null) {
                            SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = bind.selectComponentSelectionIcon;
                            q.f(simpleDraweeSpanTextView2, "binding.selectComponentSelectionIcon");
                            setImage(simpleDraweeSpanTextView2, searchableSelectItem.getIconSrc(), searchableSelectItem.getIconColor(), searchableSelectItem.getType() == SelectOptionType.USER.getSerialNumber());
                            SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = bind.selectComponentSelectionIcon;
                            q.f(simpleDraweeSpanTextView3, "binding.selectComponentSelectionIcon");
                            simpleDraweeSpanTextView3.setVisibility(0);
                        }
                    }
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView4 = bind.selectComponentSelectionIcon;
                    q.f(simpleDraweeSpanTextView4, "binding.selectComponentSelectionIcon");
                    simpleDraweeSpanTextView4.setVisibility(8);
                }
            }
        } else {
            FlexboxLayout flexboxLayout3 = bind.selectComponentSelectionsRoot;
            q.f(flexboxLayout3, "binding.selectComponentSelectionsRoot");
            MaterialTextView materialTextView4 = bind.selectComponentSelectionText;
            q.f(materialTextView4, "binding.selectComponentSelectionText");
            materialTextView4.setVisibility(8);
            flexboxLayout3.setVisibility(0);
            setSelectedOptions(flexboxLayout3, selectedItems);
        }
        boolean z11 = component.getState() == ActionComponentState.DISABLED || component.getDisabled();
        boolean z12 = component.getState() == ActionComponentState.LOADING;
        ProgressBar progressBar = bind.selectComponentLoading;
        q.f(progressBar, "binding.selectComponentLoading");
        progressBar.setVisibility(z12 ^ true ? 4 : 0);
        SimpleDraweeView simpleDraweeView2 = bind.selectComponentChevron;
        q.f(simpleDraweeView2, "binding.selectComponentChevron");
        if (!z12) {
            i10 = 0;
        }
        simpleDraweeView2.setVisibility(i10);
        bind.getRoot().setAlpha(z11 ? 0.3f : 1.0f);
        SelectComponentView root3 = bind.getRoot();
        q.f(root3, "binding.root");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(root3, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                SelectComponentView.configure$lambda$1(ComponentActionListener.this, component, view);
            }
        }, 1, null);
        SelectComponentView root4 = bind.getRoot();
        if (!z12 && !z11) {
            z10 = true;
        }
        root4.setClickable(z10);
        bind.getRoot().setEnabled(!z11);
    }
}
