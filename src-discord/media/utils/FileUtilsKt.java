package com.discord.media.utils;

import bk.m;
import bk.n;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"writeTo", "Ljava/io/File;", "Ljava/io/InputStream;", "outputFile", "media_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class FileUtilsKt {
    public static final File writeTo(InputStream inputStream, File outputFile) {
        q.h(inputStream, "<this>");
        q.h(outputFile, "outputFile");
        th = null;
        try {
            m.c(n.g(outputFile, false, 1, th)).N(m.l(inputStream));
            Unit unit = Unit.f21436a;
            return outputFile;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
