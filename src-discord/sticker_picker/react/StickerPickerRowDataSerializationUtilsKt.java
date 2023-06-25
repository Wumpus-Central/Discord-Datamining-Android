package com.discord.sticker_picker.react;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.sticker_picker.StickerPickerRow;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import hf.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"deserializeStickerPickerRowData", "Lcom/discord/sticker_picker/StickerPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "sticker_picker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickerPickerRowDataSerializationUtilsKt {
    public static final StickerPickerRow deserializeStickerPickerRowData(ReadableMap data) {
        int s10;
        StickerPickerRow.Sticker sticker;
        StickerPickerRow.Sticker.Type type;
        q.g(data, "data");
        int i10 = data.getInt("rowContentWidth");
        int i11 = data.getInt("rowContentPaddingVertical");
        int i12 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, "items");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        s10 = k.s(sizeRange, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((p) it).nextInt();
            if (!nonNullArray.isNull(nextInt)) {
                ReadableMap stickerRow = nonNullArray.getMap(nextInt);
                q.f(stickerRow, "stickerRow");
                String nonNullString = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerId");
                String nonNullString2 = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerName");
                int i13 = stickerRow.getInt("stickerType");
                if (i13 == 1) {
                    type = StickerPickerRow.Sticker.Type.PNG;
                } else if (i13 == 2) {
                    type = StickerPickerRow.Sticker.Type.APNG;
                } else if (i13 == 3) {
                    type = StickerPickerRow.Sticker.Type.LOTTIE;
                } else if (i13 == 4) {
                    type = StickerPickerRow.Sticker.Type.GIF;
                } else {
                    throw new IllegalArgumentException("Unknown type " + i13);
                }
                sticker = new StickerPickerRow.Sticker(nonNullString, nonNullString2, type, stickerRow.getBoolean("stickerAnimated"), NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerUrl"), stickerRow.getBoolean("stickerDisabled"), stickerRow.getBoolean("stickerOpaque"));
            } else {
                sticker = null;
            }
            arrayList.add(sticker);
        }
        return new StickerPickerRow(i10, i11, i12, arrayList);
    }
}
