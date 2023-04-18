.class public final synthetic Lcom/linecorp/apng/decoder/ApngException$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->values()[Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/linecorp/apng/decoder/ApngException$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_STREAM_READ_FAIL:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_UNEXPECTED_EOF:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_INVALID_FILE_FORMAT:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_NOT_EXIST_IMAGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_FRAME_INDEX_OUT_OF_RANGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_OUT_OF_MEMORY:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_BITMAP_OPERATION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_UNSUPPORTED_TYPE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_WITH_CHILD_EXCEPTION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1

    return-void
.end method
