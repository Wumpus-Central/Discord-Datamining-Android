package com.discord.bundle_updater;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdater$otasRootDirectory$2 extends s implements Function0<File> {
    final /* synthetic */ BundleUpdater this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdater$otasRootDirectory$2(BundleUpdater bundleUpdater) {
        super(0);
        this.this$0 = bundleUpdater;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File file;
        file = this.this$0.filesDirectory;
        return new File(file.getAbsolutePath(), "otas");
    }
}
