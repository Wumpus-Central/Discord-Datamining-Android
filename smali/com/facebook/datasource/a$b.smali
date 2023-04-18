.class Lcom/facebook/datasource/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/datasource/a;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/datasource/d;

.field final synthetic l:Lcom/facebook/datasource/a;


# direct methods
.method constructor <init>(Lcom/facebook/datasource/a;Lcom/facebook/datasource/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/datasource/a$b;->l:Lcom/facebook/datasource/a;

    iput-object p2, p0, Lcom/facebook/datasource/a$b;->k:Lcom/facebook/datasource/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/datasource/a$b;->k:Lcom/facebook/datasource/d;

    iget-object v1, p0, Lcom/facebook/datasource/a$b;->l:Lcom/facebook/datasource/a;

    invoke-interface {v0, v1}, Lcom/facebook/datasource/d;->onProgressUpdate(Lcom/facebook/datasource/DataSource;)V

    return-void
.end method
