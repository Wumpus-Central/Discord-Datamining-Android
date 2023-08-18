package com.discord.chat.listmanager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation;", "", "()V", "Change", "ChangeRange", "Insert", "InsertRange", "Remove", "RemoveRange", "Lcom/discord/chat/listmanager/ListOperation$Change;", "Lcom/discord/chat/listmanager/ListOperation$ChangeRange;", "Lcom/discord/chat/listmanager/ListOperation$Insert;", "Lcom/discord/chat/listmanager/ListOperation$InsertRange;", "Lcom/discord/chat/listmanager/ListOperation$Remove;", "Lcom/discord/chat/listmanager/ListOperation$RemoveRange;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class ListOperation {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$Change;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Change extends ListOperation {
        private final int index;

        public Change(int i10) {
            super(null);
            this.index = i10;
        }

        public static  Change copy$default(Change change, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = change.index;
            }
            return change.copy(i10);
        }

        public final int component1() {
            return this.index;
        }

        public final Change copy(int i10) {
            return new Change(i10);
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
            int i10 = this.index;
            return "Change(index=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$ChangeRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class ChangeRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        
        public ChangeRange(IntRange range) {
            super(null);
            q.h(range, "range");
            this.range = range;
            this.first = range.a();
            this.last = range.h();
            this.count = (range.h() - range.a()) + 1;
        }

        public static  ChangeRange copy$default(ChangeRange changeRange, IntRange intRange, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intRange = changeRange.range;
            }
            return changeRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final ChangeRange copy(IntRange range) {
            q.h(range, "range");
            return new ChangeRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRange) && q.c(this.range, ((ChangeRange) obj).range);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$Insert;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Insert extends ListOperation {
        private final int index;

        public Insert(int i10) {
            super(null);
            this.index = i10;
        }

        public static  Insert copy$default(Insert insert, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = insert.index;
            }
            return insert.copy(i10);
        }

        public final int component1() {
            return this.index;
        }

        public final Insert copy(int i10) {
            return new Insert(i10);
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
            int i10 = this.index;
            return "Insert(index=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$InsertRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class InsertRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        
        public InsertRange(IntRange range) {
            super(null);
            q.h(range, "range");
            this.range = range;
            this.first = range.a();
            this.last = range.h();
            this.count = (range.h() - range.a()) + 1;
        }

        public static  InsertRange copy$default(InsertRange insertRange, IntRange intRange, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intRange = insertRange.range;
            }
            return insertRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final InsertRange copy(IntRange range) {
            q.h(range, "range");
            return new InsertRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InsertRange) && q.c(this.range, ((InsertRange) obj).range);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$Remove;", "Lcom/discord/chat/listmanager/ListOperation;", "index", "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Remove extends ListOperation {
        private final int index;

        public Remove(int i10) {
            super(null);
            this.index = i10;
        }

        public static  Remove copy$default(Remove remove, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = remove.index;
            }
            return remove.copy(i10);
        }

        public final int component1() {
            return this.index;
        }

        public final Remove copy(int i10) {
            return new Remove(i10);
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
            int i10 = this.index;
            return "Remove(index=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/listmanager/ListOperation$RemoveRange;", "Lcom/discord/chat/listmanager/ListOperation;", "range", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "count", "", "getCount", "()I", "first", "getFirst", "last", "getLast", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class RemoveRange extends ListOperation {
        private final int count;
        private final int first;
        private final int last;
        private final IntRange range;

        
        public RemoveRange(IntRange range) {
            super(null);
            q.h(range, "range");
            this.range = range;
            this.first = range.a();
            this.last = range.h();
            this.count = (range.h() - range.a()) + 1;
        }

        public static  RemoveRange copy$default(RemoveRange removeRange, IntRange intRange, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intRange = removeRange.range;
            }
            return removeRange.copy(intRange);
        }

        public final IntRange component1() {
            return this.range;
        }

        public final RemoveRange copy(IntRange range) {
            q.h(range, "range");
            return new RemoveRange(range);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveRange) && q.c(this.range, ((RemoveRange) obj).range);
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

    public  ListOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
