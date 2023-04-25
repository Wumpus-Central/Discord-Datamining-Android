.class public final Lcom/linecorp/apng/decoder/ApngDecoderJni;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0019\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J!\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0087 J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 \u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/linecorp/apng/decoder/ApngDecoderJni;",
        "",
        "()V",
        "copy",
        "",
        "id",
        "result",
        "Lcom/linecorp/apng/decoder/Apng$DecodeResult;",
        "decode",
        "inputStream",
        "Ljava/io/InputStream;",
        "draw",
        "",
        "index",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "isApng",
        "",
        "recycle",
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
.field public static final INSTANCE:Lcom/linecorp/apng/decoder/ApngDecoderJni;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/linecorp/apng/decoder/ApngDecoderJni;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/linecorp/apng/decoder/ApngDecoderJni;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/linecorp/apng/decoder/ApngDecoderJni;->INSTANCE:Lcom/linecorp/apng/decoder/ApngDecoderJni;

    .line 7
    .line 8
    const-string v0, "apng-drawable"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native copy(ILcom/linecorp/apng/decoder/Apng$DecodeResult;)I
.end method

.method public static final native decode(Ljava/io/InputStream;Lcom/linecorp/apng/decoder/Apng$DecodeResult;)I
.end method

.method public static final native draw(IILandroid/graphics/Bitmap;)V
.end method

.method public static final native isApng(Ljava/io/InputStream;)Z
.end method

.method public static final native recycle(I)I
.end method
