.class Ld2/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/g0;-><init>(Landroid/content/Context;Ld2/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/g0;


# direct methods
.method constructor <init>(Ld2/g0;)V
    .locals 0

    iput-object p1, p0, Ld2/g0$a;->k:Ld2/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld2/g0$a;->k:Ld2/g0;

    invoke-virtual {v0}, Ld2/g0;->s()V

    return-void
.end method
