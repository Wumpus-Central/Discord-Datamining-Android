.class Ld2/v0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/v0;->e(Ld2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/c;

.field final synthetic l:Ld2/v0;


# direct methods
.method constructor <init>(Ld2/v0;Ld2/c;)V
    .locals 0

    iput-object p1, p0, Ld2/v0$b;->l:Ld2/v0;

    iput-object p2, p0, Ld2/v0$b;->k:Ld2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/v0$b;->l:Ld2/v0;

    iget-object v1, p0, Ld2/v0$b;->k:Ld2/c;

    invoke-static {v0, v1}, Ld2/v0;->j(Ld2/v0;Ld2/c;)V

    return-void
.end method
