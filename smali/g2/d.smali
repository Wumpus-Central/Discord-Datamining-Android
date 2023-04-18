.class public final synthetic Lg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg2/h;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lg2/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/d;->a:Lg2/h;

    iput p2, p0, Lg2/d;->b:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg2/d;->a:Lg2/h;

    iget v1, p0, Lg2/d;->b:I

    invoke-static {v0, v1}, Lg2/h;->e(Lg2/h;I)Lg2/k0;

    move-result-object v0

    return-object v0
.end method
