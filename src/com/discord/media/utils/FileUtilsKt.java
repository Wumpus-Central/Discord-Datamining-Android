package com.discord.media.utils;

import fk.C6824m;
import fk.C6825n;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m15073d2 = {"writeTo", "Ljava/io/File;", "Ljava/io/InputStream;", "outputFile", "media_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class FileUtilsKt {
    public static final File writeTo(InputStream inputStream, File outputFile) {
        C9677q.m14633g(inputStream, "<this>");
        C9677q.m14633g(outputFile, "outputFile");
        th = null;
        try {
            C6824m.m22820c(C6825n.m22803g(outputFile, false, 1, th)).mo9748N(C6824m.m22811l(inputStream));
            Unit unit = Unit.f25780a;
            return outputFile;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
