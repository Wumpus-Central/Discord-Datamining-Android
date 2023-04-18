.class public final synthetic Lk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lk0/f;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:Lk0/f$e;


# direct methods
.method public synthetic constructor <init>(Lk0/f;Ljava/util/concurrent/Executor;Lk0/f$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/a;->k:Lk0/f;

    iput-object p2, p0, Lk0/a;->l:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lk0/a;->m:Lk0/f$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lk0/a;->k:Lk0/f;

    iget-object v1, p0, Lk0/a;->l:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lk0/a;->m:Lk0/f$e;

    invoke-static {v0, v1, v2}, Lk0/f;->e(Lk0/f;Ljava/util/concurrent/Executor;Lk0/f$e;)V

    return-void
.end method
