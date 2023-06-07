package com.discord.file_downloader;

import com.facebook.react.util.JSStackTrace;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/discord/file_downloader/DownloadState;", "", "()V", "Completed", "Failure", "InProgress", "Lcom/discord/file_downloader/DownloadState$Completed;", "Lcom/discord/file_downloader/DownloadState$Failure;", "Lcom/discord/file_downloader/DownloadState$InProgress;", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DownloadState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/discord/file_downloader/DownloadState$Completed;", "Lcom/discord/file_downloader/DownloadState;", JSStackTrace.FILE_KEY, "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Completed extends DownloadState {
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(File file) {
            super(null);
            q.g(file, "file");
            this.file = file;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, File file, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                file = completed.file;
            }
            return completed.copy(file);
        }

        public final File component1() {
            return this.file;
        }

        public final Completed copy(File file) {
            q.g(file, "file");
            return new Completed(file);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && q.b(this.file, ((Completed) obj).file);
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            File file = this.file;
            return "Completed(file=" + file + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/file_downloader/DownloadState$Failure;", "Lcom/discord/file_downloader/DownloadState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failure extends DownloadState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Exception exception) {
            super(null);
            q.g(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = failure.exception;
            }
            return failure.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Failure copy(Exception exception) {
            q.g(exception, "exception");
            return new Failure(exception);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && q.b(this.exception, ((Failure) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            Exception exc = this.exception;
            return "Failure(exception=" + exc + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/file_downloader/DownloadState$InProgress;", "Lcom/discord/file_downloader/DownloadState;", "()V", "file_downloader_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class InProgress extends DownloadState {
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super(null);
        }
    }

    private DownloadState() {
    }

    public /* synthetic */ DownloadState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
