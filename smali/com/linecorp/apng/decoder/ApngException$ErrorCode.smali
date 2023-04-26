.class public final enum Lcom/linecorp/apng/decoder/ApngException$ErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/linecorp/apng/decoder/ApngException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorCode"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;",
        "",
        "",
        "k",
        "I",
        "getErrorCode",
        "()I",
        "errorCode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "Companion",
        "ERR_STREAM_READ_FAIL",
        "ERR_UNEXPECTED_EOF",
        "ERR_INVALID_FILE_FORMAT",
        "ERR_NOT_EXIST_IMAGE",
        "ERR_FRAME_INDEX_OUT_OF_RANGE",
        "ERR_OUT_OF_MEMORY",
        "ERR_BITMAP_OPERATION",
        "ERR_UNSUPPORTED_TYPE",
        "ERR_WITH_CHILD_EXCEPTION",
        "apng-drawable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field public static final Companion:Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;

.field public static final enum ERR_BITMAP_OPERATION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_FRAME_INDEX_OUT_OF_RANGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_INVALID_FILE_FORMAT:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_NOT_EXIST_IMAGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_OUT_OF_MEMORY:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_STREAM_READ_FAIL:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_UNEXPECTED_EOF:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_UNSUPPORTED_TYPE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field public static final enum ERR_WITH_CHILD_EXCEPTION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

.field private static final synthetic l:[Lcom/linecorp/apng/decoder/ApngException$ErrorCode;


# instance fields
.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 4
    .line 5
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 6
    .line 7
    const-string v2, "ERR_STREAM_READ_FAIL"

    .line 8
    .line 9
    const/16 v3, -0x64

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_STREAM_READ_FAIL:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 16
    .line 17
    aput-object v1, v0, v4

    .line 18
    .line 19
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 20
    .line 21
    const-string v2, "ERR_UNEXPECTED_EOF"

    .line 22
    .line 23
    const/16 v3, -0x65

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_UNEXPECTED_EOF:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 30
    .line 31
    aput-object v1, v0, v4

    .line 32
    .line 33
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 34
    .line 35
    const-string v2, "ERR_INVALID_FILE_FORMAT"

    .line 36
    .line 37
    const/16 v3, -0x66

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_INVALID_FILE_FORMAT:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 44
    .line 45
    aput-object v1, v0, v4

    .line 46
    .line 47
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 48
    .line 49
    const-string v2, "ERR_NOT_EXIST_IMAGE"

    .line 50
    .line 51
    const/16 v3, -0x67

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_NOT_EXIST_IMAGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 58
    .line 59
    aput-object v1, v0, v4

    .line 60
    .line 61
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 62
    .line 63
    const-string v2, "ERR_FRAME_INDEX_OUT_OF_RANGE"

    .line 64
    .line 65
    const/16 v3, -0x68

    .line 66
    .line 67
    const/4 v4, 0x4

    .line 68
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    .line 71
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_FRAME_INDEX_OUT_OF_RANGE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 72
    .line 73
    aput-object v1, v0, v4

    .line 74
    .line 75
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 76
    .line 77
    const-string v2, "ERR_OUT_OF_MEMORY"

    .line 78
    .line 79
    const/16 v3, -0x69

    .line 80
    .line 81
    const/4 v4, 0x5

    .line 82
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_OUT_OF_MEMORY:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 86
    .line 87
    aput-object v1, v0, v4

    .line 88
    .line 89
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 90
    .line 91
    const-string v2, "ERR_BITMAP_OPERATION"

    .line 92
    .line 93
    const/16 v3, -0x6a

    .line 94
    .line 95
    const/4 v4, 0x6

    .line 96
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 97
    .line 98
    .line 99
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_BITMAP_OPERATION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 100
    .line 101
    aput-object v1, v0, v4

    .line 102
    .line 103
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 104
    .line 105
    const-string v2, "ERR_UNSUPPORTED_TYPE"

    .line 106
    .line 107
    const/16 v3, -0x6b

    .line 108
    .line 109
    const/4 v4, 0x7

    .line 110
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_UNSUPPORTED_TYPE:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 114
    .line 115
    aput-object v1, v0, v4

    .line 116
    .line 117
    new-instance v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 118
    .line 119
    const-string v2, "ERR_WITH_CHILD_EXCEPTION"

    .line 120
    .line 121
    const/16 v3, -0xc8

    .line 122
    .line 123
    const/16 v4, 0x8

    .line 124
    .line 125
    invoke-direct {v1, v2, v4, v3}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 126
    .line 127
    .line 128
    sput-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->ERR_WITH_CHILD_EXCEPTION:Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 129
    .line 130
    aput-object v1, v0, v4

    .line 131
    .line 132
    sput-object v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->l:[Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    .line 133
    .line 134
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    invoke-direct {v0, v1}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->Companion:Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;

    .line 141
    .line 142
    return-void
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->k:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/linecorp/apng/decoder/ApngException$ErrorCode;
    .locals 1

    const-class v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/linecorp/apng/decoder/ApngException$ErrorCode;
    .locals 1

    sget-object v0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->l:[Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    invoke-virtual {v0}, [Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    return-object v0
.end method


# virtual methods
.method public final getErrorCode()I
    .locals 1

    iget v0, p0, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->k:I

    return v0
.end method
