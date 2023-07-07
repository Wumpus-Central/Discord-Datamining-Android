package com.discord.chat.input.plugins;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J*\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J*\u0010\u001a\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher;", "Landroid/text/TextWatcher;", "()V", "deleteEvent", "Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "getDeleteEvent", "()Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "setDeleteEvent", "(Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;)V", "ignoreUpdate", "", "getIgnoreUpdate", "()Z", "setIgnoreUpdate", "(Z)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "s", "", ViewProps.START, "", "count", "after", "onTextChanged", "before", "DeleteEvent", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteNodeOnBackspaceTextWatcher implements TextWatcher {
    private DeleteEvent deleteEvent;
    private boolean ignoreUpdate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "", ViewProps.START, "", ViewProps.END, "(II)V", "getEnd", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DeleteEvent {
        private final int end;
        private final int start;

        public DeleteEvent(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public static /* synthetic */ DeleteEvent copy$default(DeleteEvent deleteEvent, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = deleteEvent.start;
            }
            if ((i12 & 2) != 0) {
                i11 = deleteEvent.end;
            }
            return deleteEvent.copy(i10, i11);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final DeleteEvent copy(int i10, int i11) {
            return new DeleteEvent(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteEvent)) {
                return false;
            }
            DeleteEvent deleteEvent = (DeleteEvent) obj;
            return this.start == deleteEvent.start && this.end == deleteEvent.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.start * 31) + this.end;
        }

        public String toString() {
            int i10 = this.start;
            int i11 = this.end;
            return "DeleteEvent(start=" + i10 + ", end=" + i11 + ")";
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        DeleteEvent deleteEvent;
        if (!this.ignoreUpdate && editable != null && (deleteEvent = this.deleteEvent) != null) {
            this.ignoreUpdate = true;
            editable.delete(deleteEvent.getStart(), deleteEvent.getEnd());
            this.deleteEvent = null;
            this.ignoreUpdate = false;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Spanned spanned;
        boolean z10;
        DCDDeleteOnBackspaceSpan[] dCDDeleteOnBackspaceSpanArr;
        Integer num = null;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        if (!(this.ignoreUpdate || spanned == null)) {
            if (i11 - i12 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i13 = i12 + i10;
                int i14 = i10 + i11;
                Object[] spans = spanned.getSpans(i13, i14, DCDDeleteOnBackspaceSpan.class);
                if (spans == null) {
                    spans = new DCDDeleteOnBackspaceSpan[0];
                }
                Integer num2 = null;
                for (DCDDeleteOnBackspaceSpan dCDDeleteOnBackspaceSpan : (DCDDeleteOnBackspaceSpan[]) spans) {
                    int spanStart = spanned.getSpanStart(dCDDeleteOnBackspaceSpan);
                    int spanEnd = spanned.getSpanEnd(dCDDeleteOnBackspaceSpan);
                    if (num == null) {
                        num = Integer.valueOf(spanStart);
                    } else if (num.intValue() > spanStart) {
                        num = Integer.valueOf(spanStart);
                    }
                    if (num2 == null) {
                        num2 = Integer.valueOf(spanEnd);
                    } else if (num2.intValue() < spanEnd) {
                        num2 = Integer.valueOf(spanEnd);
                    }
                }
                if (!(num == null || num2 == null)) {
                    this.deleteEvent = new DeleteEvent(Math.min(num.intValue(), i13), Math.max(num2.intValue(), i14) - (i14 - i13));
                }
            }
        }
    }

    public final DeleteEvent getDeleteEvent() {
        return this.deleteEvent;
    }

    public final boolean getIgnoreUpdate() {
        return this.ignoreUpdate;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void setDeleteEvent(DeleteEvent deleteEvent) {
        this.deleteEvent = deleteEvent;
    }

    public final void setIgnoreUpdate(boolean z10) {
        this.ignoreUpdate = z10;
    }
}
