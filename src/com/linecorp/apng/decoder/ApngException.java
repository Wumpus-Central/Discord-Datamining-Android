package com.linecorp.apng.decoder;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001d\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m15073d2 = {"Lcom/linecorp/apng/decoder/ApngException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "k", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "getErrorCode", "()Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "errorCode", "", "getMessage", "()Ljava/lang/String;", "message", "", "throwable", "<init>", "(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "ErrorCode", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ApngException extends Exception {

    /* renamed from: k */
    private final ErrorCode f12153k;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m15073d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "", "", "k", "I", "getErrorCode", "()I", "errorCode", "<init>", "(Ljava/lang/String;II)V", "Companion", "ERR_STREAM_READ_FAIL", "ERR_UNEXPECTED_EOF", "ERR_INVALID_FILE_FORMAT", "ERR_NOT_EXIST_IMAGE", "ERR_FRAME_INDEX_OUT_OF_RANGE", "ERR_OUT_OF_MEMORY", "ERR_BITMAP_OPERATION", "ERR_UNSUPPORTED_TYPE", "ERR_WITH_CHILD_EXCEPTION", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public enum ErrorCode {
        ERR_STREAM_READ_FAIL(-100),
        ERR_UNEXPECTED_EOF(-101),
        ERR_INVALID_FILE_FORMAT(-102),
        ERR_NOT_EXIST_IMAGE(-103),
        ERR_FRAME_INDEX_OUT_OF_RANGE(-104),
        ERR_OUT_OF_MEMORY(-105),
        ERR_BITMAP_OPERATION(-106),
        ERR_UNSUPPORTED_TYPE(-107),
        ERR_WITH_CHILD_EXCEPTION(-200);
        
        public static final Companion Companion = new Companion(null);

        /* renamed from: k */
        private final int f12155k;

        @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m15073d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;", "", "()V", "fromErrorCode", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "errorCode", "", "fromErrorCode$apng_drawable_release", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorCode fromErrorCode$apng_drawable_release(int i) {
                ErrorCode[] values;
                boolean z;
                for (ErrorCode errorCode : ErrorCode.values()) {
                    if (errorCode.getErrorCode() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return errorCode;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        ErrorCode(int i) {
            this.f12155k = i;
        }

        public final int getErrorCode() {
            return this.f12155k;
        }
    }

    @Metadata(m15075bv = {1, 0, 3}, m15072k = 3, m15071mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ErrorCode.ERR_STREAM_READ_FAIL.ordinal()] = 1;
            iArr[ErrorCode.ERR_UNEXPECTED_EOF.ordinal()] = 2;
            iArr[ErrorCode.ERR_INVALID_FILE_FORMAT.ordinal()] = 3;
            iArr[ErrorCode.ERR_NOT_EXIST_IMAGE.ordinal()] = 4;
            iArr[ErrorCode.ERR_FRAME_INDEX_OUT_OF_RANGE.ordinal()] = 5;
            iArr[ErrorCode.ERR_OUT_OF_MEMORY.ordinal()] = 6;
            iArr[ErrorCode.ERR_BITMAP_OPERATION.ordinal()] = 7;
            iArr[ErrorCode.ERR_UNSUPPORTED_TYPE.ordinal()] = 8;
            iArr[ErrorCode.ERR_WITH_CHILD_EXCEPTION.ordinal()] = 9;
        }
    }

    public /* synthetic */ ApngException(ErrorCode errorCode, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, (i & 2) != 0 ? null : th2);
    }

    public final ErrorCode getErrorCode() {
        return this.f12153k;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        switch (WhenMappings.$EnumSwitchMapping$0[this.f12153k.ordinal()]) {
            case 1:
                return "Can't read the stream.";
            case 2:
                return "Unexpected end of file.";
            case 3:
                return "Invalid file format.";
            case 4:
                return "Not exist native image.";
            case 5:
                return "Frame index is out of range.";
            case 6:
                return "Out of memory";
            case 7:
                return "Error in the native bitmap operation.";
            case 8:
                return "Unsupported image type.";
            case 9:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed with sub exception : ");
                Throwable cause = getCause();
                if (cause != null) {
                    str = cause.getMessage();
                } else {
                    str = null;
                }
                sb2.append(str);
                return sb2.toString();
            default:
                throw new C11088q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApngException(ErrorCode errorCode, Throwable th2) {
        super(th2);
        C9971q.m14633g(errorCode, "errorCode");
        this.f12153k = errorCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApngException(Throwable throwable) {
        this(ErrorCode.ERR_WITH_CHILD_EXCEPTION, throwable);
        C9971q.m14633g(throwable, "throwable");
    }
}
