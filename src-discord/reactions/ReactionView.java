package com.discord.reactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.emoji.RenderableEmoji;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.reactions.BurstReactionView;
import com.discord.reactions.databinding.ReactionViewBinding;
import com.discord.recycler_view.ids.IdUtilsKt;
import com.discord.recycler_view.utils.ItemDiffableType;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001d\u001e\u001f B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006!"}, d2 = {"Lcom/discord/reactions/ReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/ReactionViewBinding;", "currentCount", "", "Ljava/lang/Integer;", "currentEmojiId", "", "currentShouldAnimate", "", "Ljava/lang/Boolean;", "configureBackground", "", "isMe", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "configureCount", "count", "animate", "configureTextColor", "setReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "Companion", "Emoji", "Reaction", "ReactionsTheme", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactionView extends LinearLayout {
    private final ReactionViewBinding binding;
    private Integer currentCount;
    private String currentEmojiId;
    private Boolean currentShouldAnimate;
    public static final Companion Companion = new Companion(null);
    private static final int STROKE_WIDTH = SizeUtilsKt.getDpToPx(1);
    private static final int MINIMUM_WIDTH = SizeUtilsKt.getDpToPx(40);
    private static final int HORIZ_PADDING = SizeUtilsKt.getDpToPx(6);
    private static final int EMOJI_SIZE = SizeUtilsKt.getDpToPx(16);
    private static final int CORNER_RADIUS = SizeUtilsKt.getDpToPx(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/discord/reactions/ReactionView$Companion;", "", "()V", "CORNER_RADIUS", "", "getCORNER_RADIUS", "()I", "EMOJI_SIZE", "getEMOJI_SIZE", "HORIZ_PADDING", "getHORIZ_PADDING", "MINIMUM_WIDTH", "getMINIMUM_WIDTH", "STROKE_WIDTH", "getSTROKE_WIDTH", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCORNER_RADIUS() {
            return ReactionView.CORNER_RADIUS;
        }

        public final int getEMOJI_SIZE() {
            return ReactionView.EMOJI_SIZE;
        }

        public final int getHORIZ_PADDING() {
            return ReactionView.HORIZ_PADDING;
        }

        public final int getMINIMUM_WIDTH() {
            return ReactionView.MINIMUM_WIDTH;
        }

        public final int getSTROKE_WIDTH() {
            return ReactionView.STROKE_WIDTH;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/discord/reactions/ReactionView$Emoji;", "", "animated", "", "getAnimated", "()Ljava/lang/Boolean;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "emojiId", "getEmojiId", "id", "getId", ZeroconfModule.KEY_SERVICE_NAME, "getName", "shouldAnimate", "getShouldAnimate", "()Z", "src", "getSrc", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface Emoji {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class DefaultImpls {
            public static String getEmojiId(Emoji emoji) {
                String id2 = emoji.getId();
                return id2 == null ? emoji.getName() : id2;
            }

            public static boolean getShouldAnimate(Emoji emoji) {
                Boolean animated = emoji.getAnimated();
                if (animated != null) {
                    return animated.booleanValue();
                }
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                r0 = nj.t.o(r0);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static com.discord.emoji.RenderableEmoji renderable(com.discord.reactions.ReactionView.Emoji r5) {
                /*
                    java.lang.String r0 = r5.getId()
                    if (r0 == 0) goto L_0x0021
                    java.lang.Long r0 = nj.l.o(r0)
                    if (r0 == 0) goto L_0x0021
                    long r0 = r0.longValue()
                    com.discord.emoji.RenderableEmoji$Companion r2 = com.discord.emoji.RenderableEmoji.Companion
                    boolean r3 = r5.getShouldAnimate()
                    java.lang.String r4 = r5.getDisplayName()
                    com.discord.emoji.RenderableEmoji$CustomWithEmojiId r0 = r2.customWithEmojiId(r0, r3, r4)
                    if (r0 == 0) goto L_0x0021
                    goto L_0x002f
                L_0x0021:
                    com.discord.emoji.RenderableEmoji$Companion r0 = com.discord.emoji.RenderableEmoji.Companion
                    java.lang.String r5 = r5.getName()
                    if (r5 != 0) goto L_0x002b
                    java.lang.String r5 = ""
                L_0x002b:
                    com.discord.emoji.RenderableEmoji$Unicode r0 = r0.unicode(r5)
                L_0x002f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.ReactionView.Emoji.DefaultImpls.renderable(com.discord.reactions.ReactionView$Emoji):com.discord.emoji.RenderableEmoji");
            }
        }

        Boolean getAnimated();

        String getDisplayName();

        String getEmojiId();

        String getId();

        String getName();

        boolean getShouldAnimate();

        String getSrc();

        RenderableEmoji renderable();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/discord/reactions/ReactionView$Reaction;", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "burstCount", "", "getBurstCount", "()I", "count", "getCount", "emoji", "Lcom/discord/reactions/ReactionView$Emoji;", "getEmoji", "()Lcom/discord/reactions/ReactionView$Emoji;", "isMe", "", "()Z", "isMeBurst", "itemId", "", "getItemId", "()Ljava/lang/Long;", "themedBurstColors", "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "getThemedBurstColors", "()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "isBurstReaction", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface Reaction extends ItemDiffableType {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class DefaultImpls {
            public static Long getItemId(Reaction reaction) {
                String emojiId = reaction.getEmoji().getEmojiId();
                boolean isBurstReaction = reaction.isBurstReaction();
                return Long.valueOf(IdUtilsKt.convertToId(emojiId + "_" + isBurstReaction));
            }

            public static boolean isBurstReaction(Reaction reaction) {
                return reaction.getBurstCount() > 0;
            }
        }

        int getBurstCount();

        int getCount();

        Emoji getEmoji();

        @Override // com.discord.recycler_view.utils.ItemDiffableType
        Long getItemId();

        BurstReactionView.ThemedBurstColorPalette getThemedBurstColors();

        boolean isBurstReaction();

        boolean isMe();

        boolean isMeBurst();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/discord/reactions/ReactionView$ReactionsTheme;", "", "activeReactionBackgroundColor", "", "getActiveReactionBackgroundColor", "()Ljava/lang/Integer;", "activeReactionBorderColor", "getActiveReactionBorderColor", "activeReactionTextColor", "getActiveReactionTextColor", "reactionBackgroundColor", "getReactionBackgroundColor", "reactionBorderColor", "getReactionBorderColor", "reactionTextColor", "getReactionTextColor", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface ReactionsTheme {
        Integer getActiveReactionBackgroundColor();

        Integer getActiveReactionBorderColor();

        Integer getActiveReactionTextColor();

        Integer getReactionBackgroundColor();

        Integer getReactionBorderColor();

        Integer getReactionTextColor();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ ReactionView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void configureBackground(boolean z10, ReactionsTheme reactionsTheme) {
        int i10;
        Integer num;
        Integer reactionBackgroundColor;
        int i11;
        int i12;
        Integer activeReactionBorderColor;
        Integer activeReactionBackgroundColor;
        if (z10) {
            if (reactionsTheme == null || (activeReactionBackgroundColor = reactionsTheme.getActiveReactionBackgroundColor()) == null) {
                Context context = getContext();
                q.f(context, "context");
                i11 = ColorUtilsKt.getColorCompat(context, R.color.brand_new_500_alpha_20);
            } else {
                i11 = activeReactionBackgroundColor.intValue();
            }
            int i13 = CORNER_RADIUS;
            if (reactionsTheme == null || (activeReactionBorderColor = reactionsTheme.getActiveReactionBorderColor()) == null) {
                Context context2 = getContext();
                q.f(context2, "context");
                i12 = ColorUtilsKt.getColorCompat(context2, R.color.brand_560);
            } else {
                i12 = activeReactionBorderColor.intValue();
            }
            ViewBackgroundUtilsKt.setBackgroundRectangle(this, i11, i13, Integer.valueOf(i12), STROKE_WIDTH);
            return;
        }
        if (reactionsTheme == null || (reactionBackgroundColor = reactionsTheme.getReactionBackgroundColor()) == null) {
            i10 = ThemeManagerKt.getTheme().getBackgroundSecondary();
        } else {
            i10 = reactionBackgroundColor.intValue();
        }
        if (reactionsTheme != null) {
            num = reactionsTheme.getReactionBorderColor();
        } else {
            num = null;
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, i10, CORNER_RADIUS, num, STROKE_WIDTH);
    }

    private final void configureCount(int i10, boolean z10) {
        int i11;
        TextSwitcher textSwitcher = this.binding.reactionCountSwitcher;
        if (z10) {
            Integer num = this.currentCount;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            if (i10 > i11) {
                textSwitcher.setInAnimation(textSwitcher.getContext(), R.anim.anim_slide_in_up);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), R.anim.anim_slide_out_up);
            } else {
                textSwitcher.setInAnimation(textSwitcher.getContext(), R.anim.anim_slide_in_down);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), R.anim.anim_slide_out_down);
            }
            textSwitcher.setText(String.valueOf(i10));
        } else {
            textSwitcher.setCurrentText(String.valueOf(i10));
        }
        this.currentCount = Integer.valueOf(i10);
    }

    private final void configureTextColor(boolean z10, ReactionsTheme reactionsTheme) {
        int i10;
        Integer reactionTextColor;
        Integer activeReactionTextColor;
        if (z10) {
            if (reactionsTheme == null || (activeReactionTextColor = reactionsTheme.getActiveReactionTextColor()) == null) {
                i10 = ThemeManagerKt.getTheme().getInteractiveActive();
            } else {
                i10 = activeReactionTextColor.intValue();
            }
        } else if (reactionsTheme == null || (reactionTextColor = reactionsTheme.getReactionTextColor()) == null) {
            i10 = ThemeManagerKt.getTheme().getInteractiveNormal();
        } else {
            i10 = reactionTextColor.intValue();
        }
        this.binding.reactionEmoji.setTextColor(i10);
        this.binding.reactionCount1.setTextColor(i10);
        this.binding.reactionCount2.setTextColor(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r4 != r5.intValue()) goto L_0x005a;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setReaction(com.discord.reactions.ReactionView.Reaction r10, com.discord.reactions.ReactionView.ReactionsTheme r11) {
        /*
            r9 = this;
            java.lang.String r0 = "reaction"
            kotlin.jvm.internal.q.g(r10, r0)
            com.discord.reactions.databinding.ReactionViewBinding r0 = r9.binding
            android.view.View r0 = r0.getRoot()
            com.discord.reactions.ReactionView$Emoji r1 = r10.getEmoji()
            java.lang.String r1 = r1.getDisplayName()
            r0.setContentDescription(r1)
            java.lang.String r0 = r9.currentEmojiId
            com.discord.reactions.ReactionView$Emoji r1 = r10.getEmoji()
            java.lang.String r1 = r1.getEmojiId()
            boolean r0 = kotlin.jvm.internal.q.b(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Boolean r0 = r9.currentShouldAnimate
            com.discord.reactions.ReactionView$Emoji r3 = r10.getEmoji()
            boolean r3 = r3.getShouldAnimate()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.q.b(r0, r3)
            if (r0 == 0) goto L_0x003e
            r0 = r1
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            int r3 = r10.getCount()
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r4 = r9.currentCount
            if (r4 == 0) goto L_0x0059
            int r4 = r10.getCount()
            java.lang.Integer r5 = r9.currentCount
            if (r5 != 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            int r5 = r5.intValue()
            if (r4 == r5) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            r9.configureCount(r3, r1)
            boolean r1 = r10.isMe()
            r9.configureBackground(r1, r11)
            boolean r1 = r10.isMe()
            r9.configureTextColor(r1, r11)
            com.discord.reactions.ReactionView$Emoji r11 = r10.getEmoji()
            boolean r11 = r11.getShouldAnimate()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r9.currentShouldAnimate = r11
            if (r0 == 0) goto L_0x007c
            return
        L_0x007c:
            com.discord.reactions.databinding.ReactionViewBinding r11 = r9.binding
            com.facebook.drawee.span.SimpleDraweeSpanTextView r11 = r11.reactionEmoji
            com.discord.reactions.ReactionView$Emoji r0 = r10.getEmoji()
            com.discord.emoji.RenderableEmoji r1 = r0.renderable()
            android.content.Context r2 = r9.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.f(r2, r0)
            int r3 = com.discord.reactions.ReactionView.EMOJI_SIZE
            com.discord.reactions.ReactionView$Emoji r0 = r10.getEmoji()
            boolean r4 = r0.getShouldAnimate()
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            com.facebook.drawee.span.DraweeSpanStringBuilder r0 = com.discord.emoji.RenderableEmojiKt.renderEmoji$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.setDraweeSpanStringBuilder(r0)
            com.discord.reactions.ReactionView$Emoji r10 = r10.getEmoji()
            java.lang.String r10 = r10.getEmojiId()
            r9.currentEmojiId = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.ReactionView.setReaction(com.discord.reactions.ReactionView$Reaction, com.discord.reactions.ReactionView$ReactionsTheme):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        ReactionViewBinding inflate = ReactionViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        setOrientation(0);
        setGravity(16);
        setMinimumWidth(MINIMUM_WIDTH);
        int i10 = HORIZ_PADDING;
        setPadding(i10, 0, i10, 0);
        TextView textView = inflate.reactionCount1;
        q.f(textView, "binding.reactionCount1");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.reactionCount1;
        q.f(textView2, "binding.reactionCount1");
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f, 14.0f);
        TextView textView3 = inflate.reactionCount2;
        q.f(textView3, "binding.reactionCount2");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.reactionCount2;
        q.f(textView4, "binding.reactionCount2");
        SetTextSizeSpKt.setTextSizeSp(textView4, 14.0f, 14.0f);
        inflate.reactionCountSwitcher.setMeasureAllChildren(false);
    }
}
