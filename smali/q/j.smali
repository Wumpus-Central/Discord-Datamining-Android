.class public final synthetic Lq/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lq/w;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lq/w;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/j;->a:Lq/w;

    iput-wide p2, p0, Lq/j;->b:J

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lq/j;->a:Lq/w;

    iget-wide v1, p0, Lq/j;->b:J

    invoke-static {v0, v1, v2, p1}, Lq/w;->q(Lq/w;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
