.class Ld2/v0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/v0;->h(Ld2/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/v0;


# direct methods
.method constructor <init>(Ld2/v0;)V
    .locals 0

    iput-object p1, p0, Ld2/v0$d;->k:Ld2/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld2/v0$d;->k:Ld2/v0;

    invoke-static {v0}, Ld2/v0;->l(Ld2/v0;)V

    return-void
.end method
