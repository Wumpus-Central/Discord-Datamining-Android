package com.discord.chat.listmanager;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation;", "", "()V", "Change", "ChangeRange", "Insert", "InsertRange", "Remove", "RemoveRange", "Lcom/discord/chat/listmanager/ListOperation$Change;", "Lcom/discord/chat/listmanager/ListOperation$ChangeRange;", "Lcom/discord/chat/listmanager/ListOperation$Insert;", "Lcom/discord/chat/listmanager/ListOperation$InsertRange;", "Lcom/discord/chat/listmanager/ListOperation$Remove;", "Lcom/discord/chat/listmanager/ListOperation$RemoveRange;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public abstract class ListOperation {

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$Change;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Change extends ListOperation {
        private final int index;

        public Change(int i) {
            super(null);
            this.index = i;
        }

        public static /* synthetic */ Change copy$default(Change change, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = change.index;
            }
            return change.copy(i);
        }

        public final int component1() {
            return this.index;
        }

        public final Change copy(int i) {
            return new Change(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Change) && this.index == ((Change) obj).index;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.index;
        }

        public String toString() {
            int i = this.index;
            return "Change(index=" + i + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$ChangeRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class ChangeRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeRange(IntRange range) {
            super(null);
            C9677q.m14633g(range, "range");
            this.range = range;
            this.first = range.m14605a();
            this.last = range.m14604b();
            this.count = (range.m14604b() - range.m14605a()) + 1;
        }

        public static /* synthetic */ ChangeRange copy$default(ChangeRange changeRange, IntRange intRange, int i, Object obj) {
            if ((i & 1) != 0) {
                intRange = changeRange.range;
            }
            return changeRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final ChangeRange copy(IntRange range) {
            C9677q.m14633g(range, "range");
            return new ChangeRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRange) && C9677q.m14638b(this.range, ((ChangeRange) obj).range);
        }

        public final int getCount() {
            return this.count;
        }

        public final int getFirst() {
            return this.first;
        }

        public final int getLast() {
            return this.last;
        }

        public final IntRange getRange() {
            return this.range;
        }

        public int hashCode() {
            return this.range.hashCode();
        }

        public String toString() {
            IntRange intRange = this.range;
            return "ChangeRange(range=" + intRange + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$Insert;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Insert extends ListOperation {
        private final int index;

        public Insert(int i) {
            super(null);
            this.index = i;
        }

        public static /* synthetic */ Insert copy$default(Insert insert, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = insert.index;
            }
            return insert.copy(i);
        }

        public final int component1() {
            return this.index;
        }

        public final Insert copy(int i) {
            return new Insert(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Insert) && this.index == ((Insert) obj).index;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.index;
        }

        public String toString() {
            int i = this.index;
            return "Insert(index=" + i + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$InsertRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class InsertRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsertRange(IntRange range) {
            super(null);
            C9677q.m14633g(range, "range");
            this.range = range;
            this.first = range.m14605a();
            this.last = range.m14604b();
            this.count = (range.m14604b() - range.m14605a()) + 1;
        }

        public static /* synthetic */ InsertRange copy$default(InsertRange insertRange, IntRange intRange, int i, Object obj) {
            if ((i & 1) != 0) {
                intRange = insertRange.range;
            }
            return insertRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final InsertRange copy(IntRange range) {
            C9677q.m14633g(range, "range");
            return new InsertRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InsertRange) && C9677q.m14638b(this.range, ((InsertRange) obj).range);
        }

        public final int getCount() {
            return this.count;
        }

        public final int getFirst() {
            return this.first;
        }

        public final int getLast() {
            return this.last;
        }

        public final IntRange getRange() {
            return this.range;
        }

        public int hashCode() {
            return this.range.hashCode();
        }

        public String toString() {
            IntRange intRange = this.range;
            return "InsertRange(range=" + intRange + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$Remove;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Remove extends ListOperation {
        private final int index;

        public Remove(int i) {
            super(null);
            this.index = i;
        }

        public static /* synthetic */ Remove copy$default(Remove remove, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = remove.index;
            }
            return remove.copy(i);
        }

        public final int component1() {
            return this.index;
        }

        public final Remove copy(int i) {
            return new Remove(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remove) && this.index == ((Remove) obj).index;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.index;
        }

        public String toString() {
            int i = this.index;
            return "Remove(index=" + i + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/listmanager/ListOperation$RemoveRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class RemoveRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveRange(IntRange range) {
            super(null);
            C9677q.m14633g(range, "range");
            this.range = range;
            this.first = range.m14605a();
            this.last = range.m14604b();
            this.count = (range.m14604b() - range.m14605a()) + 1;
        }

        public static /* synthetic */ RemoveRange copy$default(RemoveRange removeRange, IntRange intRange, int i, Object obj) {
            if ((i & 1) != 0) {
                intRange = removeRange.range;
            }
            return removeRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final RemoveRange copy(IntRange range) {
            C9677q.m14633g(range, "range");
            return new RemoveRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveRange) && C9677q.m14638b(this.range, ((RemoveRange) obj).range);
        }

        public final int getCount() {
            return this.count;
        }

        public final int getFirst() {
            return this.first;
        }

        public final int getLast() {
            return this.last;
        }

        public final IntRange getRange() {
            return this.range;
        }

        public int hashCode() {
            return this.range.hashCode();
        }

        public String toString() {
            IntRange intRange = this.range;
            return "RemoveRange(range=" + intRange + ")";
        }
    }

    private ListOperation() {
    }

    public /* synthetic */ ListOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
