.class Ld2/a1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a1;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/a1;


# direct methods
.method constructor <init>(Ld2/a1;)V
    .locals 0

    iput-object p1, p0, Ld2/a1$d;->k:Ld2/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld2/a1$d;->k:Ld2/a1;

    invoke-static {v0}, Ld2/a1;->l(Ld2/a1;)V

    return-void
.end method
