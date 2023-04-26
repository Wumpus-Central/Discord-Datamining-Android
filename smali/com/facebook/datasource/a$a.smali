.class Lcom/facebook/datasource/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/datasource/a;->l(Lcom/facebook/datasource/d;Ljava/util/concurrent/Executor;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Z

.field final synthetic l:Lcom/facebook/datasource/d;

.field final synthetic m:Z

.field final synthetic n:Lcom/facebook/datasource/a;


# direct methods
.method constructor <init>(Lcom/facebook/datasource/a;ZLcom/facebook/datasource/d;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/datasource/a$a;->n:Lcom/facebook/datasource/a;

    iput-boolean p2, p0, Lcom/facebook/datasource/a$a;->k:Z

    iput-object p3, p0, Lcom/facebook/datasource/a$a;->l:Lcom/facebook/datasource/d;

    iput-boolean p4, p0, Lcom/facebook/datasource/a$a;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/datasource/a$a;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/datasource/a$a;->l:Lcom/facebook/datasource/d;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/datasource/a$a;->n:Lcom/facebook/datasource/a;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/facebook/datasource/d;->onFailure(Lcom/facebook/datasource/DataSource;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/datasource/a$a;->m:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/datasource/a$a;->l:Lcom/facebook/datasource/d;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/datasource/a$a;->n:Lcom/facebook/datasource/a;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lcom/facebook/datasource/d;->onCancellation(Lcom/facebook/datasource/DataSource;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/facebook/datasource/a$a;->l:Lcom/facebook/datasource/d;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/facebook/datasource/a$a;->n:Lcom/facebook/datasource/a;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lcom/facebook/datasource/d;->onNewResult(Lcom/facebook/datasource/DataSource;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method
