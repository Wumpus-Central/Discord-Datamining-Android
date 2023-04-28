package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.ForumPostActionBarViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ReactionsView;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9609i;
import kotlin.collections.C9618r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p164j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-Jb\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002JÏ\u0001\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "messageId", "", "Lcom/discord/reactions/ReactionView$Reaction;", "reactionsToDisplay", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onAddReactionClick", "Lkotlin/Function1;", "", "onReactionClick", "onReactionLongPress", "", "useSortedReactions", "setReactions", "Lcom/discord/primitives/MessageId;", "", "numDisplayedReactions", "isFollowing", "followIcon", "followLabel", "shareIcon", "shareLabel", "reactions", "defaultReaction", "canAddNewReactions", "addNewReactionAccessibilityLabel", "onTapFollowForumPost", "onTapShareForumPost", "onTapReactionOverflow", "configure-m9bs0RY", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Z)V", "configure", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "binding", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ForumPostActionBarView extends ConstraintLayout {
    private final ForumPostActionBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ ForumPostActionBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setReactions(String str, List<? extends ReactionView.Reaction> list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1<? super ReactionView.Reaction, Unit> function1, Function1<? super ReactionView.Reaction, Unit> function12, boolean z) {
        ReactionsView reactionsView = this.binding.reactionsView;
        C9677q.m14634f(reactionsView, "binding.reactionsView");
        reactionsView.setVisibility(0);
        ReactionsView reactionsView2 = this.binding.reactionsView;
        C9677q.m14634f(reactionsView2, "binding.reactionsView");
        reactionsView2.setReactions(str, list, false, false, "", "", "", reactionsTheme, (r34 & Spliterator.NONNULL) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0039: INVOKE  
              (r5v1 'reactionsView2' com.discord.reactions.ReactionsView)
              (r20v0 'str' java.lang.String)
              (r21v0 'list' java.util.List<? extends com.discord.reactions.ReactionView$Reaction>)
              false
              false
              ("")
              ("")
              ("")
              (r22v0 'reactionsTheme' com.discord.reactions.ReactionView$ReactionsTheme)
              (wrap: android.view.View$OnClickListener : ?: TERNARYnull = ((wrap: int : 0x0002: ARITH  (r1v0 int A[REMOVE]) = (r34v0 int) & (wrap: ?? : ?: SGET   j$.util.Spliterator.NONNULL int)) != (0 int)) ? (wrap: android.view.View$OnClickListener : 0x000b: CONSTRUCTOR   call: com.discord.reactions.e.<init>():void type: CONSTRUCTOR) : (r23v0 'onClickListener' android.view.View$OnClickListener))
              (wrap: android.view.View$OnClickListener : ?: TERNARYnull = ((wrap: int : 0x000f: ARITH  (r1v1 int A[REMOVE]) = (r34v0 int) & (512 int)) != (0 int)) ? (wrap: android.view.View$OnClickListener : 0x0018: CONSTRUCTOR   call: com.discord.reactions.f.<init>():void type: CONSTRUCTOR) : (null android.view.View$OnClickListener))
              (r24v0 'function1' kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>)
              (wrap: kotlin.jvm.functions.Function1 : ?: TERNARYnull = ((wrap: int : 0x001c: ARITH  (r1v2 int A[REMOVE]) = (r34v0 int) & (wrap: ?? : ?: SGET   androidx.recyclerview.widget.RecyclerView.ItemAnimator.FLAG_MOVED int)) != (0 int)) ? (wrap: com.discord.reactions.ReactionsView$setReactions$3 : 0x0022: SGET   com.discord.reactions.ReactionsView$setReactions$3.INSTANCE com.discord.reactions.ReactionsView$setReactions$3) : (r25v0 'function12' kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>))
              (wrap: com.discord.theme.DiscordTheme : ?: TERNARYnull = ((wrap: int : 0x0026: ARITH  (r1v3 int A[REMOVE]) = (r34v0 int) & (4096 int)) != (0 int)) ? (null com.discord.theme.DiscordTheme) : (null com.discord.theme.DiscordTheme))
              (wrap: boolean : ?: TERNARYnull = ((wrap: int : 0x002f: ARITH  (r0v1 int A[REMOVE]) = (r34v0 int) & (8192 int)) != (0 int)) ? false : (wrap: boolean : 0x0031: INVOKE  (r15v1 boolean A[REMOVE]) = 
              (wrap: com.discord.chat.presentation.root.ChatView$Companion : 0x002f: SGET  (r15v0 com.discord.chat.presentation.root.ChatView$Companion A[REMOVE]) =  com.discord.chat.presentation.root.ChatView.Companion com.discord.chat.presentation.root.ChatView$Companion)
             type: VIRTUAL call: com.discord.chat.presentation.root.ChatView.Companion.getAreChatAnimationsEnabled():boolean))
              (r26v0 'z' boolean)
             type: VIRTUAL call: com.discord.reactions.ReactionsView.setReactions(java.lang.String, java.util.List, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.discord.reactions.ReactionView$ReactionsTheme, android.view.View$OnClickListener, android.view.View$OnClickListener, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.discord.theme.DiscordTheme, boolean, boolean):void in method: com.discord.chat.presentation.message.view.ForumPostActionBarView.setReactions(java.lang.String, java.util.List<? extends com.discord.reactions.ReactionView$Reaction>, com.discord.reactions.ReactionView$ReactionsTheme, android.view.View$OnClickListener, kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>, boolean):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:278)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:241)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:267)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:260)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.discord.reactions.e, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:299)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:386)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:140)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:116)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1041)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:504)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:140)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:116)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:996)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:390)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:271)
            	... 15 more
            */
        /*
            this = this;
            r0 = r19
            r2 = r20
            r3 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r13 = r25
            r16 = r26
            com.discord.chat.databinding.ForumPostActionBarViewBinding r1 = r0.binding
            com.discord.reactions.ReactionsView r1 = r1.reactionsView
            java.lang.String r4 = "binding.reactionsView"
            kotlin.jvm.internal.C9677q.m14634f(r1, r4)
            r5 = 0
            r1.setVisibility(r5)
            com.discord.chat.databinding.ForumPostActionBarViewBinding r1 = r0.binding
            com.discord.reactions.ReactionsView r5 = r1.reactionsView
            r1 = r5
            kotlin.jvm.internal.C9677q.m14634f(r5, r4)
            r4 = 0
            r5 = 0
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r11 = 0
            r14 = 0
            com.discord.chat.presentation.root.ChatView$Companion r15 = com.discord.chat.presentation.root.ChatView.Companion
            boolean r15 = r15.getAreChatAnimationsEnabled()
            r17 = 4608(0x1200, float:6.457E-42)
            r18 = 0
            com.discord.reactions.ReactionsView.setReactions$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.ForumPostActionBarView.setReactions(java.lang.String, java.util.List, com.discord.reactions.ReactionView$ReactionsTheme, android.view.View$OnClickListener, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
    }

    static /* synthetic */ void setReactions$default(ForumPostActionBarView forumPostActionBarView, String str, List list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        ForumPostActionBarView$setReactions$1 forumPostActionBarView$setReactions$1;
        if ((i & 32) != 0) {
            forumPostActionBarView$setReactions$1 = ForumPostActionBarView$setReactions$1.INSTANCE;
        } else {
            forumPostActionBarView$setReactions$1 = function12;
        }
        forumPostActionBarView.setReactions(str, list, reactionsTheme, onClickListener, function1, forumPostActionBarView$setReactions$1, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: configure-m9bs0RY  reason: not valid java name */
    public final void m41859configurem9bs0RY(String messageId, int i, boolean z, String followIcon, String followLabel, String shareIcon, String shareLabel, List<? extends ReactionView.Reaction> list, ReactionView.Reaction reaction, boolean z2, String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onTapReactionOverflow, boolean z3) {
        int i2;
        boolean z4;
        Object obj;
        int i3;
        boolean z5;
        List<? extends ReactionView.Reaction> x0;
        List d;
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(followIcon, "followIcon");
        C9677q.m14633g(followLabel, "followLabel");
        C9677q.m14633g(shareIcon, "shareIcon");
        C9677q.m14633g(shareLabel, "shareLabel");
        C9677q.m14633g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9677q.m14633g(onAddReactionClick, "onAddReactionClick");
        C9677q.m14633g(onReactionClick, "onReactionClick");
        C9677q.m14633g(onReactionLongPress, "onReactionLongPress");
        C9677q.m14633g(onTapFollowForumPost, "onTapFollowForumPost");
        C9677q.m14633g(onTapShareForumPost, "onTapShareForumPost");
        C9677q.m14633g(onTapReactionOverflow, "onTapReactionOverflow");
        boolean z6 = true;
        if (list != null && !list.isEmpty()) {
            z6 = false;
        }
        if (z6) {
            DCDButton dCDButton = this.binding.otherReactionsCount;
            C9677q.m14634f(dCDButton, "binding.otherReactionsCount");
            dCDButton.setVisibility(8);
            if (reaction == null || !z2) {
                i2 = 2;
                ReactionsView reactionsView = this.binding.reactionsView;
                C9677q.m14634f(reactionsView, "binding.reactionsView");
                reactionsView.setVisibility(8);
            } else {
                d = C9609i.m14825d(reaction);
                i2 = 2;
                setReactions$default(this, MessageId.m42121toStringimpl(messageId), d, reactionsTheme, onAddReactionClick, onReactionClick, null, z3, 32, null);
            }
            obj = null;
            z4 = false;
        } else {
            i2 = 2;
            int i4 = i - 1;
            x0 = C9618r.m14741x0(list, i4);
            ReactionsView reactionsView2 = this.binding.reactionsView;
            C9677q.m14634f(reactionsView2, "binding.reactionsView");
            reactionsView2.setVisibility(0);
            z4 = false;
            setReactions(MessageId.m42121toStringimpl(messageId), x0, reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress, z3);
            int max = Math.max(list.size() - i4, 0);
            DCDButton configure_m9bs0RY$lambda$3 = this.binding.otherReactionsCount;
            C9677q.m14634f(configure_m9bs0RY$lambda$3, "configure_m9bs0RY$lambda$3");
            configure_m9bs0RY$lambda$3.setVisibility(max != 0 ? 0 : 8);
            if (configure_m9bs0RY$lambda$3.getVisibility() == 0) {
                Context context = configure_m9bs0RY$lambda$3.getContext();
                C9677q.m14634f(context, "context");
                configure_m9bs0RY$lambda$3.setText(I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_REACTIONS_OVERFLOW, new ForumPostActionBarView$configure$1$1(max)));
                obj = null;
                RippleUtilsKt.addRipple$default(configure_m9bs0RY$lambda$3, true, 0, 2, null);
                configure_m9bs0RY$lambda$3.setOnClickButtonListener(onTapReactionOverflow);
            } else {
                obj = null;
            }
        }
        DCDButton dCDButton2 = this.binding.followButton;
        dCDButton2.setIcon(followIcon, SizeUtilsKt.getDpToPx(16));
        dCDButton2.setText(followLabel);
        if (z) {
            i3 = ThemeManagerKt.getTheme().getTextBrand();
        } else {
            i3 = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        dCDButton2.setTextColor(Integer.valueOf(i3));
        dCDButton2.setOnClickButtonListener(onTapFollowForumPost);
        DCDButton dCDButton3 = this.binding.shareButton;
        dCDButton3.setIcon(shareIcon, SizeUtilsKt.getDpToPx(16));
        dCDButton3.setOnClickButtonListener(onTapShareForumPost);
        dCDButton3.setContentDescription(shareLabel);
        AddReactionView configure_m9bs0RY$lambda$6 = this.binding.addReaction;
        C9677q.m14634f(configure_m9bs0RY$lambda$6, "configure_m9bs0RY$lambda$6");
        configure_m9bs0RY$lambda$6.setVisibility(z2 ? z4 : 8);
        if (configure_m9bs0RY$lambda$6.getVisibility() == 0) {
            z5 = true;
        } else {
            boolean z7 = z4 ? 1 : 0;
            Object[] objArr = z4 ? 1 : 0;
            Object[] objArr2 = z4 ? 1 : 0;
            z5 = z7;
        }
        if (z5) {
            int i5 = z4 ? 1 : 0;
            int i6 = z4 ? 1 : 0;
            int i7 = z4 ? 1 : 0;
            RippleUtilsKt.addRipple$default(configure_m9bs0RY$lambda$6, true, i5, i2, obj);
            configure_m9bs0RY$lambda$6.setContentDescription(addNewReactionAccessibilityLabel);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configure_m9bs0RY$lambda$6, z4, onAddReactionClick, 1, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9677q.m14633g(context, "context");
        ForumPostActionBarViewBinding inflate = ForumPostActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.footerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.headerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        DCDButton dCDButton = inflate.followButton;
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        DCDButton dCDButton2 = inflate.shareButton;
        dCDButton2.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton2.setTextSizeSp(14.0f);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton2.setIconPadding(0);
        DCDButton dCDButton3 = inflate.otherReactionsCount;
        dCDButton3.setDiscordFont(DiscordFont.PrimarySemibold);
        dCDButton3.setTextSizeSp(14.0f);
        dCDButton3.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton3.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
    }
}
