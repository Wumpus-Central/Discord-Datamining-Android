package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked", "Lkotlin/Function1;", "onStickerLongClicked", "widthDp", "", "heightDp", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StickerPartViewHolder extends MessagePartViewHolder {
    public static final int DEFAULT_CHAT_STICKER_SIZE_DP = 160;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_STICKER_PADDING_PX = SizeUtilsKt.getDpToPx(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder$Companion;", "", "()V", "DEFAULT_CHAT_STICKER_SIZE_DP", "", "DEFAULT_STICKER_PADDING_PX", "getDEFAULT_STICKER_PADDING_PX", "()I", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_STICKER_PADDING_PX() {
            return StickerPartViewHolder.DEFAULT_STICKER_PADDING_PX;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPartViewHolder(View view) {
        super(view, null);
        q.g(view, "view");
        view.setLayoutParams(new RecyclerView.i(SizeUtilsKt.getDpToPx(160), SizeUtilsKt.getDpToPx(160)));
        int i10 = DEFAULT_STICKER_PADDING_PX;
        view.setPadding(i10, i10, i10, i10);
        RippleUtilsKt.addRipple$default(view, false, 0, 3, null);
    }

    public abstract void bind(Sticker sticker, Function1<? super Sticker, Unit> function1, Function1<? super Sticker, Unit> function12, int i10, int i11);
}
