package com.discord.chat.presentation.list;

import android.graphics.Canvas;
import android.util.Pair;
import androidx.core.view.w0;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListItemTouchHelper;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class ChatListCallback extends ItemTouchHelper.c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), w0.B(recyclerView));
    }

    public Pair getEffectiveDxDy(float f10, float f11) {
        return new Pair(Float.valueOf(f10), Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i10, float f10, float f11) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i11);
            recoverAnimation.update();
            int save = canvas.save();
            onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i10, float f10, float f11) {
        int size = list.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i11);
            int save = canvas.save();
            onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, viewHolder, f10, f11, i10, true);
            canvas.restoreToCount(save2);
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation2 = list.get(i12);
            boolean z11 = recoverAnimation2.mEnded;
            if (z11 && !recoverAnimation2.mIsPendingCleanup) {
                list.remove(i12);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public abstract void onReleased(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

    public boolean shouldReturnToOriginalPosition() {
        return false;
    }

    public boolean shouldUseSpringyExit() {
        return false;
    }
}
