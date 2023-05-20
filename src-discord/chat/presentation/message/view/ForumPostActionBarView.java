package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.forums.PostSharePrompt;
import com.discord.chat.databinding.ForumPostActionBarViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ReactionsView;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import j$.util.Spliterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0019¢\u0006\u0004\b2\u00103Jb\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u0017\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0002Jå\u0001\u0010)\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "messageId", "", "Lcom/discord/reactions/ReactionView$Reaction;", "reactionsToDisplay", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onAddReactionClick", "Lkotlin/Function1;", "", "onReactionClick", "onReactionLongPress", "", "useSortedReactions", "setReactions", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "postSharePrompt", "onTapShareForumPost", "shareIcon", "onTapDismissSharePrompt", "setSharePrompt", "Lcom/discord/primitives/MessageId;", "", "numDisplayedReactions", "isFollowing", "followIcon", "followLabel", "shareLabel", "reactions", "defaultReaction", "canAddNewReactions", "addNewReactionAccessibilityLabel", "onTapFollowForumPost", "onTapReactionOverflow", "sharePrompt", "onDismissSharePromptClick", "configure-CgeVRR0", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;ZLcom/discord/chat/bridge/forums/PostSharePrompt;Landroid/view/View$OnClickListener;)V", "configure", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "binding", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ForumPostActionBarView extends ConstraintLayout {
    private final ForumPostActionBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ForumPostActionBarView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setReactions(String str, List<? extends ReactionView.Reaction> list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1<? super ReactionView.Reaction, Unit> function1, Function1<? super ReactionView.Reaction, Unit> function12, boolean z10) {
        ReactionsView reactionsView = this.binding.reactionsView;
        q.f(reactionsView, "binding.reactionsView");
        reactionsView.setVisibility(0);
        ReactionsView reactionsView2 = this.binding.reactionsView;
        q.f(reactionsView2, "binding.reactionsView");
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
              (r26v0 'z10' boolean)
             type: VIRTUAL call: com.discord.reactions.ReactionsView.setReactions(java.lang.String, java.util.List, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.discord.reactions.ReactionView$ReactionsTheme, android.view.View$OnClickListener, android.view.View$OnClickListener, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.discord.theme.DiscordTheme, boolean, boolean):void in method: com.discord.chat.presentation.message.view.ForumPostActionBarView.setReactions(java.lang.String, java.util.List<? extends com.discord.reactions.ReactionView$Reaction>, com.discord.reactions.ReactionView$ReactionsTheme, android.view.View$OnClickListener, kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.discord.reactions.ReactionView$Reaction, kotlin.Unit>, boolean):void, file: classes5.dex
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
            kotlin.jvm.internal.q.f(r1, r4)
            r5 = 0
            r1.setVisibility(r5)
            com.discord.chat.databinding.ForumPostActionBarViewBinding r1 = r0.binding
            com.discord.reactions.ReactionsView r5 = r1.reactionsView
            r1 = r5
            kotlin.jvm.internal.q.f(r5, r4)
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

    static /* synthetic */ void setReactions$default(ForumPostActionBarView forumPostActionBarView, String str, List list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1 function1, Function1 function12, boolean z10, int i10, Object obj) {
        ForumPostActionBarView$setReactions$1 forumPostActionBarView$setReactions$1;
        if ((i10 & 32) != 0) {
            forumPostActionBarView$setReactions$1 = ForumPostActionBarView$setReactions$1.INSTANCE;
        } else {
            forumPostActionBarView$setReactions$1 = function12;
        }
        forumPostActionBarView.setReactions(str, list, reactionsTheme, onClickListener, function1, forumPostActionBarView$setReactions$1, z10);
    }

    private final void setSharePrompt(PostSharePrompt postSharePrompt, View.OnClickListener onClickListener, String str, View.OnClickListener onClickListener2) {
        boolean z10;
        ConstraintLayout constraintLayout = this.binding.sharePromptContainer;
        q.f(constraintLayout, "binding.sharePromptContainer");
        int i10 = 0;
        if (postSharePrompt != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        constraintLayout.setVisibility(i10);
        if (postSharePrompt != null) {
            this.binding.sharePromptTitle.setText(postSharePrompt.getTitle());
            this.binding.sharePromptSubtitle.setText(postSharePrompt.getDescription());
            DCDButton dCDButton = this.binding.sharePromptCopyLinkButton;
            if (str != null) {
                dCDButton.setIcon(str, SizeUtilsKt.getDpToPx(16));
            }
            dCDButton.setText(postSharePrompt.getCta());
            dCDButton.setOnClickButtonListener(onClickListener);
            DCDButton dCDButton2 = this.binding.sharePromptCloseButton;
            dCDButton2.setIcon(postSharePrompt.getCloseIcon(), SizeUtilsKt.getDpToPx(16));
            dCDButton2.setOnClickButtonListener(onClickListener2);
            SimpleDraweeView simpleDraweeView = this.binding.sharePromptIcon;
            q.f(simpleDraweeView, "binding.sharePromptIcon");
            ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, postSharePrompt.getIcon());
        }
    }

    /* renamed from: configure-CgeVRR0  reason: not valid java name */
    public final void m298configureCgeVRR0(String messageId, int i10, boolean z10, String str, String followLabel, String str2, String shareLabel, List<? extends ReactionView.Reaction> list, ReactionView.Reaction reaction, boolean z11, String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onTapReactionOverflow, boolean z12, PostSharePrompt postSharePrompt, View.OnClickListener onDismissSharePromptClick) {
        boolean z13;
        Object obj;
        int i11;
        int i12;
        boolean z14;
        List<? extends ReactionView.Reaction> x02;
        List d10;
        q.g(messageId, "messageId");
        q.g(followLabel, "followLabel");
        q.g(shareLabel, "shareLabel");
        q.g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.g(onAddReactionClick, "onAddReactionClick");
        q.g(onReactionClick, "onReactionClick");
        q.g(onReactionLongPress, "onReactionLongPress");
        q.g(onTapFollowForumPost, "onTapFollowForumPost");
        q.g(onTapShareForumPost, "onTapShareForumPost");
        q.g(onTapReactionOverflow, "onTapReactionOverflow");
        q.g(onDismissSharePromptClick, "onDismissSharePromptClick");
        if (list == null || list.isEmpty()) {
            DCDButton dCDButton = this.binding.otherReactionsCount;
            q.f(dCDButton, "binding.otherReactionsCount");
            dCDButton.setVisibility(8);
            if (reaction == null || !z11) {
                ReactionsView reactionsView = this.binding.reactionsView;
                q.f(reactionsView, "binding.reactionsView");
                reactionsView.setVisibility(8);
            } else {
                d10 = i.d(reaction);
                setReactions$default(this, MessageId.m578toStringimpl(messageId), d10, reactionsTheme, onAddReactionClick, onReactionClick, null, z12, 32, null);
            }
            i11 = 2;
            obj = null;
            z13 = true;
        } else {
            z13 = true;
            z13 = true;
            int i13 = i10 - 1;
            x02 = r.x0(list, i13);
            ReactionsView reactionsView2 = this.binding.reactionsView;
            q.f(reactionsView2, "binding.reactionsView");
            reactionsView2.setVisibility(0);
            setReactions(MessageId.m578toStringimpl(messageId), x02, reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress, z12);
            int max = Math.max(list.size() - i13, 0);
            DCDButton configure_CgeVRR0$lambda$7 = this.binding.otherReactionsCount;
            q.f(configure_CgeVRR0$lambda$7, "configure_CgeVRR0$lambda$7");
            configure_CgeVRR0$lambda$7.setVisibility(max != 0 ? 0 : 8);
            if (configure_CgeVRR0$lambda$7.getVisibility() == 0) {
                Context context = configure_CgeVRR0$lambda$7.getContext();
                q.f(context, "context");
                configure_CgeVRR0$lambda$7.setText(I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_REACTIONS_OVERFLOW, new ForumPostActionBarView$configure$1$1(max)));
                i11 = 2;
                obj = null;
                RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$7, true, 0, 2, null);
                configure_CgeVRR0$lambda$7.setOnClickButtonListener(onTapReactionOverflow);
            } else {
                i11 = 2;
                obj = null;
            }
        }
        DCDButton dCDButton2 = this.binding.followButton;
        if (str != null) {
            dCDButton2.setIcon(str, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton2.setText(followLabel);
        if (z10) {
            i12 = ThemeManagerKt.getTheme().getTextBrand();
        } else {
            i12 = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        dCDButton2.setTextColor(Integer.valueOf(i12));
        dCDButton2.setOnClickButtonListener(onTapFollowForumPost);
        DCDButton dCDButton3 = this.binding.shareButton;
        if (str2 != null) {
            dCDButton3.setIcon(str2, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton3.setOnClickButtonListener(onTapShareForumPost);
        dCDButton3.setContentDescription(shareLabel);
        AddReactionView configure_CgeVRR0$lambda$10 = this.binding.addReaction;
        q.f(configure_CgeVRR0$lambda$10, "configure_CgeVRR0$lambda$10");
        configure_CgeVRR0$lambda$10.setVisibility(z11 ? 0 : 8);
        if (configure_CgeVRR0$lambda$10.getVisibility() == 0) {
            boolean z15 = z13 ? 1 : 0;
            Object[] objArr = z13 ? 1 : 0;
            Object[] objArr2 = z13 ? 1 : 0;
            Object[] objArr3 = z13 ? 1 : 0;
            z14 = z15;
        } else {
            z14 = false;
        }
        if (z14) {
            RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$10, z13, 0, i11, obj);
            configure_CgeVRR0$lambda$10.setContentDescription(addNewReactionAccessibilityLabel);
            int i14 = z13 ? 1 : 0;
            int i15 = z13 ? 1 : 0;
            int i16 = z13 ? 1 : 0;
            int i17 = z13 ? 1 : 0;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configure_CgeVRR0$lambda$10, false, onAddReactionClick, i14, obj);
        }
        setSharePrompt(postSharePrompt, onTapShareForumPost, str2, onDismissSharePromptClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        ForumPostActionBarViewBinding inflate = ForumPostActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
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
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        dCDButton3.setDiscordFont(discordFont);
        dCDButton3.setTextSizeSp(14.0f);
        dCDButton3.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton3.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView _init_$lambda$3 = inflate.sharePromptTitle;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.f(_init_$lambda$3, "_init_$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        TextView _init_$lambda$4 = inflate.sharePromptSubtitle;
        _init_$lambda$4.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$4, "_init_$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 14.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont2);
        DCDButton dCDButton4 = inflate.sharePromptCopyLinkButton;
        dCDButton4.setCornerRadius(SizeUtilsKt.getDpToPx(20));
        dCDButton4.setTextSizeSp(14.0f);
        dCDButton4.setBackgroundColor(context.getColor(R.color.brand_500));
        dCDButton4.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        dCDButton4.setDiscordFont(discordFont2);
        dCDButton4.setIconPadding(8);
        DCDButton dCDButton5 = inflate.sharePromptCloseButton;
        dCDButton5.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton5.setBackgroundColor(0);
    }
}
