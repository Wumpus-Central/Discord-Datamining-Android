.class final Loh/d$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loh/d;-><init>(Loh/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Loh/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Loh/d;


# direct methods
.method constructor <init>(Loh/d;)V
    .locals 0

    iput-object p1, p0, Loh/d$d;->k:Loh/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Loh/d;
    .locals 2

    iget-object v0, p0, Loh/d$d;->k:Loh/d;

    sget-object v1, Loh/d$d$a;->k:Loh/d$d$a;

    invoke-virtual {v0, v1}, Loh/c;->y(Lkotlin/jvm/functions/Function1;)Loh/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Loh/d;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Loh/d$d;->a()Loh/d;

    move-result-object v0

    return-object v0
.end method
