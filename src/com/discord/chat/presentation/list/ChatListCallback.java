package com.discord.chat.presentation.list;

import android.graphics.Canvas;
import android.util.Pair;
import androidx.core.view.C2733w0;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListItemTouchHelper;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class ChatListCallback extends ItemTouchHelper.AbstractC3083c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), C2733w0.m37063B(recyclerView));
    }

    public Pair getEffectiveDxDy(float f, float f2) {
        return new Pair(Float.valueOf(f), Float.valueOf(f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i, float f, float f2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
            recoverAnimation.update();
            int save = canvas.save();
            onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.f36274mX, recoverAnimation.f36275mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i, float f, float f2) {
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
            int save = canvas.save();
            onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.f36274mX, recoverAnimation.f36275mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation2 = list.get(i3);
            boolean z2 = recoverAnimation2.mEnded;
            if (z2 && !recoverAnimation2.mIsPendingCleanup) {
                list.remove(i3);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
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
