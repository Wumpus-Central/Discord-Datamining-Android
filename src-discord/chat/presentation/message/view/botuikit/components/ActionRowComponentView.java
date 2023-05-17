package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.discord.chat.bridge.botuikit.ActionRowComponent;
import com.discord.chat.databinding.MessageComponentActionRowViewBinding;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0016¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentActionListener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "configurePadding", "views", "Landroid/view/ViewGroup;", "isTop", "", "getComponentType", "Lkotlin/reflect/KClass;", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionRowComponentView extends LinearLayout implements ComponentView<ActionRowComponent> {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView$Companion;", "", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "context", "Landroid/content/Context;", "root", "Landroid/view/ViewGroup;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ComponentView<ActionRowComponent> inflateComponent(Context context, ViewGroup root) {
            q.g(context, "context");
            q.g(root, "root");
            ActionRowComponentView root2 = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(context), root, false).getRoot();
            q.f(root2, "inflate(\n               …false,\n            ).root");
            return root2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ActionRowComponentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void configurePadding(ViewGroup viewGroup, boolean z10) {
        int i10;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z10) {
                i10 = 0;
            } else {
                i10 = SizeUtilsKt.getDpToPx(8);
            }
            layoutParams2.topMargin = i10;
            viewGroup.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public KClass<ActionRowComponent> getComponentType() {
        return f0.b(ActionRowComponent.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionRowComponentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r9 == null) goto L_0x0061;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void configure(com.discord.chat.bridge.botuikit.ActionRowComponent r11, com.discord.chat.presentation.message.view.botuikit.ComponentProvider r12, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView.configure(com.discord.chat.bridge.botuikit.ActionRowComponent, com.discord.chat.presentation.message.view.botuikit.ComponentProvider, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener):void");
    }
}
