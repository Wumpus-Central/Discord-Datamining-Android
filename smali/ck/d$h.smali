.class public final Lck/d$h;
.super Lsj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lck/d;->x()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0005"
    }
    d2 = {
        "okhttp3/internal/concurrent/TaskQueue$execute$1",
        "Lsj/a;",
        "",
        "f",
        "okhttp",
        "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lck/d;

.field final synthetic h:Lck/h;

.field final synthetic i:Lokio/ByteString;

.field final synthetic j:Lkotlin/jvm/internal/Ref$ObjectRef;

.field final synthetic k:Lkotlin/jvm/internal/e0;

.field final synthetic l:Lkotlin/jvm/internal/Ref$ObjectRef;

.field final synthetic m:Lkotlin/jvm/internal/Ref$ObjectRef;

.field final synthetic n:Lkotlin/jvm/internal/Ref$ObjectRef;

.field final synthetic o:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLck/d;Lck/h;Lokio/ByteString;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    iput-object p1, p0, Lck/d$h;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lck/d$h;->f:Z

    iput-object p5, p0, Lck/d$h;->g:Lck/d;

    iput-object p6, p0, Lck/d$h;->h:Lck/h;

    iput-object p7, p0, Lck/d$h;->i:Lokio/ByteString;

    iput-object p8, p0, Lck/d$h;->j:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p9, p0, Lck/d$h;->k:Lkotlin/jvm/internal/e0;

    iput-object p10, p0, Lck/d$h;->l:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p11, p0, Lck/d$h;->m:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p12, p0, Lck/d$h;->n:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p13, p0, Lck/d$h;->o:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0, p3, p4}, Lsj/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, Lck/d$h;->g:Lck/d;

    invoke-virtual {v0}, Lck/d;->m()V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
