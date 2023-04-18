.class public final Ltj/f$d;
.super Lck/d$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltj/f;->x(Ltj/c;)Lck/d$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "tj/f$d",
        "Lck/d$d;",
        "",
        "close",
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
.field final synthetic n:Ltj/c;

.field final synthetic o:Lokio/BufferedSource;

.field final synthetic p:Lokio/BufferedSink;


# direct methods
.method constructor <init>(Ltj/c;Lokio/BufferedSource;Lokio/BufferedSink;ZLokio/BufferedSource;Lokio/BufferedSink;)V
    .locals 0

    iput-object p1, p0, Ltj/f$d;->n:Ltj/c;

    iput-object p2, p0, Ltj/f$d;->o:Lokio/BufferedSource;

    iput-object p3, p0, Ltj/f$d;->p:Lokio/BufferedSink;

    invoke-direct {p0, p4, p5, p6}, Lck/d$d;-><init>(ZLokio/BufferedSource;Lokio/BufferedSink;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    iget-object v0, p0, Ltj/f$d;->n:Ltj/c;

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Ltj/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method
