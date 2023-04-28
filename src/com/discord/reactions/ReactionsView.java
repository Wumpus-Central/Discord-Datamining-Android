package com.discord.reactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.reactions.ReactionView;
import com.discord.recycler_view.decorations.HorizontalSpacingItemDecoration;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.DiscordTheme;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006Jª\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u001c2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m15073d2 = {"Lcom/discord/reactions/ReactionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/discord/reactions/ReactionsViewAdapter;", "setReactions", "", "messageId", "", "reactions", "", "Lcom/discord/reactions/ReactionView$Reaction;", "canAddNewReactions", "", "canAddNewBurstReactions", "addReactionLabel", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "onAddBurstReactionClick", "onReactionClick", "Lkotlin/Function1;", "onReactionLongPress", "theme", "Lcom/discord/theme/DiscordTheme;", "areChatAnimationsEnabled", "sortReactions", "Companion", "reactions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class ReactionsView extends RecyclerView {
    public static final Companion Companion = new Companion(null);
    private static final int REACTION_HEIGHT = SizeUtilsKt.getDpToPx(26);
    private static final Lazy<RecyclerView.RecycledViewPool> sharedViewPool$delegate;
    private final ReactionsViewAdapter adapter;

    @Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/reactions/ReactionsView$Companion;", "", "()V", "REACTION_HEIGHT", "", "sharedViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getSharedViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "sharedViewPool$delegate", "Lkotlin/Lazy;", "reactions_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RecyclerView.RecycledViewPool getSharedViewPool() {
            return (RecyclerView.RecycledViewPool) ReactionsView.sharedViewPool$delegate.getValue();
        }
    }

    static {
        Lazy<RecyclerView.RecycledViewPool> a;
        a = C11084n.m10945a(ReactionsView$Companion$sharedViewPool$2.INSTANCE);
        sharedViewPool$delegate = a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ ReactionsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setReactions$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setReactions$lambda$1(View view) {
    }

    public final void setReactions(String messageId, List<? extends ReactionView.Reaction> reactions, boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, View.OnClickListener onAddBurstReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, DiscordTheme discordTheme, boolean z3, boolean z4) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(reactions, "reactions");
        C9971q.m14633g(addReactionLabel, "addReactionLabel");
        C9971q.m14633g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9971q.m14633g(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        C9971q.m14633g(onAddReactionClick, "onAddReactionClick");
        C9971q.m14633g(onAddBurstReactionClick, "onAddBurstReactionClick");
        C9971q.m14633g(onReactionClick, "onReactionClick");
        C9971q.m14633g(onReactionLongPress, "onReactionLongPress");
        this.adapter.setReactions(messageId, ReactionsViewKt.separateAndSortDuplicateReactions(reactions, z4), z, z2, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, onAddReactionClick, onAddBurstReactionClick, onReactionClick, onReactionLongPress, discordTheme, z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        setLayoutManager(new FlexboxLayoutManager(context));
        ReactionsViewAdapter reactionsViewAdapter = new ReactionsViewAdapter(REACTION_HEIGHT);
        this.adapter = reactionsViewAdapter;
        setAdapter(reactionsViewAdapter);
        int dpToPx = SizeUtilsKt.getDpToPx(4);
        addItemDecoration(new HorizontalSpacingItemDecoration(dpToPx));
        addItemDecoration(new VerticalSpacingItemDecoration(dpToPx, 0, dpToPx, false, 10, null));
        setRecycledViewPool(Companion.getSharedViewPool());
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        DefaultItemAnimator defaultItemAnimator = null;
        if (itemAnimator != null) {
            defaultItemAnimator = (DefaultItemAnimator) (!(itemAnimator instanceof DefaultItemAnimator) ? null : itemAnimator);
        }
        C9971q.m14636d(defaultItemAnimator);
        defaultItemAnimator.setSupportsChangeAnimations(false);
    }
}
