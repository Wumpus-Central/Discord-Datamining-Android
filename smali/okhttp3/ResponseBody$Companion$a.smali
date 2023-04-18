.class public final Lokhttp3/ResponseBody$Companion$a;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/ResponseBody$Companion;->f(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "okhttp3/ResponseBody$Companion$a",
        "Lokhttp3/ResponseBody;",
        "Lokhttp3/MediaType;",
        "contentType",
        "",
        "contentLength",
        "Lokio/BufferedSource;",
        "source",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lokio/BufferedSource;

.field final synthetic l:Lokhttp3/MediaType;

.field final synthetic m:J


# direct methods
.method constructor <init>(Lokio/BufferedSource;Lokhttp3/MediaType;J)V
    .locals 0

    iput-object p1, p0, Lokhttp3/ResponseBody$Companion$a;->k:Lokio/BufferedSource;

    iput-object p2, p0, Lokhttp3/ResponseBody$Companion$a;->l:Lokhttp3/MediaType;

    iput-wide p3, p0, Lokhttp3/ResponseBody$Companion$a;->m:J

    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/ResponseBody$Companion$a;->m:J

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lokhttp3/ResponseBody$Companion$a;->l:Lokhttp3/MediaType;

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    iget-object v0, p0, Lokhttp3/ResponseBody$Companion$a;->k:Lokio/BufferedSource;

    return-object v0
.end method
