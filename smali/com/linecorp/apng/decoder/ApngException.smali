.class public final Lcom/linecorp/apng/decoder/ApngException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linecorp/apng/decoder/ApngException$ErrorCode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001d\u0008\u0000\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0011\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0011R\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/linecorp/apng/decoder/ApngException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;",
        "k",
        "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;",
        "getErrorCode",
        "()Lcom/linecorp/apng/decoder/ApngException$ErrorCode;",
        "errorCode",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "",
        "throwable",
        "<init>",
        "(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V",
        "(Ljava/lang/Throwable;)V",
        "ErrorCode",
        "apng-drawable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# instance fields
.field private final k:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;


# direct methods
.method public constructor <init>(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/linecorp/apng/decoder/ApngException;->k:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_WITH_CHILD_EXCEPTION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-direct {p0, v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getErrorCode()Lcom/linecorp/apng/decoder/ApngException$ErrorCode;
    .locals 1

    iget-object v0, p0, Lcom/linecorp/apng/decoder/ApngException;->k:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/linecorp/apng/decoder/ApngException;->k:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 2
    .line 3
    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Llf/q;

    .line 15
    .line 16
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Failed with sub exception : "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_1

    .line 50
    :pswitch_1
    const-string v0, "Unsupported image type."

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_2
    const-string v0, "Error in the native bitmap operation."

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_3
    const-string v0, "Out of memory"

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_4
    const-string v0, "Frame index is out of range."

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_5
    const-string v0, "Not exist native image."

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_6
    const-string v0, "Invalid file format."

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :pswitch_7
    const-string v0, "Unexpected end of file."

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_8
    const-string v0, "Can\'t read the stream."

    .line 72
    .line 73
    :goto_1
    return-object v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
