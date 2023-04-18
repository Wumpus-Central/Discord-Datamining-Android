.class Lf2/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ljava/lang/Object;

.field final synthetic l:Lf2/a$a;


# direct methods
.method constructor <init>(Lf2/a$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lf2/a$a$a;->l:Lf2/a$a;

    iput-object p2, p0, Lf2/a$a$a;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lf2/a$a$a;->l:Lf2/a$a;

    iget-object v0, v0, Lf2/a$a;->m:Lf2/a;

    iget-object v1, p0, Lf2/a$a$a;->k:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lf2/a;->c(Ljava/lang/Object;)V

    return-void
.end method
