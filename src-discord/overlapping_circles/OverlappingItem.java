package com.discord.overlapping_circles;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingItem;", "", "imageUri", "", "(Ljava/lang/String;)V", "getImageUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "overlapping_circles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlappingItem {
    private final String imageUri;

    public OverlappingItem(String str) {
        this.imageUri = str;
    }

    public static /* synthetic */ OverlappingItem copy$default(OverlappingItem overlappingItem, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = overlappingItem.imageUri;
        }
        return overlappingItem.copy(str);
    }

    public final String component1() {
        return this.imageUri;
    }

    public final OverlappingItem copy(String str) {
        return new OverlappingItem(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverlappingItem) && q.b(this.imageUri, ((OverlappingItem) obj).imageUri);
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public int hashCode() {
        String str = this.imageUri;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.imageUri;
        return "OverlappingItem(imageUri=" + str + ")";
    }
}
