.class public final Lre/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "imageFormat",
        "",
        "a",
        "react-native-vision-camera_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(I)Ljava/lang/String;
    .locals 2

    const-string v0, "raw"

    const-string v1, "yuv"

    sparse-switch p0, :sswitch_data_0

    const-string v0, "unknown"

    goto :goto_0

    :sswitch_0
    const-string v0, "jpeg-depth"

    goto :goto_0

    :sswitch_1
    const-string v0, "heic"

    goto :goto_0

    :sswitch_2
    const-string v0, "depth-16"

    goto :goto_0

    :sswitch_3
    const-string v0, "jpeg"

    goto :goto_0

    :sswitch_4
    move-object v0, v1

    goto :goto_0

    :sswitch_5
    const-string v0, "private"

    :goto_0
    :sswitch_6
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_6
        0x22 -> :sswitch_5
        0x23 -> :sswitch_4
        0x24 -> :sswitch_6
        0x27 -> :sswitch_4
        0x28 -> :sswitch_4
        0x100 -> :sswitch_3
        0x44363159 -> :sswitch_2
        0x48454946 -> :sswitch_1
        0x69656963 -> :sswitch_0
    .end sparse-switch
.end method
