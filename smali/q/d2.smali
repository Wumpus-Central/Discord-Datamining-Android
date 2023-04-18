.class public final synthetic Lq/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/h2;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lq/h2;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/d2;->k:Lq/h2;

    iput-wide p2, p0, Lq/d2;->l:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/d2;->k:Lq/h2;

    iget-wide v1, p0, Lq/d2;->l:J

    invoke-static {v0, v1, v2}, Lq/h2;->a(Lq/h2;J)V

    return-void
.end method
